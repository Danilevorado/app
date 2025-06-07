package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class n20 {

    /* renamed from: b, reason: collision with root package name */
    static final m3.d0 f12368b = new l20();

    /* renamed from: c, reason: collision with root package name */
    static final m3.d0 f12369c = new m20();

    /* renamed from: a, reason: collision with root package name */
    private final z10 f12370a;

    public n20(Context context, ff0 ff0Var, String str, cu2 cu2Var) {
        this.f12370a = new z10(context, ff0Var, str, f12368b, f12369c, cu2Var);
    }

    public final d20 a(String str, g20 g20Var, f20 f20Var) {
        return new r20(this.f12370a, str, g20Var, f20Var);
    }

    public final x20 b() {
        return new x20(this.f12370a);
    }
}
