package oops;

import java.io.*;

//Custom checked exception
class UnderAgeException extends Exception {
 public UnderAgeException(String message) {
     super(message);
 }
}

public class ExceptionDemo {

 // Method that throws a checked exception
 static void readFile(String fileName) throws IOException {
     FileReader fr = new FileReader(fileName);  // Checked Exception (FileNotFoundException)
     BufferedReader br = new BufferedReader(fr);
     System.out.println("File content: " + br.readLine());
     br.close();
 }

 // Method that throws custom checked exception
 static void checkAge(int age) throws UnderAgeException {
     if (age < 18) {
         throw new UnderAgeException("You must be 18 or older!");
     }
     System.out.println("You are eligible!");
 }

 public static void main(String[] args) {
     try {
         // 1. Unchecked Exception (runtime)
         int result = 10 / 0;  // ArithmeticException
         System.out.println("Result: " + result);

         // 2. Checked Exception
         readFile("nonexistent.txt");

         // 3. Custom Checked Exception
         checkAge(15);

     } catch (ArithmeticException e) {  // Unchecked Exception
         System.out.println("Caught Unchecked Exception: " + e);

     } catch (IOException e) {  // Checked Exception
         System.out.println("Caught Checked Exception: " + e);

     } catch (UnderAgeException e) {  // Custom Checked Exception
         System.out.println("Caught Custom Exception: " + e.getMessage());

     } finally {
         System.out.println("Finally block always runs (cleanup).");
     }

     System.out.println("Program continues after handling exceptions...");
 }
}
