package co.edu.uniquindio.poo.openclose;

import java.util.List;
import java.util.ArrayList;

public class CandidatoMal {
    private String nombre;
    private String numeroIdentificacion;
    private String partidoPolitico;
    
    // Intento de agregar una nueva funcionalidad directamente
    private List<String> logros;

    public CandidatoMal(String nombre, String numeroIdentificacion, String partidoPolitico) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.partidoPolitico = partidoPolitico;
        this.logros = new ArrayList<>();
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

    // Metodos para acceder a la lista de logros
    public List<String> getLogros() {
        return logros;
    }

    public void agregarLogro(String logro) {
        logros.add(logro);
    }
}
