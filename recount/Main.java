import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> candidates = new HashMap<>();
        String s = "";
        int max = 0;
        int same = 0;
        while(in.hasNextLine()){
            s = in.nextLine();
            if(s.equals("***")){
                break;
            }
            if(candidates.containsKey(s)){
                candidates.put(s, candidates.get(s) + 1);
            }else{
                candidates.put(s, 1);
            }
            
            if(candidates.get(s) > max){
                max = candidates.get(s);
            }
        }

        for(String candidate : candidates.keySet()){
            if(candidates.get(candidate) == max){
                s = candidate;
                same++;
            }
        }

        if(same == 1){
            System.out.println(s);
        }else{
            System.out.println("Runoff!");
        }
    }
}