package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class n84 {

    /* renamed from: s, reason: collision with root package name */
    private static final hh4 f12512s = new hh4(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final h11 f12513a;

    /* renamed from: b, reason: collision with root package name */
    public final hh4 f12514b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12515c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12516d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12517e;

    /* renamed from: f, reason: collision with root package name */
    public final o54 f12518f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12519g;

    /* renamed from: h, reason: collision with root package name */
    public final fj4 f12520h;

    /* renamed from: i, reason: collision with root package name */
    public final yk4 f12521i;

    /* renamed from: j, reason: collision with root package name */
    public final List f12522j;

    /* renamed from: k, reason: collision with root package name */
    public final hh4 f12523k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12524l;

    /* renamed from: m, reason: collision with root package name */
    public final int f12525m;

    /* renamed from: n, reason: collision with root package name */
    public final sl0 f12526n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f12527o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f12528p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f12529q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f12530r;

    public n84(h11 h11Var, hh4 hh4Var, long j10, long j11, int i10, o54 o54Var, boolean z10, fj4 fj4Var, yk4 yk4Var, List list, hh4 hh4Var2, boolean z11, int i11, sl0 sl0Var, long j12, long j13, long j14, boolean z12) {
        this.f12513a = h11Var;
        this.f12514b = hh4Var;
        this.f12515c = j10;
        this.f12516d = j11;
        this.f12517e = i10;
        this.f12518f = o54Var;
        this.f12519g = z10;
        this.f12520h = fj4Var;
        this.f12521i = yk4Var;
        this.f12522j = list;
        this.f12523k = hh4Var2;
        this.f12524l = z11;
        this.f12525m = i11;
        this.f12526n = sl0Var;
        this.f12528p = j12;
        this.f12529q = j13;
        this.f12530r = j14;
        this.f12527o = z12;
    }

    public static n84 g(yk4 yk4Var) {
        h11 h11Var = h11.f8946a;
        hh4 hh4Var = f12512s;
        return new n84(h11Var, hh4Var, -9223372036854775807L, 0L, 1, null, false, fj4.f8300d, yk4Var, c63.u(), hh4Var, false, 0, sl0.f15309d, 0L, 0L, 0L, false);
    }

    public static hh4 h() {
        return f12512s;
    }

    public final n84 a(hh4 hh4Var) {
        return new n84(this.f12513a, this.f12514b, this.f12515c, this.f12516d, this.f12517e, this.f12518f, this.f12519g, this.f12520h, this.f12521i, this.f12522j, hh4Var, this.f12524l, this.f12525m, this.f12526n, this.f12528p, this.f12529q, this.f12530r, this.f12527o);
    }

    public final n84 b(hh4 hh4Var, long j10, long j11, long j12, long j13, fj4 fj4Var, yk4 yk4Var, List list) {
        return new n84(this.f12513a, hh4Var, j11, j12, this.f12517e, this.f12518f, this.f12519g, fj4Var, yk4Var, list, this.f12523k, this.f12524l, this.f12525m, this.f12526n, this.f12528p, j13, j10, this.f12527o);
    }

    public final n84 c(boolean z10, int i10) {
        return new n84(this.f12513a, this.f12514b, this.f12515c, this.f12516d, this.f12517e, this.f12518f, this.f12519g, this.f12520h, this.f12521i, this.f12522j, this.f12523k, z10, i10, this.f12526n, this.f12528p, this.f12529q, this.f12530r, this.f12527o);
    }

    public final n84 d(o54 o54Var) {
        return new n84(this.f12513a, this.f12514b, this.f12515c, this.f12516d, this.f12517e, o54Var, this.f12519g, this.f12520h, this.f12521i, this.f12522j, this.f12523k, this.f12524l, this.f12525m, this.f12526n, this.f12528p, this.f12529q, this.f12530r, this.f12527o);
    }

    public final n84 e(int i10) {
        return new n84(this.f12513a, this.f12514b, this.f12515c, this.f12516d, i10, this.f12518f, this.f12519g, this.f12520h, this.f12521i, this.f12522j, this.f12523k, this.f12524l, this.f12525m, this.f12526n, this.f12528p, this.f12529q, this.f12530r, this.f12527o);
    }

    public final n84 f(h11 h11Var) {
        return new n84(h11Var, this.f12514b, this.f12515c, this.f12516d, this.f12517e, this.f12518f, this.f12519g, this.f12520h, this.f12521i, this.f12522j, this.f12523k, this.f12524l, this.f12525m, this.f12526n, this.f12528p, this.f12529q, this.f12530r, this.f12527o);
    }
}
