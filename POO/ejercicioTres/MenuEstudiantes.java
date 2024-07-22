package ejercicioTres;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuEstudiantes {
    public static void main(String[] args) {
        int optionUser;
        Estudiante estudiante;
        Curso curso;
        GestionCurso cursos = new GestionCurso();
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("---Programa gestion de cursos---");
            System.out.println("1. Agregar curso");
            System.out.println("2. Inscribir estudiante");
            System.out.println("3. Mostrar estudiantes inscritos por curso");
            System.out.println("4. salir");
            System.out.println("Seleccione una opcion");

            optionUser= entrada.nextInt();
            entrada.nextLine();

            switch (optionUser){
                case 1:
                    System.out.println("Ingrese el nombre del curso");
                    String nombreCurso = entrada.nextLine();
                    System.out.println("Ingrese el codigo del curso");
                    String codigo = entrada.nextLine();
                    curso = new Curso(codigo, nombreCurso);
                    cursos.agregarCurso(curso);
                    break;
                case 2:
                    System.out.println("Ingrese un Id para el estudiante: ");
                    int id = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nombre = entrada.nextLine();
                    System.out.println("Ingrese el email del estudiante: ");
                    String email = entrada.nextLine();

                    System.out.println("Cual es el codigo del curso");
                    String codigo = entrada.nextLine();
                    System.out.println();
                    estudiante = new Estudiante(id,nombre,email,nombreCurso);
                    if(codigo.inscribirEstudianteCurso(codigo,).equal(codigo))


                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        }while(optionUser != 4);

    }

}
