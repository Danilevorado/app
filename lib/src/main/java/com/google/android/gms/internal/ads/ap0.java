package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class ap0 implements sj2 {

    /* renamed from: a, reason: collision with root package name */
    private final ho0 f6197a;

    /* renamed from: b, reason: collision with root package name */
    private Context f6198b;

    /* renamed from: c, reason: collision with root package name */
    private String f6199c;

    /* renamed from: d, reason: collision with root package name */
    private k3.h4 f6200d;

    /* synthetic */ ap0(ho0 ho0Var, zo0 zo0Var) {
        this.f6197a = ho0Var;
    }

    @Override // com.google.android.gms.internal.ads.sj2
    public final /* synthetic */ sj2 a(Context context) {
        Objects.requireNonNull(context);
        this.f6198b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.sj2
    public final /* synthetic */ sj2 b(k3.h4 h4Var) {
        Objects.requireNonNull(h4Var);
        this.f6200d = h4Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.sj2
    public final tj2 f() {
        k44.c(this.f6198b, Context.class);
        k44.c(this.f6199c, String.class);
        k44.c(this.f6200d, k3.h4.class);
        return new cp0(this.f6197a, this.f6198b, this.f6199c, this.f6200d, null);
    }

    @Override // com.google.android.gms.internal.ads.sj2
    public final /* synthetic */ sj2 x(String str) {
        Objects.requireNonNull(str);
        this.f6199c = str;
        return this;
    }
}
