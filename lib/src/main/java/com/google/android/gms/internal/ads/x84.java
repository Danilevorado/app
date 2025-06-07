package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x84 {

    /* renamed from: c, reason: collision with root package name */
    public static final x84 f17474c;

    /* renamed from: d, reason: collision with root package name */
    public static final x84 f17475d;

    /* renamed from: e, reason: collision with root package name */
    public static final x84 f17476e;

    /* renamed from: f, reason: collision with root package name */
    public static final x84 f17477f;

    /* renamed from: g, reason: collision with root package name */
    public static final x84 f17478g;

    /* renamed from: a, reason: collision with root package name */
    public final long f17479a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17480b;

    static {
        x84 x84Var = new x84(0L, 0L);
        f17474c = x84Var;
        f17475d = new x84(Long.MAX_VALUE, Long.MAX_VALUE);
        f17476e = new x84(Long.MAX_VALUE, 0L);
        f17477f = new x84(0L, Long.MAX_VALUE);
        f17478g = x84Var;
    }

    public x84(long j10, long j11) {
        gt1.d(j10 >= 0);
        gt1.d(j11 >= 0);
        this.f17479a = j10;
        this.f17480b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x84.class == obj.getClass()) {
            x84 x84Var = (x84) obj;
            if (this.f17479a == x84Var.f17479a && this.f17480b == x84Var.f17480b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f17479a) * 31) + ((int) this.f17480b);
    }
}
