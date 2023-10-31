public class Main {
    public static void main(String[] args) {
        // Define the subjects and students
        String[] subjects = { "Math", "Science", "History", "English" };
        String[] students = { "Alice", "Bob", "Charlie", "David" };

        // Create a 2D array to store grades
        double[][] grades = new double[students.length][subjects.length];

        // Populate the grades for each student and subject
        grades[0] = new double[] { 95.5, 88.0, 75.5, 90.5 };
        grades[1] = new double[] { 89.0, 92.5, 80.0, 88.5 };
        grades[2] = new double[] { 78.5, 85.0, 70.5, 75.0 };
        grades[3] = new double[] { 91.0, 94.5, 85.5, 89.5 };

        // Display the grades for each student and subject
        System.out.println("Student Grades:");
        System.out.println("Subject\t\t" + String.join("\t", subjects));
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + "\t\t");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.println();
        }
    }
}