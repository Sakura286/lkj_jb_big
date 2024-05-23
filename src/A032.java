import java.util.Scanner;
public class A032
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the string to process: ");
        String s = input.nextLine();
        System.out.print("Please input the char to remove: ");
        char c = input.next().charAt(0);
        s = s.replaceAll(String.valueOf(c),"");
        System.out.println(s);
    }
}
