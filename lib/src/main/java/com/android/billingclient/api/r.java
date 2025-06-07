package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.b6;
import com.google.android.gms.internal.play_billing.g6;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class r implements ServiceConnection {

    /* renamed from: m, reason: collision with root package name */
    private final Object f5254m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private boolean f5255n = false;

    /* renamed from: o, reason: collision with root package name */
    private k1.c f5256o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ b f5257p;

    /* synthetic */ r(b bVar, k1.c cVar, k1.l lVar) {
        this.f5257p = bVar;
        this.f5256o = cVar;
    }

    private final void c(d dVar) {
        synchronized (this.f5254m) {
            k1.c cVar = this.f5256o;
            if (cVar != null) {
                cVar.a(dVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ java.lang.Object a() {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.r.a():java.lang.Object");
    }

    final /* synthetic */ void b() {
        this.f5257p.f5139a = 0;
        this.f5257p.f5145g = null;
        d dVar = v.f5274n;
        this.f5257p.P(t.a(24, 6, dVar));
        c(dVar);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.a0.h("BillingClient", "Billing service connected.");
        this.f5257p.f5145g = g6.C(iBinder);
        Callable callable = new Callable() { // from class: com.android.billingclient.api.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f5252a.a();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f5253m.b();
            }
        };
        b bVar = this.f5257p;
        if (bVar.O(callable, 30000L, runnable, bVar.K()) == null) {
            b bVar2 = this.f5257p;
            d dVarM = bVar2.M();
            bVar2.P(t.a(25, 6, dVarM));
            c(dVarM);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.a0.i("BillingClient", "Billing service disconnected.");
        this.f5257p.f5144f.b(b6.C());
        this.f5257p.f5145g = null;
        this.f5257p.f5139a = 0;
        synchronized (this.f5254m) {
            k1.c cVar = this.f5256o;
            if (cVar != null) {
                cVar.b();
            }
        }
    }
}
