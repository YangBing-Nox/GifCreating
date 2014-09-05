/**
 * 
 */
package com.gif.create;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * @author YangBing
 * @date   2014-8-19
 */
public class GifCreatePackaging extends Ergodic{
	
	static String DirAndNameOfGif = "D:\\GifBybeyoud.gif";
	static String DirOfImg = "D:\\SMSPlatformScreenCapture\\ManagingSensitiveWords";

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedImage[] src1 = new BufferedImage[100];
		AnimatedGifEncoder e = new AnimatedGifEncoder(); 
		e.setRepeat(0); 
        e.start(DirAndNameOfGif); 
        e.setDelay(300); 
        
        for (int i = 0; i < traverseviaYangBing(DirOfImg).size(); i++) {
        	src1[i] = ImageIO.read(new File(""+traverseviaYangBing(DirOfImg).get(i)));
        	e.addFrame(src1[i]); 
            e.setDelay(1000); 
        }
        e.finish(); 
        System.out.println("finished!");
        
	}

}
//File root = new File(DirOfImg);
//for (int i = 0; i < showAllFilesviaYangBing(root).size(); i++) {
//  System.out.println(showAllFilesviaYangBing(root).get(i));
//	src1[i] = ImageIO.read(new File(""+showAllFilesviaYangBing(root).get(i)));
//	e.addFrame(src1[i]); 
//  e.setDelay(1000); 
//}
