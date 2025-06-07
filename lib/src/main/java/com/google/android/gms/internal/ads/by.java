package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class by implements gy {
    by() {
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        nk0 nk0Var = (nk0) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            nk0Var.W();
        } else if ("resume".equals(str)) {
            nk0Var.b();
        }
    }
}
