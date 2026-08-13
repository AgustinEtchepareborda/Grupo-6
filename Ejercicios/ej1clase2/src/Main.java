public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto(3232, "guitarra",4500);
        Producto p2 = new Producto(3233, "tambor",5800);

        p1.mostrarDatos();
        p2.mostrarDatos();

        p1.ingresarStock(10);
        p1.ingresarStock(5);
        System.out.println("Stock de "+"guitarra"+": "+p1.consultarStock());

        p1.venderProducto(8);
        System.out.println("Stock luego de vender 8: "+p1.consultarStock());

        p1.venderProducto(20);
        System.out.println("Stock luego de intentar vender 20: "+p1.consultarStock());
    }
}
