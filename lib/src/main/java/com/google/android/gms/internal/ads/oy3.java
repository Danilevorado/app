package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
final class oy3 extends InputStream {

    /* renamed from: m, reason: collision with root package name */
    private Iterator f13469m;

    /* renamed from: n, reason: collision with root package name */
    private ByteBuffer f13470n;

    /* renamed from: o, reason: collision with root package name */
    private int f13471o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f13472p;

    /* renamed from: q, reason: collision with root package name */
    private int f13473q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13474r;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f13475s;

    /* renamed from: t, reason: collision with root package name */
    private int f13476t;

    /* renamed from: u, reason: collision with root package name */
    private long f13477u;

    oy3(Iterable iterable) {
        this.f13469m = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f13471o++;
        }
        this.f13472p = -1;
        if (c()) {
            return;
        }
        this.f13470n = ly3.f11872e;
        this.f13472p = 0;
        this.f13473q = 0;
        this.f13477u = 0L;
    }

    private final void a(int i10) {
        int i11 = this.f13473q + i10;
        this.f13473q = i11;
        if (i11 == this.f13470n.limit()) {
            c();
        }
    }

    private final boolean c() {
        this.f13472p++;
        if (!this.f13469m.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f13469m.next();
        this.f13470n = byteBuffer;
        this.f13473q = byteBuffer.position();
        if (this.f13470n.hasArray()) {
            this.f13474r = true;
            this.f13475s = this.f13470n.array();
            this.f13476t = this.f13470n.arrayOffset();
        } else {
            this.f13474r = false;
            this.f13477u = t04.m(this.f13470n);
            this.f13475s = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f13472p == this.f13471o) {
            return -1;
        }
        int i10 = (this.f13474r ? this.f13475s[this.f13473q + this.f13476t] : t04.i(this.f13473q + this.f13477u)) & 255;
        a(1);
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f13472p == this.f13471o) {
            return -1;
        }
        int iLimit = this.f13470n.limit();
        int i12 = this.f13473q;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f13474r) {
            System.arraycopy(this.f13475s, i12 + this.f13476t, bArr, i10, i11);
        } else {
            int iPosition = this.f13470n.position();
            this.f13470n.position(this.f13473q);
            this.f13470n.get(bArr, i10, i11);
            this.f13470n.position(iPosition);
        }
        a(i11);
        return i11;
    }
}
