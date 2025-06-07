package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class kc2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f10953a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f10954b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f10955c;

    public kc2(bb3 bb3Var, Context context, Set set) {
        this.f10953a = bb3Var;
        this.f10954b = context;
        this.f10955c = set;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f10953a.g(new Callable() { // from class: com.google.android.gms.internal.ads.jc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10421a.c();
            }
        });
    }

    final /* synthetic */ lc2 c() {
        zq zqVar = ir.G4;
        if (((Boolean) k3.w.c().b(zqVar)).booleanValue()) {
            Set set = this.f10955c;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                j3.t.a();
                return new lc2(true == ((Boolean) k3.w.c().b(zqVar)).booleanValue() ? "a.1.3.37-google_20220829" : null);
            }
        }
        return new lc2(null);
    }
}
