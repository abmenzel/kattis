import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startDegree = in.nextInt();
        int endDegree = in.nextInt();        
        int clockwise = (360 - (startDegree - endDegree)) % 360;
        int antiClockwise = clockwise - 360;

        System.out.println(clockwise <= 180 ? clockwise : antiClockwise);
    }
}