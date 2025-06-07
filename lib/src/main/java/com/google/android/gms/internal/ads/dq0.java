package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class dq0 implements an2 {

    /* renamed from: a, reason: collision with root package name */
    private final ho0 f7472a;

    /* renamed from: b, reason: collision with root package name */
    private Context f7473b;

    /* renamed from: c, reason: collision with root package name */
    private String f7474c;

    /* synthetic */ dq0(ho0 ho0Var, cq0 cq0Var) {
        this.f7472a = ho0Var;
    }

    @Override // com.google.android.gms.internal.ads.an2
    public final /* synthetic */ an2 a(Context context) {
        Objects.requireNonNull(context);
        this.f7473b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.an2
    public final bn2 d() {
        k44.c(this.f7473b, Context.class);
        return new fq0(this.f7472a, this.f7473b, this.f7474c, null);
    }

    @Override // com.google.android.gms.internal.ads.an2
    public final /* synthetic */ an2 o(String str) {
        this.f7474c = str;
        return this;
    }
}
