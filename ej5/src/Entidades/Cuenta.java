/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class Cuenta {
    private int numeroCuenta;
    private int dniCliente;
    private double saldo;
    
    //constructores

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dniCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Cuenta crearCuenta(){
        Cuenta cuenta1 = new Cuenta();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su dni");
        cuenta1.setDniCliente(read.nextInt());
        int cta = (int)(Math.random()*15+1);
        cuenta1.setNumeroCuenta(cta);
        cuenta1.setSaldo(0);
        return cuenta1;
    }
    /*  Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
    */
    public void ingresar(double ingreso){
        saldo = saldo + ingreso;
        System.out.println("Su nuevo saldo es: " + saldo);
    }
     /*  Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
    */
    
    public void retirar(double retiro){
        if(retiro>saldo){
            saldo = 0;
            System.out.println("Su nuevo saldo es: ");
        } else {
            saldo = saldo - retiro;
            System.out.println("Su nuevo saldo es: " + saldo);
        }
    }
    
    /*Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%. */
    public void extraccionRapida(double retiro){
        if(saldo * .2 >= retiro){
            saldo = saldo -retiro;
            System.out.println("Su nuevo saldo es de: "+ saldo);
        } else {
            System.out.println("No se puede retirar ese monto");
        }
    }
    
    /* consultarSaldo(): */
    
    public void consultarSaldo (){
        System.out.println("Su saldo actual es: " + saldo);
    }
    
    public void consultarDatos(){
        System.out.println("--------------------------");
        System.out.println("Nro de cuenta: " +numeroCuenta);
        System.out.println("DNI: "+ dniCliente);
        System.out.println("Saldo actual: " + saldo);
        System.out.println("--------------------------");
    }
}
