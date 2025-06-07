package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zs0 {

    /* renamed from: j, reason: collision with root package name */
    private static final String f18731j = Integer.toString(0, 36);

    /* renamed from: k, reason: collision with root package name */
    private static final String f18732k = Integer.toString(1, 36);

    /* renamed from: l, reason: collision with root package name */
    private static final String f18733l = Integer.toString(2, 36);

    /* renamed from: m, reason: collision with root package name */
    private static final String f18734m = Integer.toString(3, 36);

    /* renamed from: n, reason: collision with root package name */
    private static final String f18735n = Integer.toString(4, 36);

    /* renamed from: o, reason: collision with root package name */
    private static final String f18736o = Integer.toString(5, 36);

    /* renamed from: p, reason: collision with root package name */
    private static final String f18737p = Integer.toString(6, 36);

    /* renamed from: q, reason: collision with root package name */
    public static final xa4 f18738q = new xa4() { // from class: com.google.android.gms.internal.ads.yr0
    };

    /* renamed from: a, reason: collision with root package name */
    public final Object f18739a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18740b;

    /* renamed from: c, reason: collision with root package name */
    public final v30 f18741c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18742d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18743e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18744f;

    /* renamed from: g, reason: collision with root package name */
    public final long f18745g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18746h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18747i;

    public zs0(Object obj, int i10, v30 v30Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f18739a = obj;
        this.f18740b = i10;
        this.f18741c = v30Var;
        this.f18742d = obj2;
        this.f18743e = i11;
        this.f18744f = j10;
        this.f18745g = j11;
        this.f18746h = i12;
        this.f18747i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zs0.class == obj.getClass()) {
            zs0 zs0Var = (zs0) obj;
            if (this.f18740b == zs0Var.f18740b && this.f18743e == zs0Var.f18743e && this.f18744f == zs0Var.f18744f && this.f18745g == zs0Var.f18745g && this.f18746h == zs0Var.f18746h && this.f18747i == zs0Var.f18747i && d33.a(this.f18739a, zs0Var.f18739a) && d33.a(this.f18742d, zs0Var.f18742d) && d33.a(this.f18741c, zs0Var.f18741c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18739a, Integer.valueOf(this.f18740b), this.f18741c, this.f18742d, Integer.valueOf(this.f18743e), Long.valueOf(this.f18744f), Long.valueOf(this.f18745g), Integer.valueOf(this.f18746h), Integer.valueOf(this.f18747i)});
    }
}
