
import java.util.Scanner;
public class A027
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        reverse(s);
    }

    public static void reverse(String s){
        if(s.equals("")){
            return;
        }else{
            char c = s.charAt(0);
            reverse(s.substring(1));
            System.out.print(c);
        }
    }
}
