
package com.mycompany.clase_automovil;

/**
 *
 * @author JIMMY
 */
class Clase_automovil {
 // Atributos
 
 private boolean estado; //estado del vehiculo: true= buen estado false= dañado
 private String clase; //clase de vehiculo: carro, camioneta, etc
 private String placa; //placa del vehiculo
 private String color; //color del vehiculo

 // Constructor
 public Clase_automovil(boolean estado, String clase, String placa, String color) {
 
 this.estado = estado;
 this.clase = clase;
 this.placa = placa;
 this.color = color;
 }
 // Método color
 public void color() {
     System.out.println("el/la "+clase+" es de color: "+color);
 }
 // Método placa
 public void placa() {
     System.out.println("la placa de el/la "+clase+" es: "+placa);
 }
 // Método encender
 public void encender() {
     System.out.println("el/la "+clase+" ha encendido");
 }
 // Método estadotrue
 public void estadotrue() {
     System.out.println("el/la "+clase+" esta en buen estado");
     }
     // Método estadofalse
 public void estadofalse() {
     System.out.println("el/la "+clase+" esta dañado");
     }
 // Método dar velocidad
 public void velocidad() {
 System.out.println("se esta aumentando la velocidad a el/la "+clase);
 }
 // Main para probar la clase vehiculo
 public static void main(String[] args) {
 Clase_automovil  carro = new Clase_automovil (true, "Carro", "ABC143", "Gris plata");
 carro.color();
 carro.placa();
 carro.estadotrue();
 carro.encender();
 carro.velocidad();
 Clase_automovil  camioneta = new Clase_automovil (true, "Camioneta", "AXZ143", "Negro carbon");
 camioneta.color();
 camioneta.placa();
 camioneta.estadotrue();
 camioneta.encender();
 camioneta.velocidad();
 Clase_automovil  camion = new Clase_automovil (false, "Camion", "SXR131", "Rojo ultra");
 camion.color();
 camion.placa();
 camion.estadofalse();
 }
}