package server.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.commons.OpenQuestion;
import server.commons.Question;
import server.services.QuestionService;

import java.util.List;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping
    public ResponseEntity<List<Question>> getQuestions() {
        Question question = new OpenQuestion("first question", "first question text");
        questionService.addQuestion(question);
        return ResponseEntity.ok().body(questionService.getAllQuestions());
    }

    @PostMapping
    public ResponseEntity<Question> add(@RequestBody Question question) {
        Question addedQuestion = questionService.addQuestion(question);
        if (addedQuestion == null) {
            return ResponseEntity.badRequest().build();
        } else {
            return ResponseEntity.ok().body(addedQuestion);
        }
    }
}
