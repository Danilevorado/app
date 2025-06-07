package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class c4 extends e4 {
    c4(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.e4
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f19487a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.e4
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f19487a.getInt(obj, j10));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.f4.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.f4.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.play_billing.f4.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.play_billing.f4.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.play_billing.e4
    public final void c(Object obj, long j10, boolean z10) {
        if (f4.f19504h) {
            f4.n(obj, j10, z10);
        } else {
            f4.o(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.e4
    public final void d(Object obj, long j10, byte b10) {
        if (f4.f19504h) {
            f4.d(obj, j10, b10);
        } else {
            f4.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.e4
    public final void e(Object obj, long j10, double d10) {
        this.f19487a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.e4
    public final void f(Object obj, long j10, float f5) {
        this.f19487a.putInt(obj, j10, Float.floatToIntBits(f5));
    }

    @Override // com.google.android.gms.internal.play_billing.e4
    public final boolean g(Object obj, long j10) {
        return f4.f19504h ? f4.y(obj, j10) : f4.z(obj, j10);
    }
}
