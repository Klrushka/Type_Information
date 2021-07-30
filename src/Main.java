import task10.TrueObject;
import task20.InfoAboutClass;
import task25.pack.Methods;
import task4.*;
import task9.RecursiveHierarchy;

import java.io.FileReader;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {


        /*
        Exercise 3: (2) Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a
        Shape, then downcast it back to a Rhomboid. Try downCasting to a Circle and see what
        happens.

        Exercise 4: (2) Modify the previous exercise so that it uses instanceof to check the type
        before performing the downcast.
         */

        Shape shapeRhomboid = new Rhomboid();

        System.out.println(shapeRhomboid);

        try {
            System.out.println((Circle) shapeRhomboid);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }

        // Ex 4
        System.out.println((shapeRhomboid instanceof Circle) ? (Circle) shapeRhomboid : "ClassCastException");

        System.out.println();


        /*
        Exercise 8: (5) Write a method that takes an object and recursively prints all the classes
        in that object’s hierarchy.


        Exercise 9: (5) Modify the previous exercise so that it uses
        Class.getDeclaredFields( ) to also display information about the fields in a class.
         */

        System.out.println("Hierarchy");

        RecursiveHierarchy.hierarchy(new ArrayList<>());

        System.out.println();


        /*
        Exercise 10: (3) Write a program to determine whether an array of char is a primitive
        type or a true Object.
         */

        System.out.println(TrueObject.isObject());




        /*
        Exercise 20: (5) Look up the interface for java.lang.Class in the JDK documentation
        from http://java.sun.com. Write a program that takes the name of a class as a command-line
        argument, then uses the Class methods to dump all the information available for that class.
        Test your program with a standard library class and a class you create.
         */


        InfoAboutClass.info(LinkedHashSet.class.getCanonicalName());


        /*
        Exercise 24: (4) Add Null Objects to RegisteredFactories.java.
         */


        System.out.println();


        /*
        Exercise 25: (2) Create a class containing private, protected and package-access
        methods. Write code to access these methods from outside of the class’s package.
         */

        Methods methods = new Methods();

        for(Method method : methods.getClass().getDeclaredMethods()){
            method.setAccessible(true);
            method.invoke(methods);
        }

















    }


}

