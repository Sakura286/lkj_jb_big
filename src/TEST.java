import java.util.Scanner;

public class TEST
{
    public static void main(String[] args)
    {
        test1(4); // 实参 实际参数 actual parameter
    }

    public static void test1(int num) // 形参  形式参数 formal parameter
    {
        System.out.printf("The num is %d\n",num);
        if (num != 1)
        {
            num--;
            test2(num);
        }
    }

    public static void test2(int num)
    {
        System.out.printf("The num is %d\n",num);
        if (num != 1)
        {
            num--;
            test1(num);
        }
    }
}

