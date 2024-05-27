public class A020
{
    public static void main(String[] args)
    {
        // h 代表第 x 次落地后弹起的高度
        // s 代表第 x 次落地时经过的距离
        float h = 100;
        float s = 100;
        h /= 2;
        for (int i = 2; i <= 10; i++)
        {
            s += 2 * h;
            h /= 2;
        }
        System.out.print(s + " " + h);
    }
}
