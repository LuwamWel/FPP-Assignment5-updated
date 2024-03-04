public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapesArr = new Shape[5];
        shapesArr[0] = new Rectangle("Blue", 4.0, 3.0);
        shapesArr[1] = new Square("Red", 5.0);
        shapesArr[2] = new Circle("purple", 4.0);
        shapesArr[3] = new Shape("green");
        shapesArr[4] = new Square("pink",3);

        printTotal(shapesArr);
    }

    public static void printTotal(Shape[] shapes){
        double totalArea = 0.0;
        double totalPerimeter = 0.0;
        for(Shape s: shapes){
            totalArea += s.calculateArea();
            totalPerimeter += s.calculatePerimeter();
        }
        System.out.println("The total area of all shapes is: "+ totalArea);
        System.out.println("The total perimeter of all shapes is: "+ totalPerimeter);
    }
}
