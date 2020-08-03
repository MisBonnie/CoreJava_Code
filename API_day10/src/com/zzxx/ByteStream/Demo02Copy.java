package com.zzxx.ByteStream;

import org.junit.Test;

import java.io.*;

public class Demo02Copy {
    @Test
    public void copy01() throws IOException {
        InputStream is = new FileInputStream("a.mp3");
        OutputStream os = new FileOutputStream("a_bak.mp3");
        int a ;
        long time1 = System.currentTimeMillis();
        while ((a = is.read()) != -1) {
            os.write(a);
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }

    @Test
    public void copy02() throws IOException {
        InputStream is = new FileInputStream("a.mp3");
        OutputStream os = new FileOutputStream("a_bak.mp3");
        int len ;
        byte[] bs = new byte[1024];
        long time1 = System.currentTimeMillis();
        while ((len = is.read(bs)) != -1) {
            os.write(bs, 0, len);
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }

    @Test
    public void copy01Buffered() {
        InputStream is = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            is = new FileInputStream("a_bak.txt");
            bis = new BufferedInputStream(is);
            OutputStream os = new FileOutputStream("a_bak_back.txt");
            bos = new BufferedOutputStream(os);
            int a;
            long time1 = System.currentTimeMillis();
            while ((a = bis.read()) != -1) {
                bos.write(a ^ 1);
            }
            // 手动将缓冲区的内容写出到文件
//        bos.flush();
            long time2 = System.currentTimeMillis();
            System.out.println(time2 - time1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                // 流在关闭的时候, 也会自动刷新缓冲区内容
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void copy02Buffered() throws IOException {
        InputStream is = new FileInputStream("a.mp3");
        BufferedInputStream bis = new BufferedInputStream(is);
        OutputStream os = new FileOutputStream("a_bak.mp3");
        BufferedOutputStream bos = new BufferedOutputStream(os);
        int len ;
        byte[] bs = new byte[1024];
        long time1 = System.currentTimeMillis();
        while ((len = bis.read(bs)) != -1) {
            bos.write(bs, 0, len);
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }
    // try-catch 新的处理方式, 了解
    @Test
    public void tryCatchTest() {
        // try(resource) {} 不管有没有异常, resource都会自动关闭, 不需要finally
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a_bak.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a_bak_back.txt"))) {
            int a ;
            long time1 = System.currentTimeMillis();
            while ((a = bis.read()) != -1) {
                bos.write(a ^ 1);
            }
            // 手动将缓冲区的内容写出到文件
//        bos.flush();
            long time2 = System.currentTimeMillis();
            System.out.println(time2 - time1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
