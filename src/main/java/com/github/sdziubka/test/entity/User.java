package com.github.sdziubka.test.entity;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class User {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private String middleName;

    private LocalDate dateOfBirth;

    private Gender gender;

    private String login;

    public enum Gender {
        MALE, FEMALE, OTHER
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return String.format("User{id=%d, firstName='%s', lastName='%s', middleName='%s', dateOfBirth=%s, gender=%s, login='%s'}", id, firstName, lastName, middleName, dateOfBirth, gender, login);
    }
}
