package ShapesLab;

public class Main {


    public static void main(String[] args) {
        Shape shape1 = new Rectangle(2,4);
        Shape shape2 = new ETriangle(6);
        Shape shape3 = new Circle(1);

        Shape shape4 = new RPentagon(2);
        System.out.println(shape4);
        System.out.println("My Perimeter is: " + shape4.getPerimeter());
        System.out.println("My Area is: " + shape4.getArea());

        Shape[] shapes = {shape1, shape2, shape3};
        for (Shape cur:shapes)
        {
            System.out.println(cur);
            System.out.println("My area is: " + cur.getArea());
            System.out.println("My perimeter is: " + cur.getPerimeter());
        }
    }
}

