package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class mt0 implements gy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pt0 f12251a;

    mt0(pt0 pt0Var) {
        this.f12251a = pt0Var;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) {
        if (pt0.g(this.f12251a, map)) {
            this.f12251a.f14038c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.lt0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11844m.f12251a.f14039d.a();
                }
            });
        }
    }
}
