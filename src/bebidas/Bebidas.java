/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bebidas;

/**
 *
 * @author Cesar
 */
abstract class Bebidas {
    protected int CodigoB;
    protected String TipoB;
    protected String MarcaB;
    protected String TamanhoB;
    protected double PrecoB;

    /**
     * @return the CodigoB
     */
    public int getCodigoB() {
        return CodigoB;
    }

    /**
     * @param CodigoB the CodigoB to set
     */
    public void setCodigoB(int CodigoB) {
        this.CodigoB = CodigoB;
    }

    /**
     * @return the TipoB
     */
    public String getTipoB() {
        return TipoB;
    }

    /**
     * @param TipoB the TipoB to set
     */
    public void setTipoB(String TipoB) {
        this.TipoB = TipoB;
    }

    /**
     * @return the MarcaB
     */
    public String getMarcaB() {
        return MarcaB;
    }

    /**
     * @param MarcaB the MarcaB to set
     */
    public void setMarcaB(String MarcaB) {
        this.MarcaB = MarcaB;
    }

    /**
     * @return the TamanhoB
     */
    public String getTamanhoB() {
        return TamanhoB;
    }

    /**
     * @param TamanhoB the TamanhoB to set
     */
    public void setTamanhoB(String TamanhoB) {
        this.TamanhoB = TamanhoB;
    }

    /**
     * @return the PrecoB
     */
    public double getPrecoB() {
        return PrecoB;
    }

    /**
     * @param PrecoB the PrecoB to set
     */
    public void setPrecoB(double PrecoB) {
        this.PrecoB = PrecoB;
    }
    
    
    
    
}
