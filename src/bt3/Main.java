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
public class Main {
    
    public static void main(String[] args) {
        
        /*Shape circle = Circle.createInstance();
        circle.setBrush("dùng bút chì");
        circle.setFrame("không đóng khung");
        circle.setPaper("vẽ lên giấy A4");
        System.out.println(circle.toString());
        
        Shape circle2 = Circle.createInstance();
        circle2.setBrush("dùng bút chì");
        circle2.setFrame("đóng khung gỗ");
        circle2.setPaper("vẽ lên giấy A4");
        System.out.println(circle.toString());*/
        
        ShapeFactory shape = new ShapeFactory();
        
        Shape circle = shape.createShape(ShapeType.circle);
        circle.setBrush("dùng bút chì");
        circle.setFrame("không đóng khung");
        circle.setPaper("vẽ lên giấy A4");
        System.out.println(circle.toString());
        
        Shape circle2 = Circle.createInstance();
        circle2.setBrush("dùng bút chì");
        circle2.setFrame("đóng khung gỗ");
        circle2.setPaper("vẽ lên giấy A4");
        System.out.println(circle.toString());
        
        Shape rectangle = shape.createShape(ShapeType.rectangle);
        System.out.println(rectangle.toString());
        Shape rectangle2 = shape.createShape(ShapeType.rectangle);
        rectangle2.setPaper("vẽ lên giấy A4");
        System.out.println(rectangle.toString());
    }
}
