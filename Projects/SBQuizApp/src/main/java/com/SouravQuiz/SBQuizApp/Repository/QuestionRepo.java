package com.SouravQuiz.SBQuizApp.Repository;

import com.SouravQuiz.SBQuizApp.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
    public List<Question> findBySubject(String subject);
}
