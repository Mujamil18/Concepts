class Parent
{
    private void method1()
    {
        System.out.println("This is a private method from Parent class");
    }
    protected void method2()
    {
        System.out.println("This is a protected method from parent class");
    }
}
class Child extends Parent
{
    private void method1()
    {
        System.out.println("This is private method from Child class");
    }
    //protected instance method can be made public when overriding
    public void method2()
    {
        System.out.println("This is private method from child class");
    }

}
public class MethodOverriding
{
    public static void main(String[] args) 
    {
        Parent parent = new Parent();
//        parent.method1();  //private method cannot be accessed from other class
        parent.method2();
        Child child = new Child();
        child.method2();

//        Parent parent = new Child();
//        parent.method2();
    }

}
