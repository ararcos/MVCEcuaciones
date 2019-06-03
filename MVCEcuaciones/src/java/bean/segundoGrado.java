/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import static java.lang.Math.sqrt;

/**
 *
 * @author alexa
 */
public class segundoGrado {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private double y;
    private double[] tabla;


    public segundoGrado() {
    }

    public segundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
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
            tablaAux[i]= (this.a*Math.pow(x1, 2))+(this.b*x1)+this.c;
            x1++;
        }
        this.tabla=tablaAux;
    }
    public void calcularX(){
        this.y=0;
        this.x1=(-this.b+sqrt(Math.pow(this.b, 2)-(4*this.a*this.c)))/(2*this.a);
        this.x2=(-this.b-sqrt(Math.pow(this.b, 2)-(4*this.a*this.c)))/(2*this.a);
    }

    public double[] getTabla() {
        return tabla;
    }

    public void setTabla(double[] tabla) {
        this.tabla = tabla;
    }
    
}
