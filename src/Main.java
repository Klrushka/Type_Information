import task10.TrueObject;
import task4.*;
import task9.RecursiveHierarchy;

import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


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

         */












    }


}

