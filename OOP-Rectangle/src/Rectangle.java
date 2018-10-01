public class Rectangle {

    double width;
    double height;

    public Rectangle() {}


    public Rectangle (double width,double height)
    {
        this.width= width;
        this.height = height;
    }

    public double getArea()
    {
        return (width+height)/2;
    }
    public double getPerimeter()
    {
        return width *height;
    }
    public String display ()
    {
        return "Width: "+width + " And " + height;
    }
}
