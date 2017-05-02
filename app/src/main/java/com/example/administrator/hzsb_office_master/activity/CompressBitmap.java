package com.example.administrator.hzsb_office_master.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.utils.BitMapUtils;
import com.example.administrator.hzsb_office_master.utils.MD5Utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * ÎÄ¼þÃèÊö£ºÑ¹ËõÍ¼Æ¬²»Ê§Õæ *
 * @author liujiancheng
 * @date 2017/3/29
 *
 */
public class CompressBitmap extends AppCompatActivity {

    final String PATH = Environment.getExternalStorageDirectory()+"/Download/login.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getThumbUploadPath(PATH,480);
        Bitmap bitmap = getCompressBitmap(PATH);
        System.out.println("123"+bitmap.getByteCount());
    }

    private Bitmap getCompressBitmap(String path) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap bitmap = BitmapFactory.decodeFile(path,options);
        options.inJustDecodeBounds = false;
        int width = options.outWidth;
        int height = options.outHeight;
        float reqWidth = 800f;
        float reqHeight = 480f;
        int inSampleSize = 1;
        if(width>height&&width>reqWidth){
            inSampleSize = (int)(options.outWidth / reqWidth);
        }else if(width<height&&height>reqHeight){
            inSampleSize = (int)(options.outHeight / reqHeight);
        }
        if(inSampleSize<=0)
            inSampleSize = 1;
        options.inSampleSize = inSampleSize;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        bitmap = BitmapFactory.decodeFile(path,options);
        return bitmap;
    }


    public String getThumbUploadPath(String oldPath,int bitMapMaxWidth){
        BitmapFactory.Options  options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(oldPath, options);
        int width = options.outWidth;
        int height = options.outHeight;
        int reqHeight = 0;
        int reqWidth = bitMapMaxWidth;
        reqHeight = (reqWidth*height)/width;
        options.inSampleSize = calculInSampleSize(options,bitMapMaxWidth,reqHeight);
        options.inJustDecodeBounds = false;
        Bitmap bitmap = BitmapFactory.decodeFile(oldPath,options);
        Bitmap mBitmap = compressBitmap(Bitmap.createScaledBitmap(bitmap,bitMapMaxWidth,reqHeight,false));
        String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        return BitMapUtils.compressBitmap(mBitmap, MD5Utils.MD5(time));
    }

    private Bitmap compressBitmap(Bitmap bitmap) {
        ByteArrayOutputStream outBao = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, outBao);
        int options = 100;
        while(outBao.toByteArray().length / 1024 > 100){
            options -= 10;
            outBao.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, options, outBao);
        }
        ByteArrayInputStream inBao = new ByteArrayInputStream(outBao.toByteArray());
        Bitmap mBitmap = BitmapFactory.decodeStream(inBao,null,null);
        return mBitmap;
    }


    private int calculInSampleSize(BitmapFactory.Options options,int reqWidth,int reqHeight) {
        int width = options.outWidth;
        int height = options.outHeight;
        int inSampleSize = 1;

        if(width>reqWidth||height>reqHeight){
            if(width>height){
                inSampleSize = Math.round((float) height/(float) reqHeight);
            }else{
                inSampleSize = Math.round((float) width/(float) reqWidth);
            }
        }
        return inSampleSize;
    }


}
