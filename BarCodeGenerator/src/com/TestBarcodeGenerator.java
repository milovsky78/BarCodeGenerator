/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.BarCodeGenerator;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import java.io.IOException;
import java.io.*;

/**
 *
 * @author Home
 */
public class TestBarcodeGenerator {
  public static void main(String[] args) throws IOException,WriterException{
    String[] print = {"*M1000033699","*V-","*Q300","*Ukg","*BXF17040701","*D20170411","*T170100200-2"};
    for(int i = 0;i < 7;i++){
      BitMatrix matrix = new MultiFormatWriter().encode(print[i],BarcodeFormat.CODE_128,175,9);
      File file = new File(i + ".jpg");
      MatrixToImageWriter.writeToFile(matrix, "jpg", file);
    }
  }
}
