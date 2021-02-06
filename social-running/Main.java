import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] friends = new int[in.nextInt()];
        int lowestSoFar = 0;
        for(int i = 0; i < friends.length; i++){
            friends[i] = in.nextInt();
        }
        for (int i = 0; i < friends.length; i++) {
            int distanceAlone = friends[i] + friends[(i+2)%friends.length];
            lowestSoFar = lowestSoFar == 0 || (lowestSoFar > distanceAlone) ? distanceAlone : lowestSoFar;
        }
        System.out.println(lowestSoFar);
    }
}