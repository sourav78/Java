package com.SouravQuiz.SBQuizApp.Repository;

import com.SouravQuiz.SBQuizApp.Entity.Question;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
    public List<Question> findBySubject(String subject);

    @Query(value = "SELECT q FROM Question q WHERE q.subject = :subject ORDER BY RANDOM()")
    public List<Question> findDistinctQuestionBySubject(@Param("subject") String subject, Pageable pageable);
}
