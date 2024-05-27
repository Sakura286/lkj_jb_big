import java.util.Scanner;

public class A033
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
