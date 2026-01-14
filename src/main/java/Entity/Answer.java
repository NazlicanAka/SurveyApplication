package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Entity
@Table(name = "answer")
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "participant_ıd")
    private SurveyParticipant participant;

    @ManyToOne
    @JoinColumn(name = "question_ıd")
    private Question question;

    private String answerText;

    private Integer ratingValue;

}
