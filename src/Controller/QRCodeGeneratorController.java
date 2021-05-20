/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import java.io.IOException;
import java.nio.file.Paths;


/**
 *
 * @author guuil
 */

// Teste com a Livraria QRCode
public class QRCodeGeneratorController {
    
    public void generateQRCode() throws WriterException, IOException{
    String data = "www.google.com";
    String path = "C:\\Users\\guuil\\OneDrive\\Documentos\\GitHub\\InterdisciplinarPUC\\testeQRCode.jpg";
    
    BitMatrix matrix = new MultiFormatWriter()
            .encode(data, BarcodeFormat.QR_CODE, 500, 500);
    
    MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
    }
    
}
