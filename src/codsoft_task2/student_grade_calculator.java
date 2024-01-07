package codsoft_task2;

import java.util.Scanner;

public class student_grade_calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of subjects: ");
        int numOfSubjects = scanner.nextInt();
        System.out.println("\n");

        int totalMarks = 0;
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " out of 100 : ");
            int subjectMarks = scanner.nextInt();

            if (subjectMarks < 0 || subjectMarks > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100. ");
                return;
            }

            totalMarks += subjectMarks;
        }

        double averagePercentage = (double) totalMarks / numOfSubjects;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 40) {
            grade = 'D';
        }  else {
            grade = 'F';
        }

        System.out.println("\nResult:");
        System.out.println("Total Marks Obtained : " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}