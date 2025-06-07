package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class a8 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ AtomicReference f19761m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f19762n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f19763o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ z9 f19764p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ boolean f19765q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ h8 f19766r;

    a8(h8 h8Var, AtomicReference atomicReference, String str, String str2, String str3, z9 z9Var, boolean z10) {
        this.f19766r = h8Var;
        this.f19761m = atomicReference;
        this.f19762n = str2;
        this.f19763o = str3;
        this.f19764p = z9Var;
        this.f19765q = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        h8 h8Var;
        x4.f fVar;
        AtomicReference atomicReference2;
        List listT1;
        synchronized (this.f19761m) {
            try {
                try {
                    h8Var = this.f19766r;
                    fVar = h8Var.f19989d;
                } catch (RemoteException e5) {
                    this.f19766r.f20269a.b().p().d("(legacy) Failed to get user properties; remote exception", null, this.f19762n, e5);
                    this.f19761m.set(Collections.emptyList());
                    atomicReference = this.f19761m;
                }
                if (fVar == null) {
                    h8Var.f20269a.b().p().d("(legacy) Failed to get user properties; not connected to service", null, this.f19762n, this.f19763o);
                    this.f19761m.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    e4.p.l(this.f19764p);
                    atomicReference2 = this.f19761m;
                    listT1 = fVar.L2(this.f19762n, this.f19763o, this.f19765q, this.f19764p);
                } else {
                    atomicReference2 = this.f19761m;
                    listT1 = fVar.T1(null, this.f19762n, this.f19763o, this.f19765q);
                }
                atomicReference2.set(listT1);
                this.f19766r.E();
                atomicReference = this.f19761m;
                atomicReference.notify();
            } finally {
                this.f19761m.notify();
            }
        }
    }
}
