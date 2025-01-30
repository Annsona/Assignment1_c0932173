import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testHasOldDog_True() {
        Person person = new Person("Alice", 30, new Dog("Rex", 12));
        assertTrue(person.hasOldDog());
    }

    @Test
    public void testHasOldDog_False_NoDog() {
        Person person = new Person("Bob", 40);
        assertFalse(person.hasOldDog());
    }

    @Test
    public void testHasOldDog_False_YoungDog() {
        Person person = new Person("Charlie", 35, new Dog("Max", 5));
        assertFalse(person.hasOldDog());
    }

    @Test
    public void testChangeDogsName_Success() {
        Dog dog = new Dog("Lucky", 7);
        Person person = new Person("David", 28, dog);
        person.changeDogsName("Buddy");
        assertEquals("Buddy", person.getDog().get().getName());
    }

    @Test
    public void testChangeDogsName_NoDog_ThrowsException() {
        Person person = new Person("Eve", 22);
        Exception exception = assertThrows(RuntimeException.class, () -> person.changeDogsName("Buddy"));
        assertEquals("Eve does not own a dog!", exception.getMessage());
    }
}



