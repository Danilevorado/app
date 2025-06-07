package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class h11 {

    /* renamed from: a, reason: collision with root package name */
    public static final h11 f8946a = new cw0();

    /* renamed from: b, reason: collision with root package name */
    private static final String f8947b = Integer.toString(0, 36);

    /* renamed from: c, reason: collision with root package name */
    private static final String f8948c = Integer.toString(1, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f8949d = Integer.toString(2, 36);

    /* renamed from: e, reason: collision with root package name */
    public static final xa4 f8950e = new xa4() { // from class: com.google.android.gms.internal.ads.bv0
    };

    protected h11() {
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract ey0 d(int i10, ey0 ey0Var, boolean z10);

    public abstract g01 e(int i10, g01 g01Var, long j10);

    public final boolean equals(Object obj) {
        int iH;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h11)) {
            return false;
        }
        h11 h11Var = (h11) obj;
        if (h11Var.c() == c() && h11Var.b() == b()) {
            g01 g01Var = new g01();
            ey0 ey0Var = new ey0();
            g01 g01Var2 = new g01();
            ey0 ey0Var2 = new ey0();
            for (int i10 = 0; i10 < c(); i10++) {
                if (!e(i10, g01Var, 0L).equals(h11Var.e(i10, g01Var2, 0L))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < b(); i11++) {
                if (!d(i11, ey0Var, true).equals(h11Var.d(i11, ey0Var2, true))) {
                    return false;
                }
            }
            int iG = g(true);
            if (iG == h11Var.g(true) && (iH = h(true)) == h11Var.h(true)) {
                while (iG != iH) {
                    int iJ = j(iG, 0, true);
                    if (iJ != h11Var.j(iG, 0, true)) {
                        return false;
                    }
                    iG = iJ;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i10);

    public int g(boolean z10) {
        return o() ? -1 : 0;
    }

    public int h(boolean z10) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i10;
        g01 g01Var = new g01();
        ey0 ey0Var = new ey0();
        int iC = c() + 217;
        int i11 = 0;
        while (true) {
            i10 = iC * 31;
            if (i11 >= c()) {
                break;
            }
            iC = i10 + e(i11, g01Var, 0L).hashCode();
            i11++;
        }
        int iB = i10 + b();
        for (int i12 = 0; i12 < b(); i12++) {
            iB = (iB * 31) + d(i12, ey0Var, true).hashCode();
        }
        int iG = g(true);
        while (iG != -1) {
            iB = (iB * 31) + iG;
            iG = j(iG, 0, true);
        }
        return iB;
    }

    public final int i(int i10, ey0 ey0Var, g01 g01Var, int i11, boolean z10) {
        int i12 = d(i10, ey0Var, false).f8041c;
        if (e(i12, g01Var, 0L).f8543n != i10) {
            return i10 + 1;
        }
        int iJ = j(i12, i11, z10);
        if (iJ == -1) {
            return -1;
        }
        return e(iJ, g01Var, 0L).f8542m;
    }

    public int j(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == h(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == h(z10) ? g(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public int k(int i10, int i11, boolean z10) {
        if (i10 == g(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public final Pair l(g01 g01Var, ey0 ey0Var, int i10, long j10) {
        Pair pairM = m(g01Var, ey0Var, i10, j10, 0L);
        Objects.requireNonNull(pairM);
        return pairM;
    }

    public final Pair m(g01 g01Var, ey0 ey0Var, int i10, long j10, long j11) {
        gt1.a(i10, 0, c());
        e(i10, g01Var, j11);
        if (j10 == -9223372036854775807L) {
            long j12 = g01Var.f8540k;
            j10 = 0;
        }
        int i11 = g01Var.f8542m;
        d(i11, ey0Var, false);
        while (i11 < g01Var.f8543n) {
            long j13 = ey0Var.f8043e;
            if (j10 == 0) {
                break;
            }
            int i12 = i11 + 1;
            long j14 = d(i12, ey0Var, false).f8043e;
            if (j10 < 0) {
                break;
            }
            i11 = i12;
        }
        d(i11, ey0Var, true);
        long j15 = ey0Var.f8043e;
        long j16 = ey0Var.f8042d;
        if (j16 != -9223372036854775807L) {
            j10 = Math.min(j10, j16 - 1);
        }
        long jMax = Math.max(0L, j10);
        Object obj = ey0Var.f8040b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public ey0 n(Object obj, ey0 ey0Var) {
        return d(a(obj), ey0Var, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}
