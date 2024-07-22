public class ProductoEspecifico extends Producto{
    //Atributos
    private String marca;
    

    //contructor
    public ProductoEspecifico(int id, String nombre, int precio, String marca){
        super(id,nombre,precio);
        this.marca=marca;
    }

    //Metodos get
    public String getMarca(){
        return marca;
    }
    //Metodos set
    public void setMarca(String marca){
        this.marca=marca;
    }

}