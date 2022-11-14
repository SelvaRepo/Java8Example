package com.java8.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

public class ByteArrayToImage {
    public static void main(String args[]) throws Exception {
        BufferedImage bImage = ImageIO.read(new File("c:/data/in/download.png"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(bImage, "png", bos );
        byte [] data = bos.toByteArray();

        //creating Date from millisecond
        Date currentDate = new Date(System.currentTimeMillis());
        //format
        DateFormat df = new SimpleDateFormat("ddMMyyHHmmssSSS");

        String imageAppDir = "/data/";

        File imageAppDirFile = new File(imageAppDir+df.format(currentDate)+".jpeg");

        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        BufferedImage bImage2 = ImageIO.read(bis);
        ImageIO.write(bImage2, "jpeg", imageAppDirFile );
        System.out.println("image created");
    }

}
