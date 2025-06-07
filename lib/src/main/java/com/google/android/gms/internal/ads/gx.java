package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class gx implements gy {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f91 f8900a;

    public /* synthetic */ gx(f91 f91Var) {
        this.f8900a = f91Var;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) {
        nk0 nk0Var = (nk0) obj;
        fy.c(map, this.f8900a);
        String str = (String) map.get("u");
        if (str == null) {
            ze0.g("URL missing from click GMSG.");
        } else {
            qa3.q(fy.a(nk0Var, str), new vx(nk0Var), of0.f13186a);
        }
    }
}
