package lv.venta.model;

import jakarta.validation.constraints.*;

public class Customer {
    @NotNull
    @Size(min = 3, max = 10)
    @Pattern(regexp = "[A-Z]{1}[a-z\\ ]+") //only latin letters
    private String name;

    @NotNull
    @Size(min = 3, max = 10)
    @Pattern(regexp = "[A-Z]{1}[a-z\\ ]+") //only latin letters
    private String surname;

    @Min(0)
    @Max(120)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
