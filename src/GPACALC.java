import java.util.Scanner;
public class GPACALC
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);

        System.out.println("ENTER THE NUMBER OF COURSES");
        int numberOfCourses = input.nextInt();
        input.nextLine();

        double totalQualityPoints = 0;
        int totalCreditHours = 0;

        for (int i = 1; i<= numberOfCourses; i++)
        {
            boolean validGrade = true;

            System.out.println("ENTER COURSE NAME");
            String courseName = input.nextLine();
            System.out.println("ENTER CREDIT HOURS");
            int creditHours = input.nextInt();

            System.out.println("ENTER LETTER GRADE");
            String grade = input.next();
            input.nextLine();
            double gradePoints = 0;

            if (grade.equals("A+")) {
                gradePoints = 4.0;
            }

            else if (grade.equals("A")) {
                gradePoints = 3.7;
            }
            else if (grade.equals("A-")) {
                gradePoints = 3.5;
            }
            else if (grade.equals("B+")) {
                gradePoints = 3.4;
            }
            else if (grade.equals("B")) {
                gradePoints = 3.0;
            }
            else if (grade.equals("B-")) {
                gradePoints = 2.7;
            }
            else if (grade.equals("C+")) {
                gradePoints = 2.5;
            }
            else if (grade.equals("C")) {
                gradePoints = 2.0;
            }
            else if (grade.equals("C-")) {
                gradePoints = 1.7;
            }
            else if (grade.equals("D+")) {
                gradePoints = 1.5;
            }
            else if (grade.equals("D")) {
                gradePoints = 1.0;
            }
            else if (grade.equals("D-")) {
                gradePoints = 0.7;
            }
            else if (grade.equals("F")) {
                gradePoints = 0.0;
                System.out.println("FAIL");
            }
            else {
                System.out.println("Invalid grade");
                validGrade = false;
            }

            if (validGrade)
            {
                double qualityPoints = gradePoints * creditHours;

                totalQualityPoints = totalQualityPoints + qualityPoints;
                totalCreditHours = totalCreditHours + creditHours;
            }
        }
        if (totalCreditHours > 0)
        {
            double gpa = totalQualityPoints / totalCreditHours;

            System.out.println("----- GPA SUMMARY -----");
            System.out.println("Total credit hours: " + totalCreditHours);
            System.out.println("Total quality points: " + totalQualityPoints);
            System.out.println("YOUR GPA IS " + gpa);
        }
        else
        {
            System.out.println("No valid courses were entered.");
        }

    }
}

