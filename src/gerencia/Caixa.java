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
public class Caixa extends Funcionarios {
        protected  String SenhaC; 
        protected  String DataAdmC;
        protected String DataPagC;

    /**
     * @return the SenhaC
     */
    public String getSenhaC() {
        return SenhaC;
    }

    /**
     * @param SenhaC the SenhaC to set
     */
    public void setSenhaC(String SenhaC) {
        this.SenhaC = SenhaC;
    }

    /**
     * @return the DataAdmC
     */
    public String getDataAdmC() {
        return DataAdmC;
    }

    /**
     * @param DataAdmC the DataAdmC to set
     */
    public void setDataAdmC(String DataAdmC) {
        this.DataAdmC = DataAdmC;
    }

    /**
     * @return the DataPagC
     */
    public String getDataPagC() {
        return DataPagC;
    }

    /**
     * @param DataPagC the DataPagC to set
     */
    public void setDataPagC(String DataPagC) {
        this.DataPagC = DataPagC;
    }
    
}
