/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Patient;
import dao.PatientDao;
import java.sql.Date;
import java.util.List;
import java.util.Map;
import org.hsqldb.lib.HashMap;
import org.jfree.util.HashNMap;
import util.Config;
import util.JasperUtil;

/**
 *
 * @author hamid
 */
public class PatientService {

    PatientDao patientDao = new PatientDao();

    public int addPatient(Patient patient) throws Exception {
        return patientDao.save(patient);

    }

    public int updatePatient(Patient patient) throws Exception {
        return patientDao.update(patient);

    }

    public Patient findPatient(String idPatient) throws Exception {
        return patientDao.findById(idPatient);

    }

    public List<Patient> findAllPatient() throws Exception {
        return patientDao.findAll();

    }

    public int deletePatient(Patient patient) throws Exception {
        return patientDao.delete(patient);

    }

    public List<Patient> findByCreteria(String numeroDossier, String prenom, String nomFamille, Date dateNaissance) throws Exception {
        String requette = "SELECT * FROM patient WHERE 1=1 ";

        if (numeroDossier != null) {
            requette += " AND id = '" + numeroDossier + "'";
        }
        if (prenom != null) {
            requette += " AND prenom  = '" + prenom + "'";

        }
        if (nomFamille != null) {
            requette += " AND nomFamille  = '" + nomFamille + "'";

        }
//        if (dateNaissance != null) {
//            requette += " AND dateNaissance  = '" + dateNaissance + "'";
//
//        }

        return patientDao.load(requette);
    }

    public List<Patient> findByCreteria1(String prenom, String nomFamille) throws Exception {
        String requette = "SELECT * FROM patient WHERE 1=1 ";

        if (prenom != null) {
            requette += " AND prenom  = '" + prenom + "'";

        }
        if (nomFamille != null) {
            requette += " AND nomFamille  = '" + nomFamille + "'";

        }
//        if (dateNaissance != null) {
//            requette += " AND dateNaissance  = '" + dateNaissance + "'";
//
//        }

        return patientDao.load(requette);
    }

    public void generatePdf() throws Exception {

        List<Patient> patients = findAllPatient();
        JasperUtil.generatePdf(patients, Config.getCheminJasper(), Config.getCheminExport(), null, true);
    }
}
