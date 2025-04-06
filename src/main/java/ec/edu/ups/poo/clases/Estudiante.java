package ec.edu.ups.poo.clases;

import java.util.List;

public class Estudiante extends Persona {
    private String carrera;
    private String matricula;
    public Estudiante() {}
    public Estudiante(String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<Direccion> direcciones, List<Institucion> instituciones, String carrera, String matricula) {
        super(cedula, nombre, apellido, telefono, correoElectronico,direcciones, instituciones);
        this.carrera = carrera;
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
