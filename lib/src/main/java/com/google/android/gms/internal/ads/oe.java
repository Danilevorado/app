package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
abstract class oe {

    /* renamed from: a, reason: collision with root package name */
    static boolean f13166a = false;

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f13167b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f13168c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f13169d = new Object();

    /* renamed from: e, reason: collision with root package name */
    static final CountDownLatch f13170e = new CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13171f = 0;

    static String a(byte[] bArr, String str) throws GeneralSecurityException {
        byte[] bArrG;
        by3 by3VarM;
        if (((Boolean) k3.w.c().b(ir.R2)).booleanValue()) {
            Vector vectorB = b(bArr, 255);
            if (vectorB == null || vectorB.size() == 0) {
                bArrG = g(f(4096).x(), str, true);
                return ke.a(bArrG, true);
            }
            he heVarK = ie.K();
            int size = vectorB.size();
            for (int i10 = 0; i10 < size; i10++) {
                heVarK.u(ww3.I(g((byte[]) vectorB.get(i10), str, false), 0, 256));
            }
            byte[] bArrE = e(bArr);
            ww3 ww3Var = ww3.f17284n;
            heVarK.v(ww3.I(bArrE, 0, bArrE.length));
            by3VarM = heVarK.m();
        } else {
            if (fh.f8281a == null) {
                throw new GeneralSecurityException();
            }
            byte[] bArrA = fh.f8281a.a(bArr, str != null ? str.getBytes() : new byte[0]);
            he heVarK2 = ie.K();
            ww3 ww3Var2 = ww3.f17284n;
            heVarK2.u(ww3.I(bArrA, 0, bArrA.length));
            heVarK2.w(3);
            by3VarM = heVarK2.m();
        }
        bArrG = ((ie) by3VarM).x();
        return ke.a(bArrG, true);
    }

    static Vector b(byte[] bArr, int i10) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i11 = length + 254;
        Vector vector = new Vector();
        for (int i12 = 0; i12 < i11 / 255; i12++) {
            int i13 = i12 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i13 > 255) {
                    length2 = i13 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i13, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void d() {
        synchronized (f13169d) {
            if (!f13166a) {
                f13166a = true;
                new Thread(new ne(null)).start();
            }
        }
    }

    public static byte[] e(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f13168c) {
            d();
            MessageDigest messageDigest2 = null;
            try {
                if (f13170e.await(2L, TimeUnit.SECONDS) && (messageDigest = f13167b) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest2 == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigest2.reset();
            messageDigest2.update(bArr);
            bArrDigest = f13167b.digest();
        }
        return bArrDigest;
    }

    static vd f(int i10) {
        xc xcVarK0 = vd.k0();
        xcVarK0.y(4096L);
        return (vd) xcVarK0.m();
    }

    private static byte[] g(byte[] bArr, String str, boolean z10) {
        ByteBuffer byteBufferPut;
        int length = bArr.length;
        int i10 = true != z10 ? 255 : 239;
        if (length > i10) {
            bArr = f(4096).x();
        }
        int length2 = bArr.length;
        if (length2 < i10) {
            byte[] bArr2 = new byte[i10 - length2];
            new SecureRandom().nextBytes(bArr2);
            byteBufferPut = ByteBuffer.allocate(i10 + 1).put((byte) length2).put(bArr).put(bArr2);
        } else {
            byteBufferPut = ByteBuffer.allocate(i10 + 1).put((byte) length2).put(bArr);
        }
        byte[] bArrArray = byteBufferPut.array();
        if (z10) {
            bArrArray = ByteBuffer.allocate(256).put(e(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        qe[] qeVarArr = new pf().G2;
        int length3 = qeVarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            qeVarArr[i11].a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new ew3(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }
}
