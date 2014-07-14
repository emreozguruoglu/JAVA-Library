/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author alp
 */

import java.sql.*;
import javax.swing.JOptionPane;


public class baglantiSinifi {
    
    Connection baglan=null;
    
    public static Connection Baglanti(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection baglan = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Kutuphane",
                                "postgres", "12345");
            return baglan;
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
