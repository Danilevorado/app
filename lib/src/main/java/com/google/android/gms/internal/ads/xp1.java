package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xp1 implements wq1, ip1 {

    /* renamed from: a, reason: collision with root package name */
    private final gq1 f17759a;

    /* renamed from: b, reason: collision with root package name */
    private final xq1 f17760b;

    /* renamed from: c, reason: collision with root package name */
    private final jp1 f17761c;

    /* renamed from: d, reason: collision with root package name */
    private final sp1 f17762d;

    /* renamed from: e, reason: collision with root package name */
    private final hp1 f17763e;

    /* renamed from: f, reason: collision with root package name */
    private final sq1 f17764f;

    /* renamed from: g, reason: collision with root package name */
    private final String f17765g;

    /* renamed from: m, reason: collision with root package name */
    private JSONObject f17771m;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17774p;

    /* renamed from: q, reason: collision with root package name */
    private int f17775q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f17776r;

    /* renamed from: i, reason: collision with root package name */
    private final Map f17767i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f17768j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private final Map f17769k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    private String f17770l = "{}";

    /* renamed from: n, reason: collision with root package name */
    private long f17772n = Long.MAX_VALUE;

    /* renamed from: o, reason: collision with root package name */
    private tp1 f17773o = tp1.NONE;

    /* renamed from: s, reason: collision with root package name */
    private wp1 f17777s = wp1.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    private final String f17766h = "afma-sdk-a-v22.1.0";

    xp1(gq1 gq1Var, xq1 xq1Var, jp1 jp1Var, Context context, ff0 ff0Var, sp1 sp1Var, sq1 sq1Var) {
        this.f17759a = gq1Var;
        this.f17760b = xq1Var;
        this.f17761c = jp1Var;
        this.f17763e = new hp1(context);
        this.f17765g = ff0Var.f8252m;
        this.f17762d = sp1Var;
        this.f17764f = sq1Var;
        j3.t.u().g(this);
    }

    private final synchronized JSONObject q() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.f17767i.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (lp1 lp1Var : (List) entry.getValue()) {
                if (lp1Var.e()) {
                    jSONArray.put(lp1Var.b());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void r() {
        this.f17776r = true;
        this.f17762d.c();
        this.f17759a.e(this);
        this.f17760b.c(this);
        this.f17761c.c(this);
        this.f17764f.O5(this);
        x(j3.t.q().h().p());
    }

    private final void s() {
        j3.t.q().h().K(d());
    }

    private final synchronized void t(tp1 tp1Var, boolean z10) {
        if (this.f17773o == tp1Var) {
            return;
        }
        if (o()) {
            v();
        }
        this.f17773o = tp1Var;
        if (o()) {
            w();
        }
        if (z10) {
            s();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void u(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f17774p     // Catch: java.lang.Throwable -> L3d
            if (r0 != r2) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.f17774p = r2     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L2b
            com.google.android.gms.internal.ads.zq r2 = com.google.android.gms.internal.ads.ir.A8     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.gr r0 = k3.w.c()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r0.b(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L27
            m3.x r2 = j3.t.u()     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.l()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L2b
        L27:
            r1.w()     // Catch: java.lang.Throwable -> L3d
            goto L34
        L2b:
            boolean r2 = r1.o()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L34
            r1.v()     // Catch: java.lang.Throwable -> L3d
        L34:
            if (r3 == 0) goto L3b
            r1.s()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r1)
            return
        L3b:
            monitor-exit(r1)
            return
        L3d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xp1.u(boolean, boolean):void");
    }

    private final synchronized void v() {
        tp1 tp1Var = tp1.NONE;
        int iOrdinal = this.f17773o.ordinal();
        if (iOrdinal == 1) {
            this.f17760b.a();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f17761c.a();
        }
    }

    private final synchronized void w() {
        tp1 tp1Var = tp1.NONE;
        int iOrdinal = this.f17773o.ordinal();
        if (iOrdinal == 1) {
            this.f17760b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f17761c.b();
        }
    }

    private final synchronized void x(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            u(jSONObject.optBoolean("isTestMode", false), false);
            t((tp1) Enum.valueOf(tp1.class, jSONObject.optString("gesture", "NONE")), false);
            this.f17770l = jSONObject.optString("networkExtras", "{}");
            this.f17772n = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final tp1 a() {
        return this.f17773o;
    }

    public final synchronized ab3 b(String str) {
        tf0 tf0Var;
        tf0Var = new tf0();
        if (this.f17768j.containsKey(str)) {
            tf0Var.e((lp1) this.f17768j.get(str));
        } else {
            if (!this.f17769k.containsKey(str)) {
                this.f17769k.put(str, new ArrayList());
            }
            ((List) this.f17769k.get(str)).add(tf0Var);
        }
        return tf0Var;
    }

    public final synchronized String c() {
        if (((Boolean) k3.w.c().b(ir.f10009l8)).booleanValue() && o()) {
            if (this.f17772n < j3.t.b().a() / 1000) {
                this.f17770l = "{}";
                this.f17772n = Long.MAX_VALUE;
                return "";
            }
            if (this.f17770l.equals("{}")) {
                return "";
            }
            return this.f17770l;
        }
        return "";
    }

    public final synchronized String d() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f17774p);
            jSONObject.put("gesture", this.f17773o);
            if (this.f17772n > j3.t.b().a() / 1000) {
                jSONObject.put("networkExtras", this.f17770l);
                jSONObject.put("networkExtrasExpirationSecs", this.f17772n);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject e() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("sdkVersion", this.f17766h);
            jSONObject.put("internalSdkVersion", this.f17765g);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.f17762d.a());
            if (((Boolean) k3.w.c().b(ir.J8)).booleanValue()) {
                String strM = j3.t.q().m();
                if (!TextUtils.isEmpty(strM)) {
                    jSONObject.put("plugin", strM);
                }
            }
            if (this.f17772n < j3.t.b().a() / 1000) {
                this.f17770l = "{}";
            }
            jSONObject.put("networkExtras", this.f17770l);
            jSONObject.put("adSlots", q());
            jSONObject.put("appInfo", this.f17763e.a());
            String strC = j3.t.q().h().g().c();
            if (!TextUtils.isEmpty(strC)) {
                jSONObject.put("cld", new JSONObject(strC));
            }
            if (((Boolean) k3.w.c().b(ir.B8)).booleanValue() && (jSONObject2 = this.f17771m) != null) {
                ze0.b("Server data: " + jSONObject2.toString());
                jSONObject.put("serverData", this.f17771m);
            }
            if (((Boolean) k3.w.c().b(ir.A8)).booleanValue()) {
                jSONObject.put("openAction", this.f17777s);
                jSONObject.put("gesture", this.f17773o);
            }
        } catch (JSONException e5) {
            j3.t.q().t(e5, "Inspector.toJson");
            ze0.h("Ad inspector encountered an error", e5);
        }
        return jSONObject;
    }

    public final synchronized void f(String str, lp1 lp1Var) {
        if (((Boolean) k3.w.c().b(ir.f10009l8)).booleanValue() && o()) {
            if (this.f17775q >= ((Integer) k3.w.c().b(ir.f10030n8)).intValue()) {
                ze0.g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f17767i.containsKey(str)) {
                this.f17767i.put(str, new ArrayList());
            }
            this.f17775q++;
            ((List) this.f17767i.get(str)).add(lp1Var);
            if (((Boolean) k3.w.c().b(ir.H8)).booleanValue()) {
                String strA = lp1Var.a();
                this.f17768j.put(strA, lp1Var);
                if (this.f17769k.containsKey(strA)) {
                    List list = (List) this.f17769k.get(strA);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((tf0) it.next()).e(lp1Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void g() {
        if (((Boolean) k3.w.c().b(ir.f10009l8)).booleanValue()) {
            if (((Boolean) k3.w.c().b(ir.A8)).booleanValue() && j3.t.q().h().I()) {
                r();
                return;
            }
            String strP = j3.t.q().h().p();
            if (TextUtils.isEmpty(strP)) {
                return;
            }
            try {
                if (new JSONObject(strP).optBoolean("isTestMode", false)) {
                    r();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void h(k3.w1 w1Var, wp1 wp1Var) {
        if (!o()) {
            try {
                w1Var.P3(fp2.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                ze0.g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) k3.w.c().b(ir.f10009l8)).booleanValue()) {
            this.f17777s = wp1Var;
            this.f17759a.g(w1Var, new yy(this), new ry(this.f17764f));
            return;
        } else {
            try {
                w1Var.P3(fp2.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                ze0.g("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void i(String str, long j10) {
        this.f17770l = str;
        this.f17772n = j10;
        s();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f17776r
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.r()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.f17774p
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.w()
            return
        L15:
            boolean r2 = r1.o()
            if (r2 != 0) goto L1e
            r1.v()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xp1.j(boolean):void");
    }

    public final void k(tp1 tp1Var) {
        t(tp1Var, true);
    }

    public final synchronized void l(JSONObject jSONObject) {
        this.f17771m = jSONObject;
    }

    public final void m(boolean z10) {
        if (!this.f17776r && z10) {
            r();
        }
        u(z10, true);
    }

    public final boolean n() {
        return this.f17771m != null;
    }

    public final synchronized boolean o() {
        if (((Boolean) k3.w.c().b(ir.A8)).booleanValue()) {
            return this.f17774p || j3.t.u().l();
        }
        return this.f17774p;
    }

    public final synchronized boolean p() {
        return this.f17774p;
    }
}
