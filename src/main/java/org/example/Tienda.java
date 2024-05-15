package org.example;

public class Tienda {

    public static String asignarDescuento(int edad, double compra) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }

        String categoria = obtenerCategoria(edad);
        boolean altaCompra = compra >= 500;

        switch (categoria) {
            case "Estudiante":
                return altaCompra ? "20%" : "10%";
            case "Trabajador":
                return altaCompra ? "15%" : "5%";
            case "Jubilado":
                return altaCompra ? "30%" : "20%";
            default:
                return "Sin descuento";
        }
    }

    private static String obtenerCategoria(int edad) {
        if (edad < 25) {
            return "Estudiante";
        } else if (edad <= 60) {
            return "Trabajador";
        } else {
            return "Jubilado";
        }
    }

    public static void main(String[] args) {
        System.out.println(asignarDescuento(20, 600)); // 20%
        System.out.println(asignarDescuento(30, 400)); // 5%
        System.out.println(asignarDescuento(65, 700)); // 30%
        System.out.println(asignarDescuento(70, 200)); // 20%
    }
}
