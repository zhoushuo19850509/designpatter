package com.nbcb.design.decorating.file;

import java.io.*;

/**
 * 这主要是为了验证我们写的装饰类LowerCaseInputStream
 * 用法和FileTest.java中，通过BufferedInputStream读取文件的方式类似
 * 只不过当前这个代码是把通过FileInputStream读取的字节流全部转成小写
 */
public class LowerCaseInputStreamTest {
    public static void main(String[] args) {

        System.out.println("start test ...");
        String filePath = "/Users/zhoushuo/Documents/tmp/aa.txt";
        InputStream in = null;

        try {
            in = new LowerCaseInputStream(
                    new FileInputStream(new File(filePath)));

            byte[] buffer = new byte[1024];
            StringBuilder sb = new StringBuilder();
            int n = 0;
            while( (n = in.read(buffer)) > 0){
                sb.append(new String(buffer,0,n));
            }
            System.out.println(sb.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 关闭资源
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
