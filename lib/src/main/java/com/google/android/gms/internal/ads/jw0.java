package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class jw0 extends zu0 {

    /* renamed from: i, reason: collision with root package name */
    private final hw f10725i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f10726j;

    /* renamed from: k, reason: collision with root package name */
    private final Executor f10727k;

    public jw0(cx0 cx0Var, hw hwVar, Runnable runnable, Executor executor) {
        super(cx0Var);
        this.f10725i = hwVar;
        this.f10726j = runnable;
        this.f10727k = executor;
    }

    static /* synthetic */ void o(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.ex0
    public final void b() {
        final hw0 hw0Var = new hw0(new AtomicReference(this.f10726j));
        this.f10727k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.iw0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10187m.p(hw0Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final View i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final k3.m2 j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final in2 k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final in2 l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final void n(ViewGroup viewGroup, k3.h4 h4Var) {
    }

    final /* synthetic */ void p(Runnable runnable) {
        try {
            if (this.f10725i.G0(l4.b.p1(runnable))) {
                return;
            }
            o(((hw0) runnable).f9428m);
        } catch (RemoteException unused) {
            o(((hw0) runnable).f9428m);
        }
    }
}
