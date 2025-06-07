package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class dy implements gy {
    dy() {
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        nk0 nk0Var = (nk0) obj;
        if (map.keySet().contains("start")) {
            nk0Var.G().l();
        } else if (map.keySet().contains("stop")) {
            nk0Var.G().n();
        } else if (map.keySet().contains("cancel")) {
            nk0Var.G().k();
        }
    }
}
