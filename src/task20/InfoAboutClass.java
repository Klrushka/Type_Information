package task20;

import java.util.Arrays;

public class InfoAboutClass {


    private static void print(String s) {
        System.out.println(s);
    }


    public static void info(String s) {

        Class<?> aClass = null;

        try {
            aClass = Class.forName(s);

            print("getAnnotatedInterfaces(): " + Arrays.toString(aClass.getAnnotatedInterfaces()));
            print("getAnnotatedSuperclass(): " + aClass.getAnnotatedSuperclass().toString());
            print("getAnnotations(): " + Arrays.toString(aClass.getAnnotations()));
            print("getCanonicalName(): " + aClass.getCanonicalName());
            print("getClasses(): " + Arrays.toString(aClass.getClasses()));


            if (aClass.getClassLoader() == null) print("\"getClassLoader(): null");
            else
                print("getClassLoader(): " + aClass.getClassLoader().toString());                                           // check null

            if (aClass.getComponentType() == null) print("getComponentType(): null");
            else
                print("getComponentType(): " + aClass.getComponentType());

            print("getConstructors(): " + Arrays.toString(aClass.getConstructors()));
            print("getDeclaredAnnotations(): " + Arrays.toString(aClass.getDeclaredAnnotations()));
            print("getDeclaredClasses(): " + Arrays.toString(aClass.getDeclaredClasses()));
            print("getDeclaredConstructors(): " + Arrays.toString(aClass.getDeclaredConstructors()));
            print("getDeclaredFields(): " + Arrays.toString(aClass.getDeclaredFields()));
            print("getDeclaredMethods(): " + Arrays.toString(aClass.getDeclaredMethods()));


            if (aClass.getDeclaringClass() == null) print("getDeclaringClass(): null");
            else
                print("getDeclaringClass(): " + aClass.getDeclaringClass());


            if (aClass.getEnclosingClass() == null) print("getEnclosingClass(): null");
            else
                print("getEnclosingClass(): " + aClass.getEnclosingClass());

            if (aClass.getEnclosingConstructor() == null) print("getEnclosingConstructor(): null");
            else
                print("getEnclosingConstructor(): " + aClass.getEnclosingConstructor().toString());

            if (aClass.getEnclosingMethod() == null) print("getEnclosingMethod(): null");
            else
                print("getEnclosingMethod(): " + aClass.getEnclosingMethod().toString());


            print("getEnumConstants(): " + Arrays.toString(aClass.getEnumConstants()));
            print("getFields(): " + Arrays.toString(aClass.getFields()));
            print("getGenericInterfaces(): " + Arrays.toString(aClass.getGenericInterfaces()));
            print("getGenericSuperclass(): " + aClass.getGenericSuperclass().toString());
            print("getInterfaces(): " + Arrays.toString(aClass.getInterfaces()));
            print("getMethods(): " + Arrays.toString(aClass.getMethods()));
            print("getModifiers(): " + aClass.getModifiers());
            print("getModule(): " + aClass.getModule().getName());
            print("getName(): " + aClass.getName());
            print("getPackage(): " + aClass.getPackage().toString());
            print("getPackageName(): " + aClass.getPackageName());
            print("getSimpleName(): " + aClass.getSimpleName());
            print("getSuperclass(): " + aClass.getSuperclass().toString());
            print("getTypeName(): " + aClass.getTypeName());


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
