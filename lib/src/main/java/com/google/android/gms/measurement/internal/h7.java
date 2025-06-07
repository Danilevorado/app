package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class h7 extends x3 {

    /* renamed from: c, reason: collision with root package name */
    private volatile a7 f19976c;

    /* renamed from: d, reason: collision with root package name */
    private volatile a7 f19977d;

    /* renamed from: e, reason: collision with root package name */
    protected a7 f19978e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f19979f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f19980g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f19981h;

    /* renamed from: i, reason: collision with root package name */
    private volatile a7 f19982i;

    /* renamed from: j, reason: collision with root package name */
    private a7 f19983j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19984k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f19985l;

    /* renamed from: m, reason: collision with root package name */
    private a7 f19986m;

    /* renamed from: n, reason: collision with root package name */
    private String f19987n;

    public h7(w4 w4Var) {
        super(w4Var);
        this.f19985l = new Object();
        this.f19979f = new ConcurrentHashMap();
    }

    private final a7 H(Activity activity) {
        e4.p.l(activity);
        a7 a7Var = (a7) this.f19979f.get(activity);
        if (a7Var == null) {
            a7 a7Var2 = new a7(null, s(activity.getClass(), "Activity"), this.f20269a.N().r0());
            this.f19979f.put(activity, a7Var2);
            a7Var = a7Var2;
        }
        return this.f19982i != null ? this.f19982i : a7Var;
    }

    private final void m(Activity activity, a7 a7Var, boolean z10) {
        a7 a7Var2;
        a7 a7Var3 = this.f19976c == null ? this.f19977d : this.f19976c;
        if (a7Var.f19756b == null) {
            a7Var2 = new a7(a7Var.f19755a, activity != null ? s(activity.getClass(), "Activity") : null, a7Var.f19757c, a7Var.f19759e, a7Var.f19760f);
        } else {
            a7Var2 = a7Var;
        }
        this.f19977d = this.f19976c;
        this.f19976c = a7Var2;
        this.f20269a.B().y(new c7(this, a7Var2, a7Var3, this.f20269a.d().b(), z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(com.google.android.gms.measurement.internal.a7 r16, com.google.android.gms.measurement.internal.a7 r17, long r18, boolean r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.h7.n(com.google.android.gms.measurement.internal.a7, com.google.android.gms.measurement.internal.a7, long, boolean, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(a7 a7Var, boolean z10, long j10) {
        this.f20269a.w().l(this.f20269a.d().b());
        if (!this.f20269a.M().f20573e.d(a7Var != null && a7Var.f19758d, z10, j10) || a7Var == null) {
            return;
        }
        a7Var.f19758d = false;
    }

    static /* bridge */ /* synthetic */ void v(h7 h7Var, Bundle bundle, a7 a7Var, a7 a7Var2, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        h7Var.n(a7Var, a7Var2, j10, true, h7Var.f20269a.N().v0(null, "screen_view", bundle, null, false));
    }

    public final void A(Activity activity) {
        synchronized (this.f19985l) {
            this.f19984k = false;
            this.f19981h = true;
        }
        long jB = this.f20269a.d().b();
        if (!this.f20269a.y().D()) {
            this.f19976c = null;
            this.f20269a.B().y(new e7(this, jB));
        } else {
            a7 a7VarH = H(activity);
            this.f19977d = this.f19976c;
            this.f19976c = null;
            this.f20269a.B().y(new f7(this, a7VarH, jB));
        }
    }

    public final void C(Activity activity) {
        synchronized (this.f19985l) {
            this.f19984k = true;
            if (activity != this.f19980g) {
                synchronized (this.f19985l) {
                    this.f19980g = activity;
                    this.f19981h = false;
                }
                if (this.f20269a.y().D()) {
                    this.f19982i = null;
                    this.f20269a.B().y(new g7(this));
                }
            }
        }
        if (!this.f20269a.y().D()) {
            this.f19976c = this.f19982i;
            this.f20269a.B().y(new d7(this));
        } else {
            m(activity, H(activity), false);
            a2 a2VarW = this.f20269a.w();
            a2VarW.f20269a.B().y(new z0(a2VarW, a2VarW.f20269a.d().b()));
        }
    }

    public final void D(Activity activity, Bundle bundle) {
        a7 a7Var;
        if (!this.f20269a.y().D() || bundle == null || (a7Var = (a7) this.f19979f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", a7Var.f19757c);
        bundle2.putString("name", a7Var.f19755a);
        bundle2.putString("referrer_name", a7Var.f19756b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r5.length() <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r6.length() <= 100) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.w4 r0 = r3.f20269a
            com.google.android.gms.measurement.internal.h r0 = r0.y()
            boolean r0 = r0.D()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.w4 r4 = r3.f20269a
            com.google.android.gms.measurement.internal.s3 r4 = r4.b()
            com.google.android.gms.measurement.internal.q3 r4 = r4.v()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.a(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.a7 r0 = r3.f19976c
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.w4 r4 = r3.f20269a
            com.google.android.gms.measurement.internal.s3 r4 = r4.b()
            com.google.android.gms.measurement.internal.q3 r4 = r4.v()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.a(r5)
            return
        L30:
            java.util.Map r1 = r3.f19979f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.w4 r4 = r3.f20269a
            com.google.android.gms.measurement.internal.s3 r4 = r4.b()
            com.google.android.gms.measurement.internal.q3 r4 = r4.v()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.a(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.s(r6, r1)
        L54:
            java.lang.String r1 = r0.f19756b
            boolean r1 = x4.y.a(r1, r6)
            java.lang.String r0 = r0.f19755a
            boolean r0 = x4.y.a(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.w4 r4 = r3.f20269a
            com.google.android.gms.measurement.internal.s3 r4 = r4.b()
            com.google.android.gms.measurement.internal.q3 r4 = r4.v()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.a(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.google.android.gms.measurement.internal.w4 r1 = r3.f20269a
            r1.y()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.w4 r4 = r3.f20269a
            com.google.android.gms.measurement.internal.s3 r4 = r4.b()
            com.google.android.gms.measurement.internal.q3 r4 = r4.v()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.google.android.gms.measurement.internal.w4 r1 = r3.f20269a
            r1.y()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.w4 r4 = r3.f20269a
            com.google.android.gms.measurement.internal.s3 r4 = r4.b()
            com.google.android.gms.measurement.internal.q3 r4 = r4.v()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.w4 r0 = r3.f20269a
            com.google.android.gms.measurement.internal.s3 r0 = r0.b()
            com.google.android.gms.measurement.internal.q3 r0 = r0.t()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.c(r2, r1, r6)
            com.google.android.gms.measurement.internal.a7 r0 = new com.google.android.gms.measurement.internal.a7
            com.google.android.gms.measurement.internal.w4 r1 = r3.f20269a
            com.google.android.gms.measurement.internal.u9 r1 = r1.N()
            long r1 = r1.r0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f19979f
            r5.put(r4, r0)
            r5 = 1
            r3.m(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.h7.E(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r2 > 100) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r4 > 100) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.h7.F(android.os.Bundle, long):void");
    }

    public final void G(String str, a7 a7Var) {
        f();
        synchronized (this) {
            String str2 = this.f19987n;
            if (str2 == null || str2.equals(str) || a7Var != null) {
                this.f19987n = str;
                this.f19986m = a7Var;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.x3
    protected final boolean l() {
        return false;
    }

    public final a7 q() {
        return this.f19976c;
    }

    public final a7 r(boolean z10) {
        g();
        f();
        if (!z10) {
            return this.f19978e;
        }
        a7 a7Var = this.f19978e;
        return a7Var != null ? a7Var : this.f19983j;
    }

    final String s(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str2.length();
        this.f20269a.y();
        if (length2 <= 100) {
            return str2;
        }
        this.f20269a.y();
        return str2.substring(0, 100);
    }

    public final void y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f20269a.y().D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f19979f.put(activity, new a7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void z(Activity activity) {
        synchronized (this.f19985l) {
            if (activity == this.f19980g) {
                this.f19980g = null;
            }
        }
        if (this.f20269a.y().D()) {
            this.f19979f.remove(activity);
        }
    }
}
