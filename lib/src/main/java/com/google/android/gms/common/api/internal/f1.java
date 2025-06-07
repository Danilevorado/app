package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
final class f1 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final d1 f5713m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ g1 f5714n;

    f1(g1 g1Var, d1 d1Var) {
        this.f5714n = g1Var;
        this.f5713m = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5714n.f5743n) {
            b4.b bVarB = this.f5713m.b();
            if (bVarB.x()) {
                g1 g1Var = this.f5714n;
                g1Var.f5639m.startActivityForResult(GoogleApiActivity.a(g1Var.b(), (PendingIntent) e4.p.l(bVarB.v()), this.f5713m.a(), false), 1);
                return;
            }
            g1 g1Var2 = this.f5714n;
            if (g1Var2.f5746q.d(g1Var2.b(), bVarB.f(), null) != null) {
                g1 g1Var3 = this.f5714n;
                g1Var3.f5746q.y(g1Var3.b(), g1Var3.f5639m, bVarB.f(), 2, this.f5714n);
                return;
            }
            if (bVarB.f() != 18) {
                this.f5714n.l(bVarB, this.f5713m.a());
                return;
            }
            g1 g1Var4 = this.f5714n;
            Dialog dialogT = g1Var4.f5746q.t(g1Var4.b(), g1Var4);
            g1 g1Var5 = this.f5714n;
            g1Var5.f5746q.u(g1Var5.b().getApplicationContext(), new e1(this, dialogT));
        }
    }
}
