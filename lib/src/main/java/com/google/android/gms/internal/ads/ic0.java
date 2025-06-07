package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class ic0 {

    /* renamed from: a, reason: collision with root package name */
    private Context f9681a;

    /* renamed from: b, reason: collision with root package name */
    private i4.e f9682b;

    /* renamed from: c, reason: collision with root package name */
    private m3.p1 f9683c;

    /* renamed from: d, reason: collision with root package name */
    private ed0 f9684d;

    /* synthetic */ ic0(hc0 hc0Var) {
    }

    public final ic0 a(m3.p1 p1Var) {
        this.f9683c = p1Var;
        return this;
    }

    public final ic0 b(Context context) {
        Objects.requireNonNull(context);
        this.f9681a = context;
        return this;
    }

    public final ic0 c(i4.e eVar) {
        Objects.requireNonNull(eVar);
        this.f9682b = eVar;
        return this;
    }

    public final ic0 d(ed0 ed0Var) {
        this.f9684d = ed0Var;
        return this;
    }

    public final fd0 e() {
        k44.c(this.f9681a, Context.class);
        k44.c(this.f9682b, i4.e.class);
        k44.c(this.f9683c, m3.p1.class);
        k44.c(this.f9684d, ed0.class);
        return new lc0(this.f9681a, this.f9682b, this.f9683c, this.f9684d, null);
    }
}
