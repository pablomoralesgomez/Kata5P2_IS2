/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.List;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;

/**
 *
 * @author Pablo
 */
public class Kata5_2_IS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        SQLiteMailLoader connectionBD = new SQLiteMailLoader();
        List<Mail> mailList = connectionBD.load();
        
        HistogramDisplay histoDisplay = new HistogramDisplay("Histograma "
                + "Leyendo de Fichero", MailHistogramBuilder.build(mailList));
        histoDisplay.execute();;
    }
    
}
