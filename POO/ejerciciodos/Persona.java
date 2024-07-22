package ejerciciodos;
public class Persona {
    //Atributos
    private String persona;
    private int edad;

    //constructor
    public Persona(String persona, int edad){
        this.persona=persona;
        this.edad=edad;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setPersona(String persona){
        this.persona=persona;
    }
    public String getPersona(){
        return persona;
    }

    public String toString(){
        return " Nombre: "+ persona+ "--"+"edad: "+ edad;
    }
    
}