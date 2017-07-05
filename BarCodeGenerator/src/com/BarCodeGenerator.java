/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.google.zxing.EncodeHintType;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.util.Hashtable;
import java.io.IOException;
import java.io.*;


/**
 *
 * @author milov
 */
public class BarCodeGenerator {
  
  public static void creatCode128(OutputStream outputstream,String contents,String encodeType,int height,
                                    int length,String imgType){
    Hashtable hints = new Hashtable();
    hints.put(EncodeHintType.CHARACTER_SET, encodeType);
    BitMatrix matrix = null;
    
    try{
      matrix = new MultiFormatWriter().encode(contents, BarcodeFormat.CODE_128, length, height,hints);
      MatrixToImageWriter.writeToStream(matrix, contents, outputstream);
    }catch(WriterException e){
      e.printStackTrace();
    }catch(IOException e){
      e.printStackTrace();
    }
  } 
  
  public static void creatQRCode(OutputStream outputstream,String contents,String encodeType,int height,
                                    int length,String imgType){
    Hashtable hints = new Hashtable();
    hints.put(EncodeHintType.CHARACTER_SET, encodeType);
    BitMatrix matrix = null;
    
    try{
      matrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, length, height,hints);
      MatrixToImageWriter.writeToStream(matrix, contents, outputstream);
    }catch(WriterException e){
      e.printStackTrace();
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
