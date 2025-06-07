package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class wx implements gy {
    wx() {
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        nk0 nk0Var = (nk0) obj;
        if (nk0Var.y() != null) {
            nk0Var.y().a();
        }
        l3.r rVarG0 = nk0Var.g0();
        if (rVarG0 != null) {
            rVarG0.b();
            return;
        }
        l3.r rVarV = nk0Var.V();
        if (rVarV != null) {
            rVarV.b();
        } else {
            ze0.g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
