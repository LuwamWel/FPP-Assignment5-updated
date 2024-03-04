public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    double calculateArea(){
        double area = width * height;
        return area;
    }
    @Override
    double calculatePerimeter(){
        double perimeter = (width * 2) + (height * 2);
        return perimeter;
    }
}
