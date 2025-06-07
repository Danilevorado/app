package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t9 {
    public static X509Certificate[][] a(String str) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairC = u9.c(randomAccessFile);
            if (pairC == null) {
                throw new q9("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairC.first;
            long jLongValue = ((Long) pairC.second).longValue();
            long j10 = (-20) + jLongValue;
            if (j10 >= 0) {
                randomAccessFile.seek(j10);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new q9("ZIP64 APK not supported");
                }
            }
            long jA = u9.a(byteBuffer);
            if (jA >= jLongValue) {
                throw new q9("ZIP Central Directory offset out of range: " + jA + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (u9.b(byteBuffer) + jA != jLongValue) {
                throw new q9("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jA < 32) {
                throw new q9("APK too small for APK Signing Block. ZIP Central Directory offset: " + jA);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jA - byteBufferAllocate.capacity());
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new q9("No APK Signing Block before ZIP Central Directory");
            }
            int i10 = 0;
            long j11 = byteBufferAllocate.getLong(0);
            if (j11 < byteBufferAllocate.capacity() || j11 > 2147483639) {
                throw new q9("APK Signing Block size out of range: " + j11);
            }
            int i11 = (int) (8 + j11);
            long j12 = jA - i11;
            if (j12 < 0) {
                throw new q9("APK Signing Block offset out of range: " + j12);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i11);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j12);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j13 = byteBufferAllocate2.getLong(0);
            if (j13 != j11) {
                throw new q9("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j11);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j12));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                while (byteBufferSlice.hasRemaining()) {
                    i10++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new q9("Insufficient data to read size of APK Signing Block entry #" + i10);
                    }
                    long j14 = byteBufferSlice.getLong();
                    if (j14 < 4 || j14 > 2147483647L) {
                        throw new q9("APK Signing Block entry #" + i10 + " size out of range: " + j14);
                    }
                    int i12 = (int) j14;
                    int iPosition2 = byteBufferSlice.position() + i12;
                    if (i12 > byteBufferSlice.remaining()) {
                        throw new q9("APK Signing Block entry #" + i10 + " size out of range: " + i12 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrL = l(randomAccessFile.getChannel(), new p9(e(byteBufferSlice, i12 - 4), jLongValue2, jA, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        return x509CertificateArrL;
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new q9("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int b(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    private static int c(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    private static String d(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    private static ByteBuffer e(ByteBuffer byteBuffer, int i10) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return e(byteBuffer, i10);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i10 + ", remaining: " + byteBuffer.remaining());
    }

    private static void g(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    private static void h(Map map, FileChannel fileChannel, long j10, long j11, long j12, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        n9 n9Var = new n9(fileChannel, 0L, j10);
        n9 n9Var2 = new n9(fileChannel, j11, j12 - j11);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        u9.d(byteBufferDuplicate, j10);
        l9 l9Var = new l9(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        try {
            byte[][] bArrK = k(iArr, new m9[]{n9Var, n9Var2, l9Var});
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = iArr[i11];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), bArrK[i11])) {
                    throw new SecurityException(d(i12).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e5) {
            throw new SecurityException("Failed to compute digest(s) of contents", e5);
        }
    }

    private static byte[] i(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i10 + ", available: " + byteBuffer.remaining());
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012e A[Catch: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x024e, InvalidAlgorithmParameterException -> 0x0250, InvalidKeyException -> 0x0252, InvalidKeySpecException -> 0x0254, NoSuchAlgorithmException -> 0x0256, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x024e, blocks: (B:60:0x0118, B:62:0x012e, B:63:0x0131), top: B:130:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] j(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) throws java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.io.IOException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t9.j(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] k(int[] iArr, m9[] m9VarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        long j11 = 0;
        int i11 = 0;
        long jA = 0;
        int i12 = 0;
        while (true) {
            j10 = 1048576;
            if (i12 >= 3) {
                break;
            }
            jA += (m9VarArr[i12].a() + 1048575) / 1048576;
            i12++;
        }
        if (jA >= 2097151) {
            throw new DigestException("Too many chunks: " + jA);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i13 = 0;
        while (true) {
            length = iArr.length;
            if (i13 >= length) {
                break;
            }
            int i14 = (int) jA;
            byte[] bArr2 = new byte[(b(iArr[i13]) * i14) + 5];
            bArr2[0] = 90;
            g(i14, bArr2, 1);
            bArr[i13] = bArr2;
            i13++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i15 = 0; i15 < iArr.length; i15++) {
            String strD = d(iArr[i15]);
            try {
                messageDigestArr[i15] = MessageDigest.getInstance(strD);
            } catch (NoSuchAlgorithmException e5) {
                throw new RuntimeException(strD.concat(" digest not supported"), e5);
            }
        }
        int i16 = 0;
        int i17 = 0;
        for (i10 = 3; i16 < i10; i10 = 3) {
            m9 m9Var = m9VarArr[i16];
            long j12 = j11;
            long jA2 = m9Var.a();
            while (jA2 > j11) {
                int iMin = (int) Math.min(jA2, j10);
                g(iMin, bArr3, 1);
                for (int i18 = 0; i18 < length; i18++) {
                    messageDigestArr[i18].update(bArr3);
                }
                long j13 = j12;
                try {
                    m9Var.b(messageDigestArr, j13, iMin);
                    byte[] bArr4 = bArr3;
                    int i19 = 0;
                    while (i19 < iArr.length) {
                        int i20 = iArr[i19];
                        m9 m9Var2 = m9Var;
                        byte[] bArr5 = bArr[i19];
                        int iB = b(i20);
                        int i21 = length;
                        MessageDigest messageDigest = messageDigestArr[i19];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr5, (i17 * iB) + 5, iB);
                        if (iDigest != iB) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i19++;
                        m9Var = m9Var2;
                        length = i21;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j14 = iMin;
                    long j15 = j13 + j14;
                    jA2 -= j14;
                    i17++;
                    j11 = 0;
                    j10 = 1048576;
                    bArr3 = bArr4;
                    j12 = j15;
                    messageDigestArr = messageDigestArr;
                } catch (IOException e10) {
                    throw new DigestException("Failed to digest chunk #" + i17 + " of section #" + i11, e10);
                }
            }
            i11++;
            i16++;
            j11 = 0;
            j10 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i22 = 0; i22 < iArr.length; i22++) {
            int i23 = iArr[i22];
            byte[] bArr7 = bArr[i22];
            String strD2 = d(i23);
            try {
                bArr6[i22] = MessageDigest.getInstance(strD2).digest(bArr7);
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(strD2.concat(" digest not supported"), e11);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] l(FileChannel fileChannel, p9 p9Var) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferF = f(p9Var.f13637a);
                int i10 = 0;
                while (byteBufferF.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(j(f(byteBufferF), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e5) {
                        throw new SecurityException("Failed to parse/verify signer #" + i10 + " block", e5);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                h(map, fileChannel, p9Var.f13638b, p9Var.f13639c, p9Var.f13640d, p9Var.f13641e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e10) {
                throw new SecurityException("Failed to read list of signers", e10);
            }
        } catch (CertificateException e11) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e11);
        }
    }
}
