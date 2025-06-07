package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class us1 extends os1 {

    /* renamed from: s, reason: collision with root package name */
    private String f16439s;

    /* renamed from: t, reason: collision with root package name */
    private int f16440t = 1;

    us1(Context context) {
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
                    int i10 = this.f16440t;
                    if (i10 == 2) {
                        this.f13380r.n0().e4(this.f13379q, new ns1(this));
                    } else if (i10 == 3) {
                        this.f13380r.n0().D3(this.f16439s, new ns1(this));
                    } else {
                        this.f13375m.f(new dt1(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    tf0Var = this.f13375m;
                    dt1Var = new dt1(1);
                    tf0Var.f(dt1Var);
                } catch (Throwable th) {
                    j3.t.q().u(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    tf0Var = this.f13375m;
                    dt1Var = new dt1(1);
                    tf0Var.f(dt1Var);
                }
            }
        }
    }

    public final ab3 b(k90 k90Var) {
        synchronized (this.f13376n) {
            int i10 = this.f16440t;
            if (i10 != 1 && i10 != 2) {
                return qa3.g(new dt1(2));
            }
            if (this.f13377o) {
                return this.f13375m;
            }
            this.f16440t = 2;
            this.f13377o = true;
            this.f13379q = k90Var;
            this.f13380r.u();
            this.f13375m.b(new Runnable() { // from class: com.google.android.gms.internal.ads.ts1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16020m.a();
                }
            }, of0.f13191f);
            return this.f13375m;
        }
    }

    public final ab3 c(String str) {
        synchronized (this.f13376n) {
            int i10 = this.f16440t;
            if (i10 != 1 && i10 != 3) {
                return qa3.g(new dt1(2));
            }
            if (this.f13377o) {
                return this.f13375m;
            }
            this.f16440t = 3;
            this.f13377o = true;
            this.f16439s = str;
            this.f13380r.u();
            this.f13375m.b(new Runnable() { // from class: com.google.android.gms.internal.ads.ss1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15542m.a();
                }
            }, of0.f13191f);
            return this.f13375m;
        }
    }

    @Override // com.google.android.gms.internal.ads.os1, e4.c.b
    public final void w0(b4.b bVar) {
        ze0.b("Cannot connect to remote service, fallback to local instance.");
        this.f13375m.f(new dt1(1));
    }
}
