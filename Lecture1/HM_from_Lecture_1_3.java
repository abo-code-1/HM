package lecture_package.Lecture1;

public class HM_from_Lecture_1_3 {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        rc.setLength(10.3);
        rc.setWidth(12.2);

        System.out.println(rc.getArea());
        System.out.println(rc.getPerimeter());

    }
}

class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(){}

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}
