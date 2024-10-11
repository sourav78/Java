package com.SouravQuiz.SBQuizApp.Helper.Admin;

import com.SouravQuiz.SBQuizApp.Entity.Question;
import com.SouravQuiz.SBQuizApp.Utils.ErrorHandler;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class QuestionValidation {
    public void validateQuestion(Question question) throws ErrorHandler{
        if(question.getQuestion() == null || question.getQuestion().isEmpty()){
            throw new ErrorHandler("Please enter the question", HttpStatus.BAD_REQUEST);
        }

        if(question.getOpt1() == null ||
            question.getOpt1().isEmpty() ||
            question.getOpt2() == null ||
            question.getOpt2().isEmpty() ||
            question.getOpt3() == null ||
            question.getOpt3().isEmpty() ||
            question.getOpt4() == null ||
            question.getOpt4().isEmpty()
        ){
            throw new ErrorHandler("4 options are required.", HttpStatus.BAD_REQUEST);
        }

        if(question.getAns() == null || question.getAns().isEmpty()){
            throw new ErrorHandler("Please enter the Answer", HttpStatus.BAD_REQUEST);
        }
        if(question.getSubject() == null || question.getSubject().isEmpty()){
            throw new ErrorHandler("Please enter the subject", HttpStatus.BAD_REQUEST);
        }
    }
}
