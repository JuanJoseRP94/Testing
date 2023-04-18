package curso.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailCheckerTest {

    @Test
    public void isValid_True(){
        EmailChecker emailChecker = new EmailChecker();
        String email = "juancho@puntocom";
        boolean result = emailChecker.isValidEmail(email);
        assertTrue(result);
    }

    @Test
    public void isValid_False(){
        EmailChecker emailChecker = new EmailChecker();
        boolean result = emailChecker.isValidEmail("juancho.gmail");
        assertFalse(result);
    }
}
