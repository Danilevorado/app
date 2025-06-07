package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class op0 implements ho1 {

    /* renamed from: a, reason: collision with root package name */
    private final ho0 f13353a;

    /* renamed from: b, reason: collision with root package name */
    private Context f13354b;

    /* renamed from: c, reason: collision with root package name */
    private cz f13355c;

    /* synthetic */ op0(ho0 ho0Var, np0 np0Var) {
        this.f13353a = ho0Var;
    }

    @Override // com.google.android.gms.internal.ads.ho1
    public final /* synthetic */ ho1 a(Context context) {
        Objects.requireNonNull(context);
        this.f13354b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ho1
    public final /* synthetic */ ho1 b(cz czVar) {
        Objects.requireNonNull(czVar);
        this.f13355c = czVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ho1
    public final io1 d() {
        k44.c(this.f13354b, Context.class);
        k44.c(this.f13355c, cz.class);
        return new qp0(this.f13353a, this.f13354b, this.f13355c, null);
    }
}
