package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class q90 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f14201a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s90 f14202b;

    q90(s90 s90Var, Context context) {
        this.f14202b = s90Var;
        this.f14201a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        r90 r90Var = (r90) this.f14202b.f15155a.get(this.f14201a);
        p90 p90VarA = (r90Var == null || r90Var.f14696a + ((Long) ss.f15540a.e()).longValue() < j3.t.b().a()) ? new o90(this.f14201a).a() : new o90(this.f14201a, r90Var.f14697b).a();
        s90 s90Var = this.f14202b;
        s90Var.f15155a.put(this.f14201a, new r90(s90Var, p90VarA));
        return p90VarA;
    }
}
