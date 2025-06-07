package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class q0 implements Iterable, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final q0 f19623n = new n0(v1.f19661d);

    /* renamed from: o, reason: collision with root package name */
    private static final Comparator f19624o;

    /* renamed from: p, reason: collision with root package name */
    private static final p0 f19625p;

    /* renamed from: m, reason: collision with root package name */
    private int f19626m = 0;

    static {
        int i10 = c0.f19463a;
        f19625p = new p0(null);
        f19624o = new h0();
    }

    q0() {
    }

    static int q(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static q0 t(byte[] bArr, int i10, int i11) {
        q(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new n0(bArr2);
    }

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    abstract byte f(int i10);

    public abstract int h();

    public final int hashCode() {
        int iK = this.f19626m;
        if (iK == 0) {
            int iH = h();
            iK = k(iH, 0, iH);
            if (iK == 0) {
                iK = 1;
            }
            this.f19626m = iK;
        }
        return iK;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new g0(this);
    }

    protected abstract int k(int i10, int i11, int i12);

    public abstract q0 l(int i10, int i11);

    protected abstract String n(Charset charset);

    abstract void o(f0 f0Var);

    public abstract boolean p();

    protected final int s() {
        return this.f19626m;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(h());
        objArr[2] = h() <= 50 ? t3.a(this) : t3.a(l(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String u(Charset charset) {
        return h() == 0 ? "" : n(charset);
    }
}
