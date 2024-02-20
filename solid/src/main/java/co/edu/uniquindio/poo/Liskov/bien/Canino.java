package co.edu.uniquindio.poo.liskov;

public class Canino extends Animal{
    private String nombre;
    
    @Override
    public String getRuido (){
        return "Guaou"
    }
}