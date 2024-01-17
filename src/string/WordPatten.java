package string;
import java.util.HashMap;


public class WordPatten {
    public static void main(String[] args) {

        //  290. Word Pattern

        String pattern = "abba";
        String s = "dog cat cat dog";

        HashMap<Character,String> map = new HashMap<>();
        map.put('a',"dog");
        map.put('b',"cat");

        StringBuilder sb = new StringBuilder();

        for (int i=0 ;i<pattern.length();i++){
            if (map.containsKey(pattern.charAt(i))){
                sb.append(map.get(pattern.charAt(i)));
            }
            sb.append(" ");
        }

        if (s.trim().equals(sb.toString().trim())){

            System.out.println("true");
        }

    }
}
