public class A028
{
    public static void main(String[] args)
    {
        System.out.println(age(5));
    }

    // n: 第 n 个人
    public static int age(int n)
    {
        if (n == 1) return 10;
        return age(n - 1) + 2;
    }
}
