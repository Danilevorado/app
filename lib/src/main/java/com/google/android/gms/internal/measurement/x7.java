package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class x7 implements Iterable, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final x7 f19398n = new u7(b9.f18842d);

    /* renamed from: o, reason: collision with root package name */
    private static final Comparator f19399o;

    /* renamed from: p, reason: collision with root package name */
    private static final w7 f19400p;

    /* renamed from: m, reason: collision with root package name */
    private int f19401m = 0;

    static {
        int i10 = j7.f19027a;
        f19400p = new w7(null);
        f19399o = new o7();
    }

    x7() {
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

    public static x7 t(byte[] bArr, int i10, int i11) {
        q(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new u7(bArr2);
    }

    public static x7 u(String str) {
        return new u7(str.getBytes(b9.f18840b));
    }

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    abstract byte f(int i10);

    public abstract int h();

    public final int hashCode() {
        int iK = this.f19401m;
        if (iK == 0) {
            int iH = h();
            iK = k(iH, 0, iH);
            if (iK == 0) {
                iK = 1;
            }
            this.f19401m = iK;
        }
        return iK;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new n7(this);
    }

    protected abstract int k(int i10, int i11, int i12);

    public abstract x7 l(int i10, int i11);

    protected abstract String n(Charset charset);

    abstract void o(m7 m7Var);

    public abstract boolean p();

    protected final int s() {
        return this.f19401m;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(h());
        objArr[2] = h() <= 50 ? na.a(this) : na.a(l(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String v(Charset charset) {
        return h() == 0 ? "" : n(charset);
    }
}
