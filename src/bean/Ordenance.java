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
public class Ordenance {

    private int id; // auto ??
    private Medicament medicament ;
    private String forme ;
    private int dose ;
    private int nbrfoisParJour ;
    private String quantiteUnitaire;
    private int qsp ;
    private Patient patient ;
    private Medcin medcin ;

    public Ordenance() {
    }

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Medcin getMedcin() {
        return medcin;
    }

    public void setMedcin(Medcin medcin) {
        this.medcin = medcin;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public int getNbrfoisParJour() {
        return nbrfoisParJour;
    }

    public void setNbrfoisParJour(int nbrfoisParJour) {
        this.nbrfoisParJour = nbrfoisParJour;
    }

    public String getQuantiteUnitaire() {
        return quantiteUnitaire;
    }

    public void setQuantiteUnitaire(String quantiteUnitaire) {
        this.quantiteUnitaire = quantiteUnitaire;
    }

    public int getQsp() {
        return qsp;
    }

    public void setQsp(int qsp) {
        this.qsp = qsp;
    }
    
    
    
}
