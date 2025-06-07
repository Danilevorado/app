package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class po0 implements ci2 {

    /* renamed from: a, reason: collision with root package name */
    private final ho0 f13956a;

    /* renamed from: b, reason: collision with root package name */
    private Context f13957b;

    /* renamed from: c, reason: collision with root package name */
    private String f13958c;

    /* synthetic */ po0(ho0 ho0Var, oo0 oo0Var) {
        this.f13956a = ho0Var;
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final /* synthetic */ ci2 a(Context context) {
        Objects.requireNonNull(context);
        this.f13957b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final di2 d() {
        k44.c(this.f13957b, Context.class);
        k44.c(this.f13958c, String.class);
        return new ro0(this.f13956a, this.f13957b, this.f13958c, null);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final /* synthetic */ ci2 o(String str) {
        Objects.requireNonNull(str);
        this.f13958c = str;
        return this;
    }
}
