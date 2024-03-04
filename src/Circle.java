public class Circle extends Shape{
    double radius;

    public Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    double calculatePerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
