package co.edu.uniquindio.poo.openclose;

import java.util.List;

public class CandidatoPortafolio extends Candidato {
    private List<String> proyectos;

    public CandidatoPortafolio(String nombre, String numeroIdentificacion, String partidoPolitico, List<String> proyectos) {
        super(nombre, numeroIdentificacion, partidoPolitico);
        this.proyectos = proyectos;
    }

    public List<String> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<String> proyectos) {
        this.proyectos = proyectos;
    }
}

