package com.nbcb.design.decorating.file;

import java.io.*;

/**
 * 介绍了一个典型的通过BufferedInputStream读取文件内容的代码片段
 */
public class FileTest {
    public static void main(String[] args) {
        System.out.println("start test ...");
        String filePath = "/Users/zhoushuo/Documents/tmp/aa.txt";
        InputStream in = null;

        try {
            in = new BufferedInputStream(
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
