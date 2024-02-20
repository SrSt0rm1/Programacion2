package co.edu.uniquindio.poo.InterfaceSegretationPrinciple.bien;


public class Pajaro implements Come,Vuela{
    @Override
    public void comer() {
        System.out.println("El pájaro está comiendo");
    }
    
    @Override
    public void volar() {
        System.out.println("El pájaro está volando");
    }
}