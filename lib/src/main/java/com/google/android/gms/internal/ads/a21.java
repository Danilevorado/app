package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class a21 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f5922a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f5923b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f5924c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f5925d;

    public a21(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f5922a = q44Var;
        this.f5923b = q44Var2;
        this.f5924c = q44Var3;
        this.f5925d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        x11 x11VarB = ((z11) this.f5922a).b();
        Set setB = ((o44) this.f5923b).b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new y11(x11VarB, setB, bb3Var, (ScheduledExecutorService) this.f5925d.b());
    }
}
