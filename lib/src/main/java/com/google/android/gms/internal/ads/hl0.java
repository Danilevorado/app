package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.b03;
import com.google.android.gms.internal.ads.ir;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class hl0 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, nk0 {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f9168k0 = 0;
    private l4.a A;
    private em0 B;
    private final String C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private Boolean H;
    private boolean I;
    private final String J;
    private kl0 K;
    private boolean L;
    private boolean M;
    private du N;
    private bu O;
    private cl P;
    private int Q;
    private int R;
    private xr S;
    private final xr T;
    private xr U;
    private final yr V;
    private int W;

    /* renamed from: a0, reason: collision with root package name */
    private l3.r f9169a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f9170b0;

    /* renamed from: c0, reason: collision with root package name */
    private final m3.l1 f9171c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f9172d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f9173e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f9174f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f9175g0;

    /* renamed from: h0, reason: collision with root package name */
    private Map f9176h0;

    /* renamed from: i0, reason: collision with root package name */
    private final WindowManager f9177i0;

    /* renamed from: j0, reason: collision with root package name */
    private final pm f9178j0;

    /* renamed from: m, reason: collision with root package name */
    private final dm0 f9179m;

    /* renamed from: n, reason: collision with root package name */
    private final bg f9180n;

    /* renamed from: o, reason: collision with root package name */
    private final ls f9181o;

    /* renamed from: p, reason: collision with root package name */
    private final ff0 f9182p;

    /* renamed from: q, reason: collision with root package name */
    private j3.l f9183q;

    /* renamed from: r, reason: collision with root package name */
    private final j3.a f9184r;

    /* renamed from: s, reason: collision with root package name */
    private final DisplayMetrics f9185s;

    /* renamed from: t, reason: collision with root package name */
    private final float f9186t;

    /* renamed from: u, reason: collision with root package name */
    private hn2 f9187u;

    /* renamed from: v, reason: collision with root package name */
    private ln2 f9188v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f9189w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f9190x;

    /* renamed from: y, reason: collision with root package name */
    private vk0 f9191y;

    /* renamed from: z, reason: collision with root package name */
    private l3.r f9192z;

    protected hl0(dm0 dm0Var, em0 em0Var, String str, boolean z10, boolean z11, bg bgVar, ls lsVar, ff0 ff0Var, as asVar, j3.l lVar, j3.a aVar, pm pmVar, hn2 hn2Var, ln2 ln2Var) {
        ln2 ln2Var2;
        super(dm0Var);
        this.f9189w = false;
        this.f9190x = false;
        this.I = true;
        this.J = "";
        this.f9172d0 = -1;
        this.f9173e0 = -1;
        this.f9174f0 = -1;
        this.f9175g0 = -1;
        this.f9179m = dm0Var;
        this.B = em0Var;
        this.C = str;
        this.F = z10;
        this.f9180n = bgVar;
        this.f9181o = lsVar;
        this.f9182p = ff0Var;
        this.f9183q = lVar;
        this.f9184r = aVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f9177i0 = windowManager;
        j3.t.r();
        DisplayMetrics displayMetricsM = m3.b2.M(windowManager);
        this.f9185s = displayMetricsM;
        this.f9186t = displayMetricsM.density;
        this.f9178j0 = pmVar;
        this.f9187u = hn2Var;
        this.f9188v = ln2Var;
        this.f9171c0 = new m3.l1(dm0Var.a(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e5) {
            ze0.e("Unable to enable Javascript.", e5);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) k3.w.c().b(ir.O9)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(j3.t.r().z(dm0Var, ff0Var.f8252m));
        j3.t.r();
        final Context context = getContext();
        m3.e1.a(context, new Callable() { // from class: m3.v1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                b03 b03Var = b2.f25197i;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) k3.w.c().b(ir.G0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        o1();
        addJavascriptInterface(new ol0(this, new nl0(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        w1();
        yr yrVar = new yr(new as(true, "make_wv", this.C));
        this.V = yrVar;
        yrVar.a().c(null);
        if (((Boolean) k3.w.c().b(ir.I1)).booleanValue() && (ln2Var2 = this.f9188v) != null && ln2Var2.f11674b != null) {
            yrVar.a().d("gqi", this.f9188v.f11674b);
        }
        yrVar.a();
        xr xrVarF = as.f();
        this.T = xrVarF;
        yrVar.b("native:view_create", xrVarF);
        this.U = null;
        this.S = null;
        m3.h1.a().b(dm0Var);
        j3.t.q().r();
    }

    private final synchronized void o1() {
        hn2 hn2Var = this.f9187u;
        if (hn2Var != null && hn2Var.f9263n0) {
            ze0.b("Disabling hardware acceleration on an overlay.");
            q1();
            return;
        }
        if (!this.F && !this.B.i()) {
            ze0.b("Enabling hardware acceleration on an AdView.");
            s1();
            return;
        }
        ze0.b("Enabling hardware acceleration on an overlay.");
        s1();
    }

    private final synchronized void p1() {
        if (this.f9170b0) {
            return;
        }
        this.f9170b0 = true;
        j3.t.q().q();
    }

    private final synchronized void q1() {
        if (!this.G) {
            setLayerType(1, null);
        }
        this.G = true;
    }

    private final void r1(boolean z10) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z10 ? "0" : "1");
        c("onAdVisibilityChanged", map);
    }

    private final synchronized void s1() {
        if (this.G) {
            setLayerType(0, null);
        }
        this.G = false;
    }

    private final synchronized void t1(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            j3.t.q().u(th, "AdWebViewImpl.loadUrlUnsafe");
            ze0.h("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void u1() {
        sr.a(this.V.a(), this.T, "aeh2");
    }

    private final synchronized void v1() {
        Map map = this.f9176h0;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((yi0) it.next()).b();
            }
        }
        this.f9176h0 = null;
    }

    private final void w1() {
        yr yrVar = this.V;
        if (yrVar == null) {
            return;
        }
        as asVarA = yrVar.a();
        qr qrVarF = j3.t.q().f();
        if (qrVarF != null) {
            qrVarF.f(asVarA);
        }
    }

    private final synchronized void x1() {
        Boolean boolK = j3.t.q().k();
        this.H = boolK;
        if (boolK == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                C0(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                C0(Boolean.FALSE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void A(boolean z10) {
        this.f9191y.a(false);
    }

    protected final void A0(String str) {
        if (!i4.m.d()) {
            B0("javascript:".concat(str));
            return;
        }
        if (w0() == null) {
            x1();
        }
        if (w0().booleanValue()) {
            z0(str, null);
        } else {
            B0("javascript:".concat(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized boolean B() {
        return this.E;
    }

    protected final synchronized void B0(String str) {
        if (B()) {
            ze0.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    final void C0(Boolean bool) {
        synchronized (this) {
            this.H = bool;
        }
        j3.t.q().v(bool);
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final synchronized void D() {
        bu buVar = this.O;
        if (buVar != null) {
            final qh1 qh1Var = (qh1) buVar;
            m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.oh1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        qh1Var.f();
                    } catch (RemoteException e5) {
                        ze0.i("#007 Could not call remote method.", e5);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void D0() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final Context E() {
        return this.f9179m.b();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized l4.a E0() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.lh0
    public final synchronized void F(String str, yi0 yi0Var) {
        if (this.f9176h0 == null) {
            this.f9176h0 = new HashMap();
        }
        this.f9176h0.put(str, yi0Var);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void F0(Context context) {
        this.f9179m.setBaseContext(context);
        this.f9171c0.e(this.f9179m.a());
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final /* synthetic */ cm0 G() {
        return this.f9191y;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void G0(int i10) {
        l3.r rVar = this.f9192z;
        if (rVar != null) {
            rVar.U5(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.lh0
    public final synchronized void H(kl0 kl0Var) {
        if (this.K != null) {
            ze0.d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.K = kl0Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void H0(boolean z10) {
        l3.r rVar = this.f9192z;
        if (rVar != null) {
            rVar.T5(this.f9191y.s(), z10);
        } else {
            this.D = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.wl0
    public final synchronized em0 I() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized boolean I0() {
        return this.F;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void J0() {
        if (this.U == null) {
            this.V.a();
            xr xrVarF = as.f();
            this.U = xrVarF;
            this.V.b("native:view_load", xrVarF);
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized boolean K0() {
        return this.Q > 0;
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.xl0
    public final bg L() {
        return this.f9180n;
    }

    public final boolean L0() throws JSONException {
        int i10;
        int iX;
        if (!this.f9191y.s() && !this.f9191y.e()) {
            return false;
        }
        k3.t.b();
        DisplayMetrics displayMetrics = this.f9185s;
        int iX2 = se0.x(displayMetrics, displayMetrics.widthPixels);
        k3.t.b();
        DisplayMetrics displayMetrics2 = this.f9185s;
        int iX3 = se0.x(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityA = this.f9179m.a();
        if (activityA == null || activityA.getWindow() == null) {
            i10 = iX2;
            iX = iX3;
        } else {
            j3.t.r();
            int[] iArrL = m3.b2.l(activityA);
            k3.t.b();
            int iX4 = se0.x(this.f9185s, iArrL[0]);
            k3.t.b();
            iX = se0.x(this.f9185s, iArrL[1]);
            i10 = iX4;
        }
        int i11 = this.f9173e0;
        if (i11 == iX2 && this.f9172d0 == iX3 && this.f9174f0 == i10 && this.f9175g0 == iX) {
            return false;
        }
        boolean z10 = (i11 == iX2 && this.f9172d0 == iX3) ? false : true;
        this.f9173e0 = iX2;
        this.f9172d0 = iX3;
        this.f9174f0 = i10;
        this.f9175g0 = iX;
        new n60(this, "").e(iX2, iX3, i10, iX, this.f9185s.density, this.f9177i0.getDefaultDisplay().getRotation());
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final synchronized yi0 M(String str) {
        Map map = this.f9176h0;
        if (map == null) {
            return null;
        }
        return (yi0) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized String M0() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void N(int i10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x0007, B:8:0x000b), top: B:16:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.nk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void N0(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L7
            r0 = 0
            r1.setBackgroundColor(r0)     // Catch: java.lang.Throwable -> L12
        L7:
            l3.r r0 = r1.f9192z     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            r0.M5(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hl0.N0(boolean):void");
    }

    @Override // k3.a
    public final void O() {
        vk0 vk0Var = this.f9191y;
        if (vk0Var != null) {
            vk0Var.O();
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void O0(String str, gy gyVar) {
        vk0 vk0Var = this.f9191y;
        if (vk0Var != null) {
            vk0Var.h0(str, gyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final WebView P() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void P0(String str, gy gyVar) {
        vk0 vk0Var = this.f9191y;
        if (vk0Var != null) {
            vk0Var.b(str, gyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void Q0(boolean z10) {
        this.I = z10;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void R0(String str, i4.n nVar) {
        vk0 vk0Var = this.f9191y;
        if (vk0Var != null) {
            vk0Var.c(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.ll0
    public final ln2 S() {
        return this.f9188v;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void S0(du duVar) {
        this.N = duVar;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final WebViewClient T() {
        return this.f9191y;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final boolean T0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nj
    public final void U(mj mjVar) {
        boolean z10;
        synchronized (this) {
            z10 = mjVar.f12152j;
            this.L = z10;
        }
        r1(z10);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void U0(bu buVar) {
        this.O = buVar;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized l3.r V() {
        return this.f9169a0;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void V0(l3.r rVar) {
        this.f9169a0 = rVar;
    }

    @Override // j3.l
    public final synchronized void W() {
        j3.l lVar = this.f9183q;
        if (lVar != null) {
            lVar.W();
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void W0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final synchronized String X() {
        ln2 ln2Var = this.f9188v;
        if (ln2Var == null) {
            return null;
        }
        return ln2Var.f11674b;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final boolean X0(final boolean z10, final int i10) {
        destroy();
        this.f9178j0.b(new om() { // from class: com.google.android.gms.internal.ads.el0
            @Override // com.google.android.gms.internal.ads.om
            public final void a(go goVar) {
                boolean z11 = z10;
                int i11 = i10;
                int i12 = hl0.f9168k0;
                oq oqVarK = pq.K();
                if (oqVarK.w() != z11) {
                    oqVarK.u(z11);
                }
                oqVarK.v(i11);
                goVar.E((pq) oqVarK.m());
            }
        });
        this.f9178j0.c(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ul0
    public final void Y(boolean z10, int i10, String str, String str2, boolean z11) throws NumberFormatException {
        this.f9191y.f0(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void Y0(String str, String str2, String str3) {
        String str4;
        if (B()) {
            ze0.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) k3.w.c().b(ir.P);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e5) {
            ze0.h("Unable to build MRAID_ENV", e5);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, vl0.a(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void Z0(l3.r rVar) {
        this.f9192z = rVar;
    }

    @Override // com.google.android.gms.internal.ads.p00
    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(string);
        sb2.append(");");
        ze0.b("Dispatching AFMA event: ".concat(sb2.toString()));
        A0(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.ul0
    public final void a0(boolean z10, int i10, String str, boolean z11) throws NumberFormatException {
        this.f9191y.e0(z10, i10, str, z11);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void a1() {
        this.f9171c0.b();
    }

    @Override // j3.l
    public final synchronized void b() {
        j3.l lVar = this.f9183q;
        if (lVar != null) {
            lVar.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void b1(boolean z10) {
        boolean z11 = this.F;
        this.F = z10;
        o1();
        if (z10 != z11) {
            if (!((Boolean) k3.w.c().b(ir.Q)).booleanValue() || !this.B.i()) {
                new n60(this, "").g(true != z10 ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p00
    public final void c(String str, Map map) {
        try {
            a(str, k3.t.b().k(map));
        } catch (JSONException unused) {
            ze0.g("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void c1(em0 em0Var) {
        this.B = em0Var;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.ul0
    public final void d0(m3.t0 t0Var, jy1 jy1Var, xm1 xm1Var, ws2 ws2Var, String str, String str2, int i10) throws NumberFormatException {
        this.f9191y.a0(t0Var, jy1Var, xm1Var, ws2Var, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized boolean d1() {
        return this.I;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.nk0
    public final synchronized void destroy() {
        w1();
        this.f9171c0.a();
        l3.r rVar = this.f9192z;
        if (rVar != null) {
            rVar.b();
            this.f9192z.l();
            this.f9192z = null;
        }
        this.A = null;
        this.f9191y.U();
        this.P = null;
        this.f9183q = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.E) {
            return;
        }
        j3.t.A().i(this);
        v1();
        this.E = true;
        if (!((Boolean) k3.w.c().b(ir.f9999k9)).booleanValue()) {
            m3.n1.k("Destroying the WebView immediately...");
            f1();
        } else {
            m3.n1.k("Initiating WebView self destruct sequence in 3...");
            m3.n1.k("Loading blank page in WebView, 2...");
            t1("about:blank");
        }
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final synchronized int e() {
        return this.W;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void e1() {
        throw null;
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!B()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        ze0.i("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void f1() {
        m3.n1.k("Destroying WebView!");
        p1();
        m3.b2.f25197i.post(new gl0(this));
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.E) {
                    this.f9191y.U();
                    j3.t.A().i(this);
                    v1();
                    p1();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final int g() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized l3.r g0() {
        return this.f9192z;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void g1(hn2 hn2Var, ln2 ln2Var) {
        this.f9187u = hn2Var;
        this.f9188v = ln2Var;
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final int h() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final synchronized String h0() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void h1(boolean z10) {
        this.f9191y.W(z10);
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.pl0, com.google.android.gms.internal.ads.lh0
    public final Activity i() {
        return this.f9179m.a();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void i1(l4.a aVar) {
        this.A = aVar;
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.lh0
    public final j3.a j() {
        return this.f9184r;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void j1(cl clVar) {
        this.P = clVar;
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final xr k() {
        return this.T;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void k1() {
        u1();
        HashMap map = new HashMap(1);
        map.put("version", this.f9182p.f8252m);
        c("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final ab3 l1() {
        ls lsVar = this.f9181o;
        return lsVar == null ? qa3.h(null) : lsVar.a();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.nk0
    public final synchronized void loadData(String str, String str2, String str3) {
        if (B()) {
            ze0.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.nk0
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (B()) {
            ze0.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.nk0
    public final synchronized void loadUrl(String str) {
        if (B()) {
            ze0.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            j3.t.q().u(th, "AdWebViewImpl.loadUrl");
            ze0.h("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.yl0, com.google.android.gms.internal.ads.lh0
    public final ff0 m() {
        return this.f9182p;
    }

    @Override // com.google.android.gms.internal.ads.ul0
    public final void m0(l3.i iVar, boolean z10) throws NumberFormatException {
        this.f9191y.Z(iVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void m1(int i10) {
        if (i10 == 0) {
            sr.a(this.V.a(), this.T, "aebb2");
        }
        u1();
        this.V.a();
        this.V.a().d("close_type", String.valueOf(i10));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i10));
        map.put("version", this.f9182p.f8252m);
        c("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.lh0
    public final yr n() {
        return this.V;
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void n0(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized void n1(boolean z10) {
        l3.r rVar;
        int i10 = this.Q + (true != z10 ? -1 : 1);
        this.Q = i10;
        if (i10 > 0 || (rVar = this.f9192z) == null) {
            return;
        }
        rVar.P5();
    }

    @Override // com.google.android.gms.internal.ads.d10
    public final void o(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final synchronized void o0(int i10) {
        this.W = i10;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!B()) {
            this.f9171c0.c();
        }
        boolean z10 = this.L;
        vk0 vk0Var = this.f9191y;
        if (vk0Var != null && vk0Var.e()) {
            if (!this.M) {
                this.f9191y.A();
                this.f9191y.C();
                this.M = true;
            }
            L0();
            z10 = true;
        }
        r1(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        vk0 vk0Var;
        synchronized (this) {
            if (!B()) {
                this.f9171c0.d();
            }
            super.onDetachedFromWindow();
            if (this.M && (vk0Var = this.f9191y) != null && vk0Var.e() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f9191y.A();
                this.f9191y.C();
                this.M = false;
            }
        }
        r1(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            j3.t.r();
            m3.b2.o(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            ze0.b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (B()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        boolean zL0 = L0();
        l3.r rVarG0 = g0();
        if (rVarG0 == null || !zL0) {
            return;
        }
        rVarG0.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hl0.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.nk0
    public final void onPause() {
        if (B()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e5) {
            ze0.e("Could not pause webview.", e5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.nk0
    public final void onResume() {
        if (B()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e5) {
            ze0.e("Could not resume webview.", e5);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f9191y.e() || this.f9191y.d()) {
            bg bgVar = this.f9180n;
            if (bgVar != null) {
                bgVar.d(motionEvent);
            }
            ls lsVar = this.f9181o;
            if (lsVar != null) {
                lsVar.b(motionEvent);
            }
        } else {
            synchronized (this) {
                du duVar = this.N;
                if (duVar != null) {
                    duVar.c(motionEvent);
                }
            }
        }
        if (B()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final ah0 p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ul0
    public final void p0(boolean z10, int i10, boolean z11) throws NumberFormatException {
        this.f9191y.b0(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.lh0
    public final synchronized kl0 q() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void q0(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void r() {
        vk0 vk0Var = this.f9191y;
        if (vk0Var != null) {
            vk0Var.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void r0(boolean z10, long j10) {
        HashMap map = new HashMap(2);
        map.put("success", true != z10 ? "0" : "1");
        map.put("duration", Long.toString(j10));
        c("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized du s() {
        return this.N;
    }

    @Override // com.google.android.gms.internal.ads.d10
    public final void s0(String str, JSONObject jSONObject) {
        v(str, jSONObject.toString());
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.nk0
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof vk0) {
            this.f9191y = (vk0) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (B()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e5) {
            ze0.e("Could not stop loading webview.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void t() {
        vk0 vk0Var = this.f9191y;
        if (vk0Var != null) {
            vk0Var.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void t0() {
        if (this.S == null) {
            sr.a(this.V.a(), this.T, "aes2");
            this.V.a();
            xr xrVarF = as.f();
            this.S = xrVarF;
            this.V.b("native:view_show", xrVarF);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f9182p.f8252m);
        c("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.lh0
    public final void u() {
        l3.r rVarG0 = g0();
        if (rVarG0 != null) {
            rVarG0.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.d10
    public final void v(String str, String str2) {
        A0(str + "(" + str2 + ");");
    }

    public final vk0 v0() {
        return this.f9191y;
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.ek0
    public final hn2 w() {
        return this.f9187u;
    }

    final synchronized Boolean w0() {
        return this.H;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized boolean x() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final synchronized cl y() {
        return this.P;
    }

    @Override // com.google.android.gms.internal.ads.nk0, com.google.android.gms.internal.ads.zl0
    public final View z() {
        return this;
    }

    protected final synchronized void z0(String str, ValueCallback valueCallback) {
        if (B()) {
            ze0.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }
}
