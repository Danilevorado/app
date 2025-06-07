package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class s5 {
    private long A;
    private String B;
    private boolean C;
    private long D;
    private long E;

    /* renamed from: a, reason: collision with root package name */
    private final w4 f20366a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20367b;

    /* renamed from: c, reason: collision with root package name */
    private String f20368c;

    /* renamed from: d, reason: collision with root package name */
    private String f20369d;

    /* renamed from: e, reason: collision with root package name */
    private String f20370e;

    /* renamed from: f, reason: collision with root package name */
    private String f20371f;

    /* renamed from: g, reason: collision with root package name */
    private long f20372g;

    /* renamed from: h, reason: collision with root package name */
    private long f20373h;

    /* renamed from: i, reason: collision with root package name */
    private long f20374i;

    /* renamed from: j, reason: collision with root package name */
    private String f20375j;

    /* renamed from: k, reason: collision with root package name */
    private long f20376k;

    /* renamed from: l, reason: collision with root package name */
    private String f20377l;

    /* renamed from: m, reason: collision with root package name */
    private long f20378m;

    /* renamed from: n, reason: collision with root package name */
    private long f20379n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20380o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20381p;

    /* renamed from: q, reason: collision with root package name */
    private String f20382q;

    /* renamed from: r, reason: collision with root package name */
    private Boolean f20383r;

    /* renamed from: s, reason: collision with root package name */
    private long f20384s;

    /* renamed from: t, reason: collision with root package name */
    private List f20385t;

    /* renamed from: u, reason: collision with root package name */
    private String f20386u;

    /* renamed from: v, reason: collision with root package name */
    private long f20387v;

    /* renamed from: w, reason: collision with root package name */
    private long f20388w;

    /* renamed from: x, reason: collision with root package name */
    private long f20389x;

    /* renamed from: y, reason: collision with root package name */
    private long f20390y;

    /* renamed from: z, reason: collision with root package name */
    private long f20391z;

    s5(w4 w4Var, String str) {
        e4.p.l(w4Var);
        e4.p.f(str);
        this.f20366a = w4Var;
        this.f20367b = str;
        w4Var.B().f();
    }

    public final long A() {
        this.f20366a.B().f();
        return 0L;
    }

    public final void B(long j10) {
        e4.p.a(j10 >= 0);
        this.f20366a.B().f();
        this.C |= this.f20372g != j10;
        this.f20372g = j10;
    }

    public final void C(long j10) {
        this.f20366a.B().f();
        this.C |= this.f20373h != j10;
        this.f20373h = j10;
    }

    public final void D(boolean z10) {
        this.f20366a.B().f();
        this.C |= this.f20380o != z10;
        this.f20380o = z10;
    }

    public final void E(Boolean bool) {
        this.f20366a.B().f();
        this.C |= !x4.n.a(this.f20383r, bool);
        this.f20383r = bool;
    }

    public final void F(String str) {
        this.f20366a.B().f();
        this.C |= !x4.n.a(this.f20370e, str);
        this.f20370e = str;
    }

    public final void G(List list) {
        this.f20366a.B().f();
        if (x4.n.a(this.f20385t, list)) {
            return;
        }
        this.C = true;
        this.f20385t = list != null ? new ArrayList(list) : null;
    }

    public final void H(String str) {
        this.f20366a.B().f();
        this.C |= !x4.n.a(this.f20386u, str);
        this.f20386u = str;
    }

    public final boolean I() {
        this.f20366a.B().f();
        return this.f20381p;
    }

    public final boolean J() {
        this.f20366a.B().f();
        return this.f20380o;
    }

    public final boolean K() {
        this.f20366a.B().f();
        return this.C;
    }

    public final long L() {
        this.f20366a.B().f();
        return this.f20376k;
    }

    public final long M() {
        this.f20366a.B().f();
        return this.D;
    }

    public final long N() {
        this.f20366a.B().f();
        return this.f20390y;
    }

    public final long O() {
        this.f20366a.B().f();
        return this.f20391z;
    }

    public final long P() {
        this.f20366a.B().f();
        return this.f20389x;
    }

    public final long Q() {
        this.f20366a.B().f();
        return this.f20388w;
    }

    public final long R() {
        this.f20366a.B().f();
        return this.A;
    }

    public final long S() {
        this.f20366a.B().f();
        return this.f20387v;
    }

    public final long T() {
        this.f20366a.B().f();
        return this.f20379n;
    }

    public final long U() {
        this.f20366a.B().f();
        return this.f20384s;
    }

    public final long V() {
        this.f20366a.B().f();
        return this.E;
    }

    public final long W() {
        this.f20366a.B().f();
        return this.f20378m;
    }

    public final long X() {
        this.f20366a.B().f();
        return this.f20374i;
    }

    public final long Y() {
        this.f20366a.B().f();
        return this.f20372g;
    }

    public final long Z() {
        this.f20366a.B().f();
        return this.f20373h;
    }

    public final String a() {
        this.f20366a.B().f();
        return this.f20370e;
    }

    public final Boolean a0() {
        this.f20366a.B().f();
        return this.f20383r;
    }

    public final String b() {
        this.f20366a.B().f();
        return this.f20386u;
    }

    public final String b0() {
        this.f20366a.B().f();
        return this.f20382q;
    }

    public final List c() {
        this.f20366a.B().f();
        return this.f20385t;
    }

    public final String c0() {
        this.f20366a.B().f();
        String str = this.B;
        y(null);
        return str;
    }

    public final void d() {
        this.f20366a.B().f();
        this.C = false;
    }

    public final String d0() {
        this.f20366a.B().f();
        return this.f20367b;
    }

    public final void e() {
        this.f20366a.B().f();
        long j10 = this.f20372g + 1;
        if (j10 > 2147483647L) {
            this.f20366a.b().u().b("Bundle index overflow. appId", s3.y(this.f20367b));
            j10 = 0;
        }
        this.C = true;
        this.f20372g = j10;
    }

    public final String e0() {
        this.f20366a.B().f();
        return this.f20368c;
    }

    public final void f(String str) {
        this.f20366a.B().f();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ x4.n.a(this.f20382q, str);
        this.f20382q = str;
    }

    public final String f0() {
        this.f20366a.B().f();
        return this.f20377l;
    }

    public final void g(boolean z10) {
        this.f20366a.B().f();
        this.C |= this.f20381p != z10;
        this.f20381p = z10;
    }

    public final String g0() {
        this.f20366a.B().f();
        return this.f20375j;
    }

    public final void h(String str) {
        this.f20366a.B().f();
        this.C |= !x4.n.a(this.f20368c, str);
        this.f20368c = str;
    }

    public final String h0() {
        this.f20366a.B().f();
        return this.f20371f;
    }

    public final void i(String str) {
        this.f20366a.B().f();
        this.C |= !x4.n.a(this.f20377l, str);
        this.f20377l = str;
    }

    public final String i0() {
        this.f20366a.B().f();
        return this.f20369d;
    }

    public final void j(String str) {
        this.f20366a.B().f();
        this.C |= !x4.n.a(this.f20375j, str);
        this.f20375j = str;
    }

    public final String j0() {
        this.f20366a.B().f();
        return this.B;
    }

    public final void k(long j10) {
        this.f20366a.B().f();
        this.C |= this.f20376k != j10;
        this.f20376k = j10;
    }

    public final void l(long j10) {
        this.f20366a.B().f();
        this.C |= this.D != j10;
        this.D = j10;
    }

    public final void m(long j10) {
        this.f20366a.B().f();
        this.C |= this.f20390y != j10;
        this.f20390y = j10;
    }

    public final void n(long j10) {
        this.f20366a.B().f();
        this.C |= this.f20391z != j10;
        this.f20391z = j10;
    }

    public final void o(long j10) {
        this.f20366a.B().f();
        this.C |= this.f20389x != j10;
        this.f20389x = j10;
    }

    public final void p(long j10) {
        this.f20366a.B().f();
        this.C |= this.f20388w != j10;
        this.f20388w = j10;
    }

    public final void q(long j10) {
        this.f20366a.B().f();
        this.C |= this.A != j10;
        this.A = j10;
    }

    public final void r(long j10) {
        this.f20366a.B().f();
        this.C |= this.f20387v != j10;
        this.f20387v = j10;
    }

    public final void s(long j10) {
        this.f20366a.B().f();
        this.C |= this.f20379n != j10;
        this.f20379n = j10;
    }

    public final void t(long j10) {
        this.f20366a.B().f();
        this.C |= this.f20384s != j10;
        this.f20384s = j10;
    }

    public final void u(long j10) {
        this.f20366a.B().f();
        this.C |= this.E != j10;
        this.E = j10;
    }

    public final void v(String str) {
        this.f20366a.B().f();
        this.C |= !x4.n.a(this.f20371f, str);
        this.f20371f = str;
    }

    public final void w(String str) {
        this.f20366a.B().f();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ x4.n.a(this.f20369d, str);
        this.f20369d = str;
    }

    public final void x(long j10) {
        this.f20366a.B().f();
        this.C |= this.f20378m != j10;
        this.f20378m = j10;
    }

    public final void y(String str) {
        this.f20366a.B().f();
        this.C |= !x4.n.a(this.B, str);
        this.B = str;
    }

    public final void z(long j10) {
        this.f20366a.B().f();
        this.C |= this.f20374i != j10;
        this.f20374i = j10;
    }
}
