package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class pa2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f13667a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f13668b;

    public pa2(q44 q44Var, q44 q44Var2) {
        this.f13667a = q44Var;
        this.f13668b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        h63 h63VarV;
        fa2 fa2VarA = ha2.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f13668b.b();
        if (((Boolean) k3.w.c().b(ir.G3)).booleanValue()) {
            h63VarV = h63.x(new oc2(fa2VarA, ((Integer) k3.w.c().b(ir.H3)).intValue(), scheduledExecutorService));
        } else {
            h63VarV = h63.v();
        }
        k44.b(h63VarV);
        return h63VarV;
    }
}
