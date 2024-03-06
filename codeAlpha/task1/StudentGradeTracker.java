import java.util.Scanner;
class StudentGradeTracker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Student : ");
        int numOfStudents = sc.nextInt();

        // Create arrays to store the names and grades of Students
        String[]  namesOfStudents = new String[numOfStudents];
        double[] gradesOfStudents = new double[numOfStudents];

        // Give Input of Student names and Grades
        for(int i=0; i<numOfStudents; i++){
            System.out.println("Enter the name of the student " +(i+1)+ ":");
            namesOfStudents[i] = sc.next();

            System.out.println("Enter the grade of the student " +(i+1)+ ":");
            gradesOfStudents[i] = sc.nextDouble();
        }

        // Calculating average, highest, and lowest grades
        double sum = 0;
        double highestGrade = gradesOfStudents[0];
        double lowestGrade = gradesOfStudents[0];
        int highestIndex = 0;
        int lowestIndex = 0;

        for(int i=0; i<numOfStudents; i++){
            double grade = gradesOfStudents[i];
            sum += grade;

            if(grade > highestGrade){
                highestGrade = grade;
                highestIndex = i;
            }

            if(grade < lowestGrade){
                lowestGrade = grade;
                lowestGrade = i;
            }
        }

        double averageGrade = sum / numOfStudents;

        // displaying Results

        System.out.println("\nGradeSummary");
        System.out.println("Average Grade is : "+averageGrade);
        System.out.println("Highest Grade is : "+highestGrade+ " (Student " +namesOfStudents[highestIndex]+ " )");
        System.out.println("Lowest Grade is : "+lowestGrade+ " (Student " +namesOfStudents[lowestIndex]+ " )");

        sc.close();
    }

}