/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.deber;

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objeto Persona
        var persona1 = new Persona();
        var persona2= new Persona();
        
        //Persona 1
        persona1.nombre = "Juan";
        persona1.apellido= "Coraisaca";
        persona1.edad= 19;
        persona1.peso= 35;
        
        System.out.println("El nombre de la persona es;"+persona1.nombre);
        System.out.println("El apellido de la persona es;"+persona1.apellido);
        System.out.println("La edad es;"+persona1.edad);
        System.out.println("El peso es;"+persona1.peso);
        System.out.println("-------------------------------------------------");
        
        //Persona 2
        persona2.nombre= "Ariel";
        persona2.apellido="Lopez";
        persona2.edad= 15;
        persona2.peso= 30;
        
        System.out.println("El nombre de la persona es;"+persona2.nombre);
        System.out.println("El apellido de la persona es;"+persona2.apellido);
        System.out.println("La edad es;"+persona2.edad);
        System.out.println("El peso es;"+persona2.peso);
        System.out.println("-------------------------------------------------");
        
        //Objeto Auto
        var auto1= new Auto();
        var auto2= new Auto();
        
        //Auto1
        auto1.modelo= "r8";
        auto1.color= "Blanco";
        auto1.kilometraje= 0;
        auto1.marca= "Audi";
        
        System.out.println("El modelo del auto es;"+auto1.modelo);
        System.out.println("El color del auto es;"+auto1.color);
        System.out.println("El kilometraje es;"+auto1.kilometraje);
        System.out.println("La marca es;"+auto1.marca);
        System.out.println("-------------------------------------------------");
        
        //Auto2
        auto2.modelo= "r9";
        auto2.color= "Negro";
        auto2.kilometraje= 0;
        auto2.marca= "Chevrolet";
        
        System.out.println("El modelo del auto es;"+auto2.modelo);
        System.out.println("El color del auto es;"+auto2.color);
        System.out.println("El kilometraje es;"+auto2.kilometraje);
        System.out.println("La marca es;"+auto2.marca);
        System.out.println("-------------------------------------------------");
        
        //Objeto Computadora
        var computadora1= new Computadora();
        var computadora2= new Computadora();
        
        //Computadora1
        computadora1.color="Negro";
        computadora1.marca="MacBook";
        computadora1.espacio= 500;
        computadora1.precio= 750;
        
        System.out.println("El color de la computadora es;"+computadora1.color);
        System.out.println("La marca de la computadora es;"+computadora1.marca);
        System.out.println("El color de la computadora es;"+computadora1.espacio);
        System.out.println("La marca de la computadora es;"+computadora1.precio);
        System.out.println("-------------------------------------------------");
        
        //Computadora2
        computadora2.color="Gris";
        computadora2.marca="HP";
        computadora2.espacio= 600;
        computadora2.precio= 750;
        
        System.out.println("El color de la computadora es;"+computadora2.color);
        System.out.println("La marca de la computadora es;"+computadora2.marca);
        System.out.println("El color de la computadora es;"+computadora2.espacio);
        System.out.println("La marca de la computadora es;"+computadora2.precio);
        System.out.println("-------------------------------------------------");
        
        //Objeto Factura
        var factura1= new Factura();
        var factura2= new Factura();
        
        //Factura1
        factura1.cliente="Mauricio Lopez";
        factura1.direccion="Miraflores";
        factura1.cedula= 0101010101;
        factura1.genero= "Masculino";
        
        System.out.println("El cliente es;"+factura1.cliente);
        System.out.println("La direccion es;"+factura1.direccion);
        System.out.println("La cedula es;"+factura1.cedula);
        System.out.println("El genero es;"+factura1.genero);
        System.out.println("-------------------------------------------------");
        
        //Factura2
        factura2.cliente="Maria Arias";
        factura2.direccion="Ricaurte";
        factura2.cedula= 0101010101;
        factura2.genero= "Femenino";
        
        System.out.println("El cliente es;"+factura2.cliente);
        System.out.println("La direccion es;"+factura2.direccion);
        System.out.println("La cedula es;"+factura2.cedula);
        System.out.println("El genero es;"+factura2.genero);
        System.out.println("-------------------------------------------------");
        
        //Objeto Restaurant
        var restaurant1= new Restaurant();
        var restaurant2= new Restaurant();
        
        //Restaunrant1
        restaurant1.cliente="Sergio Sacoto";
        restaurant1.direccion="Calle Larga";
        restaurant1.horario= 7;
        restaurant1.precio= 12;
        
         
        System.out.println("El cliente es;"+restaurant1.cliente);
        System.out.println("La direccion es;"+restaurant1.direccion);
        System.out.println("El horario es ;"+restaurant1.horario);
        System.out.println("El precio es;"+restaurant1.precio);
        System.out.println("-------------------------------------------------");
        
        //Restaunrant2
        restaurant2.cliente="Sergio Nivicela";
        restaurant2.direccion="Calle Vieja";
        restaurant2.horario= 9;
        restaurant2.precio= 10;
        
         
        System.out.println("El cliente es;"+restaurant2.cliente);
        System.out.println("La direccion es;"+restaurant2.direccion);
        System.out.println("El horario es ;"+restaurant2.horario);
        System.out.println("El precio es;"+restaurant2.precio);
        System.out.println("-------------------------------------------------");
        
        
        
        
        
    }
    
}
