package Entity;

import Enum.SurveyStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "survey")
@AllArgsConstructor
@NoArgsConstructor
public class Survey {

    @Id
    @Generated
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "owner_ıd")
    private User owner;

    private String title;

    private String description;

    private SurveyStatus status = SurveyStatus.DRAFT;

    private LocalDateTime expireDate;

    private boolean isTemplate = false;

    private LocalDateTime createdAt;

}
