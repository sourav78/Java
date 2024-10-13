package com.SouravQuiz.SBQuizApp.Service;

import com.SouravQuiz.SBQuizApp.Entity.Question;
import com.SouravQuiz.SBQuizApp.Helper.Admin.QuestionValidation;
import com.SouravQuiz.SBQuizApp.Utils.ErrorHandler;
import com.SouravQuiz.SBQuizApp.Utils.ResponseHandler;
import com.SouravQuiz.SBQuizApp.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    @Autowired
    QuestionValidation questionValidation;

    public ResponseEntity<ResponseHandler<Question>> saveNewQuestion(Question question){

        try {

            questionValidation.validateQuestion(question);

            Question question1 = questionRepo.save(question);
            return ResponseEntity.ok(
                    new ResponseHandler<Question>(
                            true,
                            "New Question is added successfully.",
                            question1
                    )
            );
        }catch(ErrorHandler e){
            return new ResponseEntity<>(
                    new ResponseHandler<Question>(
                            e.isSuccess(),
                            e.getErrorMessage()
                    ),
                    e.getHttpStatus()
            );
        }catch (Exception e){
            return new ResponseEntity<>(
                    new ResponseHandler<Question>(
                            false,
                            "Internal server error."
                    ),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }

    }

    public ResponseEntity<ResponseHandler<List<Question>>> getAllQuestions(){
        try{
            List<Question> questions = questionRepo.findAll();

            return ResponseEntity.ok(
                    new ResponseHandler<>(
                            true,
                            "Get all questions successfully.",
                            questions
                    )
            );
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(
                    new ResponseHandler<List<Question>>(
                            false,
                            "Internal Server error"
                    ),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }

    public ResponseEntity<ResponseHandler<List<Question>>> getQuestionsBySubject(String subject){
        try{

            if(subject.isEmpty()){
                throw new ErrorHandler("Subject is required.", HttpStatus.BAD_REQUEST);
            }

            List<Question> questions = questionRepo.findBySubject(subject);

            return ResponseEntity.ok(
                    new ResponseHandler<>(
                            true,
                            questions.size() > 1 ? "Get all questions successfully." : "No question found",
                            questions
                    )
            );

        }catch(ErrorHandler e){
            return new ResponseEntity<>(
                    new ResponseHandler<List<Question>>(
                            e.isSuccess(),
                            e.getErrorMessage()
                    ),
                    e.getHttpStatus()
            );
        }catch (Exception e){
            return new ResponseEntity<>(
                    new ResponseHandler<List<Question>>(
                            false,
                            "Internal server error."
                    ),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }

    public ResponseEntity<ResponseHandler<List<Question>>> getQuestionsBy5Subject(String subject){
        try{

            if(subject.isEmpty()){
                throw new ErrorHandler("Subject is required.", HttpStatus.BAD_REQUEST);
            }

            List<Question> questions = questionRepo.findDistinctQuestionBySubject(subject, PageRequest.of(0, 5));

            return ResponseEntity.ok(
                    new ResponseHandler<>(
                            true,
                            questions.size() > 1 ? "Get all questions successfully." : "No question found",
                            questions
                    )
            );

        }catch(ErrorHandler e){
            return new ResponseEntity<>(
                    new ResponseHandler<List<Question>>(
                            e.isSuccess(),
                            e.getErrorMessage()
                    ),
                    e.getHttpStatus()
            );
        }catch (Exception e){
            return new ResponseEntity<>(
                    new ResponseHandler<List<Question>>(
                            false,
                            "Internal server error."
                    ),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }
}
