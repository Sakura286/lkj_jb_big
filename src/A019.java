public class A019
{
    public static void main(String[] args)
    {
        // 从 1 到 1000 里找符合条件的数
        for (int i = 1; i < 1000; i++)
        {
            // 这个字符串形如 28=1+2+4+7+14
            // 当 i = 28 时，我们将字符串初始化为 28=1
            // 后面如果找到新的因子那么就会添加到这个字符串的结尾
            String s = i + "=1";

            // 记录所有因子之和
            int total = 0;

            // 我们从 1 开始寻找，一直找到 i/2 ，如果能整除，说明该数是 i 的因子
            for (int j = 1; j <= i / 2; j++)
            {
                if (i % j == 0)
                {
                    s += "+" + j;
                    total += j;
                }
            }

            // 如果所有因子之和等于该数，则将我们记录下来的字符串打印出来
            if (total == i)
            {
                System.out.println(s);
            }
        }
    }
}
