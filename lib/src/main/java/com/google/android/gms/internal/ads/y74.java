package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class y74 {

    /* renamed from: a, reason: collision with root package name */
    public final hh4 f17921a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17922b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17923c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17924d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17925e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17926f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17927g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17928h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f17929i;

    y74(hh4 hh4Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        gt1.d(!z13 || z11);
        if (z12 && !z11) {
            z14 = false;
        }
        gt1.d(z14);
        this.f17921a = hh4Var;
        this.f17922b = j10;
        this.f17923c = j11;
        this.f17924d = j12;
        this.f17925e = j13;
        this.f17926f = false;
        this.f17927g = z11;
        this.f17928h = z12;
        this.f17929i = z13;
    }

    public final y74 a(long j10) {
        return j10 == this.f17923c ? this : new y74(this.f17921a, this.f17922b, j10, this.f17924d, this.f17925e, false, this.f17927g, this.f17928h, this.f17929i);
    }

    public final y74 b(long j10) {
        return j10 == this.f17922b ? this : new y74(this.f17921a, j10, this.f17923c, this.f17924d, this.f17925e, false, this.f17927g, this.f17928h, this.f17929i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y74.class == obj.getClass()) {
            y74 y74Var = (y74) obj;
            if (this.f17922b == y74Var.f17922b && this.f17923c == y74Var.f17923c && this.f17924d == y74Var.f17924d && this.f17925e == y74Var.f17925e && this.f17927g == y74Var.f17927g && this.f17928h == y74Var.f17928h && this.f17929i == y74Var.f17929i && sv2.b(this.f17921a, y74Var.f17921a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f17921a.hashCode() + 527;
        int i10 = (int) this.f17922b;
        int i11 = (int) this.f17923c;
        return (((((((((((((iHashCode * 31) + i10) * 31) + i11) * 31) + ((int) this.f17924d)) * 31) + ((int) this.f17925e)) * 961) + (this.f17927g ? 1 : 0)) * 31) + (this.f17928h ? 1 : 0)) * 31) + (this.f17929i ? 1 : 0);
    }
}
