public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle("Красный", 5.0),
                new Rectangle("Синий", 3.0, 4.0),
                new Triangle("Зеленый", 5.0, 6.0, 7.0)
        };


        for (Shape shape : shapes) {
            System.out.println("Площадь: " + shape.calculateArea());
            System.out.println("Периметр: " + shape.calculatePerimeter());
            shape.paint();
            System.out.println("Цвет: " + shape.getColor());
            System.out.println("Equals: " + shape.equals(new Shape("Чёрный")));
            System.out.println("HashCode: " + shape.hashCode());
            System.out.println("ToString: " + shape.toString());
            System.out.println();
        }
    }
}
