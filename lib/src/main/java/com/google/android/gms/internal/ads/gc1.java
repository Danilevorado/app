package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class gc1 implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f8673a;

    /* synthetic */ gc1(lc1 lc1Var, fc1 fc1Var) {
        this.f8673a = new WeakReference(lc1Var);
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) {
        lc1 lc1Var = (lc1) this.f8673a.get();
        if (lc1Var != null && "_ac".equals((String) map.get("eventName"))) {
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
}
