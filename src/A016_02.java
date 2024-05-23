import java.util.Scanner;

// 更相减损法
public class A016_02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input two number(such as '36 9'): ");
        int orig_a = input.nextInt();
        int orig_b = input.nextInt();

        int a = orig_a;
        int b = orig_b;
        // 为什么要判断？
        if (a < b)
        {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int c = a - b;
        // 不要去思考更相减损法为什么可以得到结果
        // 只要掌握如何使用即可
        while (b != c)
        {
            a = b;
            b = c;
            // 为什么要判断？
            // 为什么前面的辗转相除法不需要判断？
            // 在纸上写一写
            if (a < b)
            {
                int tmp = a;
                a = b;
                b = tmp;
            }
            c = a - b;
        }
        System.out.printf("The greatest common divisor is %d\n", b);
        System.out.printf("The least common multiple is %d\n", orig_a * orig_b / b);
    }
}
