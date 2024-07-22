package ejercicioTres;

public class Estudiante extends Curso {
    //Atributos
    private int id;
    private String nombre;
    private String email;

    //constructor
    public Estudiante(int id,String nombre,String email,String codigo,String nombreCurso){
        super(nombreCurso,codigo);
        this.nombre=nombre;
        this.id=id;
        this.email=email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "idEstudiante: "+ id +"Nombre: "+ nombre+ "Emial: "+email;
    }
}
