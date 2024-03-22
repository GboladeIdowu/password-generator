import java.util.Random;

public class Main {
    public static void main(String[] args) {
/*
        This is a password generator demo using
        StringBuilder and Random classes in java

 */

        String passwordChars = ("1234567890!@#$%&*aqwertyuiopasdfghjklzxcvbnm");
        int passLen = 10;
        Random random = new Random();
        StringBuilder password = new StringBuilder();

/* Loop through the password characters at the specified password length to:
   1.) Generate random integers in the range of "passwordChars.length()"
   2.) Get the character at the index of the generated int above
 */
        for (int i = 0; i < passLen; i++) {
            int index = random.nextInt(passwordChars.length());
            password.append(passwordChars.charAt(index));
        }
        System.out.println("The generated password is: " + password);
    }
}