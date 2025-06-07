package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class tg2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    final bb3 f15835a;

    /* renamed from: b, reason: collision with root package name */
    final String f15836b;

    /* renamed from: c, reason: collision with root package name */
    final xd0 f15837c;

    public tg2(xd0 xd0Var, bb3 bb3Var, String str) {
        this.f15837c = xd0Var;
        this.f15835a = bb3Var;
        this.f15836b = str;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        final ab3 ab3VarH = qa3.h(null);
        if (((Boolean) k3.w.c().b(ir.f10126w5)).booleanValue()) {
            ab3VarH = qa3.h(null);
        }
        final ab3 ab3VarH2 = qa3.h(null);
        return qa3.c(ab3VarH, ab3VarH2).a(new Callable() { // from class: com.google.android.gms.internal.ads.sg2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ug2((String) ab3VarH.get(), (String) ab3VarH2.get());
            }
        }, of0.f13186a);
    }
}
