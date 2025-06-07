package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qs1 extends os1 {
    qs1(Context context) {
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
                    this.f13380r.n0().Q2(this.f13379q, new ns1(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    tf0Var = this.f13375m;
                    dt1Var = new dt1(1);
                    tf0Var.f(dt1Var);
                } catch (Throwable th) {
                    j3.t.q().u(th, "RemoteSignalsClientTask.onConnected");
                    tf0Var = this.f13375m;
                    dt1Var = new dt1(1);
                    tf0Var.f(dt1Var);
                }
            }
        }
    }

    public final ab3 b(k90 k90Var) {
        synchronized (this.f13376n) {
            if (this.f13377o) {
                return this.f13375m;
            }
            this.f13377o = true;
            this.f13379q = k90Var;
            this.f13380r.u();
            this.f13375m.b(new Runnable() { // from class: com.google.android.gms.internal.ads.ps1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14033m.a();
                }
            }, of0.f13191f);
            return this.f13375m;
        }
    }
}
