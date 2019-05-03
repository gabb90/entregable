package company;

public class Profesor {
    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoDeProfesor;

    public Profesor(String nombre, String apellido, Integer codigoDeProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeProfesor = codigoDeProfesor;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }
}
