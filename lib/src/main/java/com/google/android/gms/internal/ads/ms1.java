package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ms1 extends os1 {
    public ms1(Context context) {
        this.f13380r = new k80(context, j3.t.v().b(), this, this);
    }

    @Override // e4.c.a
    public final void L0(Bundle bundle) {
        tf0 tf0Var;
        dt1 dt1Var;
        synchronized (this.f13376n) {
            if (!this.f13378p) {
                this.f13378p = true;
                try {
                    this.f13380r.n0().R1(this.f13379q, new ns1(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    tf0Var = this.f13375m;
                    dt1Var = new dt1(1);
                    tf0Var.f(dt1Var);
                } catch (Throwable th) {
                    j3.t.q().u(th, "RemoteAdRequestClientTask.onConnected");
                    tf0Var = this.f13375m;
                    dt1Var = new dt1(1);
                    tf0Var.f(dt1Var);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.os1, e4.c.b
    public final void w0(b4.b bVar) {
        ze0.b("Cannot connect to remote service, fallback to local instance.");
        this.f13375m.f(new dt1(1));
    }
}
