import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static int calcAge(Calendar current, String dob){
        return current.get(current.YEAR) - Integer.valueOf(dob.split("-")[0]);
    }

    public static void main(String[] args) {
        Calendar current = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Date of Birth (YYYY-MM-DD):");
        String input = scanner.nextLine();
        System.out.println(calcAge(current,input));

    }
}