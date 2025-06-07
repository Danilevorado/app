package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j12 implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10257a;

    /* renamed from: b, reason: collision with root package name */
    private final bb1 f10258b;

    /* renamed from: c, reason: collision with root package name */
    private final ff0 f10259c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f10260d;

    public j12(Context context, ff0 ff0Var, bb1 bb1Var, Executor executor) {
        this.f10257a = context;
        this.f10259c = ff0Var;
        this.f10258b = bb1Var;
        this.f10260d = executor;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void a(un2 un2Var, hn2 hn2Var, dz1 dz1Var) throws io2 {
        ((ap2) dz1Var.f7558b).t(this.f10257a, un2Var.f16412a.f14851a.f7445d, hn2Var.f9275w.toString(), m3.w0.l(hn2Var.f9272t), (u30) dz1Var.f7559c);
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final /* bridge */ /* synthetic */ Object b(un2 un2Var, hn2 hn2Var, final dz1 dz1Var) {
        aa1 aa1VarC = this.f10258b.c(new tx0(un2Var, hn2Var, dz1Var.f7557a), new da1(new jb1() { // from class: com.google.android.gms.internal.ads.i12
            @Override // com.google.android.gms.internal.ads.jb1
            public final void a(boolean z10, Context context, y11 y11Var) throws ib1 {
                this.f9483a.c(dz1Var, z10, context, y11Var);
            }
        }, null));
        aa1VarC.c().o0(new at0((ap2) dz1Var.f7558b), this.f10260d);
        ((y02) dz1Var.f7559c).M5(aa1VarC.g());
        return aa1VarC.i();
    }

    final /* synthetic */ void c(dz1 dz1Var, boolean z10, Context context, y11 y11Var) throws ib1 {
        try {
            ((ap2) dz1Var.f7558b).A(z10);
            if (this.f10259c.f8254o < ((Integer) k3.w.c().b(ir.D0)).intValue()) {
                ((ap2) dz1Var.f7558b).C();
            } else {
                ((ap2) dz1Var.f7558b).D(context);
            }
        } catch (io2 e5) {
            ze0.f("Cannot show interstitial.");
            throw new ib1(e5.getCause());
        }
    }
}
