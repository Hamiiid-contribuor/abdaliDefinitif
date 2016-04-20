/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Medicament;
import dao.MedicamentDao;
import java.util.List;

/**
 *
 * @author hamid
 */
public class MedicamentService {

    MedicamentDao medicamentDao = new MedicamentDao();

    public List<Medicament> findAll() throws Exception {
        return medicamentDao.findAll();
    }

    public Medicament  findById(String idMedicament) throws Exception {
        return medicamentDao.findById(idMedicament);
    }
}
