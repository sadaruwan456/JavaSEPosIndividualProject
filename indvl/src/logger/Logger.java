/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

import Cryptography.Cryption;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pasindu Kalana
 */
public class Logger {

    /**
     * @param args the command line arguments
     */
    private static String username;
    private static String date;
    private static String time;
    private static String type;
    private static String status;
    private static String attempt;
    
    public static void writeLogger(String uname, String usertype,String logstatus,int att){
        Date d = new Date();
        username = uname;
        
        time = new SimpleDateFormat("hh:mm:ss a").format(d);
      
        date = new SimpleDateFormat("yyyy-MM-dd").format(d);
        
        type = usertype;
        type = Cryption.encript(type);
        status = logstatus;
        
        attempt = String.valueOf(att);
    
        writeToFile();
                
        
    }
    private static void writeToFile(){
         try {
            File folder = new File(System.getenv("PROGRAMDATA") + "\\Grand Mobile");
            File folder2 = new File(System.getenv("PROGRAMDATA") + "\\Grand Mobile\\Compleate Log");
            File file = new File(System.getenv("PROGRAMDATA") + "\\Grand Mobile\\Compleate Log\\user.log");
            if (!(folder.exists())) {
                folder.mkdir();
            }
            if (!(folder2.exists())) {
                folder2.mkdir();
            }

            if (!(file.exists())) {
                file.createNewFile();

            }
            file.setWritable(true);
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(username + "," +date+","+ time + "," + type + "," + status+","+attempt+"\n");
            file.setWritable(false);
            br.close();
            fr.close();
        } catch (Exception e) {
           
        }
    }
    
   
}

