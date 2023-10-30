public class Rectangle {
    private int width;
    private int height;

    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }

    public void setWidth(int widthParameter)
    {
        width = widthParameter;
    }
    public void setHeight(int heightParameter)
    {
        height = heightParameter;
    }
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public int area(int width, int height)
    {
        return width * height;
    }
    public int perimeter(int width, int height)
    {
        return (2*(width+height));
    }
}
