/*
 * Copyright (c) 2022, CTL and/or its affiliates. All rights reserved.
 * Created by nkjha on 22-08-2022.
 */
package com.concept.samplelibrary;

import java.io.InputStream;
import java.io.OutputStream;

public class BalDongleLib {
    InputStream inputStream;
    OutputStream outputStream;
    public BalDongleLib(InputStream inputStream, OutputStream outputStream){
        this.inputStream= inputStream;
        this.outputStream=outputStream;
    }
    public boolean initDongle(String bt_device_name){
        return inputStream!=null && outputStream!=null;
    }
    public String getVin(){
        return "MDXNTF000012DERTD";
    }
    public void writeVin(String Vin){

    }
}
