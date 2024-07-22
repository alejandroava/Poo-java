package ejercicioTres;

import ejerciciodos.Empleado;

import java.util.ArrayList;

public class GestionCurso {
    private ArrayList<Curso> cursos;

    public GestionCurso() {
        cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }

    public boolean inscribirEstudianteCurso(String codigo,Estudiante estudiante){
        for(Curso c:cursos){
            if(c.getCodigo() == codigo){
                c.agregarEstdudiante(estudiante);
                return true;
            }
        }
        return false;
    }

    public void listarEstudiantesEnCurso(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                System.out.println("Estudiantes en el curso " + curso.getNombre() + ":");
                for (Estudiante estudiante : curso.getListaEstudiantes()) {
                    System.out.println(estudiante);
                }
                return;
            }
        }
        System.out.println("Curso no encontrado: " + codigo);
    }

    public void mostrarEstudiantes(){
        for(Curso e:cursos){
            System.out.println(e);
        }
    }
    //public void eliminarEstudiante(int idEstudiante) {
      //  cursos.removeIf(estudiante -> cursos.getCodigo() == (idEstudiante));
    //}
}
