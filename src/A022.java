public class A022
{
    public static void main(String[] args)
    {
        // -1 未经判断，1 配对，0 不配对
        int[][] result = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        changeValue(result, 1, 1, 0);

    }

    public static int[][] changeValue(int[][] arr, int a, int b, int state)
    {
        arr[a][b] = state;
        arr[b][a] = state;
        if (state == 1)
        {
            for (int i = 1; i <= 3; i++)
            {
                if (i != a)
                {
                    changeValue(arr,i,b,0);
                }
                if (i != b){
                    changeValue(arr,i,b,0);
                }
            }
        }
        return arr;
    }
}
