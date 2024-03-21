import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2] ;

        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";

        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";

        schedule[2][0] = "Tuesday";
        schedule[2][1] = "gym; meet friends";

        schedule[3][0] = "Wednesday";
        schedule[3][1] = "study; play video games";

        schedule[4][0] = "Thursday";
        schedule[4][1] = "workout; shopping";

        schedule[5][0] = "Friday";
        schedule[5][1] = "movie night; dinner with family";

        schedule[6][0] = "Saturday";
        schedule[6][1] = "outing; relax";

        while (true){
            System.out.println("Please, input the day of the week:");
            String dayOfWeek = checkInputData ();
            if (dayOfWeek.equals("EXIT")) break;
            else Answer(schedule, dayOfWeek);
        }
    }

    public static void Answer (String [][] Schedule ,String dayOfWeek) {
        for (int i = 0; i < Schedule.length; i++) {
            if (Schedule[i][0].toUpperCase().equals(dayOfWeek)){
                System.out.printf("Your tasks for %s: %s \n", Schedule[i][0] , Schedule[i][1] );
                return;
            }
        }
    }
    public static String checkInputData() {
        Scanner scan = new Scanner(System.in);
        String dayOfWeek = scan.nextLine().toUpperCase();
        switch (dayOfWeek) {
            case "SUNDAY", "MONDAY", "WEDNESDAY", "TUESDAY", "THURSDAY", "FRIDAY", "SATURDAY" , "EXIT":
                return dayOfWeek;
            default:
                System.out.println("Sorry, I don't understand you, please try again.");
                return checkInputData();
        }
    }

}