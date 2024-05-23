
class Human // 模板 模子
{
    String gender;
    String belief;
    Boolean nigger;

    void eat(String food)
    {
        System.out.println("lkj is eating "+food);
    }

    void sleep()
    {

    }

}


public class test_Human
{
    public static void main(String[] args)
    {
        Human lkj = new Human(); // 获得了叫做 lkj 的 Human 类的对象
        lkj.gender = "femboy";
        lkj.belief = "liu";
        lkj.nigger = true;
        lkj.eat("noodles");

        Human cx = new Human();
        cx.gender = "boy";
        cx.nigger = lkj.nigger;
        cx.sleep();

    }
}
