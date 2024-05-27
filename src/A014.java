import java.util.Scanner;

public class A014
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the integer:");
        int n = input.nextInt();
        // 观察一下这个条件永远为 true 的 while 循环是怎么退出的
        while (true)
        {
            boolean isDivided = false;
            // 可以看出本题的处理方式与上一题相似，最大的不同是这个循环的条件，观察一下有什么不同
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    // 这一句的作用是什么？
                    n = n / i;
                    isDivided = true;
                    System.out.printf("%d ", i);
                }
            }
            if (!isDivided)
            {
                System.out.println(n);
                break;
            }
        }
    }
}
