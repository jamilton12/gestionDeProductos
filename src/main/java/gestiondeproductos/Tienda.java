package gestiondeproductos;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Productos> productos;
    
    public Tienda() {
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(Productos producto) {
        productos.add(producto);
    }

    public Productos buscarProductoPorNombre(String nombre) {
        for (Productos producto : productos) {
            if (nombre.equals(producto.getNombre())){
                return producto;
            }
        }
        return null;
    }

    public double calcularValorTotalInventario() {
        double precioTotalInventario = 0;
        for (Productos producto : productos) {
            precioTotalInventario += producto.calcularPrecioTotal();
        }
        return precioTotalInventario;
    }

    public void mostrarProductosConStockBajo(int limite) {
        for (Productos producto : productos) {
            boolean esMenorStock = producto.getStock() <= limite;
            if (esMenorStock) {
                producto.mostrarInformacion();
            }
        }
    }
    
}
