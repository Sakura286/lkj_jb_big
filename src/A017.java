import java.util.Scanner;

public class A017
{
    public static void main(String[] args)
    {
        // 搜索“java输入一行字符串”
        // https://blog.csdn.net/ch717828/article/details/43527571
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        // 查一下 String 对象的 toLowerCase 方法做了什么，然后思考为什么要这样做
        s = s.toLowerCase();

        // 依次是：英文字母、空格、数字、其他字符的个数
        int char_cnt = 0;
        int space_cnt = 0;
        int num_cnt = 0;
        int other_cnt = 0;

        for (int i = 0; i < s.length(); i++)
        {
            // 查一下 String 对象的 charAt 方法，它的输入参数是什么？它的返回值是什么类型？
            char chr = s.charAt(i);
            if (chr >= 'a' && chr <= 'z') char_cnt++;
            else if (chr == ' ') space_cnt++;
            else if (chr >= '0' && chr <= '9') num_cnt++;
            else other_cnt++;
        }
        System.out.printf("character: %d, space: %d, number: %d, other: %d", char_cnt, space_cnt, num_cnt, other_cnt);

    }
}
