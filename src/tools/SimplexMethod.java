/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author TICS03
 */
public class SimplexMethod {
    private  int k;
    private  int n;
    private  float pl[][];

    public SimplexMethod(int k, int n) {
        this.k = k;
        this.n = n;
        this.pl = new float [k+1][n+k+3];
    }
    public void  addRow(int i, float[] r){
        for (int j=0;j<r.length; j++){
            pl[i][j]=r[j];
        }
    }

    public int getK() {
        return k;
    }

    public int getN() {
        return n;
    }
    private int numeroChido(){
        int index=-1;
        float val=0;
        for (int i=1;i<pl[0].length-2; i++){
            if (pl[0][i]<0){
                index=i;
                val=pl[0][i];
                break;
            }
        }
        if (index==-1)
            return index;
        
        for (int i=index+1;i<pl[0].length-2; i++){
            if (pl[0][i]< val){
                index=i;
                val=pl[0][i];
            }
        }
        return index;
    } 
    public void simplex(){
      //  System.out.println(pl[0][(numeroChido)]);
      System.out.println(numeroChido());
    }
    
    public void print() {
        for (int i = 0; i <= pl.length -1; i++ ) {
            for (int j = 0; j < pl[0].length; j++) {
                System.out.printf("%+5.3f  ", pl[i][j]);
            }
            System.out.println("");
        }
    }
    
}
