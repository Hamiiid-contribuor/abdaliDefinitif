/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Motif_Consultation;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author hamid
 */
public class Motif_ConsultationHelper  extends AbstractHelper<Motif_Consultation> {
    
    
    
       private static AbstractHelperItem[] titres;

   static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("Motif Consultation ","lebelle"),
           
        };
    }

   

    public Motif_ConsultationHelper(JTable jTable, List<Motif_Consultation> list) {
        super(titres, jTable, list);
    }

    public Motif_ConsultationHelper(JTable jTable) {
        super(titres, jTable);

    }
}

