package task10;

public class TrueObject {
    private static char[] chars = new char[]{'a','b','c','d','e','f','g'};

    public static boolean isObject(){
        return chars instanceof Object;
    }
}
