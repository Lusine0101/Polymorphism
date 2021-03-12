public class Circle implements Shape {
    private String color;
    private  int r;

    public Circle() {
    }

    public Circle(String color, int r) {
        this.color = color;
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double getArea()
    {
        return (int) (Math.PI*Math.pow(r,2));
    }

    @Override
    public double getPermiter() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", r=" + r +
                ", s="+ getArea()+
                ", p="+getPermiter()+
                '}';
    }
} 