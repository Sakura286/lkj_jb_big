public class A003
{
    public static void main(String args[])
    {
        int max = 2;
        // 既然 原数 + 100 与 原数 + 268 都是两个完全平方数，
        // 那么如果两个连续的数的平方之差大于 168 的时候，我们就没有必要再找下去了
        while (max * max - (max - 1) * (max - 1) <= 168)
        {
            max = max + 1;
        }

        // 先定一个大数，然后找比它小且仅小 168 的完全平方数
        // 如果之间的差超过了 168 ，那么就没有必要去找更小的数了
        for (int i = max; i >= 1; i--)
        {
            int big = i * i;
            for (int j = 1; j <= i - 1; j++)
            {
                int small = j * j;
                if ((big - 168 == small) & (big > 0))
                {
                    System.out.println(big - 268);
                    break;
                }
                if (big - 168 < small)
                {
                    break;
                }
            }
        }
    }

}