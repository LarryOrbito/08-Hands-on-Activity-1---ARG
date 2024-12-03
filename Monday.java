import java.time.LocalTime;
import java.util.Scanner;

public class Monday extends Weekday {
    @Override
    public void showAlarm() {
        LocalTime now = LocalTime.now();

        if (alarmTime.isBefore(now) || alarmTime.equals(now)) {
            System.out.println("Alarm is set for tomorrow!");
        } else {
            System.out.println("I'll wake you up later!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Monday monday = new Monday();

        System.out.print("Enter time for alarm in this format (HH:MM): ");
        String timeInput = scanner.nextLine();

        try {
            monday.setAlarm(timeInput);
            monday.showAlarm();
        } catch (Exception e) {
            System.out.println("Invalid time format! Please use the HH:MM format.");
        }

        scanner.close();
    }
}
