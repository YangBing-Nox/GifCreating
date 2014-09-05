/**
 * 
 */
package com.gif.create;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author YangBing
 * @date   2014-8-19
 */
public class Ergodic {

	static String dir = new String("D:\\SMSPlatformScreenCapture\\");
     /**
      * @param args
      * @throws Exception 
      */
     public static void main(String[] args) throws Exception {
          // TODO Auto-generated method stub

        for (int i = 0; i < traverseviaYangBing(dir).size(); i++) {
        	System.out.println(traverseviaYangBing(dir).get(i));
        }
     }
     final static void showAllFiles(File dir) throws Exception{
          File[] fs = dir.listFiles();
          for(int i=0; i<fs.length; i++){
               System.out.println(fs[i].getAbsolutePath());
               if(fs[i].isDirectory()){
                    try{
                         showAllFiles(fs[i]);
                    }catch(Exception e){}
             }
          }
     }
     final static List<String> showAllFilesviaYangBing(File dir) throws Exception{
         File[] fs = dir.listFiles();
         List<String> list = new ArrayList<String>();
         for(int i=0; i<fs.length; i++){

        	 list.add(fs[i].getAbsolutePath());
              if(fs[i].isDirectory()){
                   try{
                	   showAllFilesviaYangBing(fs[i]);
                   }catch(Exception e){}
              }
        	 
         }
		return list;
    }
     public static void traverse (String path){
    	 File file = new File(path);
    	 if(file.listFiles()==null){
    		 return;
    	 }
    	 for(File tmp : file.listFiles()){
    		 if(tmp.isFile()){ //如果是文件 ，打印名字
    			 System.out.println(tmp.getAbsolutePath());
    		 }else{ //不是文件。递归
    			 traverse(tmp.getAbsolutePath());
    		 }
    	 }
    }
     public static List<String> traverseviaYangBing(String path){
    	 File file = new File(path);
    	 List<String> list = new ArrayList<String>();
    	 if(file.listFiles()==null){
    		 list.add("");
    		 return list;
    	 }
    	 for(File tmp : file.listFiles()){
    		 if(tmp.isFile()){ //如果是文件 ，打印名字
//    			 System.out.println(tmp.getAbsolutePath());
    			 list.add(tmp.getAbsolutePath());
    		 }else{ //不是文件。递归
    			 traverse(tmp.getAbsolutePath());
    		 }
    	 }
    	 return list;
    }
}

//File root = new File(dir);
//traverse(dir);
//showAllFiles(root);
//for (int i = 0; i < showAllFilesviaYangBing(root).size(); i++) {
//  System.out.println(showAllFilesviaYangBing(root).get(i));
//}

//if(fs[i].isFile()){
//list.add(fs[i].getAbsolutePath());
//}else{
//try{
//	 showAllFilesviaYangBing(fs[i]);
////	 fs[i].getAbsolutePath();
//}catch(Exception e){}
//}
