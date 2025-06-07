package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class tx implements gy {
    tx() {
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        nk0 nk0Var = (nk0) obj;
        try {
            f03.k(nk0Var.getContext()).l();
            g03.j(nk0Var.getContext()).k();
        } catch (IOException e5) {
            j3.t.q().u(e5, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
