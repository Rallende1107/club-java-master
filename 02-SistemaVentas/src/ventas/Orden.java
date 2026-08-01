package ventas;

public class Orden {
    // atributo
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;


    private static int contadorOrdenes;
    private static final int MAX_PRODUCTO = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTO];
    }

    public void agregarProducto(Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTO){
            this.productos[this.contadorProductos++] = producto;
        }
        else {
            System.out.println("Se supero el máximo de prodcutos" + Orden.MAX_PRODUCTO);
        }
    }

    public double calcularTotal(){
        double total = 0;

        for (int i = 0; i < this.contadorProductos ; i++) {
            // Producto producto = this.productos[i];
            // total += producto.getPrecio();
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        double totalOrden = 0;
        System.out.println("Id Orden:" + this.idOrden);
        totalOrden += this.calcularTotal();
        System.out.println("Total Orden:" + this.idOrden + " $" + totalOrden);

        System.out.println("Productos: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println("\t\t" + this.productos[i]);
        }
    }


}