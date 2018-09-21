/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseeprincipal;


public class RectanguloRedondo extends Rectangulo  {

    
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
     * @return the ancho
     */
    public float getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public RectanguloRedondo(float radio, float ancho, float Sumalados, float area, String NomFigura, int lados, String color) {
        super(Sumalados, area, NomFigura, lados, color);
        this.radio = radio;
        this.ancho = ancho;
    }
    
    private float radio;
    private float ancho;
    
    
    @Override
      public String mostrarDatos(){
    
      return  "Nombre de figura " +NomFigura +"\nlos lados son" + lados +"\n el color es " +color
             + "\n el radio es " + radio + " \n el ancho es  "+ ancho ;
    
    
    }
}
