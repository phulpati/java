package statement;

public class Result {
    public static void main(String[] args) {
        String name = "Fulpati";
        int roll_no = 22;
        int DSA = 39, SAD = 86, STAT = 80, WEB = 90, JAVA = 90;
        float total;
        float percentage;

        total = DSA + SAD + STAT + WEB + JAVA;
        percentage = (total * 100) / 500;
        if (percentage >= 80 && DSA >= 40 && SAD >= 50 && STAT >= 40 && WEB >= 40 && JAVA >= 40) {
            System.out.println(name + "  " + roll_no + "     " + "You are pass");
            System.out.println("You have score :  " + percentage + "%");
            System.out.println("you got distinction: " + percentage + "%");
        } else if (percentage >= 60 && DSA >= 40 && SAD >= 50 && STAT >= 40 && WEB >= 40 && JAVA >= 40) {
            System.out.println(name + "  " + roll_no + "    " + " you are fail");
            System.out.println("You have score :  " + percentage + "%");
            System.out.println("you got first divison: " + percentage + "%");
        } else if (percentage >= 50 && DSA >= 40 && SAD >= 50 && STAT >= 40 && WEB >= 40 && JAVA >= 40) {
            System.out.println(name + "  " + roll_no + "    " + " you are pass");
            System.out.println("You have score :  " + percentage + "%");
            System.out.println("you got second divison: " + percentage + "%");
        } else {
            System.out.println(name + "  " + roll_no + "    " + " you are fail");
            System.out.println("You have score :  " + percentage + "%");
            System.out.println("you got N0 divison: " + percentage + "%");
        }
    }
}
