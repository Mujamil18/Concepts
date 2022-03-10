class Parent{
    int length;
    int breadth;

    Parent (int x, int y) // Constructor method with two parameters
    {
        length = x;
        breadth = y;
    }
    Parent (int x) //Constructor method with single parameter
    {
        length = breadth = x;
    }
    int area()
    {
        return length * breadth;
    }
}
public class ConstructorOverload {
    public static void main(String[] args)
    {
        //if we give single input , it automatically accesses the method with single parameter
        Parent myObject1= new Parent(3);
        Parent myObject2= new Parent (3, 7);
        System.out.println(myObject1.area());
        System.out.println(myObject2.area());
    }
}

/*DOCUMENTATION -  Constructor

    Constructor must have the same name of the class.
    Constructor is a block of codes similar to method.
    It is called during the instance of the class is created. At the time of calling the constructor,
     the memory for the object is allocated.
    Constructor called only once when an object of the class is created.
    Constructor do not have any return type.(But it implicitly returns the reference of the object).
    If we do not call the constructor explicitly, computer creates the default constructor for the object.
    Constructor can be Overloaded but cannot be Override.

 */
