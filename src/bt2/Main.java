/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author long
 */
public class Main {
    
    public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder.Builder().addString("hello").addBool(true).addFloat(8.4F).build();
        System.out.println(str.toString());
        System.out.println(str.getClass());
    }
}
