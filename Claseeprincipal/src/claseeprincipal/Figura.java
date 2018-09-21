
package claseeprincipal;


public class Figura {
    
    
    
        String NomFigura;
    int lados;
    String color;

  

    /**
     * @return the NomFigura
     */
    public String getNomFigura() {
        return NomFigura;
    }

    /**
     * @param NomFigura the NomFigura to set
     */
    public void setNomFigura(String NomFigura) {
        this.NomFigura = NomFigura;
    }

    /**
     * @return the lados
     */
    public int getLados() {
        return lados;
    }

    /**
     * @param lados the lados to set
     */
    public void setLados(int lados) {
        this.lados = lados;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    public Figura(String NomFigura, int lados, String color) {
        this.NomFigura = NomFigura;
        this.lados = lados;
        this.color = color;
    }
    

    public String mostrarDatos (){
        return  "Nombre de figura " +NomFigura +"\nlos lados son" + lados +"\n el color es " +color ;
    
    
    }
}
