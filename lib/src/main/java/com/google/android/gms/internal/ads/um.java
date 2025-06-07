package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class um {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f16387a;

    /* renamed from: b, reason: collision with root package name */
    private int f16388b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ vm f16389c;

    /* synthetic */ um(vm vmVar, byte[] bArr, tm tmVar) {
        this.f16389c = vmVar;
        this.f16387a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void d() {
        try {
            vm vmVar = this.f16389c;
            if (vmVar.f16773b) {
                vmVar.f16772a.E0(this.f16387a);
                this.f16389c.f16772a.a0(0);
                this.f16389c.f16772a.w(this.f16388b);
                this.f16389c.f16772a.r0(null);
                this.f16389c.f16772a.e();
            }
        } catch (RemoteException e5) {
            ze0.c("Clearcut log failed", e5);
        }
    }

    public final um a(int i10) {
        this.f16388b = i10;
        return this;
    }

    public final synchronized void c() {
        this.f16389c.f16774c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sm
            @Override // java.lang.Runnable
            public final void run() {
                this.f15323m.d();
            }
        });
    }
}
