package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cp1 implements zl1 {

    /* renamed from: b, reason: collision with root package name */
    private int f7022b;

    /* renamed from: c, reason: collision with root package name */
    private float f7023c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f7024d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private xj1 f7025e;

    /* renamed from: f, reason: collision with root package name */
    private xj1 f7026f;

    /* renamed from: g, reason: collision with root package name */
    private xj1 f7027g;

    /* renamed from: h, reason: collision with root package name */
    private xj1 f7028h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7029i;

    /* renamed from: j, reason: collision with root package name */
    private bo1 f7030j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f7031k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f7032l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f7033m;

    /* renamed from: n, reason: collision with root package name */
    private long f7034n;

    /* renamed from: o, reason: collision with root package name */
    private long f7035o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7036p;

    public cp1() {
        xj1 xj1Var = xj1.f17589e;
        this.f7025e = xj1Var;
        this.f7026f = xj1Var;
        this.f7027g = xj1Var;
        this.f7028h = xj1Var;
        ByteBuffer byteBuffer = zl1.f18622a;
        this.f7031k = byteBuffer;
        this.f7032l = byteBuffer.asShortBuffer();
        this.f7033m = byteBuffer;
        this.f7022b = -1;
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final xj1 a(xj1 xj1Var) throws yk1 {
        if (xj1Var.f17592c != 2) {
            throw new yk1("Unhandled input format:", xj1Var);
        }
        int i10 = this.f7022b;
        if (i10 == -1) {
            i10 = xj1Var.f17590a;
        }
        this.f7025e = xj1Var;
        xj1 xj1Var2 = new xj1(i10, xj1Var.f17591b, 2);
        this.f7026f = xj1Var2;
        this.f7029i = true;
        return xj1Var2;
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final ByteBuffer b() {
        int iA;
        bo1 bo1Var = this.f7030j;
        if (bo1Var != null && (iA = bo1Var.a()) > 0) {
            if (this.f7031k.capacity() < iA) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iA).order(ByteOrder.nativeOrder());
                this.f7031k = byteBufferOrder;
                this.f7032l = byteBufferOrder.asShortBuffer();
            } else {
                this.f7031k.clear();
                this.f7032l.clear();
            }
            bo1Var.d(this.f7032l);
            this.f7035o += iA;
            this.f7031k.limit(iA);
            this.f7033m = this.f7031k;
        }
        ByteBuffer byteBuffer = this.f7033m;
        this.f7033m = zl1.f18622a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            bo1 bo1Var = this.f7030j;
            Objects.requireNonNull(bo1Var);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f7034n += iRemaining;
            bo1Var.f(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final void d() {
        if (h()) {
            xj1 xj1Var = this.f7025e;
            this.f7027g = xj1Var;
            xj1 xj1Var2 = this.f7026f;
            this.f7028h = xj1Var2;
            if (this.f7029i) {
                this.f7030j = new bo1(xj1Var.f17590a, xj1Var.f17591b, this.f7023c, this.f7024d, xj1Var2.f17590a);
            } else {
                bo1 bo1Var = this.f7030j;
                if (bo1Var != null) {
                    bo1Var.c();
                }
            }
        }
        this.f7033m = zl1.f18622a;
        this.f7034n = 0L;
        this.f7035o = 0L;
        this.f7036p = false;
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final void e() {
        this.f7023c = 1.0f;
        this.f7024d = 1.0f;
        xj1 xj1Var = xj1.f17589e;
        this.f7025e = xj1Var;
        this.f7026f = xj1Var;
        this.f7027g = xj1Var;
        this.f7028h = xj1Var;
        ByteBuffer byteBuffer = zl1.f18622a;
        this.f7031k = byteBuffer;
        this.f7032l = byteBuffer.asShortBuffer();
        this.f7033m = byteBuffer;
        this.f7022b = -1;
        this.f7029i = false;
        this.f7030j = null;
        this.f7034n = 0L;
        this.f7035o = 0L;
        this.f7036p = false;
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final void f() {
        bo1 bo1Var = this.f7030j;
        if (bo1Var != null) {
            bo1Var.e();
        }
        this.f7036p = true;
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final boolean g() {
        bo1 bo1Var;
        return this.f7036p && ((bo1Var = this.f7030j) == null || bo1Var.a() == 0);
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final boolean h() {
        if (this.f7026f.f17590a == -1) {
            return false;
        }
        if (Math.abs(this.f7023c - 1.0f) >= 1.0E-4f || Math.abs(this.f7024d - 1.0f) >= 1.0E-4f) {
            return true;
        }
        return this.f7026f.f17590a != this.f7025e.f17590a;
    }

    public final long i(long j10) {
        long j11 = this.f7035o;
        if (j11 < 1024) {
            return (long) (this.f7023c * j10);
        }
        long j12 = this.f7034n;
        Objects.requireNonNull(this.f7030j);
        long jB = j12 - r3.b();
        int i10 = this.f7028h.f17590a;
        int i11 = this.f7027g.f17590a;
        return i10 == i11 ? sv2.x(j10, jB, j11) : sv2.x(j10, jB * i10, j11 * i11);
    }

    public final void j(float f5) {
        if (this.f7024d != f5) {
            this.f7024d = f5;
            this.f7029i = true;
        }
    }

    public final void k(float f5) {
        if (this.f7023c != f5) {
            this.f7023c = f5;
            this.f7029i = true;
        }
    }
}
