/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author hamid
 */
public class Paiement_Ordonnance {
    
    
    private String id ;// auto 
    private String montantTotal ;
    private String MontantPaye ;
    private String relicat ;
    private Patient patient ;
    //private Medcin medcin;
    private Ordenance ordenance ;

    public Paiement_Ordonnance() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMontantTotal() {
        return montantTotal;
    }
    

    public void setMontantTotal(String montantTotal) {
        this.montantTotal = montantTotal;
    }

    public String getMontantPaye() {
        return MontantPaye;
    }

    public void setMontantPaye(String MontantPaye) {
        this.MontantPaye = MontantPaye;
    }

    public String getRelicat() {
        return relicat;
    }

    public void setRelicat(String relicat) {
        this.relicat = relicat;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

//    public Medcin getMedcin() {
//        return medcin;
//    }
//
//    public void setMedcin(Medcin medcin) {
//        this.medcin = medcin;
//    }

    public Ordenance getOrdenance() {
        return ordenance;
    }

    public void setOrdenance(Ordenance ordenance) {
        this.ordenance = ordenance;
    }
    
    
    
    
    
}
