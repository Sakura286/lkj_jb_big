import java.util.Scanner;

public class A005
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // 在同一行里连续输入三个数，以空格作为间隔，这样写就可以读进来
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        // 为了交换两个变量的值，需要一个中间变量作为辅助
        int tmp;
        if (a > b)
        {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (a > c)
        {
            tmp = a;
            a = c;
            c = tmp;
        }
        // ↑ 经过两轮的比较后，a 已经是最小的数了
        // ↓ 所以接下来要让剩下的最小的（也就是说三个里面第二小的）放到 b 上
        if (b > c)
        {
            tmp = b;
            b = c;
            c = tmp;
        }
        System.out.printf("From small to big: %d %d %d\n", a, b, c);
    }
}
