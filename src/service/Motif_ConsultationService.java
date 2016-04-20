/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Motif_Consultation;
import dao.Motif_ConsultationDao;
import java.util.List;

/**
 *
 * @author hamid
 */
public class Motif_ConsultationService {

    Motif_ConsultationDao motif_ConsultationDao = new Motif_ConsultationDao();

    public List<Motif_Consultation> findAllMotifs() throws Exception {
        return motif_ConsultationDao.findAll();
    }
}
