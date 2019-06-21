public class Rectangle {
    private int id=0;
    private double r;
    private double d;
    private String color;

    public Rectangle (double r ,double d,String color){
        this.id++;
        this.r=1;
        this.d=1;
        this.color="black";

    }


    public Rectangle(int id ,double r ,double d,String color){
        this.id=id;
        this.color=color;
        this.r=r;
        this.d=d;
    }
    public double Area(){
        double Area=0;
        Area= r*d;
        return Area;
    }
    public String getColor()
    {
        return color;
    }

    public double getR()
    {
        return r;
    }
    public double getD()
    {
        return d;
    }
    public void setR(double r){
        this.r=r;
    }
    public void setD(double d){
        this.d=d;
    }
    public void setColor(String  color){
        this.color=color;
    }

}
