/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author long
 */
public class Triangle extends Shape{

    private static Triangle triangle;
    
    @Override
    public String Draw() {
        return "Vẽ hình tam giác";
    }

    public Triangle() {
    }

    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    
    public static Triangle createInstance() {
        if (triangle == null) {
            triangle = new Triangle();
        }
        return triangle;
    }
}
