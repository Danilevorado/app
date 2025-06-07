package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qz1 implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14556a;

    /* renamed from: b, reason: collision with root package name */
    private final nu0 f14557b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f14558c;

    qz1(Context context, nu0 nu0Var, Executor executor) {
        this.f14556a = context;
        this.f14557b = nu0Var;
        this.f14558c = executor;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void a(un2 un2Var, hn2 hn2Var, dz1 dz1Var) throws io2 {
        ((ap2) dz1Var.f7558b).q(this.f14556a, un2Var.f16412a.f14851a.f7445d, hn2Var.f9275w.toString(), (u30) dz1Var.f7559c);
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final /* bridge */ /* synthetic */ Object b(un2 un2Var, hn2 hn2Var, final dz1 dz1Var) {
        ku0 ku0VarA = this.f14557b.a(new tx0(un2Var, hn2Var, dz1Var.f7557a), new da1(new jb1() { // from class: com.google.android.gms.internal.ads.pz1
            @Override // com.google.android.gms.internal.ads.jb1
            public final void a(boolean z10, Context context, y11 y11Var) throws ib1 {
                dz1 dz1Var2 = dz1Var;
                try {
                    ((ap2) dz1Var2.f7558b).A(z10);
                    ((ap2) dz1Var2.f7558b).B(context);
                } catch (io2 e5) {
                    throw new ib1(e5.getCause());
                }
            }
        }, null), new lu0(hn2Var.f9239b0));
        ku0VarA.c().o0(new at0((ap2) dz1Var.f7558b), this.f14558c);
        ((y02) dz1Var.f7559c).M5(ku0VarA.g());
        return ku0VarA.h();
    }
}
