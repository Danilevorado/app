package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class zp0 implements ll2 {

    /* renamed from: a, reason: collision with root package name */
    private final ho0 f18676a;

    /* renamed from: b, reason: collision with root package name */
    private Context f18677b;

    /* renamed from: c, reason: collision with root package name */
    private String f18678c;

    /* renamed from: d, reason: collision with root package name */
    private k3.h4 f18679d;

    /* synthetic */ zp0(ho0 ho0Var, yp0 yp0Var) {
        this.f18676a = ho0Var;
    }

    @Override // com.google.android.gms.internal.ads.ll2
    public final /* synthetic */ ll2 a(Context context) {
        Objects.requireNonNull(context);
        this.f18677b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ll2
    public final /* synthetic */ ll2 b(k3.h4 h4Var) {
        Objects.requireNonNull(h4Var);
        this.f18679d = h4Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ll2
    public final ml2 f() {
        k44.c(this.f18677b, Context.class);
        k44.c(this.f18678c, String.class);
        k44.c(this.f18679d, k3.h4.class);
        return new bq0(this.f18676a, this.f18677b, this.f18678c, this.f18679d, null);
    }

    @Override // com.google.android.gms.internal.ads.ll2
    public final /* synthetic */ ll2 x(String str) {
        Objects.requireNonNull(str);
        this.f18678c = str;
        return this;
    }
}
