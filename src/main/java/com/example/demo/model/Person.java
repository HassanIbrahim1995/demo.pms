package model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @JsonProperty("person_id")
    private long personId;

    @NotNull(message = "First name is required.")
    @JsonProperty("first_name")
    private String firstName;

    @NotNull(message = "Last name is required.")
    @JsonProperty("last_name")
    private String lastName;

    @Column
    @JsonProperty("middle_name")
    private String middleName;

    @NotNull(message = "Date of birth is required.")
    @JsonProperty("date_of_birth")
    private LocalDate dateOfBirth;

    @NotNull(message = "Gender is required.")
    @JsonProperty("gender")
    private String gender;

    @OneToOne
    @JoinColumn(name = "profile_id", referencedColumnName = "profileId")
    @JsonProperty("profile")
    private Profile profile;

    public Person(String firstName, String lastName, String middleName, LocalDate dateOfBirth, String gender, Profile profile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.profile = profile;
    }
}

