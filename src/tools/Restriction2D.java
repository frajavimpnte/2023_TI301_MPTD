/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author TICS03
 */
enum rType {LEQ, EQ, GEQ };
public class Restriction2D {
    private float a1;
    private float a2;
    private float b1;
    private rType type;

    public Restriction2D(float a1, float a2, float b1, rType type) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.type = type;
    }
    
    public Point2D getP1() {
        float x1 = 0.0f;
        float x2 = 0.0f;
        // caso1:a1 !=0 & a2 != 0,  a1x1 + a2x2 =  b1,   con 
        if ( a1 != 0.0f  && a2 != 0.0f) {
            if (b1 != 0) { // b1 != 0
                //P1
                x1 = b1/a1;
                x2 = 0;
                //P2
                //x1 = 0;
                //x2 = b1/a2;
            } else {       // b1 == 0
                //P1
                x1 = 0;
                x2 = 0;
                //P2
                //x1 = Coordinate.X1MAX;    // que valor dar a x1
                //x2 = -a1*x2/a2;
            }
        }
        
        // caso2: a1 = 0; a2x2 = b1
        if ( a1 == 0.0f) {
            //P1
            x1 = 0.0f;
            x2 = b1/a2;
            //P2
            x1 = Coordinate.X1MAX;
            x2 = b1/a2;
        }
        
         // caso3: a2 = 0; a1x1 = b1
        if ( a2 == 0.0f) {
            //P1
            x1 = b1/a1;
            x2 = 0.0f;
        }
        return new Point2D(x1, x2);
    }
    
    public Point2D getP2() {
        float x1 = 0.0f;
        float x2 = 0.0f;
        // caso1:a1 !=0 & a2 != 0,  a1x1 + a2x2 =  b1,   con 
        if ( a1 != 0.0f  && a2 != 0.0f) {
            if (b1 != 0) { // b1 != 0
                //P2
                x1 = 0;
                x2 = b1/a2;
            } else {       // b1 == 0
                //P2
                x1 = Coordinate.X1MAX;    // que valor dar a x1
                x2 = -a1*x2/a2;
                //P2
                //x1 = b1/a1;
                //x2 = Coordinate.X2MAX;
            }
        }
        
        // caso2: a1 = 0; a2x2 = b1
        if ( a1 == 0.0f) {
            //P2
            x1 = Coordinate.X1MAX;
            x2 = b1/a2;
        }
        
         // caso3: a2 = 0; a1x1 = b1
        if ( a2 == 0.0f) {
            //P2
            x1 = b1/a1;
            x2 = Coordinate.X2MAX;
        }
        return new Point2D(x1, x2);
    }
}
