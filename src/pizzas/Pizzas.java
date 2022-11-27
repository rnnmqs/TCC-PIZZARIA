/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizzas;

/**
 *
 * @author Cesar
 */
abstract class Pizzas {
    protected int CodigoP;
    protected String SaborP;
    protected String Ingredientes;
    protected String TamanhoP;
    protected double PrecoP;

    /**
     * @return the SaborP
     */
    public String getSaborP() {
        return SaborP;
    }

    /**
     * @param SaborP the SaborP to set
     */
    public void setSaborP(String SaborP) {
        this.SaborP = SaborP;
    }

    /**
     * @return the Ingredientes
     */
    public String getIngredientes() {
        return Ingredientes;
    }

    /**
     * @param Ingredientes the Ingredientes to set
     */
    public void setIngredientes(String Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    /**
     * @return the CodigoP
     */
    public int getCodigoP() {
        return CodigoP;
    }

    /**
     * @param CodigoP the CodigoP to set
     */
    public void setCodigoP(int CodigoP) {
        this.CodigoP = CodigoP;
    }

    /**
     * @return the TamanhoP
     */
    public String getTamanhoP() {
        return TamanhoP;
    }

    /**
     * @param TamanhoP the TamanhoP to set
     */
    public void setTamanhoP(String TamanhoP) {
        this.TamanhoP = TamanhoP;
    }

    /**
     * @return the PrecoP
     */
    public double getPrecoP() {
        return PrecoP;
    }

    /**
     * @param PrecoP the PrecoP to set
     */
    public void setPrecoP(double PrecoP) {
        this.PrecoP = PrecoP;
    }
    
    
    
    
    
}
