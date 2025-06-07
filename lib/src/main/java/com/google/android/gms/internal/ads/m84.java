package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
final class m84 {

    /* renamed from: a, reason: collision with root package name */
    private final xb4 f12003a;

    /* renamed from: e, reason: collision with root package name */
    private final l84 f12007e;

    /* renamed from: h, reason: collision with root package name */
    private final i94 f12010h;

    /* renamed from: i, reason: collision with root package name */
    private final r32 f12011i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12012j;

    /* renamed from: k, reason: collision with root package name */
    private wy3 f12013k;

    /* renamed from: l, reason: collision with root package name */
    private aj4 f12014l = new aj4(0);

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f12005c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f12006d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f12004b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f12008f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Set f12009g = new HashSet();

    public m84(l84 l84Var, i94 i94Var, r32 r32Var, xb4 xb4Var) {
        this.f12003a = xb4Var;
        this.f12007e = l84Var;
        this.f12010h = i94Var;
        this.f12011i = r32Var;
    }

    private final void o(int i10, int i11) {
        while (i10 < this.f12004b.size()) {
            ((k84) this.f12004b.get(i10)).f10871d += i11;
            i10++;
        }
    }

    private final void p(k84 k84Var) {
        j84 j84Var = (j84) this.f12008f.get(k84Var);
        if (j84Var != null) {
            j84Var.f10374a.c(j84Var.f10375b);
        }
    }

    private final void q() {
        Iterator it = this.f12009g.iterator();
        while (it.hasNext()) {
            k84 k84Var = (k84) it.next();
            if (k84Var.f10870c.isEmpty()) {
                p(k84Var);
                it.remove();
            }
        }
    }

    private final void r(k84 k84Var) {
        if (k84Var.f10872e && k84Var.f10870c.isEmpty()) {
            j84 j84Var = (j84) this.f12008f.remove(k84Var);
            Objects.requireNonNull(j84Var);
            j84Var.f10374a.e(j84Var.f10375b);
            j84Var.f10374a.k(j84Var.f10376c);
            j84Var.f10374a.b(j84Var.f10376c);
            this.f12009g.remove(k84Var);
        }
    }

    private final void s(k84 k84Var) {
        ch4 ch4Var = k84Var.f10868a;
        ih4 ih4Var = new ih4() { // from class: com.google.android.gms.internal.ads.c84
            @Override // com.google.android.gms.internal.ads.ih4
            public final void a(jh4 jh4Var, h11 h11Var) {
                this.f6831a.e(jh4Var, h11Var);
            }
        };
        i84 i84Var = new i84(this, k84Var);
        this.f12008f.put(k84Var, new j84(ch4Var, ih4Var, i84Var));
        ch4Var.f(new Handler(sv2.B(), null), i84Var);
        ch4Var.h(new Handler(sv2.B(), null), i84Var);
        ch4Var.j(ih4Var, this.f12013k, this.f12003a);
    }

    private final void t(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            k84 k84Var = (k84) this.f12004b.remove(i11);
            this.f12006d.remove(k84Var.f10869b);
            o(i11, -k84Var.f10868a.F().c());
            k84Var.f10872e = true;
            if (this.f12012j) {
                r(k84Var);
            }
        }
    }

    public final int a() {
        return this.f12004b.size();
    }

    public final h11 b() {
        if (this.f12004b.isEmpty()) {
            return h11.f8946a;
        }
        int iC = 0;
        for (int i10 = 0; i10 < this.f12004b.size(); i10++) {
            k84 k84Var = (k84) this.f12004b.get(i10);
            k84Var.f10871d = iC;
            iC += k84Var.f10868a.F().c();
        }
        return new r84(this.f12004b, this.f12014l);
    }

    final /* synthetic */ void e(jh4 jh4Var, h11 h11Var) {
        this.f12007e.g();
    }

    public final void f(wy3 wy3Var) {
        gt1.f(!this.f12012j);
        this.f12013k = wy3Var;
        for (int i10 = 0; i10 < this.f12004b.size(); i10++) {
            k84 k84Var = (k84) this.f12004b.get(i10);
            s(k84Var);
            this.f12009g.add(k84Var);
        }
        this.f12012j = true;
    }

    public final void g() {
        for (j84 j84Var : this.f12008f.values()) {
            try {
                j84Var.f10374a.e(j84Var.f10375b);
            } catch (RuntimeException e5) {
                ad2.c("MediaSourceList", "Failed to release child source.", e5);
            }
            j84Var.f10374a.k(j84Var.f10376c);
            j84Var.f10374a.b(j84Var.f10376c);
        }
        this.f12008f.clear();
        this.f12009g.clear();
        this.f12012j = false;
    }

    public final void h(fh4 fh4Var) {
        k84 k84Var = (k84) this.f12005c.remove(fh4Var);
        Objects.requireNonNull(k84Var);
        k84Var.f10868a.a(fh4Var);
        k84Var.f10870c.remove(((yg4) fh4Var).f18037m);
        if (!this.f12005c.isEmpty()) {
            q();
        }
        r(k84Var);
    }

    public final boolean i() {
        return this.f12012j;
    }

    public final h11 j(int i10, List list, aj4 aj4Var) {
        int iC;
        if (!list.isEmpty()) {
            this.f12014l = aj4Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                k84 k84Var = (k84) list.get(i11 - i10);
                if (i11 > 0) {
                    k84 k84Var2 = (k84) this.f12004b.get(i11 - 1);
                    iC = k84Var2.f10871d + k84Var2.f10868a.F().c();
                } else {
                    iC = 0;
                }
                k84Var.c(iC);
                o(i11, k84Var.f10868a.F().c());
                this.f12004b.add(i11, k84Var);
                this.f12006d.put(k84Var.f10869b, k84Var);
                if (this.f12012j) {
                    s(k84Var);
                    if (this.f12005c.isEmpty()) {
                        this.f12009g.add(k84Var);
                    } else {
                        p(k84Var);
                    }
                }
            }
        }
        return b();
    }

    public final h11 k(int i10, int i11, aj4 aj4Var) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= a()) {
            z10 = true;
        }
        gt1.d(z10);
        this.f12014l = aj4Var;
        t(i10, i11);
        return b();
    }

    public final h11 l(List list, aj4 aj4Var) {
        t(0, this.f12004b.size());
        return j(this.f12004b.size(), list, aj4Var);
    }

    public final h11 m(aj4 aj4Var) {
        int iA = a();
        if (aj4Var.c() != iA) {
            aj4Var = aj4Var.f().g(0, iA);
        }
        this.f12014l = aj4Var;
        return b();
    }

    public final fh4 n(hh4 hh4Var, hl4 hl4Var, long j10) {
        Object obj = hh4Var.f10401a;
        int i10 = r84.f14687o;
        Object obj2 = ((Pair) obj).first;
        hh4 hh4VarC = hh4Var.c(((Pair) obj).second);
        k84 k84Var = (k84) this.f12006d.get(obj2);
        Objects.requireNonNull(k84Var);
        this.f12009g.add(k84Var);
        j84 j84Var = (j84) this.f12008f.get(k84Var);
        if (j84Var != null) {
            j84Var.f10374a.i(j84Var.f10375b);
        }
        k84Var.f10870c.add(hh4VarC);
        yg4 yg4VarG = k84Var.f10868a.g(hh4VarC, hl4Var, j10);
        this.f12005c.put(yg4VarG, k84Var);
        q();
        return yg4VarG;
    }
}
