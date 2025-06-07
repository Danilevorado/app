package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes.dex */
public final class q6 {

    /* renamed from: a, reason: collision with root package name */
    final String f19212a;

    /* renamed from: b, reason: collision with root package name */
    final Uri f19213b;

    /* renamed from: c, reason: collision with root package name */
    final String f19214c;

    /* renamed from: d, reason: collision with root package name */
    final String f19215d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f19216e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f19217f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f19218g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f19219h;

    /* renamed from: i, reason: collision with root package name */
    final y6 f19220i;

    public q6(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private q6(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, y6 y6Var) {
        this.f19212a = null;
        this.f19213b = uri;
        this.f19214c = "";
        this.f19215d = "";
        this.f19216e = z10;
        this.f19217f = false;
        this.f19218g = z12;
        this.f19219h = false;
        this.f19220i = null;
    }

    public final q6 a() {
        return new q6(null, this.f19213b, this.f19214c, this.f19215d, this.f19216e, false, true, false, null);
    }

    public final q6 b() {
        if (this.f19214c.isEmpty()) {
            return new q6(null, this.f19213b, this.f19214c, this.f19215d, true, false, this.f19218g, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final u6 c(String str, double d10) {
        return new o6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final u6 d(String str, long j10) {
        return new m6(this, str, Long.valueOf(j10), true);
    }

    public final u6 e(String str, String str2) {
        return new p6(this, str, str2, true);
    }

    public final u6 f(String str, boolean z10) {
        return new n6(this, str, Boolean.valueOf(z10), true);
    }
}
