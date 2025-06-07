package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class rc1 {

    /* renamed from: b, reason: collision with root package name */
    public static final rc1 f14741b = new rc1(c63.u());

    /* renamed from: c, reason: collision with root package name */
    private static final String f14742c = Integer.toString(0, 36);

    /* renamed from: d, reason: collision with root package name */
    public static final xa4 f14743d = new xa4() { // from class: com.google.android.gms.internal.ads.o91
    };

    /* renamed from: a, reason: collision with root package name */
    private final c63 f14744a;

    public rc1(List list) {
        this.f14744a = c63.s(list);
    }

    public final c63 a() {
        return this.f14744a;
    }

    public final boolean b(int i10) {
        for (int i11 = 0; i11 < this.f14744a.size(); i11++) {
            qb1 qb1Var = (qb1) this.f14744a.get(i11);
            if (qb1Var.c() && qb1Var.a() == i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rc1.class != obj.getClass()) {
            return false;
        }
        return this.f14744a.equals(((rc1) obj).f14744a);
    }

    public final int hashCode() {
        return this.f14744a.hashCode();
    }
}
