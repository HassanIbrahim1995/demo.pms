package model;

import com.example.demo.JobTitle;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person {

    @NotNull(message = "Job title is required.")
    private JobTitle jobTitle;

    @NotNull(message = "Date of joining is required.")
    @PastOrPresent(message = "Date of joining cannot be in the future.")
    private LocalDate dateOfJoining;

}
