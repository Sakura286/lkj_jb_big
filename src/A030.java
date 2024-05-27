import java.util.Scanner;

public class A030
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean isPalindrome = true;
        for (int i = 1; i <= 5; i++)
        {
            int a = (int) (num % Math.pow(10, i) / Math.pow(10, i - 1));
            int b = (int) (num % Math.pow(10, 5 + 1 - i) / Math.pow(10, 5 - i));
            if (a != b)
            {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
