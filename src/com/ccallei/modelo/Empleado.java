/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccallei.modelo;



public class Empleado extends Object{
    private String area ;
    private double salario;

    public Empleado() {
    }

    public Empleado(String area,double salario) {
        this.area = area;
        this.salario = salario;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the salario
     */
    public double  getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
     
    @Override
    public String toString() {
        return 
        super.toString() +"\n"+ "AREA"+getArea()+"\n" +"SALARIO"+getSalario(); //To change body of generated methods, choose Tools | Templates.
    }

}
