public class Conditionals {

    public static void main(String[] args) {

        // CONDITIONALS

        int grade = 40; // A-80, B-70, C-60, D-0
        String classe;

        if (grade >= 80) {
            classe = "A";
        } else if (grade < 80 && grade >= 70) {
            classe = "B";
        } else if (grade < 70 && grade >= 60) {
            classe = "C";
        } else if (grade < 60 && grade >= 0) {
            classe = "D";
        } else {
            classe = "";
        }

        switch (classe) {
            case "A":
            case "B":
                System.out.println("Approved!");
                break;
            case "C":
            case "D":
                System.out.println("Reproved!");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
