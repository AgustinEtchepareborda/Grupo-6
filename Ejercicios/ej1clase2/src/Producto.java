public class Producto {
    private int codigo;
    private String nombre;
    private int precio;
    private int stock;

// constructores
    public Producto(int codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;
    }
    public Producto() {
        this.stock = 0;
    }

    // metodos
    public void mostrarDatos(){
        System.out.println("-----producto-----");
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: $"+precio);
        System.out.println("Cantidad: "+stock);
    }

    public int consultarStock(){
        return stock;
    }

    public void ingresarStock(int cantidad){
        this.stock = this.stock + cantidad;
    }

    public void venderProducto(int cantidad){
        if(cantidad > stock){
            System.out.println("No hay stock suficiente");
        } else {
            this.stock = this.stock - cantidad;
        }
    }


}
