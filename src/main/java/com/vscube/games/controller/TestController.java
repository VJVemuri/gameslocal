package com.vscube.games.controller;

import com.vscube.games.db.entity.Quiz;
import com.vscube.games.db.repo.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    QuizRepository quizRepository;

    @GetMapping("/quiz/names")
    public Iterable<Quiz> getQuizNames(){
        Quiz quiz1 = new Quiz();
        quiz1.setName("SahiQuiz");

        Quiz quiz2 = new Quiz();
        quiz2.setName("SanviQuiz");

        quizRepository.save(quiz1);
        quizRepository.save(quiz2);

        return quizRepository.findAll();


    }

}
