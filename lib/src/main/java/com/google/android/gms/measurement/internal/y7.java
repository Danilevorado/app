package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class y7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ AtomicReference f20587m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f20588n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f20589o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ z9 f20590p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ h8 f20591q;

    y7(h8 h8Var, AtomicReference atomicReference, String str, String str2, String str3, z9 z9Var) {
        this.f20591q = h8Var;
        this.f20587m = atomicReference;
        this.f20588n = str2;
        this.f20589o = str3;
        this.f20590p = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        h8 h8Var;
        x4.f fVar;
        AtomicReference atomicReference2;
        List listP3;
        synchronized (this.f20587m) {
            try {
                try {
                    h8Var = this.f20591q;
                    fVar = h8Var.f19989d;
                } catch (RemoteException e5) {
                    this.f20591q.f20269a.b().p().d("(legacy) Failed to get conditional properties; remote exception", null, this.f20588n, e5);
                    this.f20587m.set(Collections.emptyList());
                    atomicReference = this.f20587m;
                }
                if (fVar == null) {
                    h8Var.f20269a.b().p().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f20588n, this.f20589o);
                    this.f20587m.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    e4.p.l(this.f20590p);
                    atomicReference2 = this.f20587m;
                    listP3 = fVar.A5(this.f20588n, this.f20589o, this.f20590p);
                } else {
                    atomicReference2 = this.f20587m;
                    listP3 = fVar.p3(null, this.f20588n, this.f20589o);
                }
                atomicReference2.set(listP3);
                this.f20591q.E();
                atomicReference = this.f20587m;
                atomicReference.notify();
            } finally {
                this.f20587m.notify();
            }
        }
    }
}
