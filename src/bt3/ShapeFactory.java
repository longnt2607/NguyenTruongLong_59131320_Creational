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
public class ShapeFactory {
    
    //private Shape shape;
    
    public Shape createShape(ShapeType type) {
        
        Shape shape;
        switch (type) {
            case rectangle: return shape = Rectangle.createInstance();
            case triangle: return shape = Triangle.createInstance();
            case circle: return shape = Circle.createInstance();
        }
        return null;
    }
}
