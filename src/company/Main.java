package company;

public class Main {

    public static void main(String[] args) {

        DigitalHouseManager lima = new DigitalHouseManager();

        lima.altaCurso("Full Stack", 21, 3);
        lima.altaCurso("Android", 22, 2);

        lima.altaProfesorTitular("juan","calvo",101,"frontend");
        lima.altaProfesorTitular("pedro", "goyena", 102,"java");
        lima.altaProfesorAdjunto("ambro", "seti",201,20);
        lima.altaProfesorAdjunto("scala", "ortiz", 202, 30);


        lima.asignarProfesores(20001,101,201);
        lima.asignarProfesores(20002,102,202);

        lima.altaAlumno("ricardo","mollo",1);
        lima.altaAlumno("diego","arnedo",2);
        lima.altaAlumno("alberto","troilo",3);

        System.out.println(lima.inscribirAlumno(1,21));
        System.out.println(lima.inscribirAlumno(2,21));
        System.out.println(lima.inscribirAlumno(1,22));
        System.out.println(lima.inscribirAlumno(2,22));
        System.out.println(lima.inscribirAlumno(3,22));

        lima.bajaProfesor(101);
        lima.bajaCurso(20001);




    }
}
