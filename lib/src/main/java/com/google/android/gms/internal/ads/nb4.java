package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
final class nb4 {

    /* renamed from: a, reason: collision with root package name */
    private final ey0 f12575a;

    /* renamed from: b, reason: collision with root package name */
    private c63 f12576b = c63.u();

    /* renamed from: c, reason: collision with root package name */
    private f63 f12577c = f63.d();

    /* renamed from: d, reason: collision with root package name */
    private hh4 f12578d;

    /* renamed from: e, reason: collision with root package name */
    private hh4 f12579e;

    /* renamed from: f, reason: collision with root package name */
    private hh4 f12580f;

    public nb4(ey0 ey0Var) {
        this.f12575a = ey0Var;
    }

    private static hh4 j(au0 au0Var, c63 c63Var, hh4 hh4Var, ey0 ey0Var) {
        h11 h11VarM = au0Var.m();
        int iC = au0Var.c();
        Object objF = h11VarM.o() ? null : h11VarM.f(iC);
        int iC2 = (au0Var.A() || h11VarM.o()) ? -1 : h11VarM.d(iC, ey0Var, false).c(sv2.w(au0Var.k()));
        for (int i10 = 0; i10 < c63Var.size(); i10++) {
            hh4 hh4Var2 = (hh4) c63Var.get(i10);
            if (m(hh4Var2, objF, au0Var.A(), au0Var.b(), au0Var.d(), iC2)) {
                return hh4Var2;
            }
        }
        if (c63Var.isEmpty() && hh4Var != null) {
            if (m(hh4Var, objF, au0Var.A(), au0Var.b(), au0Var.d(), iC2)) {
                return hh4Var;
            }
        }
        return null;
    }

    private final void k(e63 e63Var, hh4 hh4Var, h11 h11Var) {
        if (hh4Var == null) {
            return;
        }
        if (h11Var.a(hh4Var.f10401a) != -1) {
            e63Var.a(hh4Var, h11Var);
            return;
        }
        h11 h11Var2 = (h11) this.f12577c.get(hh4Var);
        if (h11Var2 != null) {
            e63Var.a(hh4Var, h11Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(com.google.android.gms.internal.ads.h11 r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.e63 r0 = new com.google.android.gms.internal.ads.e63
            r0.<init>()
            com.google.android.gms.internal.ads.c63 r1 = r3.f12576b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L36
            com.google.android.gms.internal.ads.hh4 r1 = r3.f12579e
            r3.k(r0, r1, r4)
            com.google.android.gms.internal.ads.hh4 r1 = r3.f12580f
            com.google.android.gms.internal.ads.hh4 r2 = r3.f12579e
            boolean r1 = com.google.android.gms.internal.ads.d33.a(r1, r2)
            if (r1 != 0) goto L21
            com.google.android.gms.internal.ads.hh4 r1 = r3.f12580f
            r3.k(r0, r1, r4)
        L21:
            com.google.android.gms.internal.ads.hh4 r1 = r3.f12578d
            com.google.android.gms.internal.ads.hh4 r2 = r3.f12579e
            boolean r1 = com.google.android.gms.internal.ads.d33.a(r1, r2)
            if (r1 != 0) goto L5c
            com.google.android.gms.internal.ads.hh4 r1 = r3.f12578d
            com.google.android.gms.internal.ads.hh4 r2 = r3.f12580f
            boolean r1 = com.google.android.gms.internal.ads.d33.a(r1, r2)
            if (r1 != 0) goto L5c
            goto L57
        L36:
            r1 = 0
        L37:
            com.google.android.gms.internal.ads.c63 r2 = r3.f12576b
            int r2 = r2.size()
            if (r1 >= r2) goto L4d
            com.google.android.gms.internal.ads.c63 r2 = r3.f12576b
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.hh4 r2 = (com.google.android.gms.internal.ads.hh4) r2
            r3.k(r0, r2, r4)
            int r1 = r1 + 1
            goto L37
        L4d:
            com.google.android.gms.internal.ads.c63 r1 = r3.f12576b
            com.google.android.gms.internal.ads.hh4 r2 = r3.f12578d
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L5c
        L57:
            com.google.android.gms.internal.ads.hh4 r1 = r3.f12578d
            r3.k(r0, r1, r4)
        L5c:
            com.google.android.gms.internal.ads.f63 r4 = r0.c()
            r3.f12577c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nb4.l(com.google.android.gms.internal.ads.h11):void");
    }

    private static boolean m(hh4 hh4Var, Object obj, boolean z10, int i10, int i11, int i12) {
        if (!hh4Var.f10401a.equals(obj)) {
            return false;
        }
        if (z10) {
            if (hh4Var.f10402b != i10 || hh4Var.f10403c != i11) {
                return false;
            }
        } else if (hh4Var.f10402b != -1 || hh4Var.f10405e != i12) {
            return false;
        }
        return true;
    }

    public final h11 a(hh4 hh4Var) {
        return (h11) this.f12577c.get(hh4Var);
    }

    public final hh4 b() {
        return this.f12578d;
    }

    public final hh4 c() {
        Object next;
        Object obj;
        if (this.f12576b.isEmpty()) {
            return null;
        }
        c63 c63Var = this.f12576b;
        if (!(c63Var instanceof List)) {
            Iterator<E> it = c63Var.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (c63Var.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = c63Var.get(c63Var.size() - 1);
        }
        return (hh4) obj;
    }

    public final hh4 d() {
        return this.f12579e;
    }

    public final hh4 e() {
        return this.f12580f;
    }

    public final void g(au0 au0Var) {
        this.f12578d = j(au0Var, this.f12576b, this.f12579e, this.f12575a);
    }

    public final void h(List list, hh4 hh4Var, au0 au0Var) {
        this.f12576b = c63.s(list);
        if (!list.isEmpty()) {
            this.f12579e = (hh4) list.get(0);
            Objects.requireNonNull(hh4Var);
            this.f12580f = hh4Var;
        }
        if (this.f12578d == null) {
            this.f12578d = j(au0Var, this.f12576b, this.f12579e, this.f12575a);
        }
        l(au0Var.m());
    }

    public final void i(au0 au0Var) {
        this.f12578d = j(au0Var, this.f12576b, this.f12579e, this.f12575a);
        l(au0Var.m());
    }
}
