import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
    
        Scanner entrada = new Scanner(System.in);
        int optionUser;
        ArrayList<Producto> listaProductos = new ArrayList<>();
        Inventario inventario = new Inventario(listaProductos);
        do{
           
            System.out.println("---Bienvenido al gestor de inventarios---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Buscar producto");
            System.out.println("4.Ver todos los productos");
            System.out.println("5. Salir");
            optionUser = entrada.nextInt();
            entrada.nextLine();

            switch(optionUser){
                case 1:
                   
                    String producto;
                    int referencia;
                    int precioProducto;
                    String marcaProducto;
                    System.out.print("Ingrese el nombre del producto: ");
                    producto = entrada.nextLine();
                    System.out.print("Ingrese la referencia del producto(id): ");
                    referencia = entrada.nextInt();
                    System.out.print("Ingrese el precio del producto: ");
                    precioProducto= entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingrese la marca del producto: ");
                    marcaProducto = entrada.nextLine();
                    ProductoEspecifico productoEspecifico = new ProductoEspecifico(referencia, producto,precioProducto,marcaProducto);
                    
                    //listaProductos.add(productoEspecifico);
                    inventario.getInventario().add(productoEspecifico);
                    //Inventario inventario = new Inventario(listaProductos);
                    System.out.print("Producto agregado con exito!");
                    break;
                case 2:
                    int optionUserId2;
                    
                    System.out.print("Ingrese el id del producto a eliminar");
                    optionUserId2= entrada.nextInt();
                    boolean eliminar = inventario.eliminarProducto(optionUserId2);
                    if(eliminar){
                        System.out.print("Producto eliminado");
                        return;
                    }
                    System.out.print("Producto no encontrado");
                    System.out.println("-----------------------");
                    break;
                case 3:
                    
                    int optionUserId3;
                    System.out.print("Ingrese el id del producto: ");
                    optionUserId3 = entrada.nextInt();
                    boolean encontrar = inventario.buscarProducto(optionUserId3);
                    if(encontrar){
                        for(Producto i:inventario.getInventario()){
                            System.out.print(i.getNombre()+ "--"+i.getPrecio()+"--");
                            return;
                        }
                        
                    }
                    System.out.println("El producto no existe");
                    System.out.println(encontrar);
                    System.out.println("-----------------------");

                    break;
                case 4:
                    for (Producto p : inventario.getInventario()) {
                    System.out.println("Nombre producto: "+p.getNombre() + " - " +"Precio producto: "+ p.getPrecio());
                    }
                    break;
                case 5:
                    break;    

            } 
        }while(optionUser != 5);

       
    }
}
