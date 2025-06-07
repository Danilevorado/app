package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class nm0 {

    /* renamed from: a, reason: collision with root package name */
    private final ff0 f12700a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12701b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f12702c;

    /* synthetic */ nm0(lm0 lm0Var, mm0 mm0Var) {
        this.f12700a = lm0Var.f11658a;
        this.f12701b = lm0Var.f11659b;
        this.f12702c = lm0Var.f11660c;
    }

    final Context a() {
        return this.f12701b;
    }

    public final bg b() {
        return new bg(new j3.i(this.f12701b, this.f12700a));
    }

    final xt c() {
        return new xt(this.f12701b);
    }

    final ff0 d() {
        return this.f12700a;
    }

    final String e() {
        return j3.t.r().z(this.f12701b, this.f12700a.f8252m);
    }

    final WeakReference f() {
        return this.f12702c;
    }
}
