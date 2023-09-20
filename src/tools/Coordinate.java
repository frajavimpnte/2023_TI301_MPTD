/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 * 02:03 -> 2:04, 
 * @author TICS03
 */
public class Coordinate {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 300;
    public static final float X1MAX = 30;
    public static final float X1MIN = -10;
    public static final float X2MAX = 30;
    public static final float X2MIN = -10;
    
    public static int toScreenX(float x1) {
        return (int)(-(X1MAX-x1)* WIDTH/(X1MAX-X1MIN)+WIDTH);
    }
    public static int toScreenY (float x2){
        return (int) ((X2MAX-x2)*HEIGHT /(X2MAX-X2MIN));
    }
}
