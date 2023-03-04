package com.nbcb.design.decorating.file;

import java.io.*;

/**
 * ����Ҫ��Ϊ����֤����д��װ����LowerCaseInputStream
 * �÷���FileTest.java�У�ͨ��BufferedInputStream��ȡ�ļ��ķ�ʽ����
 * ֻ������ǰ��������ǰ�ͨ��FileInputStream��ȡ���ֽ���ȫ��ת��Сд
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
            // �ر���Դ
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
