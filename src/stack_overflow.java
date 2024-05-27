public class stack_overflow
{
    public static void main(String[] args)
    {
        double s1 = calc(1);
        double s2 = calc(2,3);
    }

    public static double calc(double a){
        return a*a*3.14;
    }
    public static double calc(double a,double b){
        return a*b;
    }
}
