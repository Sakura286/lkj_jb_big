import java.util.Scanner;

public class A004
{
    public static void main(String argsp[])
    {
        int year, month, day;
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        month = input.nextInt();
        day = input.nextInt();
        int sum = 0;
        switch (month)
        {
            case 1 -> sum = 0;
            case 2 -> sum = 31;
            case 3 -> sum = 59;
            case 4 -> sum = 90;
            case 5 -> sum = 120;
            case 6 -> sum = 151;
            case 7 -> sum = 181;
            case 8 -> sum = 212;
            case 9 -> sum = 243;
            case 10 -> sum = 273;
            case 11 -> sum = 304;
            case 12 -> sum = 334;
            default ->
            {
                System.out.println("date error");
                return;
            }
        }
        // 别忘了算上“天”
        sum += day;
        // 闰年有两种情况：
        // 1. 可以被 400 整除
        // 2. 可以被 4 整除但是不可以被 100 整除
        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month > 2)
        {
            sum += 1;
        }
        System.out.println(sum);
    }
}
