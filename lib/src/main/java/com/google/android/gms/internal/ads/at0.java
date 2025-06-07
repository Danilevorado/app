package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class at0 implements g21 {

    /* renamed from: m, reason: collision with root package name */
    private final ap2 f6240m;

    public at0(ap2 ap2Var) {
        this.f6240m = ap2Var;
    }

    @Override // com.google.android.gms.internal.ads.g21
    public final void d(Context context) {
        try {
            this.f6240m.l();
        } catch (io2 e5) {
            ze0.h("Cannot invoke onDestroy for the mediation adapter.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.g21
    public final void e(Context context) {
        try {
            this.f6240m.z();
            if (context != null) {
                this.f6240m.x(context);
            }
        } catch (io2 e5) {
            ze0.h("Cannot invoke onResume for the mediation adapter.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.g21
    public final void o(Context context) {
        try {
            this.f6240m.y();
        } catch (io2 e5) {
            ze0.h("Cannot invoke onPause for the mediation adapter.", e5);
        }
    }
}
