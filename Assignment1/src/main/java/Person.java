
import java.util.Optional;

public class Person {
    private String name;
    private Integer age;
    private Optional<Dog> dog;

    public Person(String name, Integer age) {
        this(name, age, null);
    }

    public Person(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.ofNullable(dog);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Optional<Dog> getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = Optional.ofNullable(dog);
    }

    // hasOldDog() method without if statement
    public boolean hasOldDog() {
        return dog.map(d -> d.getAge() >= 10).orElse(false);
    }

    // changeDogsName() method without if statement
    public void changeDogsName(String newName) {
        dog.map(d -> {
            d.setName(newName);
            return d;
        }).orElseThrow(() -> new RuntimeException(this.name + " does not own a dog!"));
    }

    public static void main(String[] args) {
        try {
            Person personWithoutDog = new Person("John", 25);
            personWithoutDog.changeDogsName("Buddy");
        } catch (RuntimeException e) {
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }
    }
}


