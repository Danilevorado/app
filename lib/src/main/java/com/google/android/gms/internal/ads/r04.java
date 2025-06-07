package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class r04 extends s04 {
    r04(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final byte a(long j10) {
        return Memory.peekByte(j10);
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final double b(Object obj, long j10) {
        return Double.longBitsToDouble(this.f15038a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final float c(Object obj, long j10) {
        return Float.intBitsToFloat(this.f15038a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final void d(long j10, byte[] bArr, long j11, long j12) {
        Memory.peekByteArray(j10, bArr, (int) j11, (int) j12);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.t04.s(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.t04.t(java.lang.Object, long, boolean):void */
    /* JADX WARN: Method inline failed with exception
    java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 2
    	at java.base/java.util.ArrayList.shiftTailOverGap(Unknown Source)
    	at java.base/java.util.ArrayList.removeIf(Unknown Source)
     */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.ads.t04.t(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.s04
    public final void e(Object obj, long j10, boolean z10) {
        if (t04.f15641i) {
            t04.s(obj, j10, z10);
        } else {
            t04.t(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final void f(Object obj, long j10, byte b10) {
        if (t04.f15641i) {
            t04.g(obj, j10, b10);
        } else {
            t04.h(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final void g(Object obj, long j10, double d10) {
        this.f15038a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final void h(Object obj, long j10, float f5) {
        this.f15038a.putInt(obj, j10, Float.floatToIntBits(f5));
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final boolean i(Object obj, long j10) {
        return t04.f15641i ? t04.E(obj, j10) : t04.F(obj, j10);
    }
}
