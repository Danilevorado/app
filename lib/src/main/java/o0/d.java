package o0;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* loaded from: classes.dex */
abstract class d {

    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f25695a;

        /* renamed from: b, reason: collision with root package name */
        long f25696b;

        a() {
        }
    }

    static long a(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j10 = aVar.f25696b;
        randomAccessFile.seek(aVar.f25695a);
        int iMin = (int) Math.min(16384L, j10);
        byte[] bArr = new byte[16384];
        while (true) {
            int i10 = randomAccessFile.read(bArr, 0, iMin);
            if (i10 == -1) {
                break;
            }
            crc32.update(bArr, 0, i10);
            j10 -= i10;
            if (j10 == 0) {
                break;
            }
            iMin = (int) Math.min(16384L, j10);
        }
        return crc32.getValue();
    }

    static a b(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j10 = length - 65536;
        long j11 = j10 >= 0 ? j10 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f25696b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                aVar.f25695a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return aVar;
            }
            length--;
        } while (length >= j11);
        throw new ZipException("End Of Central Directory signature not found");
    }

    static long c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return a(randomAccessFile, b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
