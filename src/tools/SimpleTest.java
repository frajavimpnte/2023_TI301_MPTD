/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author TICS03
 */
public class SimpleTest {
    public static void main(String [] args) {
        // casos especiale de división
        System.out.println("0/0: " + 0.0/0.0);   // NaN 
        System.out.println("8/0: " + 8.0/0.0);   // Infinity
        System.out.println("-8/0:" + -8.0/0.0);  // -Infinity
        
        // comparaciones de casos especiales
        System.out.println("0/0 > 0: " + (0.0/0.0 > 0.0) );   // false,  
        System.out.println("8/0 > 0: " + (8.0/0.0 > 0.0) );   // true
        System.out.println("-8/0> 0:" + (-8.0/0.0 > 0.0) );   // false
        
        float[][] datos = { {1,1}, {2,0}, {0,-6}, {1,8}, {-3,-4} };
        float[] pc = new float[5];
        
        int index = -1;
        float val = 0.0f;
        
        // encontar el primer valor positivo
        for (int i=1; i < datos.length; i++) {
            pc[i] = datos[i][1]/datos[i][0];
            //System.out.println("pc[i]:"+ pc[i]);
            if (pc[i] > 0.0f) {
                index = i;
                val = pc[i];
                break;
            }    
        }
        
        //if (index == -1) return -1;
        // econtrar el valor positivo mas pequeño
        for (int i=index+1; i < datos.length; i++) {
            pc[i] = datos[i][1]/datos[i][0];
            System.out.println("pc[i]:"+ pc[i]);
            if (pc[i] > 0.0f && pc[i] < val ) {
                index = i;
                val = pc[i];               
            }    
        }
        
        System.out.println("index:" + index);
    }
}
