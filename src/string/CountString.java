package string;

public class CountString {
    public static void main(String[] args) {

        String value = "   fly me   to   the moon  ";

       String[] array = value.split(" ");
        System.out.println(array[array.length -1].length());


/*
        String value = "";

        for(int i= s.length()-1; i>=0;i--){
            value = s.charAt(i) + value;
            if (s.charAt(i)== ' ') {
                break;
            }
        }

        return value.trim().length();*/
    }
}
