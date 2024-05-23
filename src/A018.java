import java.util.Scanner;

public class A018
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数字与次数: ");
        int num = input.nextInt();
        int cnt = input.nextInt();
        int sum = 0;

        // 外层循环：一共有多少项相加
        // 例如输入 2 5，一共有 2 + 22 + 222 + 2222 + 22222 一共 5 项相加
        // 第 1 次得到 2 这一项
        // 第 2 次得到 22 这一项
        // ...
        // 第 5 次得到 22222 这一项
        for (int i = 1; i <= cnt; i++)
        {
            int tmp = 0;
            // 内层循环：单项是怎么生成的
            // 依然以 2 5 作为输入的例子来看，
            // 外层循环到第 5 次的时候， i = 5，那么 j 要循环 5 次生成 22222 这个数字
            // 第 1 次得到 2，加到 tmp 上
            // 第 2 次得到 22，加到 tmp 上
            // ...
            // 第 5 次得到 22222，加到 tmp 上
            for (int j = 1; j <= i; j++)
            {
                tmp += num * Math.pow(10, j - 1);
            }
            sum += tmp;
        }
        System.out.println(sum);
    }
}
