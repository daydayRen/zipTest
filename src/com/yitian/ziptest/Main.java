package com.yitian.ziptest;

public class Main {

    public static void main(String[] args) {

        //测试压缩
      /*
       String zipFilePath = "D:\\失恋";
        String targetPath = "D:\\hhhh\\";
        try {
            ZipBiz.zip(zipFilePath,targetPath,"压缩.zip");
            //ZipBiz.unzip(targetPath + "ss.zip", "D:\\hhhh" + "ss", true);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //测试压缩
        String targetPath = "D:\\hhhh\\";
        try {
            //ZipBiz.zip(zipFilePath,targetPath,"ss.zip");
            UnZip.unzip(targetPath + "压缩.zip", "D:\\hhhh\\" + "ss", true);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
