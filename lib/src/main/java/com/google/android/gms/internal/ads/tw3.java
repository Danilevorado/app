package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class tw3 extends OutputStream {

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f16081r = new byte[0];

    /* renamed from: o, reason: collision with root package name */
    private int f16084o;

    /* renamed from: q, reason: collision with root package name */
    private int f16086q;

    /* renamed from: m, reason: collision with root package name */
    private final int f16082m = 128;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList f16083n = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    private byte[] f16085p = new byte[128];

    tw3(int i10) {
    }

    private final void f(int i10) {
        this.f16083n.add(new sw3(this.f16085p));
        int length = this.f16084o + this.f16085p.length;
        this.f16084o = length;
        this.f16085p = new byte[Math.max(this.f16082m, Math.max(i10, length >>> 1))];
        this.f16086q = 0;
    }

    public final synchronized int a() {
        return this.f16084o + this.f16086q;
    }

    public final synchronized ww3 c() {
        int i10 = this.f16086q;
        byte[] bArr = this.f16085p;
        if (i10 >= bArr.length) {
            this.f16083n.add(new sw3(this.f16085p));
            this.f16085p = f16081r;
        } else if (i10 > 0) {
            this.f16083n.add(new sw3(Arrays.copyOf(bArr, i10)));
        }
        this.f16084o += this.f16086q;
        this.f16086q = 0;
        return ww3.G(this.f16083n);
    }

    public final synchronized void e() {
        this.f16083n.clear();
        this.f16084o = 0;
        this.f16086q = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        if (this.f16086q == this.f16085p.length) {
            f(1);
        }
        byte[] bArr = this.f16085p;
        int i11 = this.f16086q;
        this.f16086q = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f16085p;
        int length = bArr2.length;
        int i12 = this.f16086q;
        int i13 = length - i12;
        if (i11 <= i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f16086q += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i13);
        int i14 = i11 - i13;
        f(i14);
        System.arraycopy(bArr, i10 + i13, this.f16085p, 0, i14);
        this.f16086q = i14;
    }
}
