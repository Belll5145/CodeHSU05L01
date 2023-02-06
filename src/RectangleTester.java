public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(7.45676, 394.488543);
        double expectedPerimeter = 2*7.45676 + 2*394.488543;
        System.out.println(rect1);
        rect1.calculatePerimeter();
        System.out.println(rect1.getPerimeter() == expectedPerimeter);

    }
}
