package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class v extends z4.d {

    /* renamed from: m, reason: collision with root package name */
    private final WeakReference f5817m;

    v(y yVar) {
        this.f5817m = new WeakReference(yVar);
    }

    @Override // z4.f
    public final void N3(z4.l lVar) {
        y yVar = (y) this.f5817m.get();
        if (yVar == null) {
            return;
        }
        yVar.f5825a.k(new u(this, yVar, yVar, lVar));
    }
}
