/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transport;

/**
 *
 * @author TICS03
 */
public class TransporteiChonTest {
    public static void main(String[] args){
       TransporteiChon tc = new TransporteiChon (2,2);
      
       float[][] costos = {{1,2}, {3,4}};
       tc.setCost(costos);
       
       float origin[] = {5,10};
       tc.setOriginAmount(origin);
       
       float destiny[] = {2,13};
       tc.setDestinyAmount(destiny);
       
       tc.print();
       
       tc.sfbNE();
       tc.print();
    }
}
