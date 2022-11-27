/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerencia;

/**
 *
 * @author Cesar
 */
abstract class Funcionarios {
    protected int CodigoF;
    protected String NomeF;
    protected String EnderecoF;
    protected int NF;
    protected String TelF;
    protected String Salario;

    /**
     * @return the CodigoF
     */
    public int getCodigoF() {
        return CodigoF;
    }

    /**
     * @param CodigoF the CodigoF to set
     */
    public void setCodigoF(int CodigoF) {
        this.CodigoF = CodigoF;
    }

    /**
     * @return the NomeF
     */
    public String getNomeF() {
        return NomeF;
    }

    /**
     * @param NomeF the NomeF to set
     */
    public void setNomeF(String NomeF) {
        this.NomeF = NomeF;
    }

    /**
     * @return the EnderecoF
     */
    public String getEnderecoF() {
        return EnderecoF;
    }

    /**
     * @param EnderecoF the EnderecoF to set
     */
    public void setEnderecoF(String EnderecoF) {
        this.EnderecoF = EnderecoF;
    }

    /**
     * @return the TelF
     */
    public String getTelF() {
        return TelF;
    }

    /**
     * @param TelF the TelF to set
     */
    public void setTelF(String TelF) {
        this.TelF = TelF;
    }

    /**
     * @return the Salario
     */
    public String getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(String Salario) {
        this.Salario = Salario;
    }

    /**
     * @return the NF
     */
    public int getNF() {
        return NF;
    }

    /**
     * @param NF the NF to set
     */
    public void setNF(int NF) {
        this.NF = NF;
    }

    
}
