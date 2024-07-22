package ejercicioTres;

import java.util.ArrayList;

public class Curso {
    //Atributos
    private String codigo;
    private String nombreCurso;
    private ArrayList<Estudiante> listaEstudiantes;


    //constructor
    public Curso(String codigo,String nombreCurso){
        this.codigo=codigo;
        this.nombreCurso=nombreCurso;
        this.listaEstudiantes = new ArrayList<>();
    }

    public void agregarEstdudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }
    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombreCurso;
    }

    public void setNombre(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void inscribirEstudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }


    public String toString() {
        return "Curso{" +
                "nombre Curso='" + nombreCurso + '\'' +
                ",Codigo=" + codigo +
                ", Lista Estudiantes=" + listaEstudiantes +
                '}';
    }
}
