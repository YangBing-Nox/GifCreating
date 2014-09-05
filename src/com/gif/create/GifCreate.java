package com.gif.create;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GifCreate {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedImage src1 = ImageIO.read(new File("D:\\SMSPlatformScreenCapture\\ActorTopology\\20140818185628.jpg"));
        BufferedImage src2 = ImageIO.read(new File("D:\\SMSPlatformScreenCapture\\ActorTopology\\20140818202821.jpg"));
        AnimatedGifEncoder e = new AnimatedGifEncoder(); 
        e.setRepeat(0); 
        e.start("D:\\SMSPlatformScreenCapture\\ActorTopology\\laoma.gif"); 
        e.setDelay(300); 
        e.addFrame(src1); 
        e.setDelay(1000); 
        e.addFrame(src2); 
        e.setDelay(1000); 
        e.finish(); 
        System.out.println("finished!");
        

	}

}
