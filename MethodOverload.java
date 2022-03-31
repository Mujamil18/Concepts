public class MethodOverloading
{
    public static void main(String[] args)
    {
        Area object= new Area();
        object.area(5);  
        object.area(5, 4);
        object.area(3.2f);
    }
}
class Area
{
    int length;
    int breadth;
    float radius;
    //Area of Square
    void  area(int x)
    {
       length= breadth= x;
       System.out.println(x * x);
    }
    //Area of Rectangle
    void area(int x, int y)
    {
       length= x;
       breadth= y;
       System.out.println(x*y);
    }
    //Area of Circle
    void area(float x)
    {
       radius= x;
       System.out.println(3.14 * radius * radius);
    }
}
