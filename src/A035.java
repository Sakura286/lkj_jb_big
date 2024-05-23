import java.util.Scanner;

public class A035
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // 输入的字符串
        String s = input.nextLine();
        // 新生成的字符串
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            t += s.charAt(i);
        }
        System.out.println(t);
    }
}
