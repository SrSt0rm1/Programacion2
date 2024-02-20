package co.edu.uniquindio.poo.singleresponsability.bien;

import java.util.ArrayList;

/**
 * Clase que demuestra un buen uso de single responsability,
 * Almacena a los candidatos en una lista
 * @author Helen Giraldo, Juan Esteban Maya, Nicolas Muñoz y Miguel Vargas
 * @since 2024 - 02
 * Licencia GNU/GPL V3.0
 */
public class CandidatoInscribir{
    private ArrayList<Candidato> candidatos; 

    /**
     * Metodo para incribir un candidato
     * @param candidato a incribir
     */
    public void inscribirCandidato(Candidato candidato){
        candidatos.add(candidato);
    }
}
