package co.edu.uniquindio.poo.liskov;

/**
 * Clase que demuestra el mal uso de el caso principio de substitución de Liskov,
 * @author Helen Giraldo, Juan Esteban Maya, Nicolas Muñoz y Miguel Vargas
 * @since 2024 - 02
 * Licencia GNU/GPL V3.0
 */
public abstract class Animal{
    private String nombre;


    public String getRuido (){
        return "meow";
    }
}