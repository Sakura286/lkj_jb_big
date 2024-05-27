public class Main
{
    public static void main(String[] args)
    {
        String name = "Xu Rui";
        String gender = "male";
        int age = 26;
        String job = "sales manager";
        String address = "Huajian";
        System.out.println("My name is " + name + ". My gender is " + gender + ". I am " + age + " years old. My job is " + job + ". I live in " + address + ".");
        System.out.printf("My name is %s. My gender is %s. I am %d years old. My job is %s. I live in %s.", name, gender, age, job, address);
        //dflkdjsflkja;
        //int i =j;
    }

    public static void method1(int n, int m)
    {
        n+=m;
        method2(3);
    }

    public static int method2(int n) {
        return 1;
    }

}