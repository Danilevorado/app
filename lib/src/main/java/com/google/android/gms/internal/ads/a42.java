package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a42 implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5936a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5937b;

    /* renamed from: c, reason: collision with root package name */
    private final lj1 f5938c;

    public a42(Context context, Executor executor, lj1 lj1Var) {
        this.f5936a = context;
        this.f5937b = executor;
        this.f5938c = lj1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(un2 un2Var, hn2 hn2Var, dz1 dz1Var) {
        try {
            ((ap2) dz1Var.f7558b).p(un2Var.f16412a.f14851a.f7445d, hn2Var.f9275w.toString());
        } catch (Exception e5) {
            ze0.h("Fail to load ad from adapter ".concat(String.valueOf(dz1Var.f7557a)), e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void a(un2 un2Var, hn2 hn2Var, dz1 dz1Var) throws io2 {
        if (((ap2) dz1Var.f7558b).c()) {
            e(un2Var, hn2Var, dz1Var);
            return;
        }
        ((z02) dz1Var.f7559c).N5(new y32(this, un2Var, hn2Var, dz1Var));
        ((ap2) dz1Var.f7558b).m(this.f5936a, un2Var.f16412a.f14851a.f7445d, null, (ma0) dz1Var.f7559c, hn2Var.f9275w.toString());
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final /* bridge */ /* synthetic */ Object b(un2 un2Var, hn2 hn2Var, final dz1 dz1Var) {
        hj1 hj1VarC = this.f5938c.c(new tx0(un2Var, hn2Var, dz1Var.f7557a), new ij1(new jb1() { // from class: com.google.android.gms.internal.ads.w32
            @Override // com.google.android.gms.internal.ads.jb1
            public final void a(boolean z10, Context context, y11 y11Var) throws ib1 {
                dz1 dz1Var2 = dz1Var;
                try {
                    ((ap2) dz1Var2.f7558b).A(z10);
                    ((ap2) dz1Var2.f7558b).a();
                } catch (io2 e5) {
                    ze0.h("Cannot show rewarded video.", e5);
                    throw new ib1(e5.getCause());
                }
            }
        }));
        hj1VarC.c().o0(new at0((ap2) dz1Var.f7558b), this.f5937b);
        t21 t21VarD = hj1VarC.d();
        j11 j11VarA = hj1VarC.a();
        ((z02) dz1Var.f7559c).M5(new z32(this, hj1VarC.h(), j11VarA, t21VarD, hj1VarC.i()));
        return hj1VarC.k();
    }
}
