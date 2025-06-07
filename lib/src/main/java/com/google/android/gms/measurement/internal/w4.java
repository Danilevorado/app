package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.dc;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w4 implements r5 {
    private static volatile w4 H;
    private volatile Boolean A;
    protected Boolean B;
    protected Boolean C;
    private volatile boolean D;
    private int E;
    final long G;

    /* renamed from: a, reason: collision with root package name */
    private final Context f20511a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20512b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20513c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20514d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20515e;

    /* renamed from: f, reason: collision with root package name */
    private final c f20516f;

    /* renamed from: g, reason: collision with root package name */
    private final h f20517g;

    /* renamed from: h, reason: collision with root package name */
    private final g4 f20518h;

    /* renamed from: i, reason: collision with root package name */
    private final s3 f20519i;

    /* renamed from: j, reason: collision with root package name */
    private final u4 f20520j;

    /* renamed from: k, reason: collision with root package name */
    private final x8 f20521k;

    /* renamed from: l, reason: collision with root package name */
    private final u9 f20522l;

    /* renamed from: m, reason: collision with root package name */
    private final n3 f20523m;

    /* renamed from: n, reason: collision with root package name */
    private final i4.e f20524n;

    /* renamed from: o, reason: collision with root package name */
    private final h7 f20525o;

    /* renamed from: p, reason: collision with root package name */
    private final v6 f20526p;

    /* renamed from: q, reason: collision with root package name */
    private final a2 f20527q;

    /* renamed from: r, reason: collision with root package name */
    private final y6 f20528r;

    /* renamed from: s, reason: collision with root package name */
    private final String f20529s;

    /* renamed from: t, reason: collision with root package name */
    private m3 f20530t;

    /* renamed from: u, reason: collision with root package name */
    private h8 f20531u;

    /* renamed from: v, reason: collision with root package name */
    private p f20532v;

    /* renamed from: w, reason: collision with root package name */
    private k3 f20533w;

    /* renamed from: y, reason: collision with root package name */
    private Boolean f20535y;

    /* renamed from: z, reason: collision with root package name */
    private long f20536z;

    /* renamed from: x, reason: collision with root package name */
    private boolean f20534x = false;
    private final AtomicInteger F = new AtomicInteger(0);

    w4(u5 u5Var) {
        q3 q3VarU;
        String str;
        Bundle bundle;
        e4.p.l(u5Var);
        Context context = u5Var.f20440a;
        c cVar = new c(context);
        this.f20516f = cVar;
        g3.f19918a = cVar;
        this.f20511a = context;
        this.f20512b = u5Var.f20441b;
        this.f20513c = u5Var.f20442c;
        this.f20514d = u5Var.f20443d;
        this.f20515e = u5Var.f20447h;
        this.A = u5Var.f20444e;
        this.f20529s = u5Var.f20449j;
        this.D = true;
        com.google.android.gms.internal.measurement.n1 n1Var = u5Var.f20446g;
        if (n1Var != null && (bundle = n1Var.f19126s) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = n1Var.f19126s.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.u6.e(context);
        i4.e eVarD = i4.h.d();
        this.f20524n = eVarD;
        Long l10 = u5Var.f20448i;
        this.G = l10 != null ? l10.longValue() : eVarD.a();
        this.f20517g = new h(this);
        g4 g4Var = new g4(this);
        g4Var.j();
        this.f20518h = g4Var;
        s3 s3Var = new s3(this);
        s3Var.j();
        this.f20519i = s3Var;
        u9 u9Var = new u9(this);
        u9Var.j();
        this.f20522l = u9Var;
        this.f20523m = new n3(new t5(u5Var, this));
        this.f20527q = new a2(this);
        h7 h7Var = new h7(this);
        h7Var.h();
        this.f20525o = h7Var;
        v6 v6Var = new v6(this);
        v6Var.h();
        this.f20526p = v6Var;
        x8 x8Var = new x8(this);
        x8Var.h();
        this.f20521k = x8Var;
        y6 y6Var = new y6(this);
        y6Var.j();
        this.f20528r = y6Var;
        u4 u4Var = new u4(this);
        u4Var.j();
        this.f20520j = u4Var;
        com.google.android.gms.internal.measurement.n1 n1Var2 = u5Var.f20446g;
        boolean z10 = n1Var2 == null || n1Var2.f19121n == 0;
        if (context.getApplicationContext() instanceof Application) {
            v6 v6VarI = I();
            if (v6VarI.f20269a.f20511a.getApplicationContext() instanceof Application) {
                Application application = (Application) v6VarI.f20269a.f20511a.getApplicationContext();
                if (v6VarI.f20478c == null) {
                    v6VarI.f20478c = new u6(v6VarI, null);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(v6VarI.f20478c);
                    application.registerActivityLifecycleCallbacks(v6VarI.f20478c);
                    q3VarU = v6VarI.f20269a.b().t();
                    str = "Registered activity lifecycle callback";
                }
            }
            u4Var.y(new v4(this, u5Var));
        }
        q3VarU = b().u();
        str = "Application context is not an Application";
        q3VarU.a(str);
        u4Var.y(new v4(this, u5Var));
    }

    public static w4 H(Context context, com.google.android.gms.internal.measurement.n1 n1Var, Long l10) {
        Bundle bundle;
        if (n1Var != null && (n1Var.f19124q == null || n1Var.f19125r == null)) {
            n1Var = new com.google.android.gms.internal.measurement.n1(n1Var.f19120m, n1Var.f19121n, n1Var.f19122o, n1Var.f19123p, null, null, n1Var.f19126s, null);
        }
        e4.p.l(context);
        e4.p.l(context.getApplicationContext());
        if (H == null) {
            synchronized (w4.class) {
                if (H == null) {
                    H = new w4(new u5(context, n1Var, l10));
                }
            }
        } else if (n1Var != null && (bundle = n1Var.f19126s) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            e4.p.l(H);
            H.A = Boolean.valueOf(n1Var.f19126s.getBoolean("dataCollectionDefaultEnabled"));
        }
        e4.p.l(H);
        return H;
    }

    static /* bridge */ /* synthetic */ void c(w4 w4Var, u5 u5Var) {
        w4Var.B().f();
        w4Var.f20517g.u();
        p pVar = new p(w4Var);
        pVar.j();
        w4Var.f20532v = pVar;
        k3 k3Var = new k3(w4Var, u5Var.f20445f);
        k3Var.h();
        w4Var.f20533w = k3Var;
        m3 m3Var = new m3(w4Var);
        m3Var.h();
        w4Var.f20530t = m3Var;
        h8 h8Var = new h8(w4Var);
        h8Var.h();
        w4Var.f20531u = h8Var;
        w4Var.f20522l.k();
        w4Var.f20518h.k();
        w4Var.f20533w.i();
        q3 q3VarS = w4Var.b().s();
        w4Var.f20517g.o();
        q3VarS.b("App measurement initialized, version", 68000L);
        w4Var.b().s().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strQ = k3Var.q();
        if (TextUtils.isEmpty(w4Var.f20512b)) {
            if (w4Var.N().T(strQ)) {
                w4Var.b().s().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                w4Var.b().s().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strQ)));
            }
        }
        w4Var.b().o().a("Debug-level message logging enabled");
        if (w4Var.E != w4Var.F.get()) {
            w4Var.b().p().c("Not all components initialized", Integer.valueOf(w4Var.E), Integer.valueOf(w4Var.F.get()));
        }
        w4Var.f20534x = true;
    }

    static final void r() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void s(p5 p5Var) {
        if (p5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void t(x3 x3Var) {
        if (x3Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!x3Var.k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(x3Var.getClass())));
        }
    }

    private static final void u(q5 q5Var) {
        if (q5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!q5Var.l()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(q5Var.getClass())));
        }
    }

    public final k3 A() {
        t(this.f20533w);
        return this.f20533w;
    }

    @Override // com.google.android.gms.measurement.internal.r5
    public final u4 B() {
        u(this.f20520j);
        return this.f20520j;
    }

    public final m3 C() {
        t(this.f20530t);
        return this.f20530t;
    }

    public final n3 D() {
        return this.f20523m;
    }

    public final s3 E() {
        s3 s3Var = this.f20519i;
        if (s3Var == null || !s3Var.l()) {
            return null;
        }
        return s3Var;
    }

    public final g4 F() {
        s(this.f20518h);
        return this.f20518h;
    }

    final u4 G() {
        return this.f20520j;
    }

    public final v6 I() {
        t(this.f20526p);
        return this.f20526p;
    }

    public final y6 J() {
        u(this.f20528r);
        return this.f20528r;
    }

    public final h7 K() {
        t(this.f20525o);
        return this.f20525o;
    }

    public final h8 L() {
        t(this.f20531u);
        return this.f20531u;
    }

    public final x8 M() {
        t(this.f20521k);
        return this.f20521k;
    }

    public final u9 N() {
        s(this.f20522l);
        return this.f20522l;
    }

    public final String O() {
        return this.f20512b;
    }

    public final String P() {
        return this.f20513c;
    }

    public final String Q() {
        return this.f20514d;
    }

    public final String R() {
        return this.f20529s;
    }

    @Override // com.google.android.gms.measurement.internal.r5
    public final Context a() {
        return this.f20511a;
    }

    @Override // com.google.android.gms.measurement.internal.r5
    public final s3 b() {
        u(this.f20519i);
        return this.f20519i;
    }

    @Override // com.google.android.gms.measurement.internal.r5
    public final i4.e d() {
        return this.f20524n;
    }

    final void e() {
        this.F.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void f(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w4.f(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    final void g() {
        this.E++;
    }

    public final void h() {
        B().f();
        u(J());
        String strQ = A().q();
        Pair pairN = F().n(strQ);
        if (!this.f20517g.z() || ((Boolean) pairN.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairN.first)) {
            b().o().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        y6 y6VarJ = J();
        y6VarJ.i();
        ConnectivityManager connectivityManager = (ConnectivityManager) y6VarJ.f20269a.f20511a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            b().u().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        u9 u9VarN = N();
        A().f20269a.f20517g.o();
        URL urlQ = u9VarN.q(68000L, strQ, (String) pairN.first, F().f19936s.a() - 1);
        if (urlQ != null) {
            y6 y6VarJ2 = J();
            x4.o oVar = new x4.o(this);
            y6VarJ2.f();
            y6VarJ2.i();
            e4.p.l(urlQ);
            e4.p.l(oVar);
            y6VarJ2.f20269a.B().w(new x6(y6VarJ2, strQ, urlQ, null, null, oVar, null));
        }
    }

    final void i(boolean z10) {
        this.A = Boolean.valueOf(z10);
    }

    public final void j(boolean z10) {
        B().f();
        this.D = z10;
    }

    protected final void k(com.google.android.gms.internal.measurement.n1 n1Var) throws ClassNotFoundException {
        x4.b bVar;
        B().f();
        x4.b bVarO = F().o();
        g4 g4VarF = F();
        w4 w4Var = g4VarF.f20269a;
        g4VarF.f();
        int i10 = 100;
        int i11 = g4VarF.m().getInt("consent_source", 100);
        h hVar = this.f20517g;
        w4 w4Var2 = hVar.f20269a;
        Boolean boolR = hVar.r("google_analytics_default_allow_ad_storage");
        h hVar2 = this.f20517g;
        w4 w4Var3 = hVar2.f20269a;
        Boolean boolR2 = hVar2.r("google_analytics_default_allow_analytics_storage");
        if (!(boolR == null && boolR2 == null) && F().u(-10)) {
            bVar = new x4.b(boolR, boolR2);
            i10 = -10;
        } else {
            if (!TextUtils.isEmpty(A().r()) && (i11 == 0 || i11 == 30 || i11 == 10 || i11 == 30 || i11 == 30 || i11 == 40)) {
                I().G(x4.b.f28259b, -10, this.G);
            } else if (TextUtils.isEmpty(A().r()) && n1Var != null && n1Var.f19126s != null && F().u(30)) {
                bVar = x4.b.a(n1Var.f19126s);
                if (!bVar.equals(x4.b.f28259b)) {
                    i10 = 30;
                }
            }
            bVar = null;
        }
        if (bVar != null) {
            I().G(bVar, i10, this.G);
            bVarO = bVar;
        }
        I().J(bVarO);
        if (F().f19922e.a() == 0) {
            b().t().b("Persisting first open", Long.valueOf(this.G));
            F().f19922e.b(this.G);
        }
        I().f20489n.c();
        if (p()) {
            if (!TextUtils.isEmpty(A().r()) || !TextUtils.isEmpty(A().p())) {
                u9 u9VarN = N();
                String strR = A().r();
                g4 g4VarF2 = F();
                g4VarF2.f();
                String string = g4VarF2.m().getString("gmp_app_id", null);
                String strP = A().p();
                g4 g4VarF3 = F();
                g4VarF3.f();
                if (u9VarN.b0(strR, string, strP, g4VarF3.m().getString("admob_app_id", null))) {
                    b().s().a("Rechecking which service to use due to a GMP App Id change");
                    g4 g4VarF4 = F();
                    g4VarF4.f();
                    Boolean boolP = g4VarF4.p();
                    SharedPreferences.Editor editorEdit = g4VarF4.m().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolP != null) {
                        g4VarF4.q(boolP);
                    }
                    C().o();
                    this.f20531u.Q();
                    this.f20531u.P();
                    F().f19922e.b(this.G);
                    F().f19924g.b(null);
                }
                g4 g4VarF5 = F();
                String strR2 = A().r();
                g4VarF5.f();
                SharedPreferences.Editor editorEdit2 = g4VarF5.m().edit();
                editorEdit2.putString("gmp_app_id", strR2);
                editorEdit2.apply();
                g4 g4VarF6 = F();
                String strP2 = A().p();
                g4VarF6.f();
                SharedPreferences.Editor editorEdit3 = g4VarF6.m().edit();
                editorEdit3.putString("admob_app_id", strP2);
                editorEdit3.apply();
            }
            if (!F().o().i(x4.a.ANALYTICS_STORAGE)) {
                F().f19924g.b(null);
            }
            I().C(F().f19924g.a());
            dc.c();
            if (this.f20517g.A(null, i3.f20012e0)) {
                try {
                    N().f20269a.f20511a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(F().f19937t.a())) {
                        b().u().a("Remote config removed with active feature rollouts");
                        F().f19937t.b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(A().r()) || !TextUtils.isEmpty(A().p())) {
                boolean zM = m();
                if (!F().s() && !this.f20517g.E()) {
                    F().r(!zM);
                }
                if (zM) {
                    I().f0();
                }
                M().f20572d.a();
                L().S(new AtomicReference());
                L().t(F().f19940w.a());
            }
        } else if (m()) {
            if (!N().S("android.permission.INTERNET")) {
                b().p().a("App is missing INTERNET permission");
            }
            if (!N().S("android.permission.ACCESS_NETWORK_STATE")) {
                b().p().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!k4.c.a(this.f20511a).g() && !this.f20517g.G()) {
                if (!u9.Y(this.f20511a)) {
                    b().p().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!u9.Z(this.f20511a, false)) {
                    b().p().a("AppMeasurementService not registered/enabled");
                }
            }
            b().p().a("Uploading is not possible. App measurement disabled");
        }
        F().f19931n.a(true);
    }

    public final boolean l() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean m() {
        return v() == 0;
    }

    public final boolean n() {
        B().f();
        return this.D;
    }

    public final boolean o() {
        return TextUtils.isEmpty(this.f20512b);
    }

    protected final boolean p() {
        if (!this.f20534x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        B().f();
        Boolean bool = this.f20535y;
        if (bool == null || this.f20536z == 0 || (!bool.booleanValue() && Math.abs(this.f20524n.b() - this.f20536z) > 1000)) {
            this.f20536z = this.f20524n.b();
            boolean z10 = true;
            Boolean boolValueOf = Boolean.valueOf(N().S("android.permission.INTERNET") && N().S("android.permission.ACCESS_NETWORK_STATE") && (k4.c.a(this.f20511a).g() || this.f20517g.G() || (u9.Y(this.f20511a) && u9.Z(this.f20511a, false))));
            this.f20535y = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!N().L(A().r(), A().p()) && TextUtils.isEmpty(A().p())) {
                    z10 = false;
                }
                this.f20535y = Boolean.valueOf(z10);
            }
        }
        return this.f20535y.booleanValue();
    }

    public final boolean q() {
        return this.f20515e;
    }

    public final int v() {
        B().f();
        if (this.f20517g.E()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        B().f();
        if (!this.D) {
            return 8;
        }
        Boolean boolP = F().p();
        if (boolP != null) {
            return boolP.booleanValue() ? 0 : 3;
        }
        h hVar = this.f20517g;
        c cVar = hVar.f20269a.f20516f;
        Boolean boolR = hVar.r("firebase_analytics_collection_enabled");
        if (boolR != null) {
            return boolR.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    public final a2 w() {
        a2 a2Var = this.f20527q;
        if (a2Var != null) {
            return a2Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Override // com.google.android.gms.measurement.internal.r5
    public final c x() {
        return this.f20516f;
    }

    public final h y() {
        return this.f20517g;
    }

    public final p z() {
        u(this.f20532v);
        return this.f20532v;
    }
}
