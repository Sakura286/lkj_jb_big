
import java.util.Scanner;

public class A015
{
    // 本题请使用三元运算符进行运算
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the score: ");
        int score = input.nextInt();
        char grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
        System.out.printf("The grade is %c", grade);
    }
}
