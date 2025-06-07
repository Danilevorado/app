package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class em1 implements ms2 {

    /* renamed from: m, reason: collision with root package name */
    private final Map f7902m;

    /* renamed from: n, reason: collision with root package name */
    private final pm f7903n;

    em1(pm pmVar, Map map) {
        this.f7902m = map;
        this.f7903n = pmVar;
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void a(fs2 fs2Var, String str) {
        if (this.f7902m.containsKey(fs2Var)) {
            this.f7903n.c(((dm1) this.f7902m.get(fs2Var)).f7409a);
        }
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void b(fs2 fs2Var, String str, Throwable th) {
        if (this.f7902m.containsKey(fs2Var)) {
            this.f7903n.c(((dm1) this.f7902m.get(fs2Var)).f7411c);
        }
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void c(fs2 fs2Var, String str) {
        if (this.f7902m.containsKey(fs2Var)) {
            this.f7903n.c(((dm1) this.f7902m.get(fs2Var)).f7410b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void h(fs2 fs2Var, String str) {
    }
}
