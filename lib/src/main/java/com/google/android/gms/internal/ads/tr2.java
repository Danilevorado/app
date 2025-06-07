package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class tr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16011a;

    /* renamed from: b, reason: collision with root package name */
    private final List f16012b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ds2 f16013c;

    /* synthetic */ tr2(ds2 ds2Var, Object obj, List list, sr2 sr2Var) {
        this.f16013c = ds2Var;
        this.f16011a = obj;
        this.f16012b = list;
    }

    public final cs2 a(Callable callable) {
        pa3 pa3VarB = qa3.b(this.f16012b);
        ab3 ab3VarA = pa3VarB.a(new Callable() { // from class: com.google.android.gms.internal.ads.rr2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, of0.f13191f);
        ds2 ds2Var = this.f16013c;
        return new cs2(ds2Var, this.f16011a, ab3VarA, this.f16012b, pa3VarB.a(callable, ds2Var.f7495a));
    }
}
