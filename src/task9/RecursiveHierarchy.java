package task9;

import java.util.Arrays;

public class RecursiveHierarchy {

    public static void hierarchy(Object o) throws InstantiationException, IllegalAccessException {
        if (o.getClass().getSuperclass().getSimpleName().equals("Object")) {
            System.out.println(o.getClass().getSuperclass() + "\n"
                    + Arrays.toString(o.getClass().getSuperclass().getDeclaredFields()) + "\n");

           return;

        } else {
            System.out.println(o.getClass().getSuperclass() + "\n"
                    + Arrays.toString(o.getClass().getSuperclass().getDeclaredFields()) + "\n");
        }

        hierarchy(o.getClass().getSuperclass().newInstance());
    }





}
