interface MyInterface
{
    void myMethod();
    default void defaultMethod()
    {
        System.out.println("This is a default method");
    }
    static void staticMethod()
    {
        System.out.println("This is a static method");
    }
}
class DefaultStaticInterface implements MyInterface {
    public void myMethod() {
        System.out.println("This is my method ");
    }

    public void method1()
    {
        //default method in an interface can be called from the implementing class like this
        MyInterface.super.defaultMethod();
        System.out.println("Default method is executed from the implements Class");
        MyInterface.staticMethod();
        System.out.println("Static method is executed from the implements class");
    }

}
public class DefaultStatic
{
    public static void main(String[] args)
    {
        DefaultStaticInterface object= new DefaultStaticInterface();
        MyInterface myObject= new DefaultStaticInterface();
        myObject.myMethod();
        object.method1();


//       if the main method is inside the class , we can call the default method of Interface
//        using ClassObject.defaultMethod();
//         myObject.defaultMethod();

        //Static method can be called using the Interface
//        MyInterface.staticMethod();
    }
}
