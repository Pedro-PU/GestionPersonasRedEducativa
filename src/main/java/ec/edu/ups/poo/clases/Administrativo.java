package ec.edu.ups.poo.clases;

import java.util.List;

public class Administrativo extends Persona{
    private List<String> cargos;
    private List<String> responsabilidades;
    public Administrativo() {}
    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correoElectronico,List<Direccion> direcciones, List<Institucion> instituciones, List<String> cargos, List<String> responsabilidades) {
        super(cedula, nombre, apellido, telefono, correoElectronico, direcciones, instituciones);
        this.cargos=cargos;
        this.responsabilidades=responsabilidades;
    }

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades) {
        this.responsabilidades = responsabilidades;
    }
}
