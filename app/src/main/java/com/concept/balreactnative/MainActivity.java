package com.concept.balreactnative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.concept.samplelibrary.BalDongleLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {

    BalDongleLib balDongleLib;
    OutputStream outputStream;
    InputStream inputStream;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView status=findViewById(R.id.status);
        try {
            inputStream=new FileInputStream(new File("infilename"));
            outputStream=new FileOutputStream(new File("outfilename"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        balDongleLib=new BalDongleLib(inputStream,outputStream);
        boolean result=balDongleLib.initDongle("btdevice");
        String vin=balDongleLib.getVin();
        status.setText("initResult:"+result+",vin:"+vin);

    }
}