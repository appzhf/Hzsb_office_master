package com.example.administrator.hzsb_office_master.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Environment;

/**
 * 
 * @author Administrator
 *
 */
public class BitMapUtils {
	public static String compressBitmap(Bitmap bitmap,String md5){
		
		String path = Environment.getExternalStorageDirectory().getPath()+File.separator+"data/";
		File file = new File(path+File.separator+md5+".png");
		if(file.exists()){
			file.delete();
		}
		if(!new File(path).exists()){
			new File(path).mkdirs();
		}
		try {
			file.createNewFile();
			FileOutputStream out = new FileOutputStream(file);
			bitmap.compress(CompressFormat.PNG, 100, out);
			out.flush();
			out.close();
			bitmap.recycle();
			bitmap = null;
			System.gc();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file.getPath();
		
	} 
}
