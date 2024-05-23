import java.util.Scanner;

public class A037
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input 10 numbers: ");

        // 思考这里为什么要定义一个 int 常量
        final int NUM = 10;

        int[] arr = new int[NUM];

        // 获取输入
        for (int i = 0; i < NUM; i++)
        {
            arr[i] = input.nextInt();
        }

        // 交换 - 冒泡排序法
        // 思考：为什么这里用 NUM - 1 ？
        for (int i = 0; i < NUM - 1; i++)
        {
            // 为什么内层循环要从 0 开始，到 NUM - 1 - i 结束？
            for (int j = 0; j < NUM - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        // 输出
        for (int i = 0; i < NUM; i++)
        {
            System.out.printf("%d ", arr[i]);
        }
    }
}
