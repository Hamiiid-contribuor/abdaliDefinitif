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
public class MesureConsultation {

    private int id;//auto  
    private String taille;
    private String temperature;
    private int poids;
    private int tentionMin;
    private int tentionMax;

    public MesureConsultation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
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

}
