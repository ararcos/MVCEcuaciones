/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author alexa
 */
public class primerGrado {
    private double a;
    private double c;
    private double x;
    private double y;
    private double[] tabla;


    public primerGrado() {
    }

    public primerGrado(double a, double c) {
        this.a = a;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void obtenerTabla(){
        double[] tablaAux = new double[41];
        int x1 = -20;
        for (int i = 0; i < 41; i++) {
            tablaAux[i]= (this.a*x1)+this.c;
            x1++;
        }
        this.tabla=tablaAux;
    }
    public void calcularX(){
        this.y=0;
        double x1;
        x1=(this.c*(-1))/this.a;
        this.x=x1;
    }
            
    public double obtenerValor(int pos){
        return this.tabla[pos];
    }

    public double[] getTabla() {
        return tabla;
    }

    public void setTabla(double[] tabla) {
        this.tabla = tabla;
    }
            
}
