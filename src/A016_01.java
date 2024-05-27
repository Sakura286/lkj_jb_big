import java.util.Scanner;

// 辗转相除法
public class A016_01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input two number(such as '36 9'): ");
        int orig_a = input.nextInt();
        int orig_b = input.nextInt();
        int a = orig_a;
        int b = orig_b;
        int c = a % b;
        // 不要去思考辗转相除法为什么可以得到结果
        // 只要掌握如何使用即可
        while (c != 0)
        {

            a = b;
            b = c;
            c = a % b;
        }
        System.out.printf("The greatest common divisor is %d\n", b);
        System.out.printf("The least common multiple is %d\n", orig_a * orig_b / b);
    }
}
