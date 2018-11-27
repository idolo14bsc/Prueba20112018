/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccalle.controlador;

import com.ccallei.modelo.Empleado;
import com.ccalle.vista.EditaDatos;
import com.ccalle.vista.Login;
import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public class Coordinador {
    Login login = new Login (this);
    EditaDatos editaDatos =new  EditaDatos (this);
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    public void agregarEmpleado(Empleado e){
     empleados.add(e);
        System.out.println("EMPLEADO CREADO");
    }
}
