
// This is variables
public class variable {
    Package basic_structure_and_syntax;
    public static void main(String[] args) {
        String name = "Guardian Racelle,T";
        int age = 17;// age = 17; // This would cause an error since age is not declared as final
        int score= 20;
        System.out.println("Name "+ name);
        System.out.println("Age "+ age);
        System.err.println("Score: "+ score);
        System.out.print("Update ; " + age);
        System.out.println("Update: "+ score);
        int newScore = score + 10;
        System.out.println("New Score: " + newScore);
        boolean isPassed = newScore >= 50;
        System.out.println("Passed: " + isPassed);
        String grade;
        if (newScore >= 90) {
            grade = "A";
        } else if (newScore >= 80) {
            grade = "B";
        } else if (newScore >= 70) {
            grade = "C";
        } else if (newScore >= 60) {
            grade = "D";
        } else if (newScore >= 50) {
            grade = "E";
        } else { 
            grade = "F";
        }
        System.out.println("Grade: " + grade);
    }
}
