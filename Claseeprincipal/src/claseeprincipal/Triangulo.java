
package claseeprincipal;

public class Triangulo  extends Figura{

    public Triangulo(float angulo, float angulollano, String NomFigura, int lados, String  color) {
        super(NomFigura, lados, color);
        this.angulo = angulo;
        this.angulollano = angulollano;
    }

 
    
     private float angulo ;
    private float angulollano;
    
    
    /**
     * @return the angulo
     */
    public float getAngulo() {
        return angulo;
    }

    /**
     * @param angulo the angulo to set
     */
    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }

    /**
     * @return the angulollano
     */
    public float getAngulollano() {
        return angulollano;
    }

    /**
     * @param angulollano the angulollano to set
     */
    public void setAngulollano(float angulollano) {
        this.angulollano = angulollano;
    }
    
    
    @Override
    public String mostrarDatos (){
        return  "Nombre de figura " +NomFigura +"\nlos lados son" + lados 
                +"\n el color es " +color + "\n el angulo es "+ angulo 
                +"\n el angulo llano" +angulollano;
    
    }
 
}
