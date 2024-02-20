package co.edu.uniquindio.poo.dependencyInversion.mal;

public class Carro {
    private Motor motor;

    public Carro (Motor motor){
        this.motor = new Motor();
    }

    private void encenderCarro(){
        motor.encenderMotor();
    }
}
