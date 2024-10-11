package com.SouravQuiz.SBQuizApp.Service;

import com.SouravQuiz.SBQuizApp.Entity.Question;
import com.SouravQuiz.SBQuizApp.Utils.ErrorHandler;
import com.SouravQuiz.SBQuizApp.Utils.ResponseHandler;
import com.SouravQuiz.SBQuizApp.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public ResponseEntity<ResponseHandler<Question>> saveNewQuestion(Question question){


        try {

            if(question.getSubject() == null){
                throw new ErrorHandler("Subject is missing", HttpStatus.BAD_REQUEST);
            }

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
}
