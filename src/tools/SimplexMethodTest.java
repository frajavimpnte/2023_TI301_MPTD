/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author TICS03
 */
public class SimplexMethodTest {
    public static void main(String...args) {
        //simplexOptimality();
        //simplexTest();
        simplexTest2();
       
    }
    public static void simplexTest(){
        SimplexMethod sm = new SimplexMethod (4,3);
        
        float [] r0={1.0f,-60.0f,-30.0f,-20.0f,0f,0f,0f,0f,0f};
        sm.addRow(0, r0);
        float [] r1={0f,8.0f,6.0f,1.0f,1.0f,0f,0f,0f,48.0f,0f};
        sm.addRow (1, r1);
        float [] r2={0.f,4.0f,2.0f,1.5f,0f,1.0f,0f,0f,20.0f,0f};
        sm.addRow (2, r2);
        float [] r3={0.f,2.0f,1.5f,0.5f,0.f,0.f,1.f,0.f,8.0f,0f};
        sm.addRow(3, r3);
        float [] r4={0.0f,0.0f,1.0f,0.0f,0.0f,0.0f,0.0f,1.0f,5.0f,0.0f};
        sm.addRow(4, r4);
    
        sm.print();
        sm.simplex();
        sm.print();
        
    }
    
    public static void simplexOptimality() {
         SimplexMethod sm = new SimplexMethod(0,7);
        
        float [] r={0,1,-3,-6,9,0,1,-2,0,0};
        sm.addRow(0, r);
        sm.simplex();
    }
    public static void simplexTest2(){
        SimplexMethod sm = new SimplexMethod (4,3);
        
        float [] r0={1.0f,-60.0f,-30.0f,-20.0f,0f,0f,0f,0f,0f};
        sm.addRow(0, r0);
        float [] r1={0f,8.0f,6.0f,1.0f,1.0f,0f,0f,0f,48.0f,0f};
        sm.addRow (1, r1);
        float [] r2={0.f,4.0f,2.0f,1.5f,0f,1.0f,0f,0f,20.0f,0f};
        sm.addRow (2, r2);
        float [] r3={0.f,2.0f,1.5f,0.5f,0.f,0.f,1.f,0.f,8.0f,0f};
        sm.addRow(3, r3);
        float [] r4={0.0f,0.0f,1.0f,0.0f,0.0f,0.0f,0.0f,1.0f,5.0f,0.0f};
        sm.addRow(4, r4);
    
        sm.print();
        sm.simplex();
        sm.print();
        
    }
}
