public class A013
{
    public static void main(String[] args)
    {
        for (int i = 100; i <= 999; i++)
        {
            // 使用 a b c 分别代表 百位 、十位、个位
            int a, b, c;
            // 我们以 926 这个数字为例
            // 926 ÷ 100 = 9 ... 26
            // 可以看出 926 / 100 = 9 -> 百位数字
            // 926 % 100 = 26 -> 26 / 10 = 2 -> 十位数字
            // 个位数字如何提取，自己试着想一想
            a = i / 100;
            b = (i % 100) / 10;
            c = i % 10;
            if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i)
            {
                System.out.println(i);
            }
        }
    }
}
