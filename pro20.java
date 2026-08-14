abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class pro20{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}