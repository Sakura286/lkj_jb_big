public class test_circle
{
    public static void main(String args[]){
        Circle small_circle = new Circle();

        System.out.println(small_circle.radius);
        small_circle.join_party("CCP");
        small_circle.get_area();
    }


}

class Circle
{
    int radius = 2;

    double get_area(){
        return radius * radius * 3.14;
    }
    void join_party(String party_name){
        System.out.println("We have joined "+ party_name);
    }
}