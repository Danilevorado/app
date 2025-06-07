package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class ot0 implements gy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pt0 f13383a;

    ot0(pt0 pt0Var) {
        this.f13383a = pt0Var;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) {
        if (pt0.g(this.f13383a, map)) {
            this.f13383a.f14038c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nt0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12848m.f13383a.f14039d.h();
                }
            });
        }
    }
}
