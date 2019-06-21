public class Circle {
    private int id=0;
    private double radius;
    private String color;

    public Circle (double radius ,String color){
        this.id++;
        this.radius=1;
        this.color="black";

    }


    public Circle(int id ,double radius ,String color){
        this.id=id;
        this.color=color;
        this.radius=radius;
    }
    public double Area(){
        double Area=0;
        double  pi= 3.14;
        Area= pi*radius*radius;
        return Area;
    }
    public String getColor()
    {
        return color;
    }

    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String  color){
        this.color=color;
    }

}
