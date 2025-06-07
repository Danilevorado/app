package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class m7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ AtomicReference f20179m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ z9 f20180n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ h8 f20181o;

    m7(h8 h8Var, AtomicReference atomicReference, z9 z9Var) {
        this.f20181o = h8Var;
        this.f20179m = atomicReference;
        this.f20180n = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f20179m) {
            try {
                try {
                } catch (RemoteException e5) {
                    this.f20181o.f20269a.b().p().b("Failed to get app instance id", e5);
                    atomicReference = this.f20179m;
                }
                if (!this.f20181o.f20269a.F().o().i(x4.a.ANALYTICS_STORAGE)) {
                    this.f20181o.f20269a.b().v().a("Analytics storage consent denied; will not get app instance id");
                    this.f20181o.f20269a.I().C(null);
                    this.f20181o.f20269a.F().f19924g.b(null);
                    this.f20179m.set(null);
                    return;
                }
                h8 h8Var = this.f20181o;
                x4.f fVar = h8Var.f19989d;
                if (fVar == null) {
                    h8Var.f20269a.b().p().a("Failed to get app instance id");
                    return;
                }
                e4.p.l(this.f20180n);
                this.f20179m.set(fVar.M2(this.f20180n));
                String str = (String) this.f20179m.get();
                if (str != null) {
                    this.f20181o.f20269a.I().C(str);
                    this.f20181o.f20269a.F().f19924g.b(str);
                }
                this.f20181o.E();
                atomicReference = this.f20179m;
                atomicReference.notify();
            } finally {
                this.f20179m.notify();
            }
        }
    }
}
