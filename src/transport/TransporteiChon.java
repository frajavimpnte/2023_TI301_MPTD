/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transport;

/**
 *
 * @author TICS03
 */
public class TransporteiChon {

    private int originPoint;
    private int destinyPoint;
    private float originAmount[];
    private float destinyAmount[];
    private float cost[][];
    private float var[][];
    private int newVBRow;
    private int newVBCol;
    
    // for sbf
    private boolean I;
    private boolean J;
    private float   val;

    public TransporteiChon(int originPoint, int destinyPoint) {
        this.originPoint = originPoint;
        this.destinyPoint = destinyPoint;

        //Asignar espacio a cost y var
        cost = new float[originPoint][destinyPoint];
        var = new float[originPoint + 1][destinyPoint + 1];
    }

    public void setCost(float cost[][]) {
        this.cost = cost;
    }

    public void setOriginAmount(float amount[]) {
        this.originAmount = amount;
        for (int i = 0; i < amount.length; i++) {
            var[i][destinyPoint] = amount[i];
        }
    }

    public void setDestinyAmount(float amount[]) {
        this.destinyAmount = amount;
        for (int i = 0; i < amount.length; i++) {
            var[originPoint][i] = amount[i];
        }
    }

    private void myMin(int i, int j) {
        I = false;
        J = false;
        if (var[destinyPoint][j] < var[i][originPoint]) {
            J = true;
            val =  var[destinyPoint][j];
        } else {
            I = true;
            val =  var[i][originPoint];
        }
    }
    /*
    i = 0, j = 0
    val = 0.0f, I =false, J = false
    whuile( i != m-1 && j != n-1) {
        min (i , j)  => changes I o J and val
        var[i][J] = val;
        s_i -= val, d_i = -= val
        if (I) i++
        if (J) j++
        I = false
        J = false
    }
    */
    public void sfbNE() {
        int i = 0, j = 0;
        while( i != originPoint && j != destinyPoint ){ 
            myMin(i,j);
            var[destinyPoint][j] -= val;
            var[i][originPoint]  -= val;
            var[i][j] = val;
            if (I) i++;
            else j++;
            System.out.println("in sfbNE----------");
            print();
            System.out.println("out sfbNE----------");
        }
        // set var[][] origin and destiny values
        for (i = 0; i < originAmount.length; i++) {
            var[i][destinyPoint] = originAmount[i];
        }
        for (j = 0; j < destinyAmount.length; j++) {
            var[originPoint][j] = destinyAmount[j];
        }
    }
    
    public void print() {
        //Imprimir la tabla de variables
        System.out.println("Tabla de variables");
        for (int i = 0; i <= originPoint; i++) {
            for (int j = 0; j <= destinyPoint; j++) {
                System.out.print(var[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("Tabla de costos");
        for (int i = 0; i < originPoint; i++) {
            for (int j = 0; j < destinyPoint; j++) {
                System.out.print(cost[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
