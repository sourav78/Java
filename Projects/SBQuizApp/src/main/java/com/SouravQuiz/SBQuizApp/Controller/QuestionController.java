package com.SouravQuiz.SBQuizApp.Controller;

import com.SouravQuiz.SBQuizApp.Entity.Question;
import com.SouravQuiz.SBQuizApp.Utils.ResponseHandler;
import com.SouravQuiz.SBQuizApp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/question")
    public ResponseEntity<ResponseHandler<List<Question>>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/question/{subject}")
    public ResponseEntity<ResponseHandler<List<Question>>> getQuestionsBySubject(@PathVariable String subject){
        return questionService.getQuestionsBySubject(subject);
    }
}
