package ec.edu.ups.poo.clases;

import java.util.List;

public class Docente extends Persona{
    private List<String> titulosAcademicos;
    private List<String> areasDeEspecializacion;
    public Docente() {}
    public Docente(String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<Direccion> direcciones, List<Institucion> instituciones, List<String> titulosAcademicos, List<String> areasDeEspecializacion, List<String> carrera) {
        super(cedula, nombre, apellido, telefono, correoElectronico, direcciones, instituciones);
        this.titulosAcademicos = titulosAcademicos;
        this.areasDeEspecializacion = areasDeEspecializacion;
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreasDeEspecializacion() {
        return areasDeEspecializacion;
    }

    public void setAreasDeEspecializacion(List<String> areasDeEspecializacion) {
        this.areasDeEspecializacion = areasDeEspecializacion;
    }
}
