package w9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f28031a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28032b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28033c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28034d;

    /* renamed from: e, reason: collision with root package name */
    private final String f28035e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f28036f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f28037g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f28038h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f28039i;

    /* renamed from: j, reason: collision with root package name */
    private final String f28040j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f28041k;

    /* renamed from: l, reason: collision with root package name */
    private final String f28042l;

    /* renamed from: m, reason: collision with root package name */
    private final String f28043m;

    /* renamed from: n, reason: collision with root package name */
    private final String f28044n;

    /* renamed from: o, reason: collision with root package name */
    private final int f28045o;

    /* renamed from: p, reason: collision with root package name */
    private final int f28046p;

    /* renamed from: q, reason: collision with root package name */
    private final int f28047q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f28048r;

    /* renamed from: s, reason: collision with root package name */
    private final int f28049s;

    /* renamed from: t, reason: collision with root package name */
    private final int f28050t;

    /* renamed from: u, reason: collision with root package name */
    private final int f28051u;

    /* renamed from: v, reason: collision with root package name */
    private final List f28052v;

    /* renamed from: w, reason: collision with root package name */
    private final String f28053w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f28054x;

    /* renamed from: y, reason: collision with root package name */
    private final String f28055y;

    /* renamed from: z, reason: collision with root package name */
    private final String f28056z;

    public d(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        this.f28052v = arrayList;
        this.f28031a = bundle;
        this.f28034d = g8.e.C(bundle);
        this.f28035e = g8.e.D(bundle);
        this.f28036f = g8.e.d(bundle);
        this.f28037g = g8.e.b(bundle);
        this.f28038h = g8.e.r(bundle);
        this.f28039i = g8.e.u(bundle);
        this.f28040j = g8.e.G(bundle);
        this.f28041k = g8.e.I(bundle);
        String strY = g8.e.y(bundle);
        this.f28033c = strY;
        this.f28032b = g8.e.q(bundle);
        this.f28042l = strY;
        this.f28046p = g8.e.B(bundle);
        this.f28049s = g8.e.J(bundle);
        this.f28047q = g8.e.m(bundle);
        this.f28048r = g8.e.a(bundle);
        this.f28055y = g8.e.o(bundle);
        this.f28056z = g8.e.p(bundle);
        this.f28044n = g8.e.n(bundle);
        this.f28043m = g8.e.t(bundle);
        this.f28045o = g8.e.F(bundle);
        this.f28050t = g8.e.w(bundle);
        this.f28051u = g8.e.v(bundle);
        this.f28053w = g8.e.z(bundle);
        this.f28054x = g8.e.c(bundle);
        arrayList.addAll(g8.e.l(bundle));
    }

    public List a() {
        return this.f28052v;
    }

    public String b() {
        return this.f28044n;
    }

    public String c() {
        return this.f28055y;
    }

    public String d() {
        return this.f28056z;
    }

    public String e() {
        return this.f28032b;
    }

    public Integer f() {
        return this.f28038h;
    }

    public String g() {
        return this.f28043m;
    }

    public Integer h() {
        return this.f28039i;
    }

    public int i() {
        return this.f28051u;
    }

    public int j() {
        return this.f28050t;
    }

    public String k() {
        return this.f28033c;
    }

    public int l() {
        return this.f28046p;
    }

    public long m() {
        String str = this.f28035e;
        if (str != null) {
            return k9.b.j(str, true).getLong("uid", -1L);
        }
        return -1L;
    }

    public int n() {
        return this.f28045o;
    }

    public String o() {
        return this.f28040j;
    }

    public String p() {
        return this.f28053w;
    }

    public String q() {
        return this.f28042l;
    }

    public boolean r() {
        return this.f28041k;
    }

    public int s() {
        return this.f28049s;
    }

    public boolean t() {
        return this.f28054x;
    }

    public boolean u() {
        return this.f28036f;
    }

    public Bundle v() {
        return this.f28031a;
    }

    public JSONObject w() {
        return g8.e.h(this.f28031a);
    }
}
