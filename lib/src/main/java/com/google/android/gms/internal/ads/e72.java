package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class e72 {

    /* renamed from: a, reason: collision with root package name */
    private final ae1 f7670a;

    /* renamed from: b, reason: collision with root package name */
    private final q62 f7671b;

    /* renamed from: c, reason: collision with root package name */
    private final o11 f7672c;

    public e72(ae1 ae1Var, ws2 ws2Var) {
        this.f7670a = ae1Var;
        final q62 q62Var = new q62(ws2Var);
        this.f7671b = q62Var;
        final n00 n00VarG = ae1Var.g();
        this.f7672c = new o11() { // from class: com.google.android.gms.internal.ads.d72
            @Override // com.google.android.gms.internal.ads.o11
            public final void u(k3.w2 w2Var) {
                q62 q62Var2 = q62Var;
                n00 n00Var = n00VarG;
                q62Var2.u(w2Var);
                if (n00Var != null) {
                    try {
                        n00Var.y(w2Var);
                    } catch (RemoteException e5) {
                        ze0.i("#007 Could not call remote method.", e5);
                    }
                }
                if (n00Var != null) {
                    try {
                        n00Var.H(w2Var.f24788m);
                    } catch (RemoteException e10) {
                        ze0.i("#007 Could not call remote method.", e10);
                    }
                }
            }
        };
    }

    public final o11 a() {
        return this.f7672c;
    }

    public final a31 b() {
        return this.f7671b;
    }

    public final tb1 c() {
        return new tb1(this.f7670a, this.f7671b.a());
    }

    public final q62 d() {
        return this.f7671b;
    }

    public final void e(k3.d0 d0Var) {
        this.f7671b.c(d0Var);
    }
}
