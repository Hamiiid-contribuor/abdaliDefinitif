/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Patient;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author hamid
 */
public class PatientHelper  extends AbstractHelper<Patient> {
    
    
    
       private static AbstractHelperItem[] titres;

   static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("N° de Dossier ","id"),
            new AbstractHelperItem("Nom de Famille","nomFamille"),
            new AbstractHelperItem("Prenom ","prenom"),
            new AbstractHelperItem("Date de Naissance ","dateNaissance"),
         
        
        };
    }

   

    public PatientHelper(JTable jTable, List<Patient> list) {
        super(titres, jTable, list);
    }

    public PatientHelper(JTable jTable) {
        super(titres, jTable);

    }
}

