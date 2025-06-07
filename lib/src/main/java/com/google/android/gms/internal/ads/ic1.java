package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class ic1 implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f9685a;

    /* synthetic */ ic1(lc1 lc1Var, hc1 hc1Var) {
        this.f9685a = new WeakReference(lc1Var);
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) {
        lc1 lc1Var = (lc1) this.f9685a.get();
        if (lc1Var == null) {
            return;
        }
        lc1Var.f11462h.O();
        if (((Boolean) k3.w.c().b(ir.f9988j9)).booleanValue()) {
            lc1Var.f11463i.r();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            lc1Var.f11463i.t();
        }
    }
}
