import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int capacity = in.nextInt();
        int stops = in.nextInt();
        int currentPassengers = 0;
        boolean possible = true;

        for(var i = 0; i < stops; i++){
            int leftTrain = in.nextInt();
            int enteredTrain = in.nextInt();
            int waitingAtStation = in.nextInt();
            currentPassengers += enteredTrain - leftTrain;
            
            if(i == 0 && leftTrain > 0) possible = false;
            else if(i == stops-1 && currentPassengers > 0 ) possible = false;

            if(currentPassengers > capacity || currentPassengers < 0) possible = false;
            if(currentPassengers < capacity && waitingAtStation > 0) possible = false;

        }
        System.out.println(possible ? "possible" : "impossible");
    }
}