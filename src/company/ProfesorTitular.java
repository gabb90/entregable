package company;

public class ProfesorTitular extends Profesor {
    private String especialidad;

    public ProfesorTitular(String nombre, String apellido, Integer codigoDeProfesor) {
        super(nombre, apellido, codigoDeProfesor);
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
