package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class ww3 implements Iterable, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final ww3 f17284n = new sw3(ly3.f11871d);

    /* renamed from: o, reason: collision with root package name */
    private static final Comparator f17285o;

    /* renamed from: p, reason: collision with root package name */
    private static final vw3 f17286p;

    /* renamed from: m, reason: collision with root package name */
    private int f17287m = 0;

    static {
        int i10 = iw3.f10205a;
        f17286p = new vw3(null);
        f17285o = new nw3();
    }

    ww3() {
    }

    static int B(int i10, int i11, int i12) {
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

    public static tw3 F() {
        return new tw3(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ww3 G(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f17284n : l(iterable.iterator(), size);
    }

    public static ww3 I(byte[] bArr, int i10, int i11) {
        B(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new sw3(bArr2);
    }

    public static ww3 J(String str) {
        return new sw3(str.getBytes(ly3.f11869b));
    }

    static void L(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    private static ww3 l(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (ww3) it.next();
        }
        int i11 = i10 >>> 1;
        ww3 ww3VarL = l(it, i11);
        ww3 ww3VarL2 = l(it, i10 - i11);
        if (Integer.MAX_VALUE - ww3VarL.n() >= ww3VarL2.n()) {
            return c04.O(ww3VarL, ww3VarL2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + ww3VarL.n() + "+" + ww3VarL2.n());
    }

    public abstract boolean A();

    protected final int D() {
        return this.f17287m;
    }

    @Override // java.lang.Iterable
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public qw3 iterator() {
        return new mw3(this);
    }

    public final String K(Charset charset) {
        return n() == 0 ? "" : x(charset);
    }

    public final void M(byte[] bArr, int i10, int i11, int i12) {
        B(0, i12, n());
        B(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            o(bArr, 0, i11, i12);
        }
    }

    public final boolean e() {
        return n() == 0;
    }

    public abstract boolean equals(Object obj);

    public final byte[] f() {
        int iN = n();
        if (iN == 0) {
            return ly3.f11871d;
        }
        byte[] bArr = new byte[iN];
        o(bArr, 0, 0, iN);
        return bArr;
    }

    public abstract byte h(int i10);

    public final int hashCode() {
        int iS = this.f17287m;
        if (iS == 0) {
            int iN = n();
            iS = s(iN, 0, iN);
            if (iS == 0) {
                iS = 1;
            }
            this.f17287m = iS;
        }
        return iS;
    }

    abstract byte k(int i10);

    public abstract int n();

    protected abstract void o(byte[] bArr, int i10, int i11, int i12);

    protected abstract int p();

    protected abstract boolean q();

    protected abstract int s(int i10, int i11, int i12);

    protected abstract int t(int i10, int i11, int i12);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(n());
        objArr[2] = n() <= 50 ? g04.a(this) : g04.a(u(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract ww3 u(int i10, int i11);

    public abstract fx3 v();

    protected abstract String x(Charset charset);

    public abstract ByteBuffer y();

    abstract void z(lw3 lw3Var);
}
