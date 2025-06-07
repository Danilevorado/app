package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gf2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f8699a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8700b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageInfo f8701c;

    /* renamed from: d, reason: collision with root package name */
    private final ae0 f8702d;

    public gf2(ae0 ae0Var, Executor executor, String str, PackageInfo packageInfo, int i10) {
        this.f8702d = ae0Var;
        this.f8699a = executor;
        this.f8700b = str;
        this.f8701c = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return qa3.f(qa3.l(qa3.h(this.f8700b), new w23() { // from class: com.google.android.gms.internal.ads.ef2
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                return new hf2((String) obj);
            }
        }, this.f8699a), Throwable.class, new w93() { // from class: com.google.android.gms.internal.ads.ff2
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f8263a.c((Throwable) obj);
            }
        }, this.f8699a);
    }

    final /* synthetic */ ab3 c(Throwable th) {
        return qa3.h(new hf2(this.f8700b));
    }
}
