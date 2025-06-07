package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j94 {

    /* renamed from: a, reason: collision with root package name */
    public final long f10386a;

    /* renamed from: b, reason: collision with root package name */
    public final h11 f10387b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10388c;

    /* renamed from: d, reason: collision with root package name */
    public final hh4 f10389d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10390e;

    /* renamed from: f, reason: collision with root package name */
    public final h11 f10391f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10392g;

    /* renamed from: h, reason: collision with root package name */
    public final hh4 f10393h;

    /* renamed from: i, reason: collision with root package name */
    public final long f10394i;

    /* renamed from: j, reason: collision with root package name */
    public final long f10395j;

    public j94(long j10, h11 h11Var, int i10, hh4 hh4Var, long j11, h11 h11Var2, int i11, hh4 hh4Var2, long j12, long j13) {
        this.f10386a = j10;
        this.f10387b = h11Var;
        this.f10388c = i10;
        this.f10389d = hh4Var;
        this.f10390e = j11;
        this.f10391f = h11Var2;
        this.f10392g = i11;
        this.f10393h = hh4Var2;
        this.f10394i = j12;
        this.f10395j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j94.class == obj.getClass()) {
            j94 j94Var = (j94) obj;
            if (this.f10386a == j94Var.f10386a && this.f10388c == j94Var.f10388c && this.f10390e == j94Var.f10390e && this.f10392g == j94Var.f10392g && this.f10394i == j94Var.f10394i && this.f10395j == j94Var.f10395j && d33.a(this.f10387b, j94Var.f10387b) && d33.a(this.f10389d, j94Var.f10389d) && d33.a(this.f10391f, j94Var.f10391f) && d33.a(this.f10393h, j94Var.f10393h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10386a), this.f10387b, Integer.valueOf(this.f10388c), this.f10389d, Long.valueOf(this.f10390e), this.f10391f, Integer.valueOf(this.f10392g), this.f10393h, Long.valueOf(this.f10394i), Long.valueOf(this.f10395j)});
    }
}
