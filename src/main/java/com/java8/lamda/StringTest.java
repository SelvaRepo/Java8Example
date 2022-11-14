package com.java8.lamda;

import java.io.File;

public class StringTest {
    public static void main(String[] args) {

        String pathAndFilename ="/eqx1vwdimg/images/eqx1vwasql/span_images/202208/span_images_9860316.tiff";
        String imageAppDir = "/data/apps/spanos/print/";

        File imageServerpath = new File(pathAndFilename);
        //App server path + file name
        File imageAppDirFile = new File(imageAppDir+imageServerpath.getName());
        System.out.println("Image write in the imageAppDir >>"+imageAppDirFile.getAbsolutePath());



    }
}
