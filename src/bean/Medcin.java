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
public class Medcin {

    private String id;
    private String password;
    private String nom;
    private String nomArabe;
    private String prenom;
    private String prenomArabe;
    private String specialite;
    private String specialiteArabe;
    private String telFixe;
    private String telMobile;

    private String adresseCabinet;
    private String adresseCabinetArabe;
    private String adresseEmail;

    public Medcin() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNomArabe() {
        return nomArabe;
    }

    public void setNomArabe(String nomArabe) {
        this.nomArabe = nomArabe;
    }

    public String getPrenomArabe() {
        return prenomArabe;
    }

    public void setPrenomArabe(String prenomArabe) {
        this.prenomArabe = prenomArabe;
    }

    public String getSpecialiteArabe() {
        return specialiteArabe;
    }

    public void setSpecialiteArabe(String specialiteArabe) {
        this.specialiteArabe = specialiteArabe;
    }

    public String getAdresseCabinetArabe() {
        return adresseCabinetArabe;
    }

    public void setAdresseCabinetArabe(String adresseCabinetArabe) {
        this.adresseCabinetArabe = adresseCabinetArabe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getTelMobile() {
        return telMobile;
    }

    public void setTelMobile(String telMobile) {
        this.telMobile = telMobile;
    }

    public String getAdresseCabinet() {
        return adresseCabinet;
    }

    public void setAdresseCabinet(String adresseCabinet) {
        this.adresseCabinet = adresseCabinet;
    }

    public String getAdresseEmail() {
        return adresseEmail;
    }

    public void setAdresseEmail(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }

}
