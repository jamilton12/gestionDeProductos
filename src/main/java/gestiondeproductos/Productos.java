package gestiondeproductos;

public class Productos {
    private String nombre;
    private double precio;
    private int stock;
    
    public Productos () {
        nombre = "No hay producto";
        precio = 0.00;
        stock = 0;
    }
    public Productos (String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInformacion() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("El precio es: " + precio);
        System.out.println("El stock es: " + stock);
    }
    
    public void actualizarStock(int cantidad) {
        int diferenciaStock = stock - cantidad;
        if (cantidad <= 0 || diferenciaStock < 0){
            System.out.println("Cantidad incorrecta");
            System.out.println("no se pudo actualizar el stock");
            return;
        }else {
            setStock(diferenciaStock);
        }
    }
    
    public double calcularPrecioTotal() {
        double precioTotal = precio * stock;
        return precioTotal;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
