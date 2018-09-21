
package claseeprincipal;


public class Circulo extends Figura  {

    public Circulo(String NomFigura, int lados, String color) {
        super(NomFigura, lados, color);
    }

    
    public float getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }

    /**
     * @return the segmento
     */
    public float getSegmento() {
        return segmento;
    }

    /**
     * @param segmento the segmento to set
     */
    public void setSegmento(float segmento) {
        this.segmento = segmento;
    }
    
      private float radio ;
    private float  segmento;
    
    
    @Override
    public String mostrarDatos (){
        return  "Nombre de figura " +NomFigura +"\nlos lados son" + lados +"\n el color es " 
                +color+ "\n el radio es "+radio+"\n el segmento es"+segmento ;
    
    
    }
  
}
