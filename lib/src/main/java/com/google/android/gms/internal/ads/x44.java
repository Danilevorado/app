package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class x44 extends h11 {

    /* renamed from: f, reason: collision with root package name */
    private final int f17387f;

    /* renamed from: g, reason: collision with root package name */
    private final aj4 f17388g;

    public x44(boolean z10, aj4 aj4Var) {
        this.f17388g = aj4Var;
        this.f17387f = aj4Var.c();
    }

    private final int w(int i10, boolean z10) {
        if (z10) {
            return this.f17388g.d(i10);
        }
        if (i10 >= this.f17387f - 1) {
            return -1;
        }
        return i10 + 1;
    }

    private final int x(int i10, boolean z10) {
        if (z10) {
            return this.f17388g.e(i10);
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final int a(Object obj) {
        int iA;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iP = p(obj2);
        if (iP == -1 || (iA = u(iP).a(obj3)) == -1) {
            return -1;
        }
        return s(iP) + iA;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final ey0 d(int i10, ey0 ey0Var, boolean z10) {
        int iQ = q(i10);
        int iT = t(iQ);
        u(iQ).d(i10 - s(iQ), ey0Var, z10);
        ey0Var.f8041c += iT;
        if (z10) {
            Object objV = v(iQ);
            Object obj = ey0Var.f8040b;
            Objects.requireNonNull(obj);
            ey0Var.f8040b = Pair.create(objV, obj);
        }
        return ey0Var;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final g01 e(int i10, g01 g01Var, long j10) {
        int iR = r(i10);
        int iT = t(iR);
        int iS = s(iR);
        u(iR).e(i10 - iT, g01Var, j10);
        Object objV = v(iR);
        if (!g01.f8518o.equals(g01Var.f8530a)) {
            objV = Pair.create(objV, g01Var.f8530a);
        }
        g01Var.f8530a = objV;
        g01Var.f8542m += iS;
        g01Var.f8543n += iS;
        return g01Var;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final Object f(int i10) {
        int iQ = q(i10);
        return Pair.create(v(iQ), u(iQ).f(i10 - s(iQ)));
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final int g(boolean z10) {
        if (this.f17387f == 0) {
            return -1;
        }
        int iA = z10 ? this.f17388g.a() : 0;
        while (u(iA).o()) {
            iA = w(iA, z10);
            if (iA == -1) {
                return -1;
            }
        }
        return t(iA) + u(iA).g(z10);
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final int h(boolean z10) {
        int i10 = this.f17387f;
        if (i10 == 0) {
            return -1;
        }
        int iB = z10 ? this.f17388g.b() : i10 - 1;
        while (u(iB).o()) {
            iB = x(iB, z10);
            if (iB == -1) {
                return -1;
            }
        }
        return t(iB) + u(iB).h(z10);
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final int j(int i10, int i11, boolean z10) {
        int iR = r(i10);
        int iT = t(iR);
        int iJ = u(iR).j(i10 - iT, i11 == 2 ? 0 : i11, z10);
        if (iJ != -1) {
            return iT + iJ;
        }
        int iW = w(iR, z10);
        while (iW != -1 && u(iW).o()) {
            iW = w(iW, z10);
        }
        if (iW != -1) {
            return t(iW) + u(iW).g(z10);
        }
        if (i11 == 2) {
            return g(z10);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final int k(int i10, int i11, boolean z10) {
        int iR = r(i10);
        int iT = t(iR);
        int iK = u(iR).k(i10 - iT, 0, false);
        if (iK != -1) {
            return iT + iK;
        }
        int iX = x(iR, false);
        while (iX != -1 && u(iX).o()) {
            iX = x(iX, false);
        }
        if (iX != -1) {
            return t(iX) + u(iX).h(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final ey0 n(Object obj, ey0 ey0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iP = p(obj2);
        int iT = t(iP);
        u(iP).n(obj3, ey0Var);
        ey0Var.f8041c += iT;
        ey0Var.f8040b = obj;
        return ey0Var;
    }

    protected abstract int p(Object obj);

    protected abstract int q(int i10);

    protected abstract int r(int i10);

    protected abstract int s(int i10);

    protected abstract int t(int i10);

    protected abstract h11 u(int i10);

    protected abstract Object v(int i10);
}
