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
    public double getWidth(){
        return width;
    }

    /**
     *
     * @return the width of the rectangle
     */
    public double getHeight(){
        return height;
    }

    /**
     *
     * @return the height of the rectangle
     */


    //mutators
    public void setWidth(double newWidth){
        width = newWidth;
    }


    //other methods




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