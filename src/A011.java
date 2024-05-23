public class A011
{
    public static void main(String[] args)
    {
        int r3 = 0;
        int r2 = 0;
        int r1 = 1;
        for (int i = 1; i <= 40; i++)
        {
            System.out.println(r1 + r2 + r3);
            r3 += r2;
            r2 = r1;
            r1 = r3;
        }
    }
}
