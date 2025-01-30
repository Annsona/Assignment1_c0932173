import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    @Test
    public void testDogInitialization() {
        Dog dog = new Dog("Rocky", 5);
        assertEquals("Rocky", dog.getName());
        assertEquals(5, dog.getAge());
    }

    @Test
    public void testDogEquality() {
        Dog dog1 = new Dog("Bolt", 3);
        Dog dog2 = new Dog("Bolt", 3);
        assertEquals(dog1, dog2);
    }
}