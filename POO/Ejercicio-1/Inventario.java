import java.util.ArrayList;
public class Inventario{
    //Atributos
    private ArrayList<Producto> inventario;

    //contructor
    public Inventario(ArrayList<Producto> inventario){
        this.inventario=inventario;
    }
    // Metodo get
    public ArrayList<Producto> getInventario(){
        return inventario;
    }
    //Metodo set

    public void setInventario(ArrayList<Producto> inventario){
        this.inventario=inventario;
    }

    public boolean eliminarProducto(int id){
        for(Producto producto:inventario){
            if(producto.getId() == id){
                inventario.remove(id);
                return true;
            }
            
        }
        return false;
    }

    public boolean buscarProducto(int id){
        for(Producto producto:inventario){
            if(producto.getId() == id){
                return true;
            }
        }
        return false;
    }
  
}