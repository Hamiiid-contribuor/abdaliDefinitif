/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hamid
 */
public class Consultation {

    private int id;
    private Timestamp dateConsultation;
    private String lieuConsultation;
    private String typeConsultation;
    private Patient patient;
    private int taille;
    private int poids;
    private int tentionMin;
    private int tentionMax;
    private List<Motif_Consultation> motifs = new ArrayList<>();

    //private Medcin medcin;
    public Consultation() {
    }

    public int getId() {
        return id;
    }

    public String getTypeConsultation() {
        return typeConsultation;
    }

    public void setTypeConsultation(String typeConsultation) {
        this.typeConsultation = typeConsultation;
    }

    public List<Motif_Consultation> getMotifs() {
        return motifs;
    }

    public void setMotifs(List<Motif_Consultation> motifs) {
        this.motifs = motifs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Timestamp dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getTentionMin() {
        return tentionMin;
    }

    public void setTentionMin(int tentionMin) {
        this.tentionMin = tentionMin;
    }

    public int getTentionMax() {
        return tentionMax;
    }

    public void setTentionMax(int tentionMax) {
        this.tentionMax = tentionMax;
    }

    public String getLieuConsultation() {
        return lieuConsultation;
    }

    public void setLieuConsultation(String lieuConsultation) {
        this.lieuConsultation = lieuConsultation;
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
}
