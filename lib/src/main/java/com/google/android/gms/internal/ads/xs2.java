package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class xs2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f17802a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f17803b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f17804c;

    public xs2(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f17802a = q44Var;
        this.f17803b = q44Var2;
        this.f17804c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        w34 w34VarA = b44.a(this.f17802a);
        w34 w34VarA2 = b44.a(this.f17803b);
        Object zs2Var = ((Boolean) k3.w.c().b(ir.Z7)).booleanValue() ? new zs2((ws2) w34VarA.b(), (ScheduledExecutorService) this.f17804c.b()) : (ws2) w34VarA2.b();
        k44.b(zs2Var);
        return zs2Var;
    }
}
