import java.util.Scanner;

public class A031
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.toLowerCase();
        int day = 0;
        switch (s.charAt(0))
        {
            case 'm' -> day = 1;
            case 't' ->
            {
                if (s.charAt(1) == 'u')
                {
                    day = 2;
                } else
                {
                    day = 4;
                }
            }
            case 'w' -> day = 3;
            case 'f' -> day = 5;
            case 's' ->
            {
                if (s.charAt(1) == 'a')
                {
                    day = 6;
                } else
                {
                    day = 7;
                }
            }
            default -> {}
        }
        System.out.println(day);
    }
}
