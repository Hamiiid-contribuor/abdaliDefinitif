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
public class Medicament {

    private String id;// cle Primaire  codeBar 
    private String famille;
    private String indication;
    private String contreIndication;
    private String libelle;
    private String nomMedicament;
    private String payeFabrication;
    private String forme;
    private String laboratoireFabrication;
    private String compositionChimique;
    private String Photo;

    public Medicament() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomMedicament() {
        return nomMedicament;
    }

    public void setNomMedicament(String nomMedicament) {
        this.nomMedicament = nomMedicament;
    }


    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public String getContreIndication() {
        return contreIndication;
    }

    public void setContreIndication(String contreIndication) {
        this.contreIndication = contreIndication;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPayeFabrication() {
        return payeFabrication;
    }

    public void setPayeFabrication(String payeFabrication) {
        this.payeFabrication = payeFabrication;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public String getLaboratoireFabrication() {
        return laboratoireFabrication;
    }

    public void setLaboratoireFabrication(String laboratoireFabrication) {
        this.laboratoireFabrication = laboratoireFabrication;
    }

    public String getCompositionChimique() {
        return compositionChimique;
    }

    public void setCompositionChimique(String compositionChimique) {
        this.compositionChimique = compositionChimique;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

}
