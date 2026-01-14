package Entity;

import Enum.ParticipationStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "survey_participant")
@AllArgsConstructor
@NoArgsConstructor
public class SurveyParticipant {
    @Id
    @Generated
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "survey_ıd")
    private Survey survey;

    private String email;

    private String token;

    @Enumerated(EnumType.STRING)
    private ParticipationStatus status;

    private LocalDateTime sentAt;

    private LocalDateTime completedAt;

}
