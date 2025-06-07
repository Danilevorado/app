package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class xa extends ya {
    xa(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.ya
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(k(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.ya
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(j(obj, j10));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.za.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.za.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Method inline failed with exception
    java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative
    	at java.base/java.lang.System.arraycopy(Native Method)
    	at java.base/java.util.ArrayList.shiftTailOverGap(Unknown Source)
    	at java.base/java.util.ArrayList.removeIf(Unknown Source)
     */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.measurement.za.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.ya
    public final void c(Object obj, long j10, boolean z10) {
        if (za.f19436h) {
            za.n(obj, j10, z10);
        } else {
            za.o(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ya
    public final void d(Object obj, long j10, byte b10) {
        if (za.f19436h) {
            za.d(obj, j10, b10);
        } else {
            za.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ya
    public final void e(Object obj, long j10, double d10) {
        o(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.ya
    public final void f(Object obj, long j10, float f5) {
        n(obj, j10, Float.floatToIntBits(f5));
    }

    @Override // com.google.android.gms.internal.measurement.ya
    public final boolean g(Object obj, long j10) {
        return za.f19436h ? za.y(obj, j10) : za.z(obj, j10);
    }
}
