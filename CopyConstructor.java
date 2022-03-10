public class CopyConstructor {
    final int roll_no;
    final String name;

    CopyConstructor(int roll_no, String name)//Parameterized Constructor
    {
        this.roll_no = roll_no;
        this.name = name;
    }
    //Creating copy constructor
    CopyConstructor(CopyConstructor copyconstructor)
    {
        System.out.println("Copy Constructor created");
       roll_no = copyconstructor.roll_no+1;
       name = copyconstructor.name + 18;
    }
    public int rollNo()
    {
        return roll_no;
    }
    public String Name()
    {
        return name;
    }

    public static void main(String[] args)
    {
        CopyConstructor object1= new CopyConstructor(32, "Mujamil");
//        System.out.println("Roll No of the Student: " + object1.rollNo());
//        System.out.println("Name of the Student: " + object1.Name());

        //Calling the Copy Constructor
        CopyConstructor object2= new CopyConstructor(object1);
        System.out.println("Roll No: " + object2.rollNo());
        System.out.println("Name: " + object2.Name());

    }
}
/*DOCUMENTATION - Copy Constructor

    Constructor must have the same name of the class.
    Constructor is a block of codes similar to method.
    It is called during the instance of the class is created. At the time of calling the constructor,
     the memory for the object is allocated.
    Constructor called only once when an object of the class is created.
    Constructor do not have any return type.(But it implicitly returns the reference of the object).
    If we do not call the constructor explicitly, computer creates the default constructor for the object.


    Copy Constructor
  -> even a final can be changed
  -> addition of fields is easy using copy constructor

 */