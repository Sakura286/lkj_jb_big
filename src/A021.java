public class A021
{
    public static void main(String[] args)
    {
        // 使用 cnt 变量来表示第 x 天还没有开始吃桃子时桃子的数量
        int cnt = 1;
        for(int i =10;i>1;i--){
            cnt = (cnt + 1) *2;
            // 第 1 次循环获得的 cnt 是第 9 天还没有开始吃桃子时桃子的数量
        }
        System.out.println(cnt);
    }
}
