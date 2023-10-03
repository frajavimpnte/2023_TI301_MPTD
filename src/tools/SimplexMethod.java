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
    
    private int quotientTest(int cPiv) {
        // encontar el primer valor positivo
        // usando la colunma pivote
        int index = -1;
        float val = 0.0f;
        for (int i=1; i < pl.length; i++) {
            pl[i][pl[0].length-1] = pl[i][pl[0].length-2]/pl[i][cPiv];
            //System.out.println("pc[i]:"+ pc[i]);
            if (pl[i][pl[0].length-1] > 0.0f) {
                index = i;
                val = pl[i][pl[0].length-1];
                break;
            }    
        }
        // no valor negativo terminar
        if (index == -1) return -1;
        
        // econtrar el valor positivo mas pequeño
        for (int i=index+1; i < pl.length; i++) {
            pl[i][pl[0].length-1] = pl[i][pl[0].length-2]/pl[i][cPiv];
            if (pl[i][pl[0].length-1] > 0.0f && pl[i][pl[0].length-1] < val ) {
                index = i;
                val = pl[i][pl[0].length-1];               
            }    
        }
        return index;
    }
    
    private void rowCompute(int rPiv, int cPiv) {
        
        // crear el renglon pivote
        float div = pl[rPiv][cPiv];
        for (int j = 0; j < pl[0].length; j++) {
            pl[rPiv][j]  /= div;
        }
        // realizar la eliminación de columna pivote
        for (int i=0; i < pl.length; i++) {
            if (i != rPiv ) {
                float factor = -pl[i][cPiv];
                for (int j=0; j < pl[0].length; j++) {
                    pl[i][j] += (factor* pl[rPiv][j]);
                }
            }
        }
    }
    public void simplex(){
      // optimallity
      int rPiv=-1;
      int cPiv=-1;
      while ( (cPiv = numeroChido()) != -1 ) {
            rPiv = quotientTest(cPiv);
            rowCompute(rPiv, cPiv);
      }
      /*
      int cPiv = numeroChido();
      System.out.println("colPiv: " + cPiv);
      
      // prueba del cociente &  renglon pivote
      int rPiv = quotientTest(cPiv);
      System.out.println("rowPiv: " + rPiv);

      // operaciones renglon columna
      rowCompute(rPiv, cPiv);
      
      // columna pivote
      cPiv = numeroChido();
      System.out.println("colPiv: " + cPiv);
      
      // prueba del cociente &  renglon pivote
      rPiv = quotientTest(cPiv);
      System.out.println("rowPiv: " + rPiv);
      // operaciones renglon columna
      rowCompute(rPiv, cPiv);
      */
    }
   
    public void print() {
        for (int i = 0; i <= pl.length -1; i++ ) {
            for (int j = 0; j < pl[0].length; j++) {
                System.out.printf("%+05.3f  ", pl[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
