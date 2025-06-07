package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.be;
import com.google.android.gms.internal.measurement.cb;
import com.google.android.gms.internal.measurement.de;
import com.google.android.gms.internal.measurement.ee;
import com.google.android.gms.internal.measurement.fd;
import com.google.android.gms.measurement.internal.q4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class q4 extends c9 implements g {

    /* renamed from: d, reason: collision with root package name */
    private final Map f20289d;

    /* renamed from: e, reason: collision with root package name */
    final Map f20290e;

    /* renamed from: f, reason: collision with root package name */
    final Map f20291f;

    /* renamed from: g, reason: collision with root package name */
    final Map f20292g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f20293h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f20294i;

    /* renamed from: j, reason: collision with root package name */
    final q.e f20295j;

    /* renamed from: k, reason: collision with root package name */
    final be f20296k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f20297l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f20298m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f20299n;

    q4(n9 n9Var) {
        super(n9Var);
        this.f20289d = new q.a();
        this.f20290e = new q.a();
        this.f20291f = new q.a();
        this.f20292g = new q.a();
        this.f20293h = new q.a();
        this.f20297l = new q.a();
        this.f20298m = new q.a();
        this.f20299n = new q.a();
        this.f20294i = new q.a();
        this.f20295j = new n4(this, 20);
        this.f20296k = new o4(this);
    }

    private final com.google.android.gms.internal.measurement.v3 k(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.v3.B();
        }
        try {
            com.google.android.gms.internal.measurement.v3 v3Var = (com.google.android.gms.internal.measurement.v3) ((com.google.android.gms.internal.measurement.u3) p9.C(com.google.android.gms.internal.measurement.v3.z(), bArr)).k();
            this.f20269a.b().t().c("Parsed config. version, gmp_app_id", v3Var.M() ? Long.valueOf(v3Var.x()) : null, v3Var.L() ? v3Var.C() : null);
            return v3Var;
        } catch (com.google.android.gms.internal.measurement.d9 | RuntimeException e5) {
            this.f20269a.b().u().c("Unable to merge remote config. appId", s3.y(str), e5);
            return com.google.android.gms.internal.measurement.v3.B();
        }
    }

    private final void l(String str, com.google.android.gms.internal.measurement.u3 u3Var) {
        HashSet hashSet = new HashSet();
        q.a aVar = new q.a();
        q.a aVar2 = new q.a();
        q.a aVar3 = new q.a();
        if (u3Var != null) {
            fd.c();
            if (this.f20269a.y().A(null, i3.f20044u0)) {
                Iterator it = u3Var.y().iterator();
                while (it.hasNext()) {
                    hashSet.add(((com.google.android.gms.internal.measurement.r3) it.next()).w());
                }
            }
            for (int i10 = 0; i10 < u3Var.s(); i10++) {
                com.google.android.gms.internal.measurement.s3 s3Var = (com.google.android.gms.internal.measurement.s3) u3Var.t(i10).s();
                if (s3Var.u().isEmpty()) {
                    this.f20269a.b().u().a("EventConfig contained null event name");
                } else {
                    String strU = s3Var.u();
                    String strB = x4.q.b(s3Var.u());
                    if (!TextUtils.isEmpty(strB)) {
                        s3Var.t(strB);
                        u3Var.v(i10, s3Var);
                    }
                    if (s3Var.x() && s3Var.v()) {
                        aVar.put(strU, Boolean.TRUE);
                    }
                    if (s3Var.y() && s3Var.w()) {
                        aVar2.put(s3Var.u(), Boolean.TRUE);
                    }
                    if (s3Var.z()) {
                        if (s3Var.s() < 2 || s3Var.s() > 65535) {
                            this.f20269a.b().u().c("Invalid sampling rate. Event name, sample rate", s3Var.u(), Integer.valueOf(s3Var.s()));
                        } else {
                            aVar3.put(s3Var.u(), Integer.valueOf(s3Var.s()));
                        }
                    }
                }
            }
        }
        this.f20290e.put(str, hashSet);
        this.f20291f.put(str, aVar);
        this.f20292g.put(str, aVar2);
        this.f20294i.put(str, aVar3);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0122: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:36:0x0122 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m(java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q4.m(java.lang.String):void");
    }

    private final void n(final String str, com.google.android.gms.internal.measurement.v3 v3Var) {
        if (v3Var.v() == 0) {
            this.f20295j.e(str);
            return;
        }
        this.f20269a.b().t().b("EES programs found", Integer.valueOf(v3Var.v()));
        com.google.android.gms.internal.measurement.k5 k5Var = (com.google.android.gms.internal.measurement.k5) v3Var.G().get(0);
        try {
            com.google.android.gms.internal.measurement.c1 c1Var = new com.google.android.gms.internal.measurement.c1();
            c1Var.d("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.l4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new cb("internal.remoteConfig", new p4(this.f20153a, str));
                }
            });
            c1Var.d("internal.appMetadata", new Callable() { // from class: x4.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final q4 q4Var = this.f28263a;
                    final String str2 = str;
                    return new ee("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.k4
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            q4 q4Var2 = q4Var;
                            String str3 = str2;
                            s5 s5VarR = q4Var2.f19803b.W().R(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            q4Var2.f20269a.y().o();
                            map.put("gmp_version", 68000L);
                            if (s5VarR != null) {
                                String strG0 = s5VarR.g0();
                                if (strG0 != null) {
                                    map.put("app_version", strG0);
                                }
                                map.put("app_version_int", Long.valueOf(s5VarR.L()));
                                map.put("dynamite_version", Long.valueOf(s5VarR.U()));
                            }
                            return map;
                        }
                    });
                }
            });
            c1Var.d("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.m4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new de(this.f20174a.f20296k);
                }
            });
            c1Var.c(k5Var);
            this.f20295j.d(str, c1Var);
            this.f20269a.b().t().c("EES program loaded for appId, activities", str, Integer.valueOf(k5Var.v().v()));
            Iterator it = k5Var.v().y().iterator();
            while (it.hasNext()) {
                this.f20269a.b().t().b("EES program activity", ((com.google.android.gms.internal.measurement.i5) it.next()).w());
            }
        } catch (com.google.android.gms.internal.measurement.x1 unused) {
            this.f20269a.b().p().b("Failed to load EES program. appId", str);
        }
    }

    private static final Map o(com.google.android.gms.internal.measurement.v3 v3Var) {
        q.a aVar = new q.a();
        if (v3Var != null) {
            for (com.google.android.gms.internal.measurement.z3 z3Var : v3Var.H()) {
                aVar.put(z3Var.w(), z3Var.x());
            }
        }
        return aVar;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.c1 q(q4 q4Var, String str) throws Throwable {
        q4Var.g();
        e4.p.f(str);
        if (!q4Var.C(str)) {
            return null;
        }
        if (!q4Var.f20293h.containsKey(str) || q4Var.f20293h.get(str) == null) {
            q4Var.m(str);
        } else {
            q4Var.n(str, (com.google.android.gms.internal.measurement.v3) q4Var.f20293h.get(str));
        }
        return (com.google.android.gms.internal.measurement.c1) q4Var.f20295j.h().get(str);
    }

    final boolean A(String str) {
        f();
        com.google.android.gms.internal.measurement.v3 v3VarR = r(str);
        if (v3VarR == null) {
            return false;
        }
        return v3VarR.K();
    }

    public final boolean C(String str) {
        com.google.android.gms.internal.measurement.v3 v3Var;
        return (TextUtils.isEmpty(str) || (v3Var = (com.google.android.gms.internal.measurement.v3) this.f20293h.get(str)) == null || v3Var.v() == 0) ? false : true;
    }

    final boolean D(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_internal"));
    }

    final boolean E(String str, String str2) throws Throwable {
        Boolean bool;
        f();
        m(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f20292g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean F(String str, String str2) throws Throwable {
        Boolean bool;
        f();
        m(str);
        if (D(str) && u9.W(str2)) {
            return true;
        }
        if (G(str) && u9.X(str2)) {
            return true;
        }
        Map map = (Map) this.f20291f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean G(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_public"));
    }

    protected final boolean H(String str, byte[] bArr, String str2, String str3) throws Throwable {
        g();
        f();
        e4.p.f(str);
        com.google.android.gms.internal.measurement.u3 u3Var = (com.google.android.gms.internal.measurement.u3) k(str, bArr).s();
        if (u3Var == null) {
            return false;
        }
        l(str, u3Var);
        n(str, (com.google.android.gms.internal.measurement.v3) u3Var.k());
        this.f20293h.put(str, (com.google.android.gms.internal.measurement.v3) u3Var.k());
        this.f20297l.put(str, u3Var.w());
        this.f20298m.put(str, str2);
        this.f20299n.put(str, str3);
        this.f20289d.put(str, o((com.google.android.gms.internal.measurement.v3) u3Var.k()));
        this.f19803b.W().l(str, new ArrayList(u3Var.x()));
        try {
            u3Var.u();
            bArr = ((com.google.android.gms.internal.measurement.v3) u3Var.k()).e();
        } catch (RuntimeException e5) {
            this.f20269a.b().u().c("Unable to serialize reduced-size config. Storing full config instead. appId", s3.y(str), e5);
        }
        l lVarW = this.f19803b.W();
        e4.p.f(str);
        lVarW.f();
        lVarW.g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (lVarW.f20269a.y().A(null, i3.F0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (lVarW.P().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                lVarW.f20269a.b().p().b("Failed to update remote config (got 0). appId", s3.y(str));
            }
        } catch (SQLiteException e10) {
            lVarW.f20269a.b().p().c("Error storing remote config. appId", s3.y(str), e10);
        }
        this.f20293h.put(str, (com.google.android.gms.internal.measurement.v3) u3Var.k());
        return true;
    }

    final boolean I(String str) throws Throwable {
        f();
        m(str);
        return this.f20290e.get(str) != null && ((Set) this.f20290e.get(str)).contains("app_instance_id");
    }

    final boolean J(String str) throws Throwable {
        f();
        m(str);
        return this.f20290e.get(str) != null && (((Set) this.f20290e.get(str)).contains("device_model") || ((Set) this.f20290e.get(str)).contains("device_info"));
    }

    final boolean K(String str) throws Throwable {
        f();
        m(str);
        return this.f20290e.get(str) != null && ((Set) this.f20290e.get(str)).contains("enhanced_user_id");
    }

    final boolean L(String str) throws Throwable {
        f();
        m(str);
        return this.f20290e.get(str) != null && ((Set) this.f20290e.get(str)).contains("google_signals");
    }

    final boolean M(String str) throws Throwable {
        f();
        m(str);
        return this.f20290e.get(str) != null && (((Set) this.f20290e.get(str)).contains("os_version") || ((Set) this.f20290e.get(str)).contains("device_info"));
    }

    final boolean N(String str) throws Throwable {
        f();
        m(str);
        return this.f20290e.get(str) != null && ((Set) this.f20290e.get(str)).contains("user_id");
    }

    @Override // com.google.android.gms.measurement.internal.g
    public final String c(String str, String str2) throws Throwable {
        f();
        m(str);
        Map map = (Map) this.f20289d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.c9
    protected final boolean j() {
        return false;
    }

    final int p(String str, String str2) throws Throwable {
        Integer num;
        f();
        m(str);
        Map map = (Map) this.f20294i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    protected final com.google.android.gms.internal.measurement.v3 r(String str) {
        g();
        f();
        e4.p.f(str);
        m(str);
        return (com.google.android.gms.internal.measurement.v3) this.f20293h.get(str);
    }

    protected final String s(String str) {
        f();
        return (String) this.f20299n.get(str);
    }

    protected final String t(String str) {
        f();
        return (String) this.f20298m.get(str);
    }

    final String u(String str) throws Throwable {
        f();
        m(str);
        return (String) this.f20297l.get(str);
    }

    final Set w(String str) {
        f();
        m(str);
        return (Set) this.f20290e.get(str);
    }

    protected final void y(String str) {
        f();
        this.f20298m.put(str, null);
    }

    final void z(String str) {
        f();
        this.f20293h.remove(str);
    }
}
