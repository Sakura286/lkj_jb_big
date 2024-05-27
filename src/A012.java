
public class A012
{
    public static void main(String[] args)
    {
        for (int i = 101; i <= 200; i++)
        {
            boolean isDivided = false;
            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0)
                {
                    isDivided = true;
                    break;
                }
            }
            if (!isDivided)
            {
                System.out.println(i);
            }
        }
    }
}
