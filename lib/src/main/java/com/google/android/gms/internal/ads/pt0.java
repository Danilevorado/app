package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pt0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14036a;

    /* renamed from: b, reason: collision with root package name */
    private final x20 f14037b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f14038c;

    /* renamed from: d, reason: collision with root package name */
    private ut0 f14039d;

    /* renamed from: e, reason: collision with root package name */
    private final gy f14040e = new mt0(this);

    /* renamed from: f, reason: collision with root package name */
    private final gy f14041f = new ot0(this);

    public pt0(String str, x20 x20Var, Executor executor) {
        this.f14036a = str;
        this.f14037b = x20Var;
        this.f14038c = executor;
    }

    static /* bridge */ /* synthetic */ boolean g(pt0 pt0Var, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(pt0Var.f14036a);
    }

    public final void c(ut0 ut0Var) {
        this.f14037b.b("/updateActiveView", this.f14040e);
        this.f14037b.b("/untrackActiveViewUnit", this.f14041f);
        this.f14039d = ut0Var;
    }

    public final void d(nk0 nk0Var) {
        nk0Var.O0("/updateActiveView", this.f14040e);
        nk0Var.O0("/untrackActiveViewUnit", this.f14041f);
    }

    public final void e() {
        this.f14037b.c("/updateActiveView", this.f14040e);
        this.f14037b.c("/untrackActiveViewUnit", this.f14041f);
    }

    public final void f(nk0 nk0Var) {
        nk0Var.P0("/updateActiveView", this.f14040e);
        nk0Var.P0("/untrackActiveViewUnit", this.f14041f);
    }
}
