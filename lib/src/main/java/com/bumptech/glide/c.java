package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import g2.p;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v1.a;
import v1.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private t1.k f5341c;

    /* renamed from: d, reason: collision with root package name */
    private u1.d f5342d;

    /* renamed from: e, reason: collision with root package name */
    private u1.b f5343e;

    /* renamed from: f, reason: collision with root package name */
    private v1.h f5344f;

    /* renamed from: g, reason: collision with root package name */
    private w1.a f5345g;

    /* renamed from: h, reason: collision with root package name */
    private w1.a f5346h;

    /* renamed from: i, reason: collision with root package name */
    private a.InterfaceC0197a f5347i;

    /* renamed from: j, reason: collision with root package name */
    private v1.i f5348j;

    /* renamed from: k, reason: collision with root package name */
    private g2.d f5349k;

    /* renamed from: n, reason: collision with root package name */
    private p.b f5352n;

    /* renamed from: o, reason: collision with root package name */
    private w1.a f5353o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5354p;

    /* renamed from: q, reason: collision with root package name */
    private List f5355q;

    /* renamed from: a, reason: collision with root package name */
    private final Map f5339a = new q.a();

    /* renamed from: b, reason: collision with root package name */
    private final e.a f5340b = new e.a();

    /* renamed from: l, reason: collision with root package name */
    private int f5350l = 4;

    /* renamed from: m, reason: collision with root package name */
    private b.a f5351m = new a();

    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        public j2.f build() {
            return new j2.f();
        }
    }

    static final class b {
    }

    /* renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    static final class C0089c {
    }

    public static final class d {
    }

    public static final class e {
    }

    com.bumptech.glide.b a(Context context) {
        if (this.f5345g == null) {
            this.f5345g = w1.a.h();
        }
        if (this.f5346h == null) {
            this.f5346h = w1.a.e();
        }
        if (this.f5353o == null) {
            this.f5353o = w1.a.c();
        }
        if (this.f5348j == null) {
            this.f5348j = new i.a(context).a();
        }
        if (this.f5349k == null) {
            this.f5349k = new g2.f();
        }
        if (this.f5342d == null) {
            int iB = this.f5348j.b();
            if (iB > 0) {
                this.f5342d = new u1.j(iB);
            } else {
                this.f5342d = new u1.e();
            }
        }
        if (this.f5343e == null) {
            this.f5343e = new u1.i(this.f5348j.a());
        }
        if (this.f5344f == null) {
            this.f5344f = new v1.g(this.f5348j.d());
        }
        if (this.f5347i == null) {
            this.f5347i = new v1.f(context);
        }
        if (this.f5341c == null) {
            this.f5341c = new t1.k(this.f5344f, this.f5347i, this.f5346h, this.f5345g, w1.a.i(), this.f5353o, this.f5354p);
        }
        List list = this.f5355q;
        this.f5355q = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        com.bumptech.glide.e eVarB = this.f5340b.b();
        return new com.bumptech.glide.b(context, this.f5341c, this.f5344f, this.f5342d, this.f5343e, new p(this.f5352n, eVarB), this.f5349k, this.f5350l, this.f5351m, this.f5339a, this.f5355q, eVarB);
    }

    void b(p.b bVar) {
        this.f5352n = bVar;
    }
}
