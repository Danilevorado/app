package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class fx3 {

    /* renamed from: d, reason: collision with root package name */
    private static volatile int f8471d = 100;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8472e = 0;

    /* renamed from: a, reason: collision with root package name */
    int f8473a;

    /* renamed from: b, reason: collision with root package name */
    final int f8474b = f8471d;

    /* renamed from: c, reason: collision with root package name */
    gx3 f8475c;

    /* synthetic */ fx3(ex3 ex3Var) {
    }

    public static int e(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long f(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static fx3 g(InputStream inputStream, int i10) {
        return new dx3(inputStream, 4096, null);
    }

    static fx3 h(byte[] bArr, int i10, int i11, boolean z10) {
        yw3 yw3Var = new yw3(bArr, i10, i11, z10, null);
        try {
            yw3Var.l(i11);
            return yw3Var;
        } catch (ny3 e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public abstract String A();

    public abstract void B(int i10);

    public abstract void a(int i10);

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d(int i10);

    public abstract double i();

    public abstract float j();

    public abstract int k();

    public abstract int l(int i10);

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract long x();

    public abstract ww3 y();

    public abstract String z();
}
