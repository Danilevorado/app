package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class an1 implements zl1 {

    /* renamed from: b, reason: collision with root package name */
    protected xj1 f6176b;

    /* renamed from: c, reason: collision with root package name */
    protected xj1 f6177c;

    /* renamed from: d, reason: collision with root package name */
    private xj1 f6178d;

    /* renamed from: e, reason: collision with root package name */
    private xj1 f6179e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f6180f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f6181g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6182h;

    public an1() {
        ByteBuffer byteBuffer = zl1.f18622a;
        this.f6180f = byteBuffer;
        this.f6181g = byteBuffer;
        xj1 xj1Var = xj1.f17589e;
        this.f6178d = xj1Var;
        this.f6179e = xj1Var;
        this.f6176b = xj1Var;
        this.f6177c = xj1Var;
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final xj1 a(xj1 xj1Var) {
        this.f6178d = xj1Var;
        this.f6179e = i(xj1Var);
        return h() ? this.f6179e : xj1.f17589e;
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f6181g;
        this.f6181g = zl1.f18622a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final void d() {
        this.f6181g = zl1.f18622a;
        this.f6182h = false;
        this.f6176b = this.f6178d;
        this.f6177c = this.f6179e;
        k();
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final void e() {
        d();
        this.f6180f = zl1.f18622a;
        xj1 xj1Var = xj1.f17589e;
        this.f6178d = xj1Var;
        this.f6179e = xj1Var;
        this.f6176b = xj1Var;
        this.f6177c = xj1Var;
        m();
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final void f() {
        this.f6182h = true;
        l();
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public boolean g() {
        return this.f6182h && this.f6181g == zl1.f18622a;
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public boolean h() {
        return this.f6179e != xj1.f17589e;
    }

    protected abstract xj1 i(xj1 xj1Var);

    protected final ByteBuffer j(int i10) {
        if (this.f6180f.capacity() < i10) {
            this.f6180f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f6180f.clear();
        }
        ByteBuffer byteBuffer = this.f6180f;
        this.f6181g = byteBuffer;
        return byteBuffer;
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m() {
    }

    protected final boolean n() {
        return this.f6181g.hasRemaining();
    }
}
