package i4;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class k {
    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long b(InputStream inputStream, OutputStream outputStream) {
        return c(inputStream, outputStream, false, 1024);
    }

    public static long c(InputStream inputStream, OutputStream outputStream, boolean z10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        long j10 = 0;
        while (true) {
            try {
                int i11 = inputStream.read(bArr, 0, i10);
                if (i11 == -1) {
                    break;
                }
                j10 += i11;
                outputStream.write(bArr, 0, i11);
            } catch (Throwable th) {
                if (z10) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z10) {
            a(inputStream);
            a(outputStream);
        }
        return j10;
    }

    public static byte[] d(InputStream inputStream, boolean z10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(inputStream, byteArrayOutputStream, z10, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
