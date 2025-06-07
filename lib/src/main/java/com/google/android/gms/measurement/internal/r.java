package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    final String f20320a;

    /* renamed from: b, reason: collision with root package name */
    final String f20321b;

    /* renamed from: c, reason: collision with root package name */
    final long f20322c;

    /* renamed from: d, reason: collision with root package name */
    final long f20323d;

    /* renamed from: e, reason: collision with root package name */
    final long f20324e;

    /* renamed from: f, reason: collision with root package name */
    final long f20325f;

    /* renamed from: g, reason: collision with root package name */
    final long f20326g;

    /* renamed from: h, reason: collision with root package name */
    final Long f20327h;

    /* renamed from: i, reason: collision with root package name */
    final Long f20328i;

    /* renamed from: j, reason: collision with root package name */
    final Long f20329j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f20330k;

    r(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        e4.p.f(str);
        e4.p.f(str2);
        e4.p.a(j10 >= 0);
        e4.p.a(j11 >= 0);
        e4.p.a(j12 >= 0);
        e4.p.a(j14 >= 0);
        this.f20320a = str;
        this.f20321b = str2;
        this.f20322c = j10;
        this.f20323d = j11;
        this.f20324e = j12;
        this.f20325f = j13;
        this.f20326g = j14;
        this.f20327h = l10;
        this.f20328i = l11;
        this.f20329j = l12;
        this.f20330k = bool;
    }

    final r a(Long l10, Long l11, Boolean bool) {
        return new r(this.f20320a, this.f20321b, this.f20322c, this.f20323d, this.f20324e, this.f20325f, this.f20326g, this.f20327h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    final r b(long j10, long j11) {
        return new r(this.f20320a, this.f20321b, this.f20322c, this.f20323d, this.f20324e, this.f20325f, j10, Long.valueOf(j11), this.f20328i, this.f20329j, this.f20330k);
    }

    final r c(long j10) {
        return new r(this.f20320a, this.f20321b, this.f20322c, this.f20323d, this.f20324e, j10, this.f20326g, this.f20327h, this.f20328i, this.f20329j, this.f20330k);
    }
}
