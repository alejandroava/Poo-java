package ejerciciodos;
import java.util.ArrayList;
import java.util.Scanner;



public class GestionEmpleados{
    private ArrayList<Empleado> empleados;

    public GestionEmpleados() {
        empleados = new ArrayList<>();
    }
    public void crearArraylist(){
        empleados = new ArrayList();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public void mostrarEmpleados(){
        for(Empleado e:empleados){
            System.out.println(e);
        }
    }
    public void eliminarEmpleado(int idEmpleado) {
        empleados.removeIf(empleado -> empleado.getIdEmpleado() == (idEmpleado));
    }

    public String toString(){
        return empleados.toString();
    }

}
