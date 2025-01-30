import java.util.Optional;

public class Person {
    private String name;
    private Integer age;
    private Optional<Dog> dog; // Dog is an Optional because the person may or may not own one

    // Constructor to create a person without a dog
    public Person(String name, Integer age) {
        this(name, age, null);
    }

    // Constructor to create a person with a dog
    public Person(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.ofNullable(dog); // Wrapping dog in Optional to handle null safely
    }

    // Getters and setters for name, age, and dog

    // Checks if the person has an old dog (age >= 10)
    public boolean hasOldDog() {
        // Uses Optional's map method to avoid null checks
        return dog.map(d -> d.getAge() >= 10).orElse(false);
    }

    // Changes the dog's name if the person owns a dog
    public void changeDogsName(String newName) {
        // Throws an exception if the person doesn't own a dog
        dog.map(d -> {
            d.setName(newName);
            return d;
        }).orElseThrow(() -> new RuntimeException(this.name + " does not own a dog!"));
    }

    public static void main(String[] args) {
        try {
            // Trying to change a dog's name when the person does not own one
            Person personWithoutDog = new Person("John", 25);
            personWithoutDog.changeDogsName("Buddy");
        } catch (RuntimeException e) {
            // Handles the exception if no dog is owned
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }
    }
}
