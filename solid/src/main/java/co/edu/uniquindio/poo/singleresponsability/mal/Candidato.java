package co.edu.uniquindio.poo.singleresponsability.mal;

import java.util.ArrayList;

/**
 * Clase que demuestra un mal uso de single responsability 
 * @author Helen Giraldo, Juan Esteban Maya, Nicolas Muñoz y Miguel Vargas
 * @since 2024 - 02
 * Licencia GNU/GPL V3.0
 */

public class Candidato{
    private String nombre;
    private String numeroIdentificacion;
    private String partidoPolitico;
    private ArrayList<Candidato> candidatos;// mal uso del principio
    
    public Candidato(String nombre, String numeroIdentificacion, String partidoPolitico) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.partidoPolitico = partidoPolitico;
    }
    /**
     * MAL USO DEL PRINCIPIO
     * Metodo para incribir un candidato
     * @param candidato a incribir
     */
    public void inscribirCandidato(Candidato candidato){
        candidatos.add(candidato);
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
