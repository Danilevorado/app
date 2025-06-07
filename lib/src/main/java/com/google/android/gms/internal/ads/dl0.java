package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dl0 extends FrameLayout implements nk0 {

    /* renamed from: m, reason: collision with root package name */
    private final nk0 f7395m;

    /* renamed from: n, reason: collision with root package name */
    private final ah0 f7396n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f7397o;

    /* JADX WARN: Multi-variable type inference failed */
    public dl0(nk0 nk0Var) {
        super(nk0Var.getContext());
        this.f7397o = new AtomicBoolean();
        this.f7395m = nk0Var;
        this.f7396n = new ah0(nk0Var.E(), this, this);
        addView((View) nk0Var);
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void A(boolean z10) {
        this.f7395m.A(false);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final boolean B() {
        return this.f7395m.B();
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void D() {
        this.f7395m.D();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void D0() {
        nk0 nk0Var = this.f7395m;
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(j3.t.t().e()));
        map.put("app_volume", String.valueOf(j3.t.t().a()));
        hl0 hl0Var = (hl0) nk0Var;
        map.put("device_volume", String.valueOf(m3.c.b(hl0Var.getContext())));
        hl0Var.c("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final Context E() {
        return this.f7395m.E();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final l4.a E0() {
        return this.f7395m.E0();
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.lh0
    public final void F(String str, yi0 yi0Var) {
        this.f7395m.F(str, yi0Var);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void F0(Context context) {
        this.f7395m.F0(context);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final cm0 G() {
        return ((hl0) this.f7395m).v0();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void G0(int i10) {
        this.f7395m.G0(i10);
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.lh0
    public final void H(kl0 kl0Var) {
        this.f7395m.H(kl0Var);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void H0(boolean z10) {
        this.f7395m.H0(z10);
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.wl0
    public final em0 I() {
        return this.f7395m.I();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final boolean I0() {
        return this.f7395m.I0();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void J0() {
        this.f7395m.J0();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final boolean K0() {
        return this.f7395m.K0();
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.xl0
    public final bg L() {
        return this.f7395m.L();
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final yi0 M(String str) {
        return this.f7395m.M(str);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final String M0() {
        return this.f7395m.M0();
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void N(int i10) {
        this.f7396n.g(i10);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void N0(boolean z10) {
        this.f7395m.N0(z10);
    }

    @Override // k3.a
    public final void O() {
        nk0 nk0Var = this.f7395m;
        if (nk0Var != null) {
            nk0Var.O();
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void O0(String str, gy gyVar) {
        this.f7395m.O0(str, gyVar);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final WebView P() {
        return (WebView) this.f7395m;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void P0(String str, gy gyVar) {
        this.f7395m.P0(str, gyVar);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void Q0(boolean z10) {
        this.f7395m.Q0(z10);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void R0(String str, i4.n nVar) {
        this.f7395m.R0(str, nVar);
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.ll0
    public final ln2 S() {
        return this.f7395m.S();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void S0(du duVar) {
        this.f7395m.S0(duVar);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final WebViewClient T() {
        return this.f7395m.T();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final boolean T0() {
        return this.f7397o.get();
    }

    @Override // com.google.android.gms.internal.ads.nj
    public final void U(mj mjVar) {
        this.f7395m.U(mjVar);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void U0(bu buVar) {
        this.f7395m.U0(buVar);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final l3.r V() {
        return this.f7395m.V();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void V0(l3.r rVar) {
        this.f7395m.V0(rVar);
    }

    @Override // j3.l
    public final void W() {
        this.f7395m.W();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void W0() {
        setBackgroundColor(0);
        this.f7395m.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final String X() {
        return this.f7395m.X();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final boolean X0(boolean z10, int i10) {
        if (!this.f7397o.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) k3.w.c().b(ir.H0)).booleanValue()) {
            return false;
        }
        if (this.f7395m.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f7395m.getParent()).removeView((View) this.f7395m);
        }
        this.f7395m.X0(z10, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ul0
    public final void Y(boolean z10, int i10, String str, String str2, boolean z11) {
        this.f7395m.Y(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void Y0(String str, String str2, String str3) {
        this.f7395m.Y0(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void Z0(l3.r rVar) {
        this.f7395m.Z0(rVar);
    }

    @Override // com.google.android.gms.internal.ads.p00
    public final void a(String str, JSONObject jSONObject) {
        this.f7395m.a(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.ul0
    public final void a0(boolean z10, int i10, String str, boolean z11) {
        this.f7395m.a0(z10, i10, str, z11);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void a1() {
        this.f7395m.a1();
    }

    @Override // j3.l
    public final void b() {
        this.f7395m.b();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void b1(boolean z10) {
        this.f7395m.b1(z10);
    }

    @Override // com.google.android.gms.internal.ads.p00
    public final void c(String str, Map map) {
        this.f7395m.c(str, map);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void c1(em0 em0Var) {
        this.f7395m.c1(em0Var);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final boolean canGoBack() {
        return this.f7395m.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.ul0
    public final void d0(m3.t0 t0Var, jy1 jy1Var, xm1 xm1Var, ws2 ws2Var, String str, String str2, int i10) {
        this.f7395m.d0(t0Var, jy1Var, xm1Var, ws2Var, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final boolean d1() {
        return this.f7395m.d1();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void destroy() {
        final l4.a aVarE0 = E0();
        if (aVarE0 == null) {
            this.f7395m.destroy();
            return;
        }
        b03 b03Var = m3.b2.f25197i;
        b03Var.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bl0
            @Override // java.lang.Runnable
            public final void run() {
                l4.a aVar = aVarE0;
                j3.t.a();
                if (((Boolean) k3.w.c().b(ir.G4)).booleanValue() && wu2.b()) {
                    Object objL0 = l4.b.L0(aVar);
                    if (objL0 instanceof yu2) {
                        ((yu2) objL0).c();
                    }
                }
            }
        });
        final nk0 nk0Var = this.f7395m;
        nk0Var.getClass();
        b03Var.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.cl0
            @Override // java.lang.Runnable
            public final void run() {
                nk0Var.destroy();
            }
        }, ((Integer) k3.w.c().b(ir.H4)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final int e() {
        return this.f7395m.e();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void e1() {
        TextView textView = new TextView(getContext());
        j3.t.r();
        textView.setText(m3.b2.Q());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void f1() {
        this.f7396n.e();
        this.f7395m.f1();
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final int g() {
        return ((Boolean) k3.w.c().b(ir.f10135x3)).booleanValue() ? this.f7395m.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final l3.r g0() {
        return this.f7395m.g0();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void g1(hn2 hn2Var, ln2 ln2Var) {
        this.f7395m.g1(hn2Var, ln2Var);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void goBack() {
        this.f7395m.goBack();
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final int h() {
        return ((Boolean) k3.w.c().b(ir.f10135x3)).booleanValue() ? this.f7395m.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final String h0() {
        return this.f7395m.h0();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void h1(boolean z10) {
        this.f7395m.h1(z10);
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.pl0, com.google.android.gms.internal.ads.lh0
    public final Activity i() {
        return this.f7395m.i();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void i1(l4.a aVar) {
        this.f7395m.i1(aVar);
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.lh0
    public final j3.a j() {
        return this.f7395m.j();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void j1(cl clVar) {
        this.f7395m.j1(clVar);
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final xr k() {
        return this.f7395m.k();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void k1() {
        this.f7395m.k1();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final ab3 l1() {
        return this.f7395m.l1();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void loadData(String str, String str2, String str3) {
        this.f7395m.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f7395m.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void loadUrl(String str) {
        this.f7395m.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.yl0, com.google.android.gms.internal.ads.lh0
    public final ff0 m() {
        return this.f7395m.m();
    }

    @Override // com.google.android.gms.internal.ads.ul0
    public final void m0(l3.i iVar, boolean z10) {
        this.f7395m.m0(iVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void m1(int i10) {
        this.f7395m.m1(i10);
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.lh0
    public final yr n() {
        return this.f7395m.n();
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void n0(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void n1(boolean z10) {
        this.f7395m.n1(z10);
    }

    @Override // com.google.android.gms.internal.ads.d10
    public final void o(String str) {
        ((hl0) this.f7395m).A0(str);
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void o0(int i10) {
        this.f7395m.o0(i10);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void onPause() {
        this.f7396n.f();
        this.f7395m.onPause();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void onResume() {
        this.f7395m.onResume();
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final ah0 p() {
        return this.f7396n;
    }

    @Override // com.google.android.gms.internal.ads.ul0
    public final void p0(boolean z10, int i10, boolean z11) {
        this.f7395m.p0(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.lh0
    public final kl0 q() {
        return this.f7395m.q();
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void q0(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void r() {
        nk0 nk0Var = this.f7395m;
        if (nk0Var != null) {
            nk0Var.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void r0(boolean z10, long j10) {
        this.f7395m.r0(z10, j10);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final du s() {
        return this.f7395m.s();
    }

    @Override // com.google.android.gms.internal.ads.d10
    public final void s0(String str, JSONObject jSONObject) {
        ((hl0) this.f7395m).v(str, jSONObject.toString());
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.nk0
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7395m.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.nk0
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f7395m.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f7395m.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f7395m.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void t() {
        nk0 nk0Var = this.f7395m;
        if (nk0Var != null) {
            nk0Var.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void t0() {
        this.f7395m.t0();
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void u() {
        this.f7395m.u();
    }

    @Override // com.google.android.gms.internal.ads.d10
    public final void v(String str, String str2) {
        this.f7395m.v("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.ek0
    public final hn2 w() {
        return this.f7395m.w();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final boolean x() {
        return this.f7395m.x();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final cl y() {
        return this.f7395m.y();
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.zl0
    public final View z() {
        return this;
    }
}
