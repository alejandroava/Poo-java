package ejerciciodos;

public class Empleado extends Persona{
    private int idEmpleado;
    private int salario;

    //constructor
    public Empleado (String persona, int edad,int idEmpleado, int salario){
        super(persona,edad);
        this.idEmpleado=idEmpleado;
        this.salario=salario;
    }

    public int getIdEmpleado(){
        return idEmpleado;
    }
    public void setSalario(int salario){
        this.salario=salario;
    }
    public void setIdEmplaedo(int idEmpleado){
        this.idEmpleado=idEmpleado;
    }
    public int  getSalario(){
        return salario;
    }


    public String toString() {
        return super.toString() + ", ID Empleado: " + idEmpleado + ", Salario: " + salario;
    }
}