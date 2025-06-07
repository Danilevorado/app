package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class qt2 implements ot2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14481a;

    /* renamed from: o, reason: collision with root package name */
    private final int f14495o;

    /* renamed from: b, reason: collision with root package name */
    private long f14482b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f14483c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14484d = false;

    /* renamed from: p, reason: collision with root package name */
    private int f14496p = 2;

    /* renamed from: q, reason: collision with root package name */
    private int f14497q = 2;

    /* renamed from: e, reason: collision with root package name */
    private int f14485e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f14486f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f14487g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f14488h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f14489i = "";

    /* renamed from: j, reason: collision with root package name */
    private String f14490j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f14491k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f14492l = "";

    /* renamed from: m, reason: collision with root package name */
    private boolean f14493m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14494n = false;

    qt2(Context context, int i10) {
        this.f14481a = context;
        this.f14495o = i10;
    }

    public final synchronized qt2 A(String str) {
        this.f14489i = str;
        return this;
    }

    public final synchronized qt2 B(boolean z10) {
        this.f14484d = z10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ot2
    public final /* bridge */ /* synthetic */ ot2 B0(boolean z10) {
        B(z10);
        return this;
    }

    public final synchronized qt2 C(Throwable th) {
        if (((Boolean) k3.w.c().b(ir.f9965h8)).booleanValue()) {
            this.f14491k = b80.f(th);
            this.f14490j = (String) w33.c(t23.c('\n')).d(b80.e(th)).iterator().next();
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ot2
    public final /* bridge */ /* synthetic */ ot2 C0(tn2 tn2Var) {
        x(tn2Var);
        return this;
    }

    public final synchronized qt2 D() {
        Configuration configuration;
        this.f14485e = j3.t.s().k(this.f14481a);
        Resources resources = this.f14481a.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f14497q = i10;
        this.f14482b = j3.t.b().b();
        this.f14494n = true;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ot2
    public final /* bridge */ /* synthetic */ ot2 D0(Throwable th) {
        C(th);
        return this;
    }

    public final synchronized qt2 E() {
        this.f14483c = j3.t.b().b();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ot2
    public final /* bridge */ /* synthetic */ ot2 W(String str) {
        z(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ot2
    public final /* bridge */ /* synthetic */ ot2 Y(String str) {
        y(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ot2
    public final /* bridge */ /* synthetic */ ot2 a(int i10) {
        n(i10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ot2
    public final /* bridge */ /* synthetic */ ot2 g() {
        D();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ot2
    public final /* bridge */ /* synthetic */ ot2 i() {
        E();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ot2
    public final synchronized boolean j() {
        return this.f14494n;
    }

    @Override // com.google.android.gms.internal.ads.ot2
    public final boolean k() {
        return !TextUtils.isEmpty(this.f14488h);
    }

    @Override // com.google.android.gms.internal.ads.ot2
    public final synchronized tt2 l() {
        st2 st2Var = null;
        if (this.f14493m) {
            return null;
        }
        this.f14493m = true;
        if (!this.f14494n) {
            D();
        }
        if (this.f14483c < 0) {
            E();
        }
        return new tt2(this, st2Var);
    }

    public final synchronized qt2 n(int i10) {
        this.f14496p = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ot2
    public final /* bridge */ /* synthetic */ ot2 s(String str) {
        A(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ot2
    public final /* bridge */ /* synthetic */ ot2 u(k3.w2 w2Var) {
        w(w2Var);
        return this;
    }

    public final synchronized qt2 w(k3.w2 w2Var) {
        IBinder iBinder = w2Var.f24792q;
        if (iBinder == null) {
            return this;
        }
        d11 d11Var = (d11) iBinder;
        String strK = d11Var.k();
        if (!TextUtils.isEmpty(strK)) {
            this.f14486f = strK;
        }
        String strI = d11Var.i();
        if (!TextUtils.isEmpty(strI)) {
            this.f14487g = strI;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r2.f14487g = r0.f9241c0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.qt2 x(com.google.android.gms.internal.ads.tn2 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.ln2 r0 = r3.f15924b     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.f11674b     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.ln2 r0 = r3.f15924b     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.f11674b     // Catch: java.lang.Throwable -> L31
            r2.f14486f = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.f15923a     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.hn2 r0 = (com.google.android.gms.internal.ads.hn2) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.f9241c0     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.f9241c0     // Catch: java.lang.Throwable -> L31
            r2.f14487g = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qt2.x(com.google.android.gms.internal.ads.tn2):com.google.android.gms.internal.ads.qt2");
    }

    public final synchronized qt2 y(String str) {
        if (((Boolean) k3.w.c().b(ir.f9965h8)).booleanValue()) {
            this.f14492l = str;
        }
        return this;
    }

    public final synchronized qt2 z(String str) {
        this.f14488h = str;
        return this;
    }
}
