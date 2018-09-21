
package claseeprincipal;


public class Claseeprincipal {

   
    public static void main(String[] args) {

        Figura Figurita[] = new Figura [4];
        
        /**
     utilizando polimorfismo  por que  un objeto de la clase  padre esta 
     * guardando una clase  hija 
     */
          Figurita[0] = new Circulo("circulo normal", 3, "rojo");
          Figurita[1] = new  Rectangulo(14, 10, "rectangulo numero1", 4, "amarillo");
          Figurita[2] = new  RectanguloRedondo(21, 2, 3, 7, "REctangulo Redondo", 4, "azul");
          Figurita[3] = new  Triangulo(5, 7, "Triangulo", 3, "negro");
          
          for (Figura Figuritas : Figurita){
              
              System.out.println(Figuritas.mostrarDatos());
              System.out.println("");
              
                      
          
          
          }
         
        
        
        
    }
   
}




