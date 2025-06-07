package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class yh implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final dh f18044a;

    /* renamed from: b, reason: collision with root package name */
    private final xc f18045b;

    public yh(dh dhVar, xc xcVar) {
        this.f18044a = dhVar;
        this.f18045b = xcVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException {
        if (this.f18044a.l() != null) {
            this.f18044a.l().get();
        }
        vd vdVarC = this.f18044a.c();
        if (vdVarC == null) {
            return null;
        }
        try {
            synchronized (this.f18045b) {
                xc xcVar = this.f18045b;
                byte[] bArrX = vdVarC.x();
                xcVar.k(bArrX, 0, bArrX.length, qx3.a());
            }
            return null;
        } catch (ny3 | NullPointerException unused) {
            return null;
        }
    }
}
