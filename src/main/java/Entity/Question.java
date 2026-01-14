package Entity;

import Enum.QuestionType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Entity
@Table(name = "question")
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @Id
    @Generated
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "survey_ıd")
    private Survey survey;

    private String text;

    private QuestionType type;

    private Integer orderIndex;

    private boolean isRequired = true;

    private String options;

}
