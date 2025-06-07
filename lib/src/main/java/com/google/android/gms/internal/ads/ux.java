package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class ux implements gy {
    ux() {
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        nk0 nk0Var = (nk0) obj;
        try {
            String str = (String) map.get("enabled");
            if (!n23.c("true", str) && !n23.c("false", str)) {
                return;
            }
            g03.j(nk0Var.getContext()).n(Boolean.parseBoolean(str));
        } catch (IOException e5) {
            j3.t.q().u(e5, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
