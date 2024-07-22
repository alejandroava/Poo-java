package ejerciciodos;
import java.util.ArrayList;
import java.util.Scanner;


public class MenuPrincipal{
    public static void main(String[] args){
        int optionUser;
        Empleado empleado;
        Scanner entrada = new Scanner(System.in);
        GestionEmpleados empleados = new GestionEmpleados();
 
         do{
           
            System.out.println("---Bienvenido al Sistema de Empleados---");
            System.out.println("1. Aregar Empleado");
            System.out.println("2. Eliminar Empleado");
            System.out.println("3. Mostrar Empleados");
            System.out.println("4. Salir");
            optionUser = entrada.nextInt();
            entrada.nextLine();

            switch(optionUser){
                case 1:
                    
                    System.out.println("Nombre del empleado: ");
                    String persona = entrada.nextLine();
                    System.out.println("Edad del empleado: ");
                    int edad = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Id del empleado: ");
                    int idEmpleado= entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Salario del empleado: ");
                    int salario= entrada.nextInt();
                    entrada.nextLine();
                    empleado = new Empleado(persona,edad,idEmpleado,salario);
                    empleados.agregarEmpleado(empleado);
                    break;
                case 2:
                    int optionId;
                    System.out.println("Ingrese el id del empleado: ");
                    optionId = entrada.nextInt();
                    entrada.nextLine();
                    empleados.eliminarEmpleado(optionId);
                    System.out.println("Empleado eliminado");
                    break;
                case 3:
                    empleados.mostrarEmpleados();
                    break;
                case 4:
                    break;
            }
        }while(optionUser != 5);
    }
}
