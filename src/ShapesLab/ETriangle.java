package ShapesLab;

public class ETriangle extends Shape
{
    ///fields////
    private int leg;

    //contructors///
    public ETriangle(int leg)
    {
        super("ETriangle");
        this.leg = leg;
    }

    //methods////
    @Override

    public double getArea()
    {
        return (leg * (leg * 1.732)) / 2;
    }
    @Override
    public double getPerimeter()
    {
        return 3 * leg;
    }
}
