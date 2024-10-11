
package com.mycompany.maestro;

/**
 *
 * @author Jackfre
 */
class Maestro {

 // Atributos   
 private String nombre;
 private String materia; 
 private boolean reseña;  

 // Constructor
 public Maestro(String nombre, String materia, boolean reseña) {
 
 this.nombre = nombre;
 this.materia = materia;
 this.reseña = reseña;
 }

// Método materia
 public void descripcion() {
     System.out.println("El/la profesor/a se llama "+nombre+" y explica la materia de "+materia);
 }
 // Método reseñapos
 public void reseñapos() {
     System.out.println("El/la profesor/a "+nombre+" tiene reseñas positivas");
 }
 // Método reseñaneg
 public void reseñaneg() {
     System.out.println("El/la profesor/a "+nombre+" tiene reseñas negativas");
 }
 
 // Main para probar Maestro
 public static void main(String[] args) {
 Maestro maestro1 = new Maestro("Julio","matematicas", true);
 maestro1.descripcion();
 maestro1.reseñapos();
 Maestro maestro2 = new Maestro("Troncha Toros","Biologia", false);
 maestro2.descripcion();
 maestro2.reseñaneg();
 }
}