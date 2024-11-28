package server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import server.commons.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
