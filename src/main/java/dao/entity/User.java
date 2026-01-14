package dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue; // FIXED: Added correct import
import jakarta.persistence.GenerationType; // FIXED: Added correct import
import jakarta.persistence.Id;             // FIXED: Changed from Spring to Jakarta
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users") // RECOMMENDED: Changed "user" to "users" to avoid SQL errors
public class User {

    @Id // Now refers to jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.UUID) // FIXED: Uses JPA generation
    private UUID id;

    private String username;

    private String passwordHash;

    private String email;

    private LocalDateTime createdAt;
}