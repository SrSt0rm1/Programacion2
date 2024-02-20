package co.edu.uniquindio.poo.singleresponsability.bien;

/**
 * Clase que demuestra el buen uso de single responsability,
 * Almacena los datos de candidato
 * @author Helen Giraldo, Juan Esteban Maya, Nicolas Muñoz y Miguel Vargas
 * @since 2024 - 02
 * Licencia GNU/GPL V3.0
 */

public class Candidato{
    private String nombre;
    private String numeroIdentificacion;
    private String partidoPolitico;
    

    public Candidato(String nombre, String numeroIdentificacion, String partidoPolitico) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.partidoPolitico = partidoPolitico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

}
