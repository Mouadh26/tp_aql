package test_tp0;

import org.example.tp0.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void getFullName_ShouldReturnFullNameWithSpace() {
        Person person = new Person("John", "Doe", 25);
        assertEquals("John Doe", person.getFullName());
    }

    @ParameterizedTest
    @CsvSource({"17, false", "18, true", "19, true"})
    void isAdult_ShouldReturnCorrectResult(int age, boolean expected) {
        Person person = new Person("Alice", "Smith", age);
        assertEquals(expected, person.isAdult());
    }
}