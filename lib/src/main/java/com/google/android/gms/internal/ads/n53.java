package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class n53 extends q53 {
    n53() {
        super(null);
    }

    static final q53 j(int i10) {
        return i10 < 0 ? q53.f14154b : i10 > 0 ? q53.f14155c : q53.f14153a;
    }

    @Override // com.google.android.gms.internal.ads.q53
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.q53
    public final q53 b(int i10, int i11) {
        return j(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.q53
    public final q53 c(Object obj, Object obj2, Comparator comparator) {
        return j(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.q53
    public final q53 d(boolean z10, boolean z11) {
        return j(j83.a(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.q53
    public final q53 e(boolean z10, boolean z11) {
        return j(j83.a(false, false));
    }
}
