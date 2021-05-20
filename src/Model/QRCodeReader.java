/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author guuil
 */
public class QRCodeReader {
    
    public void ReadQRCode(){
        try{
            String path = "C:\\Users\\guuil\\OneDrive\\Documentos\\GitHub\\InterdisciplinarPUC\\testeQRCode.jpg";
            
            BufferedImage bf = ImageIO.read(new FileInputStream(path));
            
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(
                    new BufferedImageLuminanceSource(bf)));
            
            Result result = new MultiFormatReader().decode(bitmap);
            
            System.out.println(result.getText());
        }catch (Exception e){
            
        }
    }
    
}
