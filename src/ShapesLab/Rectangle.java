package ShapesLab;

public class Rectangle extends Shape
{
    ///fields////
    private int height;
    private int width;

    //contructors///
    public Rectangle(int height, int width)
    {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    //methods////
    @Override

    public double getArea()
    {
        return height * width;
    }
    @Override
    public double getPerimeter()
    {
        return (2*height)+(2*width);
    }
}

