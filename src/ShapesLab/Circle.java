package ShapesLab;

public class Circle extends Shape
{
    ///fields////
    private int radius;

    //contructors///
    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }

    //methods////
    @Override

    public double getArea()
    {
        return 3.14 * radius * radius;
    }
    @Override
    public double getPerimeter()
    {
        return 3.14 * 2 * radius;
    }
}
