/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JFileChooser;
import java.io.File;


/**
 *
 * @author guuil
 */
public class JFileChooserController {

    public File openFile() {
        String defaultPath = "C:\\Users\\guuil\\OneDrive\\Documentos\\GitHub\\InterdisciplinarPUC\\qrcodes";
        JFileChooser fileChooser = new JFileChooser(defaultPath);
        File selectedFile = null;
        
        try {
            fileChooser.setCurrentDirectory(
                    new File(System.getProperty("C:\\Users\\guuil\\OneDrive\\Documentos\\GitHub\\InterdisciplinarPUC\\qrcodes")));

            int resultFile = fileChooser.showOpenDialog(null);
            if (resultFile == javax.swing.JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                
                
            }
        } catch (Exception e) {
        }
        return selectedFile;
    }

}
