package string;

public class RemoveRepetedString {
    public static void main(String[] args) {

        String n = "aazz";
        int a_pointer =0 ;
        int count = 0;
        String str = "";
        char check = ' ';
         while ( a_pointer < n.length()){
             if (check != n.charAt(a_pointer)){
                 str = str + n.charAt(a_pointer);
             }
             if (check == n.charAt(a_pointer)){
                 count++;
             }
             check = n.charAt(a_pointer);
            a_pointer++;
        }

         boolean flag = false;
         if (count == 1){
             flag = true;
         }


        System.out.println(count);
        System.out.println(str);
    }
}
