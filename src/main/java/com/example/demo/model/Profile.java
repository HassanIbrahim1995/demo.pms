package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Profile {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long profileId;

    @Column(unique = true, nullable = false)
    @Email(message = "Email is not valid.")
    @NotNull(message = "Email is required.")
    @Size(min = 10, message = "Email should have a minimum size of 10.")
    private String email;

    @Column(unique = true, nullable = false)
    @NotNull(message = "Username is required.")
    @Size(min = 5, message = "Username should have a minimum size of 5.")
    private String userName;

    @NotNull(message = "Password is required.")
    private String password;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate createdAt;

    @UpdateTimestamp
    private LocalDate updatedAt;

    public Profile(String email, String userName, String password, LocalDate createdAt, LocalDate updatedAt) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}