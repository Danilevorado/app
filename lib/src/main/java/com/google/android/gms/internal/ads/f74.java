package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
final class f74 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, gn4, mc4, ij4, hg4, d54, z44, b94, p54 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ j74 f8165m;

    /* synthetic */ f74(j74 j74Var, e74 e74Var) {
        this.f8165m = j74Var;
    }

    @Override // com.google.android.gms.internal.ads.gn4
    public final void M(String str) {
        this.f8165m.f10363q.G(str);
    }

    @Override // com.google.android.gms.internal.ads.mc4
    public final void W(String str) {
        this.f8165m.f10363q.m(str);
    }

    @Override // com.google.android.gms.internal.ads.p54
    public final void a(boolean z10) {
        this.f8165m.s0();
    }

    @Override // com.google.android.gms.internal.ads.mc4
    public final void b(final boolean z10) {
        j74 j74Var = this.f8165m;
        if (j74Var.W == z10) {
            return;
        }
        j74Var.W = z10;
        x92 x92Var = this.f8165m.f10357k;
        x92Var.d(23, new u62() { // from class: com.google.android.gms.internal.ads.c74
            @Override // com.google.android.gms.internal.ads.u62
            public final void a(Object obj) {
                ((xq0) obj).t0(z10);
            }
        });
        x92Var.c();
    }

    @Override // com.google.android.gms.internal.ads.gn4
    public final void c(g54 g54Var) {
        this.f8165m.R = g54Var;
        this.f8165m.f10363q.C(g54Var);
    }

    @Override // com.google.android.gms.internal.ads.mc4
    public final void d(g54 g54Var) {
        this.f8165m.f10363q.z(g54Var);
        this.f8165m.L = null;
        this.f8165m.S = null;
    }

    @Override // com.google.android.gms.internal.ads.gn4
    public final void e(int i10, long j10) {
        this.f8165m.f10363q.p(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.mc4
    public final void f(int i10, long j10, long j11) {
        this.f8165m.f10363q.t(i10, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.gn4
    public final void g(long j10, int i10) {
        this.f8165m.f10363q.K(j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.gn4
    public final void h(g54 g54Var) {
        this.f8165m.f10363q.I(g54Var);
        this.f8165m.K = null;
        this.f8165m.R = null;
    }

    @Override // com.google.android.gms.internal.ads.mc4
    public final void i(k9 k9Var, h54 h54Var) {
        this.f8165m.L = k9Var;
        this.f8165m.f10363q.n(k9Var, h54Var);
    }

    @Override // com.google.android.gms.internal.ads.gn4
    public final void j(k9 k9Var, h54 h54Var) {
        this.f8165m.K = k9Var;
        this.f8165m.f10363q.H(k9Var, h54Var);
    }

    @Override // com.google.android.gms.internal.ads.mc4
    public final void k(Exception exc) {
        this.f8165m.f10363q.r(exc);
    }

    @Override // com.google.android.gms.internal.ads.mc4
    public final void l(g54 g54Var) {
        this.f8165m.S = g54Var;
        this.f8165m.f10363q.v(g54Var);
    }

    @Override // com.google.android.gms.internal.ads.gn4
    public final void m(Exception exc) {
        this.f8165m.f10363q.s(exc);
    }

    @Override // com.google.android.gms.internal.ads.gn4
    public final void n(String str, long j10, long j11) {
        this.f8165m.f10363q.w(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.mc4
    public final void o(String str, long j10, long j11) {
        this.f8165m.f10363q.B(str, j10, j11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        j74.T(this.f8165m, surfaceTexture);
        this.f8165m.l0(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f8165m.o0(null);
        this.f8165m.l0(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f8165m.l0(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.google.android.gms.internal.ads.mc4
    public final void p(long j10) {
        this.f8165m.f10363q.E(j10);
    }

    @Override // com.google.android.gms.internal.ads.gn4
    public final void q(Object obj, long j10) {
        this.f8165m.f10363q.F(obj, j10);
        j74 j74Var = this.f8165m;
        if (j74Var.N == obj) {
            x92 x92Var = j74Var.f10357k;
            x92Var.d(26, new u62() { // from class: com.google.android.gms.internal.ads.z64
                @Override // com.google.android.gms.internal.ads.u62
                public final void a(Object obj2) {
                }
            });
            x92Var.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.gn4
    public final void q0(final vh1 vh1Var) {
        this.f8165m.f10342b0 = vh1Var;
        x92 x92Var = this.f8165m.f10357k;
        x92Var.d(25, new u62() { // from class: com.google.android.gms.internal.ads.d74
            @Override // com.google.android.gms.internal.ads.u62
            public final void a(Object obj) {
                ((xq0) obj).q0(vh1Var);
            }
        });
        x92Var.c();
    }

    @Override // com.google.android.gms.internal.ads.mc4
    public final void r(Exception exc) {
        this.f8165m.f10363q.q(exc);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f8165m.l0(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f8165m.l0(0, 0);
    }
}
