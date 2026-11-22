package com.qvision.utils;

import java.util.UUID;

public class GeneradorCorreo {

    public GeneradorCorreo() {}

    public static String correoAleatorio(){
        UUID guid = UUID.randomUUID();
        return "testJeferson"+guid.toString().replace("-","")+"@test.com";
    }

}
