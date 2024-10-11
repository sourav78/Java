package com.SouravQuiz.SBQuizApp.Repository;

import com.SouravQuiz.SBQuizApp.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
