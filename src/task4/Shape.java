package task4;

public abstract class Shape {
    public void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}
