package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class vk0 extends WebViewClient implements cm0 {
    public static final /* synthetic */ int O = 0;
    private boolean A;
    private boolean B;
    private l3.e0 C;
    private m60 D;
    private j3.b E;
    private h60 F;
    protected zb0 G;
    private tu2 H;
    private boolean I;
    private boolean J;
    private int K;
    private boolean L;
    private final HashSet M;
    private View.OnAttachStateChangeListener N;

    /* renamed from: m, reason: collision with root package name */
    private final nk0 f16747m;

    /* renamed from: n, reason: collision with root package name */
    private final pm f16748n;

    /* renamed from: o, reason: collision with root package name */
    private final HashMap f16749o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f16750p;

    /* renamed from: q, reason: collision with root package name */
    private k3.a f16751q;

    /* renamed from: r, reason: collision with root package name */
    private l3.t f16752r;

    /* renamed from: s, reason: collision with root package name */
    private am0 f16753s;

    /* renamed from: t, reason: collision with root package name */
    private bm0 f16754t;

    /* renamed from: u, reason: collision with root package name */
    private xw f16755u;

    /* renamed from: v, reason: collision with root package name */
    private zw f16756v;

    /* renamed from: w, reason: collision with root package name */
    private f91 f16757w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f16758x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f16759y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f16760z;

    public vk0(nk0 nk0Var, pm pmVar, boolean z10) {
        m60 m60Var = new m60(nk0Var, nk0Var.E(), new rq(nk0Var.getContext()));
        this.f16749o = new HashMap();
        this.f16750p = new Object();
        this.f16748n = pmVar;
        this.f16747m = nk0Var;
        this.f16760z = z10;
        this.D = m60Var;
        this.F = null;
        this.M = new HashSet(Arrays.asList(((String) k3.w.c().b(ir.f10006l5)).split(",")));
    }

    private static WebResourceResponse g() {
        if (((Boolean) k3.w.c().b(ir.F0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
    
        j3.t.r();
        j3.t.r();
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0103, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0109, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010b, code lost:
    
        r6 = r14.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0116, code lost:
    
        j3.t.r();
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0121, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0123, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0125, code lost:
    
        r14 = r14.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012a, code lost:
    
        if (r14.length != 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012d, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012f, code lost:
    
        if (r0 >= r14.length) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        if (r14[r0].trim().startsWith("charset") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013f, code lost:
    
        r1 = r14[r0].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014c, code lost:
    
        if (r1.length <= 1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014e, code lost:
    
        r4 = r1[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0155, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0158, code lost:
    
        r14 = r3.getHeaderFields();
        r10 = new java.util.HashMap(r14.size());
        r14 = r14.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0171, code lost:
    
        if (r14.hasNext() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0173, code lost:
    
        r0 = r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017d, code lost:
    
        if (r0.getKey() == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0183, code lost:
    
        if (r0.getValue() == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018f, code lost:
    
        if (r0.getValue().isEmpty() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0191, code lost:
    
        r10.put(r0.getKey(), r0.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01be, code lost:
    
        return j3.t.s().c(r6, r7, r3.getResponseCode(), r3.getResponseMessage(), r10, r3.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse h(java.lang.String r13, java.util.Map r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vk0.h(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Map map, List list, String str) {
        if (m3.n1.m()) {
            m3.n1.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                m3.n1.k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((gy) it.next()).a(this.f16747m, map);
        }
    }

    private final void p() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.N;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.f16747m).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(final View view, final zb0 zb0Var, final int i10) {
        if (!zb0Var.i() || i10 <= 0) {
            return;
        }
        zb0Var.d(view);
        if (zb0Var.i()) {
            m3.b2.f25197i.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.qk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14379m.Y(view, zb0Var, i10);
                }
            }, 100L);
        }
    }

    private static final boolean v(boolean z10, nk0 nk0Var) {
        return (!z10 || nk0Var.I().i() || nk0Var.M0().equals("interstitial_mb")) ? false : true;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener A() {
        synchronized (this.f16750p) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener C() {
        synchronized (this.f16750p) {
        }
        return null;
    }

    protected final WebResourceResponse D(String str, Map map) {
        yl ylVarB;
        try {
            if (((Boolean) ft.f8413a.e()).booleanValue() && this.H != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.H.c(str, null);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String strC = gd0.c(str, this.f16747m.getContext(), this.L);
            if (!strC.equals(str)) {
                return h(strC, map);
            }
            bm bmVarF = bm.f(Uri.parse(str));
            if (bmVarF != null && (ylVarB = j3.t.e().b(bmVarF)) != null && ylVarB.y()) {
                return new WebResourceResponse("", "", ylVarB.v());
            }
            if (ye0.k() && ((Boolean) ys.f18259b.e()).booleanValue()) {
                return h(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e5) {
            j3.t.q().u(e5, "AdWebViewClient.interceptRequest");
            return g();
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void E() {
        synchronized (this.f16750p) {
            this.f16758x = false;
            this.f16760z = true;
            of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pk0
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f13922m.X();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void K(int i10, int i11) {
        h60 h60Var = this.F;
        if (h60Var != null) {
            h60Var.k(i10, i11);
        }
    }

    public final void N() {
        if (this.f16753s != null && ((this.I && this.K <= 0) || this.J || this.f16759y)) {
            if (((Boolean) k3.w.c().b(ir.I1)).booleanValue() && this.f16747m.n() != null) {
                sr.a(this.f16747m.n().a(), this.f16747m.k(), "awfllc");
            }
            am0 am0Var = this.f16753s;
            boolean z10 = false;
            if (!this.J && !this.f16759y) {
                z10 = true;
            }
            am0Var.a(z10);
            this.f16753s = null;
        }
        this.f16747m.J0();
    }

    @Override // k3.a
    public final void O() {
        k3.a aVar = this.f16751q;
        if (aVar != null) {
            aVar.O();
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void Q(boolean z10) {
        synchronized (this.f16750p) {
            this.A = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void R(k3.a aVar, xw xwVar, l3.t tVar, zw zwVar, l3.e0 e0Var, boolean z10, iy iyVar, j3.b bVar, o60 o60Var, zb0 zb0Var, final jy1 jy1Var, final tu2 tu2Var, xm1 xm1Var, ws2 ws2Var, yy yyVar, final f91 f91Var, xy xyVar, ry ryVar) {
        gy gyVar;
        j3.b bVar2 = bVar == null ? new j3.b(this.f16747m.getContext(), zb0Var, null) : bVar;
        this.F = new h60(this.f16747m, o60Var);
        this.G = zb0Var;
        if (((Boolean) k3.w.c().b(ir.N0)).booleanValue()) {
            h0("/adMetadata", new ww(xwVar));
        }
        if (zwVar != null) {
            h0("/appEvent", new yw(zwVar));
        }
        h0("/backButton", fy.f8485j);
        h0("/refresh", fy.f8486k);
        h0("/canOpenApp", fy.f8477b);
        h0("/canOpenURLs", fy.f8476a);
        h0("/canOpenIntents", fy.f8478c);
        h0("/close", fy.f8479d);
        h0("/customClose", fy.f8480e);
        h0("/instrument", fy.f8489n);
        h0("/delayPageLoaded", fy.f8491p);
        h0("/delayPageClosed", fy.f8492q);
        h0("/getLocationInfo", fy.f8493r);
        h0("/log", fy.f8482g);
        h0("/mraid", new my(bVar2, this.F, o60Var));
        m60 m60Var = this.D;
        if (m60Var != null) {
            h0("/mraidLoaded", m60Var);
        }
        j3.b bVar3 = bVar2;
        h0("/open", new qy(bVar2, this.F, jy1Var, xm1Var, ws2Var));
        h0("/precache", new zi0());
        h0("/touch", fy.f8484i);
        h0("/video", fy.f8487l);
        h0("/videoMeta", fy.f8488m);
        if (jy1Var == null || tu2Var == null) {
            h0("/click", new gx(f91Var));
            gyVar = fy.f8481f;
        } else {
            h0("/click", new gy() { // from class: com.google.android.gms.internal.ads.ko2
                @Override // com.google.android.gms.internal.ads.gy
                public final void a(Object obj, Map map) {
                    f91 f91Var2 = f91Var;
                    tu2 tu2Var2 = tu2Var;
                    jy1 jy1Var2 = jy1Var;
                    nk0 nk0Var = (nk0) obj;
                    fy.c(map, f91Var2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        ze0.g("URL missing from click GMSG.");
                    } else {
                        qa3.q(fy.a(nk0Var, str), new no2(nk0Var, tu2Var2, jy1Var2), of0.f13186a);
                    }
                }
            });
            gyVar = new gy() { // from class: com.google.android.gms.internal.ads.jo2
                @Override // com.google.android.gms.internal.ads.gy
                public final void a(Object obj, Map map) {
                    tu2 tu2Var2 = tu2Var;
                    jy1 jy1Var2 = jy1Var;
                    ek0 ek0Var = (ek0) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        ze0.g("URL missing from httpTrack GMSG.");
                    } else if (ek0Var.w().f9255j0) {
                        jy1Var2.f(new ly1(j3.t.b().a(), ((ll0) ek0Var).S().f11674b, str, 2));
                    } else {
                        tu2Var2.c(str, null);
                    }
                }
            };
        }
        h0("/httpTrack", gyVar);
        if (j3.t.p().z(this.f16747m.getContext())) {
            h0("/logScionEvent", new ly(this.f16747m.getContext()));
        }
        if (iyVar != null) {
            h0("/setInterstitialProperties", new hy(iyVar));
        }
        if (yyVar != null) {
            if (((Boolean) k3.w.c().b(ir.f10009l8)).booleanValue()) {
                h0("/inspectorNetworkExtras", yyVar);
            }
        }
        if (((Boolean) k3.w.c().b(ir.E8)).booleanValue() && xyVar != null) {
            h0("/shareSheet", xyVar);
        }
        if (((Boolean) k3.w.c().b(ir.H8)).booleanValue() && ryVar != null) {
            h0("/inspectorOutOfContextTest", ryVar);
        }
        if (((Boolean) k3.w.c().b(ir.I9)).booleanValue()) {
            h0("/bindPlayStoreOverlay", fy.f8496u);
            h0("/presentPlayStoreOverlay", fy.f8497v);
            h0("/expandPlayStoreOverlay", fy.f8498w);
            h0("/collapsePlayStoreOverlay", fy.f8499x);
            h0("/closePlayStoreOverlay", fy.f8500y);
            if (((Boolean) k3.w.c().b(ir.O2)).booleanValue()) {
                h0("/setPAIDPersonalizationEnabled", fy.A);
                h0("/resetPAID", fy.f8501z);
            }
        }
        this.f16751q = aVar;
        this.f16752r = tVar;
        this.f16755u = xwVar;
        this.f16756v = zwVar;
        this.C = e0Var;
        this.E = bVar3;
        this.f16757w = f91Var;
        this.f16758x = z10;
        this.H = tu2Var;
    }

    public final void U() {
        zb0 zb0Var = this.G;
        if (zb0Var != null) {
            zb0Var.c();
            this.G = null;
        }
        p();
        synchronized (this.f16750p) {
            this.f16749o.clear();
            this.f16751q = null;
            this.f16752r = null;
            this.f16753s = null;
            this.f16754t = null;
            this.f16755u = null;
            this.f16756v = null;
            this.f16758x = false;
            this.f16760z = false;
            this.A = false;
            this.C = null;
            this.E = null;
            this.D = null;
            h60 h60Var = this.F;
            if (h60Var != null) {
                h60Var.h(true);
                this.F = null;
            }
            this.H = null;
        }
    }

    public final void W(boolean z10) {
        this.L = z10;
    }

    final /* synthetic */ void X() throws JSONException {
        this.f16747m.a1();
        l3.r rVarG0 = this.f16747m.g0();
        if (rVarG0 != null) {
            rVarG0.N();
        }
    }

    final /* synthetic */ void Y(View view, zb0 zb0Var, int i10) {
        u(view, zb0Var, i10 - 1);
    }

    public final void Z(l3.i iVar, boolean z10) throws NumberFormatException {
        boolean zI0 = this.f16747m.I0();
        boolean zV = v(zI0, this.f16747m);
        boolean z11 = true;
        if (!zV && z10) {
            z11 = false;
        }
        d0(new AdOverlayInfoParcel(iVar, zV ? null : this.f16751q, zI0 ? null : this.f16752r, this.C, this.f16747m.m(), this.f16747m, z11 ? null : this.f16757w));
    }

    public final void a(boolean z10) {
        this.f16758x = false;
    }

    public final void a0(m3.t0 t0Var, jy1 jy1Var, xm1 xm1Var, ws2 ws2Var, String str, String str2, int i10) throws NumberFormatException {
        nk0 nk0Var = this.f16747m;
        d0(new AdOverlayInfoParcel(nk0Var, nk0Var.m(), t0Var, jy1Var, xm1Var, ws2Var, str, str2, 14));
    }

    public final void b(String str, gy gyVar) {
        synchronized (this.f16750p) {
            List list = (List) this.f16749o.get(str);
            if (list == null) {
                return;
            }
            list.remove(gyVar);
        }
    }

    public final void b0(boolean z10, int i10, boolean z11) throws NumberFormatException {
        boolean zV = v(this.f16747m.I0(), this.f16747m);
        boolean z12 = true;
        if (!zV && z11) {
            z12 = false;
        }
        k3.a aVar = zV ? null : this.f16751q;
        l3.t tVar = this.f16752r;
        l3.e0 e0Var = this.C;
        nk0 nk0Var = this.f16747m;
        d0(new AdOverlayInfoParcel(aVar, tVar, e0Var, nk0Var, z10, i10, nk0Var.m(), z12 ? null : this.f16757w));
    }

    public final void c(String str, i4.n nVar) {
        synchronized (this.f16750p) {
            List<gy> list = (List) this.f16749o.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (gy gyVar : list) {
                if (nVar.a(gyVar)) {
                    arrayList.add(gyVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void c0(am0 am0Var) {
        this.f16753s = am0Var;
    }

    public final boolean d() {
        boolean z10;
        synchronized (this.f16750p) {
            z10 = this.B;
        }
        return z10;
    }

    public final void d0(AdOverlayInfoParcel adOverlayInfoParcel) throws NumberFormatException {
        l3.i iVar;
        h60 h60Var = this.F;
        boolean zL = h60Var != null ? h60Var.l() : false;
        j3.t.k();
        l3.s.a(this.f16747m.getContext(), adOverlayInfoParcel, !zL);
        zb0 zb0Var = this.G;
        if (zb0Var != null) {
            String str = adOverlayInfoParcel.f5540x;
            if (str == null && (iVar = adOverlayInfoParcel.f5529m) != null) {
                str = iVar.f25062n;
            }
            zb0Var.Z(str);
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f16750p) {
            z10 = this.A;
        }
        return z10;
    }

    public final void e0(boolean z10, int i10, String str, boolean z11) throws NumberFormatException {
        boolean zI0 = this.f16747m.I0();
        boolean zV = v(zI0, this.f16747m);
        boolean z12 = true;
        if (!zV && z11) {
            z12 = false;
        }
        k3.a aVar = zV ? null : this.f16751q;
        uk0 uk0Var = zI0 ? null : new uk0(this.f16747m, this.f16752r);
        xw xwVar = this.f16755u;
        zw zwVar = this.f16756v;
        l3.e0 e0Var = this.C;
        nk0 nk0Var = this.f16747m;
        d0(new AdOverlayInfoParcel(aVar, uk0Var, xwVar, zwVar, e0Var, nk0Var, z10, i10, str, nk0Var.m(), z12 ? null : this.f16757w));
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final j3.b f() {
        return this.E;
    }

    public final void f0(boolean z10, int i10, String str, String str2, boolean z11) throws NumberFormatException {
        boolean zI0 = this.f16747m.I0();
        boolean zV = v(zI0, this.f16747m);
        boolean z12 = true;
        if (!zV && z11) {
            z12 = false;
        }
        k3.a aVar = zV ? null : this.f16751q;
        uk0 uk0Var = zI0 ? null : new uk0(this.f16747m, this.f16752r);
        xw xwVar = this.f16755u;
        zw zwVar = this.f16756v;
        l3.e0 e0Var = this.C;
        nk0 nk0Var = this.f16747m;
        d0(new AdOverlayInfoParcel(aVar, uk0Var, xwVar, zwVar, e0Var, nk0Var, z10, i10, str, str2, nk0Var.m(), z12 ? null : this.f16757w));
    }

    public final void h0(String str, gy gyVar) {
        synchronized (this.f16750p) {
            List copyOnWriteArrayList = (List) this.f16749o.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.f16749o.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(gyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void i0(bm0 bm0Var) {
        this.f16754t = bm0Var;
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void j0(boolean z10) {
        synchronized (this.f16750p) {
            this.B = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void k() {
        pm pmVar = this.f16748n;
        if (pmVar != null) {
            pmVar.c(10005);
        }
        this.J = true;
        N();
        this.f16747m.destroy();
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void k0(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.f16749o.get(path);
        if (path == null || list == null) {
            m3.n1.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) k3.w.c().b(ir.f10094t6)).booleanValue() || j3.t.q().f() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            of0.f13186a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ok0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    String str = strSubstring;
                    int i10 = vk0.O;
                    j3.t.q().f().e(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) k3.w.c().b(ir.f9995k5)).booleanValue() && this.M.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) k3.w.c().b(ir.f10017m5)).intValue()) {
                m3.n1.k("Parsing gmsg query params on BG thread: ".concat(path));
                qa3.q(j3.t.r().y(uri), new tk0(this, list, path, uri), of0.f13190e);
                return;
            }
        }
        j3.t.r();
        o(m3.b2.k(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void l() {
        synchronized (this.f16750p) {
        }
        this.K++;
        N();
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void l0(int i10, int i11, boolean z10) {
        m60 m60Var = this.D;
        if (m60Var != null) {
            m60Var.h(i10, i11);
        }
        h60 h60Var = this.F;
        if (h60Var != null) {
            h60Var.j(i10, i11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void n() {
        this.K--;
        N();
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        m3.n1.k("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            k0(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f16750p) {
            if (this.f16747m.B()) {
                m3.n1.k("Blank page loaded, 1...");
                this.f16747m.f1();
                return;
            }
            this.I = true;
            bm0 bm0Var = this.f16754t;
            if (bm0Var != null) {
                bm0Var.a();
                this.f16754t = null;
            }
            N();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.f16759y = true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f16747m.X0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void q() {
        zb0 zb0Var = this.G;
        if (zb0Var != null) {
            WebView webViewP = this.f16747m.P();
            if (androidx.core.view.w.R(webViewP)) {
                u(webViewP, zb0Var, 10);
                return;
            }
            p();
            sk0 sk0Var = new sk0(this, zb0Var);
            this.N = sk0Var;
            ((View) this.f16747m).addOnAttachStateChangeListener(sk0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void r() {
        f91 f91Var = this.f16757w;
        if (f91Var != null) {
            f91Var.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final boolean s() {
        boolean z10;
        synchronized (this.f16750p) {
            z10 = this.f16760z;
        }
        return z10;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return D(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws NumberFormatException {
        m3.n1.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriA = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriA.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriA.getHost())) {
            k0(uriA);
        } else {
            if (this.f16758x && webView == this.f16747m.P()) {
                String scheme = uriA.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    k3.a aVar = this.f16751q;
                    if (aVar != null) {
                        aVar.O();
                        zb0 zb0Var = this.G;
                        if (zb0Var != null) {
                            zb0Var.Z(str);
                        }
                        this.f16751q = null;
                    }
                    f91 f91Var = this.f16757w;
                    if (f91Var != null) {
                        f91Var.r();
                        this.f16757w = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f16747m.P().willNotDraw()) {
                ze0.g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    bg bgVarL = this.f16747m.L();
                    if (bgVarL != null && bgVarL.f(uriA)) {
                        Context context = this.f16747m.getContext();
                        nk0 nk0Var = this.f16747m;
                        uriA = bgVarL.a(uriA, context, (View) nk0Var, nk0Var.i());
                    }
                } catch (cg unused) {
                    ze0.g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                j3.b bVar = this.E;
                if (bVar == null || bVar.c()) {
                    Z(new l3.i("android.intent.action.VIEW", uriA.toString(), null, null, null, null, null, null), true);
                } else {
                    this.E.b(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void t() {
        f91 f91Var = this.f16757w;
        if (f91Var != null) {
            f91Var.t();
        }
    }
}
