import java.text.DecimalFormat;

/**
 * @file Rectangle.java
 * @date 2/2/23
 * @author Landon Bell
 *
 *
 */
public class Rectangle { //make public for CS A

    //instance variables
    private double width;
    private double height;
    private double area;
    private double perimeter;
    //default constructor (make public for CS A)
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    //overloaded constructor (with parameters)
    public Rectangle(double w, double h){
        width = w;
        height = h;
    }

    public Rectangle(double width){
        this.width = width;
    }


    //accessors
    /**
     *
     * @return the width of the rectangle
     */
    public double getWidth(){
        return width;
    }



    /**
     *
     * @return the height of the rectangle
     */
    public double getHeight(){
        return height;
    }

    /**
     *
     * @return the area of the rectangle
     */
    public double getArea(){
        return area;
    }

    /**
     *
     * @return the perimeter of the rectangle
     */
    public double getPerimeter(){
        return perimeter;
    }


    //mutators
    public void setWidth(double newWidth){
        width = newWidth;
    }

    /**
     * Modifies the height of the rectangle
     * @param newHeight
     */
    public void setHeight(double newHeight){
        height = newHeight;
    }

    //other methods

    /**
     * Calculates the area of the rectangle
     *
     */
    public void calculateArea(){
        area = height*width;
    }

    /**
     * Calculates the perimeter of the rectangle
     *
     */
    public void calculatePerimeter(){
        perimeter = (height*2)+(width*2);
    }


    //toString method
    /**
     * Prints the height snd width of the rectangle to 2 decimal places
     */
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return "The height of the rectangle is "+ df.format(height) +
                " and the width is " + df.format(width) + ".";
    }

}