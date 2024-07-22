public class Producto{
    //Atributos
    private int  id;
    private String  nombre;
    private int precio;

    //Metodos
    public Producto(int id, String nombre, int precio){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
    }

    //Metodos get
    public int getPrecio(){
        return precio;
    }
      public String getNombre(){
        return nombre;
    }
      public int getId(){
        return precio;
    }
    //Metodos set
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setId(int id){
        this.id=id;
    }
      public String toString() {
        return "Producto [ID=" + id + ", Nombre=" + nombre + ", Precio=" + precio + "]";
    }


}