/*DOCUMENTATION

Interface define only abstract methods and final fields.
This means interface do not contain any code to implement.
Class which implements an interface defines the code for implementation.
Interface cannot be used to declare objects. it can be only inherited by a class.

Method declaration - methods of an interface are naturally abstract.
                     does not contain block of code or statement inside the methods.
                     only contain list of methods and method declaration ends with ;(end of statement).
                     the class implements the interface must define the code for the method

Variable declaration - members of interface are always constant(static and final)
                      (although static and final keyword is not present, all the variables are treated
                       as constant)

Extending Interfaces- interface can be extended from other interface.
                  the new interface will inherit all the members of the old interface.
(we can put all the constants in one interface and methods in another. This will enable us to use the
constants in classes where methods are not required.)

Implementing Interfaces - only a class can implement an interface
                          interfaces are used as "superclass" whose properties are inherited by classes.
                          a class can extend another class while implementing interface.
(NOTE: a class that implements an interface does not implement all the methods of interface,
then the class becomes abstract and the class cannot be instantiated.)


 */

interface Interface1 {
    int number = 100;  //
    String str = "Hello Interface";

    void methodOfInterface();
    void sum(int a, int b);

}
class InterfaceDemo implements Interface1  //Interface implemented
{
    public void methodOfInterface() {
        System.out.println(str);
        System.out.println(number + " is a member of Interface");
        System.out.println("Method from Class 1");
    }

    public void sum(int a, int b)
    {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Interface1 myObject1 = new InterfaceDemo (); //Instantiates the Interface
        myObject1.methodOfInterface();
        myObject1.sum(12, 10);
    }
}



