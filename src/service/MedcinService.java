/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Medcin;
import dao.MedcinDao;
import util.Session;

/**
 *
 * @author hamid
 */
public class MedcinService {

    MedcinDao medcinDao = new MedcinDao();

    public int seConnecter(Medcin medcin) throws Exception {
        Medcin loadedMedcin = medcinDao.findById(medcin.getId());
        if (loadedMedcin != null) {
            if (loadedMedcin.getPassword().equals(medcin.getPassword())) {
                Session.updateAttribute(loadedMedcin, "connectedMedcin");
                return 1;// done 
            } else {
                return -2;//password incorrect 
            }
        }
        return -1;//user null 
    }

}
