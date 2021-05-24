/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.FileInputStream;

/**
 *
 * @author guuil
 */
public class QRCodeReaderController {

    public String readQRCode(String fileSelected) {
        try {
            BufferedImage bf = ImageIO.read(new FileInputStream(fileSelected));

            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(
                    new BufferedImageLuminanceSource(bf)));

            Result result = new MultiFormatReader().decode(bitmap);
            System.out.println(result.getText());
            return result.getText();
        } catch (Exception e) {

        }
        
        return "Erro ao ler arquivo";
    }
}