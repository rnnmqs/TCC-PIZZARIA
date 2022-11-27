/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sobremesas;

/**
 *
 * @author Cesar
 */
abstract class Sobremesas {
    protected int CodigoS;
    protected String NomeS;
    protected String SaborS;
    protected String TamanhoS;
    protected double PrecoS;

    /**
     * @return the CodigoS
     */
    public int getCodigoS() {
        return CodigoS;
    }

    /**
     * @param CodigoS the CodigoS to set
     */
    public void setCodigoS(int CodigoS) {
        this.CodigoS = CodigoS;
    }

    /**
     * @return the NomeS
     */
    public String getNomeS() {
        return NomeS;
    }

    /**
     * @param NomeS the NomeS to set
     */
    public void setNomeS(String NomeS) {
        this.NomeS = NomeS;
    }

    /**
     * @return the IngredientesS
     */
    public String getIngredientesS() {
        return SaborS;
    }

    /**
     * @param IngredientesS the IngredientesS to set
     */
    public void setIngredientesS(String IngredientesS) {
        this.SaborS = IngredientesS;
    }

    /**
     * @return the TamanhoS
     */
    public String getTamanhoS() {
        return TamanhoS;
    }

    /**
     * @param TamanhoS the TamanhoS to set
     */
    public void setTamanhoS(String TamanhoS) {
        this.TamanhoS = TamanhoS;
    }

    /**
     * @return the PrecoS
     */
    public double getPrecoS() {
        return PrecoS;
    }

    /**
     * @param PrecoS the PrecoS to set
     */
    public void setPrecoS(double PrecoS) {
        this.PrecoS = PrecoS;
    }
     
    
    
    
    
    
}
