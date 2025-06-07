package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class tu1 extends wu1 {

    /* renamed from: t, reason: collision with root package name */
    private o80 f16054t;

    tu1(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f17271q = context;
        this.f17272r = j3.t.v().b();
        this.f17273s = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.wu1, e4.c.a
    public final void C(int i10) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i10));
        ze0.b(str);
        this.f17267m.f(new dt1(1, str));
    }

    @Override // e4.c.a
    public final synchronized void L0(Bundle bundle) {
        if (this.f17269o) {
            return;
        }
        this.f17269o = true;
        try {
            try {
                this.f17270p.n0().K2(this.f16054t, new vu1(this));
            } catch (Throwable th) {
                j3.t.q().u(th, "RemoteAdsServiceSignalClientTask.onConnected");
                this.f17267m.f(th);
            }
        } catch (RemoteException unused) {
            this.f17267m.f(new dt1(1));
        }
    }

    public final synchronized ab3 c(o80 o80Var, long j10) {
        if (this.f17268n) {
            return qa3.n(this.f17267m, j10, TimeUnit.MILLISECONDS, this.f17273s);
        }
        this.f17268n = true;
        this.f16054t = o80Var;
        a();
        ab3 ab3VarN = qa3.n(this.f17267m, j10, TimeUnit.MILLISECONDS, this.f17273s);
        ab3VarN.b(new Runnable() { // from class: com.google.android.gms.internal.ads.su1
            @Override // java.lang.Runnable
            public final void run() {
                this.f15553m.b();
            }
        }, of0.f13191f);
        return ab3VarN;
    }
}
