package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j0 {
    public static int a(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.get(26) + 27;
        return (int) ((e(byteBuffer.get(i10), byteBuffer.limit() > 1 ? byteBuffer.get(i10 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int b(ByteBuffer byteBuffer) {
        return (int) ((e(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long c(byte[] bArr) {
        return e(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List d(byte[] bArr) {
        int i10 = bArr[11] & 255;
        int i11 = bArr[10] & 255;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(g(f((i10 << 8) | i11)));
        arrayList.add(g(f(3840L)));
        return arrayList;
    }

    private static long e(byte b10, byte b11) {
        int i10 = b10 & 255;
        int i11 = i10 & 3;
        int i12 = 2;
        if (i11 == 0) {
            i12 = 1;
        } else if (i11 != 1 && i11 != 2) {
            i12 = b11 & 63;
        }
        int i13 = i10 >> 3;
        return i12 * (i13 >= 16 ? 2500 << r0 : i13 >= 12 ? 10000 << (r0 & 1) : (i13 & 3) == 3 ? 60000 : 10000 << r0);
    }

    private static long f(long j10) {
        return (j10 * 1000000000) / 48000;
    }

    private static byte[] g(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }
}
