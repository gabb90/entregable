package company;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private Integer codigoDeCurso;
    private Integer cupoMaximo;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private List<Alumno> listaDeAlumnos = new ArrayList<Alumno>();

    public Curso(String nombre, Integer codigoDeCurso, Integer cupoMaximo) {
        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
        this.cupoMaximo = cupoMaximo;
    }

    public void setProfesorTitular(ProfesorTitular profesorTitular) {
        this.profesorTitular = profesorTitular;
    }

    public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }

    public Boolean agregarUnAlumno(Alumno unAlumno){
        if (this.listaDeAlumnos.size()<=this.cupoMaximo){
            this.listaDeAlumnos.add(unAlumno);

            return true;
        } else {
            return false;
        }

    }

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public void eliminarUnAlumno(Alumno unAlumno){
        listaDeAlumnos.remove(unAlumno);
    }
}
