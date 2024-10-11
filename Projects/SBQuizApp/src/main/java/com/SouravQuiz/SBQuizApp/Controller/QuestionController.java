package com.SouravQuiz.SBQuizApp.Controller;

import com.SouravQuiz.SBQuizApp.Entity.Question;
import com.SouravQuiz.SBQuizApp.Utils.ResponseHandler;
import com.SouravQuiz.SBQuizApp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @PostMapping("/question")
    public ResponseEntity<ResponseHandler<Question>> saveNewQuestion(@RequestBody Question question){
        System.out.println(question);
        return questionService.saveNewQuestion(question);
    }
}
