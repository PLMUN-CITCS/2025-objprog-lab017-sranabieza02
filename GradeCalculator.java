import java.util.Scanner;

public class GradeCalculator {

       public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score;

               System.out.print("Enter your score: ");
        
      
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Discard invalid input
            System.out.print("Enter your score: ");
        }

        score = scanner.nextDouble();
        return score;
    }

      public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

      public static void main(String[] args) {
               double score = getStudentScore();

               String grade = calculateGrade(score);

              System.out.println("Your Grade is: " + grade);
    }
}