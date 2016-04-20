/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Consultation;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import service.PatientService;

/**
 *
 * @author hamid
 */
public class ConsultationHelper extends AbstractHelper<Consultation> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("N° de Dossier "),
            new AbstractHelperItem("Nom et Prenom "),
            new AbstractHelperItem("Date de Consultation "),
            new AbstractHelperItem("Motifs Consultation "),};
    }

    public ConsultationHelper(JTable jTable, List<Consultation> list) {
        super(titres, jTable, list);
    }

    public ConsultationHelper(JTable jTable) {
        super(titres, jTable);

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PatientService patientService = new PatientService();

        if (list != null && rowIndex < list.size()) {
            if (columnIndex == 0) {
                return list.get(rowIndex).getPatient().getId();
            } else if (columnIndex == 1) {

                try {
                    list.get(rowIndex).setPatient(patientService.findPatient(list.get(rowIndex).getPatient().getId()));

                } catch (Exception ex) {
                    Logger.getLogger(ConsultationHelper.class.getName()).log(Level.SEVERE, null, ex);
                }
                String d = list.get(rowIndex).getPatient().getNomFamille() + "  " + list.get(rowIndex).getPatient().getPrenom();
                return d;

            } else if (columnIndex == 2) {
                return list.get(rowIndex).getDateConsultation();
            }else{
                return list.get(rowIndex).getMotifs();
            }

        }

        return null;

    }
}
