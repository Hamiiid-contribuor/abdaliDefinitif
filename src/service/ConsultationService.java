/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Consultation;
import dao.ConsultationDao;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author hamid
 */
public class ConsultationService {

    ConsultationDao consultationDao = new ConsultationDao();
    PatientService patientService = new PatientService();

    public int addConsultation(Consultation consultation) throws Exception {
        return consultationDao.save(consultation);
    }

    public List<Consultation> findAllConsultation() throws Exception {
        return consultationDao.findAll();
    }

    public List<Consultation> findBycriteria(Timestamp dateConsultation) throws Exception {

        String requette = "SELECT * FROM  consultation WHERE dateConsultation like = '" + dateConsultation + "'";
        System.out.println(" haaaa requetta --> " + requette);
        return consultationDao.load(requette);
    }
}
