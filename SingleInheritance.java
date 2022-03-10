class SuperClass {
    int length;
    int breadth;
    SuperClass(int x, int y)  // parameterized Constructor method
    {
        length = x;
        breadth = y;
    }
      int area()
        {
          return length * breadth;
        }
}

class SubClass extends SuperClass  // Inheriting the SuperClass
        {
        int height;
        SubClass (int x, int y, int z)
        {
            // if we want to the access the superclasss , need to add super keyword
          super (x, y);  // accessing the SuperClass by passing the values
          height =z;
        }
    int volume()
        {
            return (length * breadth * height);
        }
}
class SingleInheritance {
    public static void main(String[] args)
    {
//      SuperClass super= new SuperClass(10, 15); //creating instance for the SuperClass
        SubClass sub= new SubClass(10, 15, 5);  //Creating instance for Subclass

        /* we can create object only for subclass and access the superclass method
         without creating object for the superclass */

        int area = sub.area();      //accessing the method in the superclass
        int volume = sub.volume(); // accessing the method in the subclass
        System.out.println(area);
        System.out.println(volume);
    }
}
