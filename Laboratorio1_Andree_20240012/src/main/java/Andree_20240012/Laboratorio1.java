package Andree_20240012;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Laboratorio1 {

    public void EjercicicioProductos(){
        TreeMap<Integer, ValoresProducto> productos = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
        System.out.println("Bienvenido, estas son las opciones que puede realizar en este sistema:");
        System.out.println("1. Ingresar producto");
        System.out.println("2. Actualizar producto");
        System.out.println("3. Ver producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
        System.out.println("¿Que opcion desea realizar?");
        opcion = sc.nextInt();
        sc.nextLine();


            switch (opcion){
                case 1:
                    System.out.println("Ingrese el codigo del producto");
                    System.out.println("El codigo del producto: ");
                    int idProducto = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el nombre del producto");
                    String nombreProducto = sc.nextLine();
                    System.out.println("Ingrese el precio del producto");
                    double PrecioProducto = sc.nextDouble();

                    if (PrecioProducto<= 0){
                        System.out.println("No puede ingresar un valor menor a 0, ¡vuelve a intentarlo!");
                    }else{
                        productos.put(idProducto, new ValoresProducto(nombreProducto, PrecioProducto));
                        System.out.println("Se ha guardado el producto de manera exitosa");
                    }
                    break;

                case 2:
                    System.out.println("El codigo del producto a actualizar: ");
                    int newidProducto = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el nuevo nombre del producto");
                    String newnombreProducto = sc.nextLine();
                    System.out.println("Ingrese el nuevo precio del producto");
                    double newPrecioProducto = sc.nextDouble();


                    if (newPrecioProducto<= 0){
                        System.out.println("No puede ingresar un valor menor a 0, ¡vuelve a intentarlo!");
                    }else{
                        productos.replace(newidProducto, new ValoresProducto(newnombreProducto, newPrecioProducto));
                        System.out.println("El producto se ha actualizado de manera exitosa");
                    }
                    break;
                    
                case 3:

                    System.out.println("Listado de los productos: ");
                    for (Map.Entry<Integer,ValoresProducto> verProductos : productos.entrySet()){
                        System.out.println("Id del producto " + verProductos.getKey());
                        System.out.println("Nombre del producto " + verProductos.getValue().getNombre());
                        System.out.println("Precio del producto " +  verProductos.getValue().getPrecio());
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el codigo del producto que desea eliminar");
                    int ProductoEliminar = sc.nextInt();
                    productos.remove(ProductoEliminar);
                    System.out.println("El producto ha sido eliminado");
                    break;
                case 5:
                    System.out.println("Ha salido del sistema");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }while (opcion !=5 );



    }
}
