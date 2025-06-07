package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    final q.g f3592a = new q.g();

    /* renamed from: b, reason: collision with root package name */
    final q.d f3593b = new q.d();

    static class a {

        /* renamed from: d, reason: collision with root package name */
        static androidx.core.util.e f3594d = new androidx.core.util.f(20);

        /* renamed from: a, reason: collision with root package name */
        int f3595a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.l.c f3596b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.l.c f3597c;

        private a() {
        }

        static void a() {
            while (f3594d.b() != null) {
            }
        }

        static a b() {
            a aVar = (a) f3594d.b();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f3595a = 0;
            aVar.f3596b = null;
            aVar.f3597c = null;
            f3594d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.d0 d0Var);

        void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    p() {
    }

    private RecyclerView.l.c l(RecyclerView.d0 d0Var, int i10) {
        a aVar;
        RecyclerView.l.c cVar;
        int iF = this.f3592a.f(d0Var);
        if (iF >= 0 && (aVar = (a) this.f3592a.m(iF)) != null) {
            int i11 = aVar.f3595a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f3595a = i12;
                if (i10 == 4) {
                    cVar = aVar.f3596b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVar.f3597c;
                }
                if ((i12 & 12) == 0) {
                    this.f3592a.k(iF);
                    a.c(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = (a) this.f3592a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3592a.put(d0Var, aVarB);
        }
        aVarB.f3595a |= 2;
        aVarB.f3596b = cVar;
    }

    void b(RecyclerView.d0 d0Var) {
        a aVarB = (a) this.f3592a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3592a.put(d0Var, aVarB);
        }
        aVarB.f3595a |= 1;
    }

    void c(long j10, RecyclerView.d0 d0Var) {
        this.f3593b.k(j10, d0Var);
    }

    void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = (a) this.f3592a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3592a.put(d0Var, aVarB);
        }
        aVarB.f3597c = cVar;
        aVarB.f3595a |= 8;
    }

    void e(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = (a) this.f3592a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3592a.put(d0Var, aVarB);
        }
        aVarB.f3596b = cVar;
        aVarB.f3595a |= 4;
    }

    void f() {
        this.f3592a.clear();
        this.f3593b.b();
    }

    RecyclerView.d0 g(long j10) {
        return (RecyclerView.d0) this.f3593b.f(j10);
    }

    boolean h(RecyclerView.d0 d0Var) {
        a aVar = (a) this.f3592a.get(d0Var);
        return (aVar == null || (aVar.f3595a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.d0 d0Var) {
        a aVar = (a) this.f3592a.get(d0Var);
        return (aVar == null || (aVar.f3595a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    RecyclerView.l.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    RecyclerView.l.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void o(androidx.recyclerview.widget.p.b r7) {
        /*
            r6 = this;
            q.g r0 = r6.f3592a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L63
            q.g r1 = r6.f3592a
            java.lang.Object r1 = r1.i(r0)
            androidx.recyclerview.widget.RecyclerView$d0 r1 = (androidx.recyclerview.widget.RecyclerView.d0) r1
            q.g r2 = r6.f3592a
            java.lang.Object r2 = r2.k(r0)
            androidx.recyclerview.widget.p$a r2 = (androidx.recyclerview.widget.p.a) r2
            int r3 = r2.f3595a
            r4 = r3 & 3
            r5 = 3
            if (r4 != r5) goto L25
        L21:
            r7.a(r1)
            goto L5d
        L25:
            r4 = r3 & 1
            if (r4 == 0) goto L34
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f3596b
            if (r3 != 0) goto L2e
            goto L21
        L2e:
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r2.f3597c
        L30:
            r7.c(r1, r3, r4)
            goto L5d
        L34:
            r4 = r3 & 14
            r5 = 14
            if (r4 != r5) goto L42
        L3a:
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f3596b
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r2.f3597c
            r7.b(r1, r3, r4)
            goto L5d
        L42:
            r4 = r3 & 12
            r5 = 12
            if (r4 != r5) goto L50
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f3596b
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r2.f3597c
            r7.d(r1, r3, r4)
            goto L5d
        L50:
            r4 = r3 & 4
            if (r4 == 0) goto L58
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f3596b
            r4 = 0
            goto L30
        L58:
            r3 = r3 & 8
            if (r3 == 0) goto L5d
            goto L3a
        L5d:
            androidx.recyclerview.widget.p.a.c(r2)
            int r0 = r0 + (-1)
            goto L8
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.p.o(androidx.recyclerview.widget.p$b):void");
    }

    void p(RecyclerView.d0 d0Var) {
        a aVar = (a) this.f3592a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.f3595a &= -2;
    }

    void q(RecyclerView.d0 d0Var) {
        int iS = this.f3593b.s() - 1;
        while (true) {
            if (iS < 0) {
                break;
            }
            if (d0Var == this.f3593b.t(iS)) {
                this.f3593b.r(iS);
                break;
            }
            iS--;
        }
        a aVar = (a) this.f3592a.remove(d0Var);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
