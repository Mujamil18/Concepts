
//class Test
//{
//   int x, y;
//   Test()
//   {
//       //test class whose objects are cloned
//       x= 10;
//       y=20;
//   }
//}
//public class ObjectClone {
//    public static void main(String[] args)
//    {
//        Test object= new Test();
//        System.out.println(object.x + " " + object.y);
//        //Creating a new reference variable pointing the same address as original object
//        Test cloneObject= object;
//        //any changes made with clone object will reflect in original object
//        cloneObject.x= 100;
//        System.out.println(object.x + " " + object.y);
//        System.out.println(cloneObject.x + " " + cloneObject.y);
//
//    }
//}

/* Documentation- OBJECT CLONING

- Object Clone can be done using th clone() method
- every class implements the clone() method should call the super.clone() method
- the class must also implement java.lang.Cloneable, otherwise it will throw CloneNotSupportException

 */
class Test
{
    int x, y;
}
//containing instance for the parent class and implements clone with shallow copy
class CloneTest implements Cloneable
{
    int a, b;
    //creating instance for the class Test
    Test object = new Test();


    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class ObjectClone
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        CloneTest object1= new CloneTest();
        object1.a= 10;
        object1.b= 40;
        object1.object.x= 100;
        object1.object.y= 200;

        CloneTest object2= (CloneTest)object1.clone();
        //creating copy of the object1 and passing it to object2
        object2.a=100;
        //change in primitive type of object2 will not reflect in object1
        object2.object.x= 500;

        //change in object type will reflect in object1(shallow copy) and object2
        System.out.println(object1.a + " " + object1.b);
        System.out.println(object1.object.x + " " + object1.object.y);
        System.out.println(object2.a + " " + object2.b);
        System.out.println(object2.object.x + " " + object2.object.y);

    }
}
