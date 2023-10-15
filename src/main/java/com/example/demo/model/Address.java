package model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;

    @NotNull(message = "Street is required.")
    @Size(max = 255, message = "Street name should not exceed 255 characters.")
    private String street;

    @Size(max = 255, message = "Suite/apartment details should not exceed 255 characters.")
    private String suiteOrApartment;

    @NotNull(message = "City is required.")
    @Size(max = 100, message = "City name should not exceed 100 characters.")
    private String city;

    @NotNull(message = "State is required.")
    @Size(max = 100, message = "State name should not exceed 100 characters.")
    private String state;

    @NotNull(message = "Country is required.")
    @Size(max = 100, message = "Country name should not exceed 100 characters.")
    private String country;

    @NotNull(message = "Postal code is required.")
    @Size(max = 20, message = "Postal code should not exceed 20 characters.")
    private String postalCode;

    public Address(String street, String suiteOrApartment, String city, String state, String country, String postalCode) {
        this.street = street;
        this.suiteOrApartment = suiteOrApartment;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
    }
}

