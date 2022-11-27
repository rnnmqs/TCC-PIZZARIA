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
public class Gerente extends Funcionarios {
    protected  String SenhaG; 
    protected  String DataPagGe;   

    /**
     * @return the SenhaG
     */
    public String getSenhaG() {
        return SenhaG;
    }

    /**
     * @param SenhaG the SenhaG to set
     */
    public void setSenhaG(String SenhaG) {
        this.SenhaG = SenhaG;
    }

    /**
     * @return the DataPagGe
     */
    public String getDataPagGe() {
        return DataPagGe;
    }

    /**
     * @param DataPagGe the DataPagGe to set
     */
    public void setDataPagGe(String DataPagGe) {
        this.DataPagGe = DataPagGe;
    }

    
    
}
