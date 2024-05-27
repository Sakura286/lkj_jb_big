

public class A025
{
    public static void main(String[] args)
    {
        // runoob.com 上面提供的解答是错误的
        // 注意我们用了 long 类型，这个数太大了 int hold 不住
        long sum = 0;
        // 加 20 项
        for (int i = 1; i <= 20; i++)
        {
            long tmp = 1;
            // 计算单项的阶乘
            // 例如 i = 15 的时候，计算 15!
            // 那么就是 15 * 14 * 13 * ... * 1
            // 从 15 到 1 ，每一步减少 1
            for (int j = i; j >= 1; j--)
            {
                tmp *= j;
            }
            sum += tmp;
        }
        System.out.println(sum);
    }
}
