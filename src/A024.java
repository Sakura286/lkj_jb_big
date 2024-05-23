public class A024
{
    public static void main(String[] args)
    {
        // f2 作为分母，f1 作为分子
        int f1 = 1;
        int f2 = 2;

        double sum = 0;

        // 循环 20 次，这个不用怀疑
        for(int i =1;i<=20;i++){
            // 每次循环都加一项
            sum += 1.0 * f2 / f1;
            // 有没有找到规律？
            // 1 2 3 5 8 13 21...
            // 第 3 项是第 1, 2 项之和
            int tmp = f1 + f2;
            f1 = f2;
            f2 = tmp;
        }
        System.out.println(sum);
    }
}
