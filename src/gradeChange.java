import java.util.Scanner;

public class gradeChange
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("输入目标成绩");
        double score = input.nextDouble();
        System.out.print("the grade of this student is");
        printGrade(score);

    }

    public static void printGrade(double score)
    {
        if (score > 90)
        {
            System.out.print('A');
        } else if (score > 80)
        {
            System.out.print('B');
        } else if (score > 70)
        {
            System.out.print('C');
        } else if (score > 60)
        {
            System.out.print('D');
        } else if (score < 60)
        {
            System.out.print('F');
        }
    }
}
