package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ei0 extends rg0 implements TextureView.SurfaceTextureListener, bh0 {
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private float E;

    /* renamed from: o, reason: collision with root package name */
    private final lh0 f7791o;

    /* renamed from: p, reason: collision with root package name */
    private final mh0 f7792p;

    /* renamed from: q, reason: collision with root package name */
    private final kh0 f7793q;

    /* renamed from: r, reason: collision with root package name */
    private qg0 f7794r;

    /* renamed from: s, reason: collision with root package name */
    private Surface f7795s;

    /* renamed from: t, reason: collision with root package name */
    private ch0 f7796t;

    /* renamed from: u, reason: collision with root package name */
    private String f7797u;

    /* renamed from: v, reason: collision with root package name */
    private String[] f7798v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f7799w;

    /* renamed from: x, reason: collision with root package name */
    private int f7800x;

    /* renamed from: y, reason: collision with root package name */
    private jh0 f7801y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f7802z;

    public ei0(Context context, mh0 mh0Var, lh0 lh0Var, boolean z10, boolean z11, kh0 kh0Var) {
        super(context);
        this.f7800x = 1;
        this.f7791o = lh0Var;
        this.f7792p = mh0Var;
        this.f7802z = z10;
        this.f7793q = kh0Var;
        setSurfaceTextureListener(this);
        mh0Var.a(this);
    }

    private static String T(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void U() {
        ch0 ch0Var = this.f7796t;
        if (ch0Var != null) {
            ch0Var.H(true);
        }
    }

    private final void V() {
        if (this.A) {
            return;
        }
        this.A = true;
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18589m.I();
            }
        });
        m();
        this.f7792p.b();
        if (this.B) {
            t();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void W(boolean r6, java.lang.Integer r7) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.ch0 r0 = r5.f7796t
            if (r0 == 0) goto Lb
            if (r6 == 0) goto L7
            goto Lb
        L7:
            r0.G(r7)
            return
        Lb:
            java.lang.String r1 = r5.f7797u
            if (r1 == 0) goto Ld8
            android.view.Surface r1 = r5.f7795s
            if (r1 != 0) goto L15
            goto Ld8
        L15:
            if (r6 == 0) goto L2a
            boolean r6 = r5.d0()
            if (r6 == 0) goto L24
            r0.L()
            r5.Y()
            goto L2a
        L24:
            java.lang.String r6 = "No valid ExoPlayerAdapter exists when switch source."
        L26:
            com.google.android.gms.internal.ads.ze0.g(r6)
            return
        L2a:
            java.lang.String r6 = r5.f7797u
            java.lang.String r0 = "cache:"
            boolean r6 = r6.startsWith(r0)
            r0 = 0
            if (r6 == 0) goto L93
            com.google.android.gms.internal.ads.lh0 r6 = r5.f7791o
            java.lang.String r1 = r5.f7797u
            com.google.android.gms.internal.ads.yi0 r6 = r6.M(r1)
            boolean r1 = r6 instanceof com.google.android.gms.internal.ads.hj0
            if (r1 == 0) goto L58
            com.google.android.gms.internal.ads.hj0 r6 = (com.google.android.gms.internal.ads.hj0) r6
            com.google.android.gms.internal.ads.ch0 r6 = r6.z()
            r5.f7796t = r6
            r6.G(r7)
            com.google.android.gms.internal.ads.ch0 r6 = r5.f7796t
            boolean r6 = r6.M()
            if (r6 == 0) goto L55
            goto Lb8
        L55:
            java.lang.String r6 = "Precached video player has been released."
            goto L26
        L58:
            boolean r1 = r6 instanceof com.google.android.gms.internal.ads.ej0
            if (r1 == 0) goto L86
            com.google.android.gms.internal.ads.ej0 r6 = (com.google.android.gms.internal.ads.ej0) r6
            java.lang.String r1 = r5.F()
            java.nio.ByteBuffer r2 = r6.A()
            boolean r3 = r6.B()
            java.lang.String r6 = r6.z()
            if (r6 != 0) goto L73
            java.lang.String r6 = "Stream cache URL is null."
            goto L26
        L73:
            com.google.android.gms.internal.ads.ch0 r7 = r5.E(r7)
            r5.f7796t = r7
            r4 = 1
            android.net.Uri[] r4 = new android.net.Uri[r4]
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r4[r0] = r6
            r7.x(r4, r1, r2, r3)
            goto Lb8
        L86:
            java.lang.String r6 = r5.f7797u
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Stream cache miss: "
            java.lang.String r6 = r7.concat(r6)
            goto L26
        L93:
            com.google.android.gms.internal.ads.ch0 r6 = r5.E(r7)
            r5.f7796t = r6
            java.lang.String r6 = r5.F()
            java.lang.String[] r7 = r5.f7798v
            int r7 = r7.length
            android.net.Uri[] r7 = new android.net.Uri[r7]
            r1 = r0
        La3:
            java.lang.String[] r2 = r5.f7798v
            int r3 = r2.length
            if (r1 >= r3) goto Lb3
            r2 = r2[r1]
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r7[r1] = r2
            int r1 = r1 + 1
            goto La3
        Lb3:
            com.google.android.gms.internal.ads.ch0 r1 = r5.f7796t
            r1.w(r7, r6)
        Lb8:
            com.google.android.gms.internal.ads.ch0 r6 = r5.f7796t
            r6.C(r5)
            android.view.Surface r6 = r5.f7795s
            r5.Z(r6, r0)
            com.google.android.gms.internal.ads.ch0 r6 = r5.f7796t
            boolean r6 = r6.M()
            if (r6 == 0) goto Ld8
            com.google.android.gms.internal.ads.ch0 r6 = r5.f7796t
            int r6 = r6.P()
            r5.f7800x = r6
            r7 = 3
            if (r6 != r7) goto Ld8
            r5.V()
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ei0.W(boolean, java.lang.Integer):void");
    }

    private final void X() {
        ch0 ch0Var = this.f7796t;
        if (ch0Var != null) {
            ch0Var.H(false);
        }
    }

    private final void Y() {
        if (this.f7796t != null) {
            Z(null, true);
            ch0 ch0Var = this.f7796t;
            if (ch0Var != null) {
                ch0Var.C(null);
                this.f7796t.y();
                this.f7796t = null;
            }
            this.f7800x = 1;
            this.f7799w = false;
            this.A = false;
            this.B = false;
        }
    }

    private final void Z(Surface surface, boolean z10) {
        ch0 ch0Var = this.f7796t;
        if (ch0Var == null) {
            ze0.g("Trying to set surface before player is initialized.");
            return;
        }
        try {
            ch0Var.J(surface, z10);
        } catch (IOException e5) {
            ze0.h("", e5);
        }
    }

    private final void a0() {
        b0(this.C, this.D);
    }

    private final void b0(int i10, int i11) {
        float f5 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.E != f5) {
            this.E = f5;
            requestLayout();
        }
    }

    private final boolean c0() {
        return d0() && this.f7800x != 1;
    }

    private final boolean d0() {
        ch0 ch0Var = this.f7796t;
        return (ch0Var == null || !ch0Var.M() || this.f7799w) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final Integer A() {
        ch0 ch0Var = this.f7796t;
        if (ch0Var != null) {
            return ch0Var.t();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void B(int i10) {
        ch0 ch0Var = this.f7796t;
        if (ch0Var != null) {
            ch0Var.A(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void C(int i10) {
        ch0 ch0Var = this.f7796t;
        if (ch0Var != null) {
            ch0Var.B(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void D(int i10) {
        ch0 ch0Var = this.f7796t;
        if (ch0Var != null) {
            ch0Var.D(i10);
        }
    }

    final ch0 E(Integer num) {
        ak0 ak0Var = new ak0(this.f7791o.getContext(), this.f7793q, this.f7791o, num);
        ze0.f("ExoPlayerAdapter initialized.");
        return ak0Var;
    }

    final String F() {
        return j3.t.r().z(this.f7791o.getContext(), this.f7791o.m().f8252m);
    }

    final /* synthetic */ void G(String str) {
        qg0 qg0Var = this.f7794r;
        if (qg0Var != null) {
            qg0Var.v("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void H() {
        qg0 qg0Var = this.f7794r;
        if (qg0Var != null) {
            qg0Var.a();
        }
    }

    final /* synthetic */ void I() {
        qg0 qg0Var = this.f7794r;
        if (qg0Var != null) {
            qg0Var.e();
        }
    }

    final /* synthetic */ void J(boolean z10, long j10) {
        this.f7791o.r0(z10, j10);
    }

    final /* synthetic */ void K(String str) {
        qg0 qg0Var = this.f7794r;
        if (qg0Var != null) {
            qg0Var.z0("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void L() {
        qg0 qg0Var = this.f7794r;
        if (qg0Var != null) {
            qg0Var.h();
        }
    }

    final /* synthetic */ void M() {
        qg0 qg0Var = this.f7794r;
        if (qg0Var != null) {
            qg0Var.g();
        }
    }

    final /* synthetic */ void N() {
        qg0 qg0Var = this.f7794r;
        if (qg0Var != null) {
            qg0Var.i();
        }
    }

    final /* synthetic */ void O(int i10, int i11) {
        qg0 qg0Var = this.f7794r;
        if (qg0Var != null) {
            qg0Var.A0(i10, i11);
        }
    }

    final /* synthetic */ void P() {
        float fA = this.f14779n.a();
        ch0 ch0Var = this.f7796t;
        if (ch0Var == null) {
            ze0.g("Trying to set volume before player is initialized.");
            return;
        }
        try {
            ch0Var.K(fA, false);
        } catch (IOException e5) {
            ze0.h("", e5);
        }
    }

    final /* synthetic */ void Q(int i10) {
        qg0 qg0Var = this.f7794r;
        if (qg0Var != null) {
            qg0Var.onWindowVisibilityChanged(i10);
        }
    }

    final /* synthetic */ void R() {
        qg0 qg0Var = this.f7794r;
        if (qg0Var != null) {
            qg0Var.f();
        }
    }

    final /* synthetic */ void S() {
        qg0 qg0Var = this.f7794r;
        if (qg0Var != null) {
            qg0Var.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void a(int i10) {
        if (this.f7800x != i10) {
            this.f7800x = i10;
            if (i10 == 3) {
                V();
                return;
            }
            if (i10 != 4) {
                return;
            }
            if (this.f7793q.f11043a) {
                X();
            }
            this.f7792p.e();
            this.f14779n.c();
            m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17557m.H();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void b(int i10) {
        ch0 ch0Var = this.f7796t;
        if (ch0Var != null) {
            ch0Var.E(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void c(int i10) {
        ch0 ch0Var = this.f7796t;
        if (ch0Var != null) {
            ch0Var.I(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void d(int i10, int i11) {
        this.C = i10;
        this.D = i11;
        a0();
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void e(String str, Exception exc) {
        final String strT = T("onLoadException", exc);
        ze0.g("ExoPlayerAdapter exception: ".concat(strT));
        j3.t.q().t(exc, "AdExoPlayerView.onException");
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.uh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16333m.K(strT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void f(final boolean z10, final long j10) {
        if (this.f7791o != null) {
            of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ai0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6097m.J(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void g(String str, Exception exc) {
        final String strT = T(str, exc);
        ze0.g("ExoPlayerAdapter error: ".concat(strT));
        this.f7799w = true;
        if (this.f7793q.f11043a) {
            X();
        }
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.rh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14785m.G(strT);
            }
        });
        j3.t.q().t(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void h(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f7798v = new String[]{str};
        } else {
            this.f7798v = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f7797u;
        boolean z10 = this.f7793q.f11054l && str2 != null && !str.equals(str2) && this.f7800x == 4;
        this.f7797u = str;
        W(z10, num);
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final int i() {
        if (c0()) {
            return (int) this.f7796t.U();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final int j() {
        ch0 ch0Var = this.f7796t;
        if (ch0Var != null) {
            return ch0Var.N();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final int k() {
        if (c0()) {
            return (int) this.f7796t.V();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final int l() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.rg0, com.google.android.gms.internal.ads.ph0
    public final void m() {
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16690m.P();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final int n() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final long o() {
        ch0 ch0Var = this.f7796t;
        if (ch0Var != null) {
            return ch0Var.T();
        }
        return -1L;
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f5 = this.E;
        if (f5 != 0.0f && this.f7801y == null) {
            float f10 = measuredWidth;
            float f11 = f10 / measuredHeight;
            if (f5 > f11) {
                measuredHeight = (int) (f10 / f5);
            }
            if (f5 < f11) {
                measuredWidth = (int) (measuredHeight * f5);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        jh0 jh0Var = this.f7801y;
        if (jh0Var != null) {
            jh0Var.c(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) throws InterruptedException {
        if (this.f7802z) {
            jh0 jh0Var = new jh0(getContext());
            this.f7801y = jh0Var;
            jh0Var.d(surfaceTexture, i10, i11);
            this.f7801y.start();
            SurfaceTexture surfaceTextureB = this.f7801y.b();
            if (surfaceTextureB != null) {
                surfaceTexture = surfaceTextureB;
            } else {
                this.f7801y.e();
                this.f7801y = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f7795s = surface;
        if (this.f7796t == null) {
            W(false, null);
        } else {
            Z(surface, true);
            if (!this.f7793q.f11043a) {
                U();
            }
        }
        if (this.C == 0 || this.D == 0) {
            b0(i10, i11);
        } else {
            a0();
        }
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.yh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18046m.M();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        s();
        jh0 jh0Var = this.f7801y;
        if (jh0Var != null) {
            jh0Var.e();
            this.f7801y = null;
        }
        if (this.f7796t != null) {
            X();
            Surface surface = this.f7795s;
            if (surface != null) {
                surface.release();
            }
            this.f7795s = null;
            Z(null, true);
        }
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ci0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6931m.N();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i10, final int i11) {
        jh0 jh0Var = this.f7801y;
        if (jh0Var != null) {
            jh0Var.c(i10, i11);
        }
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.sh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15250m.O(i10, i11);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f7792p.f(this);
        this.f14778m.a(surfaceTexture, this.f7794r);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i10) {
        m3.n1.k("AdExoPlayerView3 window visibility changed to " + i10);
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6492m.Q(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final long p() {
        ch0 ch0Var = this.f7796t;
        if (ch0Var != null) {
            return ch0Var.r();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final long q() {
        ch0 ch0Var = this.f7796t;
        if (ch0Var != null) {
            return ch0Var.s();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final String r() {
        return "ExoPlayer/2".concat(true != this.f7802z ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void s() {
        if (c0()) {
            if (this.f7793q.f11043a) {
                X();
            }
            this.f7796t.F(false);
            this.f7792p.e();
            this.f14779n.c();
            m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.wh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17130m.R();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void t() {
        if (!c0()) {
            this.B = true;
            return;
        }
        if (this.f7793q.f11043a) {
            U();
        }
        this.f7796t.F(true);
        this.f7792p.c();
        this.f14779n.b();
        this.f14778m.b();
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.th0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15842m.S();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void u(int i10) {
        if (c0()) {
            this.f7796t.z(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void v() {
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.di0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7323m.L();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void w(qg0 qg0Var) {
        this.f7794r = qg0Var;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void x(String str) {
        if (str != null) {
            h(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void y() {
        if (d0()) {
            this.f7796t.L();
            Y();
        }
        this.f7792p.e();
        this.f14779n.c();
        this.f7792p.d();
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void z(float f5, float f10) {
        jh0 jh0Var = this.f7801y;
        if (jh0Var != null) {
            jh0Var.f(f5, f10);
        }
    }
}
