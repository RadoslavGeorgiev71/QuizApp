package server.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.commons.Question;
import server.repositories.QuestionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }
}
