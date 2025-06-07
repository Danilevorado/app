package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class vm {

    /* renamed from: a, reason: collision with root package name */
    ij f16772a;

    /* renamed from: b, reason: collision with root package name */
    boolean f16773b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f16774c;

    public vm() {
        this.f16774c = oe0.f13173b;
    }

    public vm(final Context context) {
        ExecutorService executorService = oe0.f13173b;
        this.f16774c = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qm
            @Override // java.lang.Runnable
            public final void run() {
                vm vmVar = this.f14400m;
                Context context2 = context;
                if (((Boolean) k3.w.c().b(ir.A4)).booleanValue()) {
                    try {
                        vmVar.f16772a = (ij) df0.b(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new bf0() { // from class: com.google.android.gms.internal.ads.rm
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.internal.ads.bf0
                            public final Object a(Object obj) {
                                return hj.L5(obj);
                            }
                        });
                        vmVar.f16772a.B2(l4.b.p1(context2), "GMA_SDK");
                        vmVar.f16773b = true;
                    } catch (RemoteException | cf0 | NullPointerException unused) {
                        ze0.b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
