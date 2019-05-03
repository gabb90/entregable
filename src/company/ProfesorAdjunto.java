package company;

public class ProfesorAdjunto extends Profesor {
    private Integer cantidadDeHoras;


    public ProfesorAdjunto(String nombre, String apellido, Integer codigoDeProfesor) {
        super(nombre, apellido, codigoDeProfesor);
    }

    public void setCantidadDeHoras(Integer cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }
}
