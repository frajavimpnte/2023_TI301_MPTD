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
    private float cost[][];
    private float var[][];
    private int newVBRow;
    private int newVBCol;

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
        for (int i = 0; i < amount.length; i++) {
            var[i][destinyPoint] = amount[i];
        }
    }

    public void setDestinyAmount(float amount[]) {
        for (int i = 0; i < amount.length; i++) {
            var[originPoint][i] = amount[i];
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
                System.out.print(cost[i][j]);
            }
            System.out.println("");
        }

    }

}
