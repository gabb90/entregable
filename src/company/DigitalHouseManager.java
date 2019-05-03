package company;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Alumno> listaDeAlumnos = new ArrayList<>();
    private List<Profesor> listaDeProfesores = new ArrayList<>();
    private List<Curso> listaDeCursos = new ArrayList<>();
    private List<Inscripcion> listaDeInscripciones = new ArrayList<>();

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {
        Curso nuevoCurso = new Curso(nombre, codigoCurso, cupoMaximoDealumnos);
        this.listaDeCursos.add(nuevoCurso);

    }

    public void bajaCurso(Integer codigoCurso) {

        this.listaDeCursos.remove(codigoCurso);
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        ProfesorAdjunto nuevoProfesorAdjunto = new ProfesorAdjunto(nombre, apellido, codigoProfesor);
        nuevoProfesorAdjunto.setCantidadDeHoras(cantidadDeHoras);
        this.listaDeProfesores.add(nuevoProfesorAdjunto);
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        ProfesorTitular nuevoProfesorTitular = new ProfesorTitular(nombre, apellido, codigoProfesor);
        Profesor profesor = (Profesor) nuevoProfesorTitular;
        this.listaDeProfesores.add(profesor);
        nuevoProfesorTitular.setEspecialidad(especialidad);
    }

    public void bajaProfesor(Integer codigoProfesor) {
        this.listaDeProfesores.remove(codigoProfesor);
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        Alumno nuevoAlumno = new Alumno(nombre, apellido, codigoAlumno);
        this.listaDeAlumnos.add(nuevoAlumno);
    }

    //El método debe:
    //● Buscar el curso al que se quiere inscribir.
    //● Buscar al alumno al que se quiere inscribir.
    //● Inscribir al alumno si es posible.
    //● En caso de ser posible, crear una inscripción y setearla con los datos que corresponden.
    //○ Agregar la inscripción a la lista de inscripciones.
    //○ Informar por pantalla la inscripción realizada.
    //● Si no hay cupo disponible:
    //○ Informar por pantalla que no se pudo inscribir porque no hay cupo.
    public String inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {

        //for (int i = 0; i < this.listaDeAlumnos.size(); i++) {
//
        //    if (this.listaDeAlumnos.get(i).getCodigoDeAlumno()==codigoAlumno){
//
        //        for (int a = 0; a < this.listaDeCursos.size(); a++) {
        //            if (this.listaDeCursos.get(a).getCodigoDeCurso() == codigoCurso) {
        //                if (this.listaDeCursos.get(a).agregarUnAlumno(this.listaDeAlumnos.get(i))) {
        //                    return "la inscripcion se realizo con exito";
        //                } else {
        //                    return "no se pudo realizar la inscripcion";
        //                }
        //            }
        //        }
        //    }
        //}
        Alumno alumnoAInscribir = null;
        for (Alumno alumnos:this.listaDeAlumnos) {
            if (alumnos.getCodigoDeAlumno().equals(codigoAlumno)){
                alumnoAInscribir=alumnos;
            }
        }
        Curso cursoAInscribir = null;
        for (Curso cursos:this.listaDeCursos) {
            if (cursos.getCodigoDeCurso().equals(codigoCurso)){
                cursoAInscribir=cursos;
            }
        }
        if (alumnoAInscribir==null){
            return "el alumno es inexistente";
        }
        if (cursoAInscribir==null){
            return "el curso es inexistente";
        }

        if (cursoAInscribir.agregarUnAlumno(alumnoAInscribir)){
            return "la inscripcion se realizo con exito";
        } else {
            return "no se pudo realizar la inscripcion";
        }



        //Curso curso = this.listaDeCursos.get(codigoCurso);
        //Alumno alumno = this.listaDeAlumnos.get(codigoAlumno);

        //if (curso.agregarUnAlumno(alumno))
        //{
        //    Inscripcion inscripto= new Inscripcion(alumno,curso);
        //    this.listaDeInscripciones.add(inscripto);
        //    return "Se realizo la inscripcion";
        //}else {
        //    return "La inscripcion no se puede realizar";
        //}

    }

    //El método debe:
    //● Buscar al profesor titular en la lista de profesores.
    //● Buscar al profesor adjunto en la lista de profesores.
    //● Asignarle al curso ambos profesores.
    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {

        for (int i = 0; i < this.listaDeCursos.size(); i++) {
            if (this.listaDeCursos.get(i).getCodigoDeCurso()==codigoCurso){

                ProfesorTitular nuevoProfesorTitular = (ProfesorTitular) this.listaDeProfesores.get(codigoProfesorTitular);
                ProfesorAdjunto nuevoProfesorAdjunto = (ProfesorAdjunto) this.listaDeProfesores.get(codigoProfesorAdjunto);

                this.listaDeCursos.get(i).setProfesorAdjunto(nuevoProfesorAdjunto);
                this.listaDeCursos.get(i).setProfesorTitular(nuevoProfesorTitular);

            }
        }
    }

}
