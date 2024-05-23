public class testCall
{
    public static void main(String[] args)
    {
        int i = testPrint1();
        testPrint2();
    }

    public static int testPrint1(){
        return 1;
    }

    public static void testPrint2(){
        System.out.println("This is 2");
    }
}
