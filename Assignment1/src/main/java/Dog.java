import java.util.Objects;

public class Dog {
    private String name;
    private Integer age;

    // Constructor to create a Dog object
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters for name and age

    // Equals and hashCode for comparing Dog objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(age, dog.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
