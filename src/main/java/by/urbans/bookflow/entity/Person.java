package by.urbans.bookflow.entity;

import java.util.Objects;

public class Person {
    int personId;
    String surname;
    String name;
    String patronym;
    int birthYear;

    public Person() {
    }

    public Person(String surname, String name, String patronym, int birthYear) {
        this.surname = surname;
        this.name = name;
        this.patronym = patronym;
        this.birthYear = birthYear;
    }

    public Person(int personId, String surname, String name, String patronym, int birthYear) {
        this.personId = personId;
        this.surname = surname;
        this.name = name;
        this.patronym = patronym;
        this.birthYear = birthYear;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronym() {
        return patronym;
    }

    public void setPatronym(String patronym) {
        this.patronym = patronym;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personId == person.personId && birthYear == person.birthYear && Objects.equals(surname, person.surname) && Objects.equals(name, person.name) && Objects.equals(patronym, person.patronym);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, surname, name, patronym, birthYear);
    }

    @Override
    public String toString() {
        return "Person{" +
               "personId=" + personId +
               ", surname='" + surname + '\'' +
               ", name='" + name + '\'' +
               ", patronym='" + patronym + '\'' +
               ", birthYear=" + birthYear +
               '}';
    }
}
