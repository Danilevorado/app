package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ld;
import com.google.android.gms.internal.measurement.mc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v6 extends x3 {

    /* renamed from: c, reason: collision with root package name */
    protected u6 f20478c;

    /* renamed from: d, reason: collision with root package name */
    private x4.t f20479d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f20480e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20481f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f20482g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f20483h;

    /* renamed from: i, reason: collision with root package name */
    private x4.b f20484i;

    /* renamed from: j, reason: collision with root package name */
    private int f20485j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicLong f20486k;

    /* renamed from: l, reason: collision with root package name */
    private long f20487l;

    /* renamed from: m, reason: collision with root package name */
    private int f20488m;

    /* renamed from: n, reason: collision with root package name */
    final ba f20489n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f20490o;

    /* renamed from: p, reason: collision with root package name */
    private final t9 f20491p;

    protected v6(w4 w4Var) {
        super(w4Var);
        this.f20480e = new CopyOnWriteArraySet();
        this.f20483h = new Object();
        this.f20490o = true;
        this.f20491p = new j6(this);
        this.f20482g = new AtomicReference();
        this.f20484i = new x4.b(null, null);
        this.f20485j = 100;
        this.f20487l = -1L;
        this.f20488m = 100;
        this.f20486k = new AtomicLong(0L);
        this.f20489n = new ba(w4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(Boolean bool, boolean z10) {
        f();
        g();
        this.f20269a.b().o().b("Setting app measurement enabled (FE)", bool);
        this.f20269a.F().q(bool);
        if (z10) {
            g4 g4VarF = this.f20269a.F();
            w4 w4Var = g4VarF.f20269a;
            g4VarF.f();
            SharedPreferences.Editor editorEdit = g4VarF.m().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.f20269a.n() || !(bool == null || bool.booleanValue())) {
            P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        Long lValueOf;
        f();
        String strA = this.f20269a.F().f19930m.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(true != "true".equals(strA) ? 0L : 1L);
            }
            M("app", "_npa", lValueOf, this.f20269a.d().a());
        }
        if (!this.f20269a.m() || !this.f20490o) {
            this.f20269a.b().o().a("Updating Scion state (FE)");
            this.f20269a.L().u();
            return;
        }
        this.f20269a.b().o().a("Recording app launch after enabling measurement for the first time (FE)");
        f0();
        mc.c();
        if (this.f20269a.y().A(null, i3.f20014f0)) {
            this.f20269a.M().f20572d.a();
        }
        this.f20269a.B().y(new z5(this));
    }

    static /* bridge */ /* synthetic */ void b0(v6 v6Var, x4.b bVar, x4.b bVar2) {
        boolean z10;
        x4.a[] aVarArr = {x4.a.ANALYTICS_STORAGE, x4.a.AD_STORAGE};
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                z10 = false;
                break;
            }
            x4.a aVar = aVarArr[i10];
            if (!bVar2.i(aVar) && bVar.i(aVar)) {
                z10 = true;
                break;
            }
            i10++;
        }
        boolean zL = bVar.l(bVar2, x4.a.ANALYTICS_STORAGE, x4.a.AD_STORAGE);
        if (z10 || zL) {
            v6Var.f20269a.A().t();
        }
    }

    static /* synthetic */ void c0(v6 v6Var, x4.b bVar, int i10, long j10, boolean z10, boolean z11) {
        v6Var.f();
        v6Var.g();
        if (j10 <= v6Var.f20487l && x4.b.j(v6Var.f20488m, i10)) {
            v6Var.f20269a.b().s().b("Dropped out-of-date consent setting, proposed settings", bVar);
            return;
        }
        g4 g4VarF = v6Var.f20269a.F();
        w4 w4Var = g4VarF.f20269a;
        g4VarF.f();
        if (!g4VarF.u(i10)) {
            v6Var.f20269a.b().s().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i10));
            return;
        }
        SharedPreferences.Editor editorEdit = g4VarF.m().edit();
        editorEdit.putString("consent_settings", bVar.h());
        editorEdit.putInt("consent_source", i10);
        editorEdit.apply();
        v6Var.f20487l = j10;
        v6Var.f20488m = i10;
        v6Var.f20269a.L().r(z10);
        if (z11) {
            v6Var.f20269a.L().S(new AtomicReference());
        }
    }

    final void A(String str, String str2, long j10, Object obj) {
        this.f20269a.B().y(new c6(this, str, str2, obj, j10));
    }

    final void C(String str) {
        this.f20482g.set(str);
    }

    public final void D(Bundle bundle) {
        E(bundle, this.f20269a.d().a());
    }

    public final void E(Bundle bundle, long j10) {
        e4.p.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f20269a.b().u().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        e4.p.l(bundle2);
        x4.p.a(bundle2, "app_id", String.class, null);
        x4.p.a(bundle2, "origin", String.class, null);
        x4.p.a(bundle2, "name", String.class, null);
        x4.p.a(bundle2, "value", Object.class, null);
        x4.p.a(bundle2, "trigger_event_name", String.class, null);
        x4.p.a(bundle2, "trigger_timeout", Long.class, 0L);
        x4.p.a(bundle2, "timed_out_event_name", String.class, null);
        x4.p.a(bundle2, "timed_out_event_params", Bundle.class, null);
        x4.p.a(bundle2, "triggered_event_name", String.class, null);
        x4.p.a(bundle2, "triggered_event_params", Bundle.class, null);
        x4.p.a(bundle2, "time_to_live", Long.class, 0L);
        x4.p.a(bundle2, "expired_event_name", String.class, null);
        x4.p.a(bundle2, "expired_event_params", Bundle.class, null);
        e4.p.f(bundle2.getString("name"));
        e4.p.f(bundle2.getString("origin"));
        e4.p.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f20269a.N().n0(string) != 0) {
            this.f20269a.b().p().b("Invalid conditional user property name", this.f20269a.D().f(string));
            return;
        }
        if (this.f20269a.N().j0(string, obj) != 0) {
            this.f20269a.b().p().c("Invalid conditional user property value", this.f20269a.D().f(string), obj);
            return;
        }
        Object objN = this.f20269a.N().n(string, obj);
        if (objN == null) {
            this.f20269a.b().p().c("Unable to normalize conditional user property value", this.f20269a.D().f(string), obj);
            return;
        }
        x4.p.b(bundle2, objN);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            this.f20269a.y();
            if (j11 > 15552000000L || j11 < 1) {
                this.f20269a.b().p().c("Invalid conditional user property timeout", this.f20269a.D().f(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong("time_to_live");
        this.f20269a.y();
        if (j12 > 15552000000L || j12 < 1) {
            this.f20269a.b().p().c("Invalid conditional user property time to live", this.f20269a.D().f(string), Long.valueOf(j12));
        } else {
            this.f20269a.B().y(new e6(this, bundle2));
        }
    }

    public final void F(Bundle bundle, int i10, long j10) {
        g();
        String strG = x4.b.g(bundle);
        if (strG != null) {
            this.f20269a.b().v().b("Ignoring invalid consent setting", strG);
            this.f20269a.b().v().a("Valid consent values are 'granted', 'denied'");
        }
        G(x4.b.a(bundle), i10, j10);
    }

    public final void G(x4.b bVar, int i10, long j10) {
        x4.b bVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        x4.b bVarD = bVar;
        g();
        if (i10 != -10 && bVar.e() == null && bVar.f() == null) {
            this.f20269a.b().v().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f20483h) {
            bVar2 = this.f20484i;
            z10 = true;
            z11 = false;
            if (x4.b.j(i10, this.f20485j)) {
                boolean zK = bVarD.k(this.f20484i);
                x4.a aVar = x4.a.ANALYTICS_STORAGE;
                if (bVarD.i(aVar) && !this.f20484i.i(aVar)) {
                    z11 = true;
                }
                bVarD = bVarD.d(this.f20484i);
                this.f20484i = bVarD;
                this.f20485j = i10;
                z12 = z11;
                z11 = zK;
            } else {
                z10 = false;
                z12 = false;
            }
        }
        if (!z10) {
            this.f20269a.b().s().b("Ignoring lower-priority consent settings, proposed settings", bVarD);
            return;
        }
        long andIncrement = this.f20486k.getAndIncrement();
        if (z11) {
            this.f20482g.set(null);
            this.f20269a.B().z(new q6(this, bVarD, j10, i10, andIncrement, z12, bVar2));
            return;
        }
        r6 r6Var = new r6(this, bVarD, i10, andIncrement, z12, bVar2);
        if (i10 == 30 || i10 == -10) {
            this.f20269a.B().z(r6Var);
        } else {
            this.f20269a.B().y(r6Var);
        }
    }

    public final void H(x4.t tVar) {
        x4.t tVar2;
        f();
        g();
        if (tVar != null && tVar != (tVar2 = this.f20479d)) {
            e4.p.p(tVar2 == null, "EventInterceptor already set.");
        }
        this.f20479d = tVar;
    }

    public final void I(Boolean bool) {
        g();
        this.f20269a.B().y(new p6(this, bool));
    }

    final void J(x4.b bVar) {
        f();
        boolean z10 = (bVar.i(x4.a.ANALYTICS_STORAGE) && bVar.i(x4.a.AD_STORAGE)) || this.f20269a.L().z();
        if (z10 != this.f20269a.n()) {
            this.f20269a.j(z10);
            g4 g4VarF = this.f20269a.F();
            w4 w4Var = g4VarF.f20269a;
            g4VarF.f();
            Boolean boolValueOf = g4VarF.m().contains("measurement_enabled_from_api") ? Boolean.valueOf(g4VarF.m().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                O(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void K(String str, String str2, Object obj, boolean z10) {
        L("auto", "_ldl", obj, true, this.f20269a.d().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(java.lang.String r16, java.lang.String r17, java.lang.Object r18, boolean r19, long r20) {
        /*
            r15 = this;
            r6 = r15
            r2 = r17
            r0 = r18
            if (r16 != 0) goto La
            java.lang.String r1 = "app"
            goto Lc
        La:
            r1 = r16
        Lc:
            r3 = 6
            r4 = 0
            r5 = 24
            if (r19 == 0) goto L1e
            com.google.android.gms.measurement.internal.w4 r3 = r6.f20269a
            com.google.android.gms.measurement.internal.u9 r3 = r3.N()
            int r3 = r3.n0(r2)
        L1c:
            r11 = r3
            goto L46
        L1e:
            com.google.android.gms.measurement.internal.w4 r7 = r6.f20269a
            com.google.android.gms.measurement.internal.u9 r7 = r7.N()
            java.lang.String r8 = "user property"
            boolean r9 = r7.R(r8, r2)
            if (r9 != 0) goto L2d
        L2c:
            goto L1c
        L2d:
            java.lang.String[] r9 = x4.s.f28274a
            r10 = 0
            boolean r9 = r7.N(r8, r9, r10, r2)
            if (r9 != 0) goto L39
            r3 = 15
            goto L1c
        L39:
            com.google.android.gms.measurement.internal.w4 r9 = r7.f20269a
            r9.y()
            boolean r7 = r7.M(r8, r5, r2)
            if (r7 != 0) goto L45
            goto L2c
        L45:
            r11 = r4
        L46:
            r3 = 1
            if (r11 == 0) goto L6e
            com.google.android.gms.measurement.internal.w4 r0 = r6.f20269a
            com.google.android.gms.measurement.internal.u9 r0 = r0.N()
            com.google.android.gms.measurement.internal.w4 r1 = r6.f20269a
            r1.y()
            java.lang.String r13 = r0.p(r2, r5, r3)
            if (r2 == 0) goto L5e
            int r4 = r17.length()
        L5e:
            r14 = r4
            com.google.android.gms.measurement.internal.w4 r0 = r6.f20269a
            com.google.android.gms.measurement.internal.u9 r8 = r0.N()
            com.google.android.gms.measurement.internal.t9 r9 = r6.f20491p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.A(r9, r10, r11, r12, r13, r14)
            return
        L6e:
            if (r0 == 0) goto Lc0
            com.google.android.gms.measurement.internal.w4 r7 = r6.f20269a
            com.google.android.gms.measurement.internal.u9 r7 = r7.N()
            int r11 = r7.j0(r2, r0)
            if (r11 == 0) goto Lab
            com.google.android.gms.measurement.internal.w4 r1 = r6.f20269a
            com.google.android.gms.measurement.internal.u9 r1 = r1.N()
            com.google.android.gms.measurement.internal.w4 r7 = r6.f20269a
            r7.y()
            java.lang.String r13 = r1.p(r2, r5, r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L93
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L9b
        L93:
            java.lang.String r0 = r18.toString()
            int r4 = r0.length()
        L9b:
            r14 = r4
            com.google.android.gms.measurement.internal.w4 r0 = r6.f20269a
            com.google.android.gms.measurement.internal.u9 r8 = r0.N()
            com.google.android.gms.measurement.internal.t9 r9 = r6.f20491p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.A(r9, r10, r11, r12, r13, r14)
            return
        Lab:
            com.google.android.gms.measurement.internal.w4 r3 = r6.f20269a
            com.google.android.gms.measurement.internal.u9 r3 = r3.N()
            java.lang.Object r5 = r3.n(r2, r0)
            if (r5 == 0) goto Lbf
            r0 = r15
            r2 = r17
            r3 = r20
            r0.A(r1, r2, r3, r5)
        Lbf:
            return
        Lc0:
            r5 = 0
            r0 = r15
            r2 = r17
            r3 = r20
            r0.A(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v6.L(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            e4.p.f(r9)
            e4.p.f(r10)
            r8.f()
            r8.g()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L61
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L4f
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4f
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.w4 r10 = r8.f20269a
            com.google.android.gms.measurement.internal.g4 r10 = r10.F()
            com.google.android.gms.measurement.internal.f4 r10 = r10.f19930m
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L5b
            java.lang.String r0 = "true"
            goto L5b
        L4f:
            if (r11 != 0) goto L61
            com.google.android.gms.measurement.internal.w4 r10 = r8.f20269a
            com.google.android.gms.measurement.internal.g4 r10 = r10.F()
            com.google.android.gms.measurement.internal.f4 r10 = r10.f19930m
            java.lang.String r0 = "unset"
        L5b:
            r10.b(r0)
            r6 = r11
            r3 = r1
            goto L63
        L61:
            r3 = r10
            r6 = r11
        L63:
            com.google.android.gms.measurement.internal.w4 r10 = r8.f20269a
            boolean r10 = r10.m()
            if (r10 != 0) goto L7b
            com.google.android.gms.measurement.internal.w4 r9 = r8.f20269a
            com.google.android.gms.measurement.internal.s3 r9 = r9.b()
            com.google.android.gms.measurement.internal.q3 r9 = r9.t()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L7b:
            com.google.android.gms.measurement.internal.w4 r10 = r8.f20269a
            boolean r10 = r10.p()
            if (r10 != 0) goto L84
            return
        L84:
            com.google.android.gms.measurement.internal.q9 r10 = new com.google.android.gms.measurement.internal.q9
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.w4 r9 = r8.f20269a
            com.google.android.gms.measurement.internal.h8 r9 = r9.L()
            r9.w(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v6.M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void N(x4.u uVar) {
        g();
        e4.p.l(uVar);
        if (this.f20480e.remove(uVar)) {
            return;
        }
        this.f20269a.b().u().a("OnEventListener had not been registered");
    }

    public final int Q(String str) {
        e4.p.f(str);
        this.f20269a.y();
        return 25;
    }

    public final Boolean R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f20269a.B().p(atomicReference, 15000L, "boolean test flag value", new h6(this, atomicReference));
    }

    public final Double S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f20269a.B().p(atomicReference, 15000L, "double test flag value", new o6(this, atomicReference));
    }

    public final Integer T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f20269a.B().p(atomicReference, 15000L, "int test flag value", new n6(this, atomicReference));
    }

    public final Long U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f20269a.B().p(atomicReference, 15000L, "long test flag value", new l6(this, atomicReference));
    }

    public final String V() {
        return (String) this.f20482g.get();
    }

    public final String W() {
        a7 a7VarQ = this.f20269a.K().q();
        if (a7VarQ != null) {
            return a7VarQ.f19756b;
        }
        return null;
    }

    public final String X() {
        a7 a7VarQ = this.f20269a.K().q();
        if (a7VarQ != null) {
            return a7VarQ.f19755a;
        }
        return null;
    }

    public final String Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f20269a.B().p(atomicReference, 15000L, "String test flag value", new k6(this, atomicReference));
    }

    public final ArrayList Z(String str, String str2) {
        if (this.f20269a.B().C()) {
            this.f20269a.b().p().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f20269a.x();
        if (c.a()) {
            this.f20269a.b().p().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f20269a.B().p(atomicReference, 5000L, "get conditional user properties", new g6(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return u9.t(list);
        }
        this.f20269a.b().p().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final Map a0(String str, String str2, boolean z10) {
        q3 q3VarP;
        String str3;
        if (this.f20269a.B().C()) {
            q3VarP = this.f20269a.b().p();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            this.f20269a.x();
            if (!c.a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f20269a.B().p(atomicReference, 5000L, "get user properties", new i6(this, atomicReference, null, str, str2, z10));
                List<q9> list = (List) atomicReference.get();
                if (list == null) {
                    this.f20269a.b().p().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
                    return Collections.emptyMap();
                }
                q.a aVar = new q.a(list.size());
                for (q9 q9Var : list) {
                    Object objF = q9Var.f();
                    if (objF != null) {
                        aVar.put(q9Var.f20314n, objF);
                    }
                }
                return aVar;
            }
            q3VarP = this.f20269a.b().p();
            str3 = "Cannot get user properties from main thread";
        }
        q3VarP.a(str3);
        return Collections.emptyMap();
    }

    public final void f0() {
        f();
        g();
        if (this.f20269a.p()) {
            if (this.f20269a.y().A(null, i3.Z)) {
                h hVarY = this.f20269a.y();
                hVarY.f20269a.x();
                Boolean boolR = hVarY.r("google_analytics_deferred_deep_link_enabled");
                if (boolR != null && boolR.booleanValue()) {
                    this.f20269a.b().o().a("Deferred Deep Link feature enabled.");
                    this.f20269a.B().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.y5
                        @Override // java.lang.Runnable
                        public final void run() {
                            v6 v6Var = this.f20586m;
                            v6Var.f();
                            if (v6Var.f20269a.F().f19935r.b()) {
                                v6Var.f20269a.b().o().a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jA = v6Var.f20269a.F().f19936s.a();
                            v6Var.f20269a.F().f19936s.b(1 + jA);
                            v6Var.f20269a.y();
                            if (jA < 5) {
                                v6Var.f20269a.h();
                            } else {
                                v6Var.f20269a.b().u().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                v6Var.f20269a.F().f19935r.a(true);
                            }
                        }
                    });
                }
            }
            this.f20269a.L().O();
            this.f20490o = false;
            g4 g4VarF = this.f20269a.F();
            g4VarF.f();
            String string = g4VarF.m().getString("previous_os_version", null);
            g4VarF.f20269a.z().i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = g4VarF.m().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f20269a.z().i();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            s("auto", "_ou", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.x3
    protected final boolean l() {
        return false;
    }

    public final void m(String str, String str2, Bundle bundle) {
        long jA = this.f20269a.d().a();
        e4.p.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f20269a.B().y(new f6(this, bundle2));
    }

    public final void n() {
        if (!(this.f20269a.a().getApplicationContext() instanceof Application) || this.f20478c == null) {
            return;
        }
        ((Application) this.f20269a.a().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f20478c);
    }

    final /* synthetic */ void o(Bundle bundle) {
        if (bundle == null) {
            this.f20269a.F().f19940w.b(new Bundle());
            return;
        }
        Bundle bundleA = this.f20269a.F().f19940w.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f20269a.N().U(obj)) {
                    this.f20269a.N().A(this.f20491p, null, 27, null, null, 0);
                }
                this.f20269a.b().v().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (u9.W(str)) {
                this.f20269a.b().v().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                bundleA.remove(str);
            } else {
                u9 u9VarN = this.f20269a.N();
                this.f20269a.y();
                if (u9VarN.P("param", str, 100, obj)) {
                    this.f20269a.N().C(bundleA, str, obj);
                }
            }
        }
        this.f20269a.N();
        int iK = this.f20269a.y().k();
        if (bundleA.size() > iK) {
            int i10 = 0;
            for (String str2 : new TreeSet(bundleA.keySet())) {
                i10++;
                if (i10 > iK) {
                    bundleA.remove(str2);
                }
            }
            this.f20269a.N().A(this.f20491p, null, 26, null, null, 0);
            this.f20269a.b().v().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f20269a.F().f19940w.b(bundleA);
        this.f20269a.L().t(bundleA);
    }

    public final void p(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, this.f20269a.d().a());
    }

    public final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            this.f20269a.K().F(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f20479d != null && !u9.W(str2)) {
            z12 = false;
        }
        z(str3, str2, j10, bundle2, z11, z12, z10, null);
    }

    public final void r(String str, String str2, Bundle bundle, String str3) {
        w4.r();
        z("auto", str2, this.f20269a.d().a(), bundle, false, true, true, str3);
    }

    final void s(String str, String str2, Bundle bundle) {
        f();
        t(str, str2, this.f20269a.d().a(), bundle);
    }

    final void t(String str, String str2, long j10, Bundle bundle) {
        f();
        u(str, str2, j10, bundle, true, this.f20479d == null || u9.W(str2), true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01c5 A[PHI: r1
  0x01c5: PHI (r1v113 com.google.android.gms.measurement.internal.a7) = (r1v13 com.google.android.gms.measurement.internal.a7), (r1v117 com.google.android.gms.measurement.internal.a7) binds: [B:70:0x01c3, B:62:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c7 A[PHI: r1
  0x01c7: PHI (r1v14 com.google.android.gms.measurement.internal.a7) = 
  (r1v13 com.google.android.gms.measurement.internal.a7)
  (r1v13 com.google.android.gms.measurement.internal.a7)
  (r1v117 com.google.android.gms.measurement.internal.a7)
  (r1v117 com.google.android.gms.measurement.internal.a7)
 binds: [B:69:0x01c1, B:70:0x01c3, B:61:0x01a3, B:62:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void u(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v6.u(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void v(x4.u uVar) {
        g();
        e4.p.l(uVar);
        if (this.f20480e.add(uVar)) {
            return;
        }
        this.f20269a.b().u().a("OnEventListener already registered");
    }

    public final void w(long j10) {
        this.f20482g.set(null);
        this.f20269a.B().y(new d6(this, j10));
    }

    final void y(long j10, boolean z10) {
        f();
        g();
        this.f20269a.b().o().a("Resetting analytics data (FE)");
        x8 x8VarM = this.f20269a.M();
        x8VarM.f();
        x8VarM.f20573e.a();
        ld.c();
        if (this.f20269a.y().A(null, i3.B0)) {
            this.f20269a.A().t();
        }
        boolean zM = this.f20269a.m();
        g4 g4VarF = this.f20269a.F();
        g4VarF.f19922e.b(j10);
        if (!TextUtils.isEmpty(g4VarF.f20269a.F().f19937t.a())) {
            g4VarF.f19937t.b(null);
        }
        mc.c();
        h hVarY = g4VarF.f20269a.y();
        h3 h3Var = i3.f20014f0;
        if (hVarY.A(null, h3Var)) {
            g4VarF.f19932o.b(0L);
        }
        if (!g4VarF.f20269a.y().E()) {
            g4VarF.r(!zM);
        }
        g4VarF.f19938u.b(null);
        g4VarF.f19939v.b(0L);
        g4VarF.f19940w.b(null);
        if (z10) {
            this.f20269a.L().o();
        }
        mc.c();
        if (this.f20269a.y().A(null, h3Var)) {
            this.f20269a.M().f20572d.a();
        }
        this.f20490o = !zM;
    }

    protected final void z(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.f20269a.B().y(new b6(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }
}
