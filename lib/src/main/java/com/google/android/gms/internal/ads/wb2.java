package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class wb2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    public final gn2 f17049a;

    public wb2(gn2 gn2Var) {
        this.f17049a = gn2Var;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        gn2 gn2Var = this.f17049a;
        if (gn2Var != null) {
            bundle.putBoolean("render_in_browser", gn2Var.d());
            bundle.putBoolean("disable_ml", this.f17049a.c());
        }
    }
}
