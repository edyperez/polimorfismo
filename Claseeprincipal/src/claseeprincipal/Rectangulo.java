
package claseeprincipal;

public class Rectangulo extends Figura {

    
    public float getSumalados() {
        return Sumalados;
    }

    
    public void setSumalados(float Sumalados) {
        this.Sumalados = Sumalados;
    }

    
    public float getArea() {
        return area;
    }

    
    public void setArea(float area) {
        this.area = area;
    }

    public Rectangulo(float Sumalados, float area, String NomFigura, int lados, String color) {
        super(NomFigura, lados, color);
        this.Sumalados = Sumalados;
        this.area = area;
    }
    
    private float Sumalados ;
    private float area;
    
    @Override
      public String mostrarDatos(){
    
      return  "Nombre de figura " +NomFigura +"\nlos lados son" + lados +"\n el color es " +color
             + "\n la suma de los lados es " +Sumalados + "\n el area del Rectangulo es "+ area ;
    
    
    }
    
}
