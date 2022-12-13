public class InterfacePractice {
    public static void main(String[] args)
    {
        Callback c = new Client1();
        /*The above process is called Dynamic Binding. Dynamic Binding is the reference of
        the object will be declared in the runtime of the program. Dynamic Binding is achieved 
        by implementing interface. (NOTE: We normally create object for a class to invoke a method
        is called Static Binding).
         */
        c.callbackMethod(21);/*can call interface methods
        c.nonInterfaceMethod(); cannot call noninterface method which is in implementing class
        non interface methods can only be invoked with creating object assigned to implementing 
        class type reference*/
        Client1 clientObj1 = new Client1();
        clientObj1.nonInterfaceMethod();
        Client2 clientObj2 = new Client2();
        c = clientObj2;
        c.callbackMethod(20);
        clientObj2.anotherMethod();
    }
}




public interface Callback {
    void callbackMethod(int data);
    default void display(){
        System.out.println("This method is a default method with definition inside the interface");
    }
}
class Client1 implements Callback{
    public void callbackMethod(int data){
        System.out.println("Callback method invoked with "+data);
    }
    public void nonInterfaceMethod(){
        System.out.println("Classes that implement interfaces can also have nonInterface method");
    }
}
class Client2 implements Callback{
    public void callbackMethod(int data){
        System.out.println("Method from another implementing class with "+data);
    }
    public void anotherMethod(){
        System.out.println("Another non interface method from another implement class");
    }
}
