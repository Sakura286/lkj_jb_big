import java.util.Scanner;

public class A029
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String s = "";
        for (int i = 1; i <= 5; i++)
        {
            if (num < Math.pow(10, i - 1))
            {
                break;
            }
            int n = (int) (num % Math.pow(10, i) / Math.pow(10, i - 1));
            s += n;
        }
        System.out.println(s);
    }
}
