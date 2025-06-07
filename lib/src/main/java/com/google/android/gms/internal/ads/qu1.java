package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class qu1 extends wu1 {

    /* renamed from: t, reason: collision with root package name */
    private s80 f14499t;

    qu1(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f17271q = context;
        this.f17272r = j3.t.v().b();
        this.f17273s = scheduledExecutorService;
    }

    @Override // e4.c.a
    public final synchronized void L0(Bundle bundle) {
        if (this.f17269o) {
            return;
        }
        this.f17269o = true;
        try {
            try {
                this.f17270p.n0().z4(this.f14499t, new vu1(this));
            } catch (Throwable th) {
                j3.t.q().u(th, "RemoteAdsServiceProxyClientTask.onConnected");
                this.f17267m.f(th);
            }
        } catch (RemoteException unused) {
            this.f17267m.f(new dt1(1));
        }
    }

    public final synchronized ab3 c(s80 s80Var, long j10) {
        if (this.f17268n) {
            return qa3.n(this.f17267m, j10, TimeUnit.MILLISECONDS, this.f17273s);
        }
        this.f17268n = true;
        this.f14499t = s80Var;
        a();
        ab3 ab3VarN = qa3.n(this.f17267m, j10, TimeUnit.MILLISECONDS, this.f17273s);
        ab3VarN.b(new Runnable() { // from class: com.google.android.gms.internal.ads.pu1
            @Override // java.lang.Runnable
            public final void run() {
                this.f14053m.b();
            }
        }, of0.f13191f);
        return ab3VarN;
    }
}
