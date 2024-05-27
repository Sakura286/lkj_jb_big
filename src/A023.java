public class A023
{
    public static void main(String[] args)
    {
        // 先打印上面的三角，可以发现每一层依次是 1, 3, 5, 7
        // 从 1 开始循环，到 7 结束，中间每层的间隔是 2
        for (int i = 1; i <= 7; i += 2)
        {
            // 观察前面有多少空格
            // i = 1 --> 3
            // i = 3 --> 2
            // i = 5 --> 1
            // 那么 j = (7 - i) ÷ 2
            for (int j = 1; j <= (7 - i) / 2; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        // 先打印上面的三角，可以发现每一层依次是 5, 3, 1
        // 从 5 开始循环，到 1 结束，中间每层的间隔是 -2
        for (int i = 5; i >= 1; i -= 2)
        {
            for (int j = 1; j <= (7 - i) / 2; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
