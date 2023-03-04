package com.nbcb.design.decorating.file;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    /**
     * ��дread()��������ǿInputStream��������
     * ʵ�ֵ�Ŀ���ǰ�����ͨ��InputStream��ȡ��byte�ֽ�����תΪСд
     * @param b
     * @param off
     * @param len
     * @return
     * @throws IOException
     */
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int n =  super.read(b, off, len);

        for (int i = 0; i < b.length; i++) {
            b[i] = (byte)Character.toLowerCase(b[i]);
        }
        return n;
    }
}
