package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class kc1 implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f10952a;

    /* synthetic */ kc1(lc1 lc1Var, jc1 jc1Var) {
        this.f10952a = new WeakReference(lc1Var);
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) {
        lc1 lc1Var = (lc1) this.f10952a.get();
        if (lc1Var == null) {
            return;
        }
        lc1Var.f11461g.a();
    }
}
