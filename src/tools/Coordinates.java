/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author TICS03
 */
public class Coordinates {
    public static final float XMAX = 20.0f;
    public static final float YMAX = 20.0f;
    
    public static final float XSCREEN = 300;
    public static final float YSCREEN = 300; 
    
    public static int toScreenX1(float x) {
        return (int) ( x * XSCREEN / XMAX );
    }
    
    public static int toScreenX2(float y) {
        return (int) ( (YMAX - y ) * YSCREEN / YMAX );
    }
}
