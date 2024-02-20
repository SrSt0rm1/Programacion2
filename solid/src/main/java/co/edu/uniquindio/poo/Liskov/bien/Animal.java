package co.edu.uniquindio.poo.liskov;

/**
 * Clase que demuestra el buen uso de el caso principio de substitución de Liskov,
 * @author Helen Giraldo, Juan Esteban Maya, Nicolas Muñoz y Miguel Vargas
 * @since 2024 - 02
 * Licencia GNU/GPL V3.0
 */
public abstract class Animal{
    private String nombre;

    abstract String getRuido (){
        return "sonido generico animal";
    }
}