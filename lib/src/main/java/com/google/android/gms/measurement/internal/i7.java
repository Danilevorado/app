package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
final class i7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f20065m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f20066n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ z9 f20067o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ boolean f20068p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f20069q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ h8 f20070r;

    i7(h8 h8Var, String str, String str2, z9 z9Var, boolean z10, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f20070r = h8Var;
        this.f20065m = str;
        this.f20066n = str2;
        this.f20067o = z9Var;
        this.f20068p = z10;
        this.f20069q = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e5;
        Bundle bundle2 = new Bundle();
        try {
            h8 h8Var = this.f20070r;
            x4.f fVar = h8Var.f19989d;
            if (fVar == null) {
                h8Var.f20269a.b().p().c("Failed to get user properties; not connected to service", this.f20065m, this.f20066n);
                this.f20070r.f20269a.N().F(this.f20069q, bundle2);
                return;
            }
            e4.p.l(this.f20067o);
            List<q9> listL2 = fVar.L2(this.f20065m, this.f20066n, this.f20068p, this.f20067o);
            bundle = new Bundle();
            if (listL2 != null) {
                for (q9 q9Var : listL2) {
                    String str = q9Var.f20317q;
                    if (str != null) {
                        bundle.putString(q9Var.f20314n, str);
                    } else {
                        Long l10 = q9Var.f20316p;
                        if (l10 != null) {
                            bundle.putLong(q9Var.f20314n, l10.longValue());
                        } else {
                            Double d10 = q9Var.f20319s;
                            if (d10 != null) {
                                bundle.putDouble(q9Var.f20314n, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.f20070r.E();
                    this.f20070r.f20269a.N().F(this.f20069q, bundle);
                } catch (Throwable th) {
                    th = th;
                    bundle2 = bundle;
                    this.f20070r.f20269a.N().F(this.f20069q, bundle2);
                    throw th;
                }
            } catch (RemoteException e10) {
                e5 = e10;
                this.f20070r.f20269a.b().p().c("Failed to get user properties; remote exception", this.f20065m, e5);
                this.f20070r.f20269a.N().F(this.f20069q, bundle);
            }
        } catch (RemoteException e11) {
            bundle = bundle2;
            e5 = e11;
        } catch (Throwable th2) {
            th = th2;
            this.f20070r.f20269a.N().F(this.f20069q, bundle2);
            throw th;
        }
    }
}
