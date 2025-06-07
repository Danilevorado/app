package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zg0 extends FrameLayout implements qg0 {
    private String[] A;
    private Bitmap B;
    private final ImageView C;
    private boolean D;

    /* renamed from: m, reason: collision with root package name */
    private final lh0 f18568m;

    /* renamed from: n, reason: collision with root package name */
    private final FrameLayout f18569n;

    /* renamed from: o, reason: collision with root package name */
    private final View f18570o;

    /* renamed from: p, reason: collision with root package name */
    private final as f18571p;

    /* renamed from: q, reason: collision with root package name */
    final nh0 f18572q;

    /* renamed from: r, reason: collision with root package name */
    private final long f18573r;

    /* renamed from: s, reason: collision with root package name */
    private final rg0 f18574s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f18575t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f18576u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f18577v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f18578w;

    /* renamed from: x, reason: collision with root package name */
    private long f18579x;

    /* renamed from: y, reason: collision with root package name */
    private long f18580y;

    /* renamed from: z, reason: collision with root package name */
    private String f18581z;

    public zg0(Context context, lh0 lh0Var, int i10, boolean z10, as asVar, kh0 kh0Var) {
        super(context);
        this.f18568m = lh0Var;
        this.f18571p = asVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18569n = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        e4.p.l(lh0Var.j());
        sg0 sg0Var = lh0Var.j().f24450a;
        rg0 ei0Var = i10 == 2 ? new ei0(context, new mh0(context, lh0Var.m(), lh0Var.h0(), asVar, lh0Var.k()), lh0Var, z10, sg0.a(lh0Var), kh0Var) : new pg0(context, lh0Var, z10, sg0.a(lh0Var), kh0Var, new mh0(context, lh0Var.m(), lh0Var.h0(), asVar, lh0Var.k()));
        this.f18574s = ei0Var;
        View view = new View(context);
        this.f18570o = view;
        view.setBackgroundColor(0);
        frameLayout.addView(ei0Var, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) k3.w.c().b(ir.F)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) k3.w.c().b(ir.C)).booleanValue()) {
            x();
        }
        this.C = new ImageView(context);
        this.f18573r = ((Long) k3.w.c().b(ir.H)).longValue();
        boolean zBooleanValue = ((Boolean) k3.w.c().b(ir.E)).booleanValue();
        this.f18578w = zBooleanValue;
        if (asVar != null) {
            asVar.d("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.f18572q = new nh0(this);
        ei0Var.w(this);
    }

    private final void r() {
        if (this.f18568m.i() == null || !this.f18576u || this.f18577v) {
            return;
        }
        this.f18568m.i().getWindow().clearFlags(128);
        this.f18576u = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numU = u();
        if (numU != null) {
            map.put("playerId", numU.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f18568m.c("onVideoEvent", map);
    }

    private final boolean t() {
        return this.C.getParent() != null;
    }

    final /* synthetic */ void A(boolean z10) {
        s("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final void A0(int i10, int i11) {
        if (this.f18578w) {
            zq zqVar = ir.G;
            int iMax = Math.max(i10 / ((Integer) k3.w.c().b(zqVar)).intValue(), 1);
            int iMax2 = Math.max(i11 / ((Integer) k3.w.c().b(zqVar)).intValue(), 1);
            Bitmap bitmap = this.B;
            if (bitmap != null && bitmap.getWidth() == iMax && this.B.getHeight() == iMax2) {
                return;
            }
            this.B = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.D = false;
        }
    }

    public final void B(Integer num) {
        if (this.f18574s == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f18581z)) {
            s("no_src", new String[0]);
        } else {
            this.f18574s.h(this.f18581z, this.A, num);
        }
    }

    public final void C() {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        rg0Var.f14779n.d(true);
        rg0Var.m();
    }

    final void D() {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        long jI = rg0Var.i();
        if (this.f18579x == jI || jI <= 0) {
            return;
        }
        float f5 = jI / 1000.0f;
        if (((Boolean) k3.w.c().b(ir.I1)).booleanValue()) {
            s("timeupdate", "time", String.valueOf(f5), "totalBytes", String.valueOf(this.f18574s.q()), "qoeCachedBytes", String.valueOf(this.f18574s.o()), "qoeLoadedBytes", String.valueOf(this.f18574s.p()), "droppedFrames", String.valueOf(this.f18574s.j()), "reportTime", String.valueOf(j3.t.b().a()));
        } else {
            s("timeupdate", "time", String.valueOf(f5));
        }
        this.f18579x = jI;
    }

    public final void E() {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        rg0Var.s();
    }

    public final void F() {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        rg0Var.t();
    }

    public final void G(int i10) {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        rg0Var.u(i10);
    }

    public final void H(MotionEvent motionEvent) {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        rg0Var.dispatchTouchEvent(motionEvent);
    }

    public final void I(int i10) {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        rg0Var.B(i10);
    }

    public final void J(int i10) {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        rg0Var.C(i10);
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final void a() {
        if (((Boolean) k3.w.c().b(ir.K1)).booleanValue()) {
            this.f18572q.a();
        }
        s("ended", new String[0]);
        r();
    }

    public final void b(int i10) {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        rg0Var.D(i10);
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final void c() {
        if (((Boolean) k3.w.c().b(ir.K1)).booleanValue()) {
            this.f18572q.b();
        }
        if (this.f18568m.i() != null && !this.f18576u) {
            boolean z10 = (this.f18568m.i().getWindow().getAttributes().flags & 128) != 0;
            this.f18577v = z10;
            if (!z10) {
                this.f18568m.i().getWindow().addFlags(128);
                this.f18576u = true;
            }
        }
        this.f18575t = true;
    }

    public final void d(int i10) {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        rg0Var.b(i10);
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final void e() {
        if (this.f18574s != null && this.f18580y == 0) {
            s("canplaythrough", "duration", String.valueOf(r0.k() / 1000.0f), "videoWidth", String.valueOf(this.f18574s.n()), "videoHeight", String.valueOf(this.f18574s.l()));
        }
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final void f() {
        s("pause", new String[0]);
        r();
        this.f18575t = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.f18572q.a();
            final rg0 rg0Var = this.f18574s;
            if (rg0Var != null) {
                of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        rg0Var.y();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final void g() {
        this.f18572q.b();
        m3.b2.f25197i.post(new wg0(this));
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final void h() {
        this.f18570o.setVisibility(4);
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16683m.z();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final void i() {
        if (this.D && this.B != null && !t()) {
            this.C.setImageBitmap(this.B);
            this.C.invalidate();
            this.f18569n.addView(this.C, new FrameLayout.LayoutParams(-1, -1));
            this.f18569n.bringChildToFront(this.C);
        }
        this.f18572q.a();
        this.f18580y = this.f18579x;
        m3.b2.f25197i.post(new xg0(this));
    }

    public final void j(int i10) {
        if (((Boolean) k3.w.c().b(ir.F)).booleanValue()) {
            this.f18569n.setBackgroundColor(i10);
            this.f18570o.setBackgroundColor(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final void k() {
        if (this.f18575t && t()) {
            this.f18569n.removeView(this.C);
        }
        if (this.f18574s == null || this.B == null) {
            return;
        }
        long jB = j3.t.b().b();
        if (this.f18574s.getBitmap(this.B) != null) {
            this.D = true;
        }
        long jB2 = j3.t.b().b() - jB;
        if (m3.n1.m()) {
            m3.n1.k("Spinner frame grab took " + jB2 + "ms");
        }
        if (jB2 > this.f18573r) {
            ze0.g("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.f18578w = false;
            this.B = null;
            as asVar = this.f18571p;
            if (asVar != null) {
                asVar.d("spinner_jank", Long.toString(jB2));
            }
        }
    }

    public final void l(int i10) {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        rg0Var.c(i10);
    }

    public final void m(String str, String[] strArr) {
        this.f18581z = str;
        this.A = strArr;
    }

    public final void n(int i10, int i11, int i12, int i13) {
        if (m3.n1.m()) {
            m3.n1.k("Set video bounds to x:" + i10 + ";y:" + i11 + ";w:" + i12 + ";h:" + i13);
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.f18569n.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void o(float f5) {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        rg0Var.f14779n.e(f5);
        rg0Var.m();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        nh0 nh0Var = this.f18572q;
        if (z10) {
            nh0Var.b();
        } else {
            nh0Var.a();
            this.f18580y = this.f18579x;
        }
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ug0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16326m.A(z10);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.qg0
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.f18572q.b();
            z10 = true;
        } else {
            this.f18572q.a();
            this.f18580y = this.f18579x;
            z10 = false;
        }
        m3.b2.f25197i.post(new yg0(this, z10));
    }

    public final void p(float f5, float f10) {
        rg0 rg0Var = this.f18574s;
        if (rg0Var != null) {
            rg0Var.z(f5, f10);
        }
    }

    public final void q() {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        rg0Var.f14779n.d(false);
        rg0Var.m();
    }

    public final Integer u() {
        rg0 rg0Var = this.f18574s;
        if (rg0Var != null) {
            return rg0Var.A();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final void v(String str, String str2) {
        s("error", "what", str, "extra", str2);
    }

    public final void x() {
        rg0 rg0Var = this.f18574s;
        if (rg0Var == null) {
            return;
        }
        TextView textView = new TextView(rg0Var.getContext());
        Resources resourcesD = j3.t.q().d();
        textView.setText(String.valueOf(resourcesD == null ? "AdMob - " : resourcesD.getString(i3.b.f24304r)).concat(this.f18574s.r()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f18569n.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f18569n.bringChildToFront(textView);
    }

    public final void y() {
        this.f18572q.a();
        rg0 rg0Var = this.f18574s;
        if (rg0Var != null) {
            rg0Var.y();
        }
        r();
    }

    final /* synthetic */ void z() {
        s("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final void z0(String str, String str2) {
        s("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }
}
