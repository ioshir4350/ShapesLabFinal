package ShapesLab;


    public class RPentagon extends Shape
{
    ///fields////
    private int side;

    //contructors///
    public RPentagon(int side)
    {
        super("RPentagon");
        this.side = side;
    }

    //methods////
    @Override

    public double getArea()
    {
        return 0.25*Math.sqrt(5*(5+2*Math.sqrt(5)))*(side*side);
    }
    @Override
    public double getPerimeter()
    {
        return 5 * side;
    }
}


