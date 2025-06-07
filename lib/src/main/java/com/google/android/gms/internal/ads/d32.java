package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d32 implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7177a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f7178b;

    /* renamed from: c, reason: collision with root package name */
    private final lj1 f7179c;

    public d32(Context context, Executor executor, lj1 lj1Var) {
        this.f7177a = context;
        this.f7178b = executor;
        this.f7179c = lj1Var;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void a(un2 un2Var, hn2 hn2Var, dz1 dz1Var) {
        try {
            do2 do2Var = un2Var.f16412a.f14851a;
            if (do2Var.f7456o.f14418a == 3) {
                ((ap2) dz1Var.f7558b).w(this.f7177a, do2Var.f7445d, hn2Var.f9275w.toString(), (u30) dz1Var.f7559c);
            } else {
                ((ap2) dz1Var.f7558b).v(this.f7177a, do2Var.f7445d, hn2Var.f9275w.toString(), (u30) dz1Var.f7559c);
            }
        } catch (Exception e5) {
            ze0.h("Fail to load ad from adapter ".concat(String.valueOf(dz1Var.f7557a)), e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final /* bridge */ /* synthetic */ Object b(un2 un2Var, hn2 hn2Var, final dz1 dz1Var) {
        hj1 hj1VarC = this.f7179c.c(new tx0(un2Var, hn2Var, dz1Var.f7557a), new ij1(new jb1() { // from class: com.google.android.gms.internal.ads.c32
            @Override // com.google.android.gms.internal.ads.jb1
            public final void a(boolean z10, Context context, y11 y11Var) throws ib1 {
                dz1 dz1Var2 = dz1Var;
                try {
                    ((ap2) dz1Var2.f7558b).A(z10);
                    ((ap2) dz1Var2.f7558b).E(context);
                } catch (io2 e5) {
                    throw new ib1(e5.getCause());
                }
            }
        }));
        hj1VarC.c().o0(new at0((ap2) dz1Var.f7558b), this.f7178b);
        ((y02) dz1Var.f7559c).M5(hj1VarC.m());
        return hj1VarC.k();
    }
}
