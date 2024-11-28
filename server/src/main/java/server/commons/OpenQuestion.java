package server.commons;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class OpenQuestion extends Question{
    private String answer;

    public OpenQuestion() {

    }

    public OpenQuestion(String name, String text) {
        super(name, text);
    }
}
