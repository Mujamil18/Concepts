package com.oops.practice;

public class InnerClassDemo {
    public static void main(String[] args) {
       OuterClass outer = new OuterClass();
       outer.publicMethod();
       /*outer.privateMethod(); -- cannot access*/
        OuterClass.staticMethod();
        outer.invokeInnerClassMethods();
        //invoking inner class method
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.invokingMethod();
        //invoking static inner class
        OuterClass.StaticClass staticClass = new OuterClass.StaticClass();
        staticClass.invokingMethod();

    }
}
class OuterClass{
    int defaultVar = 10;
    static private String STATIC_PRI_VAR = "Static Private Variable";
    InnerClass inner = new InnerClass();
    StaticClass staticClass = new StaticClass();
//    static OuterClass outer = new OuterClass();
    public void publicMethod(){
        System.out.println("This is public method with instance variable ");
        System.out.println("INT -- > "+defaultVar + " STRING --> "+STATIC_PRI_VAR );
    }
    private void privateMethod(){
        System.out.println("This method is private with instance variable ");
        System.out.println("INT -- > "+defaultVar + "STRING --> "+STATIC_PRI_VAR );
    }
    static void staticMethod(){
        System.out.println("This method is static with instance variable ");
        System.out.println("INT -- > cannot accessible without object "/* +defaultVarn -- cannot access*/ + "STRING --> "+STATIC_PRI_VAR );

    }
    public void invokeInnerClassMethods(){

        inner.display1();
        inner.display2();
        /* display(); -- cannot access inner class member in the other class without object */
        System.out.println("Inner class instance variable --> "+ inner.innerClassVar);
        staticClass.show1();
        staticClass.show2();
        System.out.println("Static inner class instance variable --> "+ staticClass.innerClassVarInStatic);

    }
    //non-static inner class
    class InnerClass{
        int innerClassVar = 100;
//        private static String STATIC_VAR = "Static variable in inner class";
        /* static member in non static inner class is not supported in jdk 11.
        available in jdk 16)*/

        void display1(){
            System.out.println("This method is inside the Inner Class with instance variable of Inner Class ");
            System.out.println("INT -- > "+innerClassVar);
        }
        void display2(){
            System.out.println("This method is inside the Inner Class with instance variable of Outer Class ");
            System.out.println("INT -- > "+defaultVar + "STRING --> "+STATIC_PRI_VAR );
        }
        /*static void staticMethodInnerClass(){
            static method cannot be defined inside the non static inner class
        }*/
//        void invokingMethod(){
//            System.out.println("This method is from Inner Class to invoke private method and static method");
//            publicMethod();
//            privateMethod();
//            staticMethod();
//
//        }
        void invokingMethod(){
            //invoking private method of Outer Class - it is accessible onlky in inner class
            privateMethod();
        }
    }
    //static inner class
    static class StaticClass{
        int innerClassVarInStatic = 200;
        void show1(){
            System.out.println("This method is inside the Static Inner class with instance variable of the Inner class ");
            System.out.println("INT -- > "+ innerClassVarInStatic);
        }
        void show2(){
            System.out.println("This method is inside the Static Inner class with instance variable of the Outer class ");
            System.out.println("INT -- > cannot accessible without static object" /*defaultVar -- cannot acces*/ + "STRING --> "+STATIC_PRI_VAR );

        }
        void invokingMethod(){
            OuterClass outer = new OuterClass();
            /*invoking private method of Outer Class - if the class is static,
            private method of Outer class is only accessible with object*/
            outer.privateMethod();
        }
//        void invokingMethod(){
//            System.out.println("This method is from Inner Class to invoke private method and static method");
//            //non static public and private methods of Outer class is accessible inside the static inner class only with object
//            outer.publicMethod();
//            outer.privateMethod();
//            staticMethod();
//
//        }

    }
}
