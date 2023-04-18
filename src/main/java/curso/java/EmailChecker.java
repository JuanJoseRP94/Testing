package curso.java;

public class EmailChecker {

    public boolean isValidEmail(String email){
        boolean isValid = email.contains("@");
        return isValid;
    }
}
