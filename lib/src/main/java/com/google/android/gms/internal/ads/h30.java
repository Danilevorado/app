package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h30 {

    /* renamed from: b, reason: collision with root package name */
    private static h30 f8985b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f8986a = new AtomicBoolean(false);

    h30() {
    }

    public static h30 a() {
        if (f8985b == null) {
            f8985b = new h30();
        }
        return f8985b;
    }

    public final Thread b(final Context context, final String str) {
        if (!this.f8986a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.g30
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                String str2 = str;
                ir.a(context2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) k3.w.c().b(ir.f9957h0)).booleanValue());
                if (((Boolean) k3.w.c().b(ir.f10033o0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((jm0) df0.b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new bf0() { // from class: com.google.android.gms.internal.ads.f30
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.internal.ads.bf0
                        public final Object a(Object obj) {
                            return im0.L5(obj);
                        }
                    })).L3(l4.b.p1(context2), new e30(w4.a.k(context2, "FA-Ads", "am", str2, bundle)));
                } catch (RemoteException | cf0 | NullPointerException e5) {
                    ze0.i("#007 Could not call remote method.", e5);
                }
            }
        });
        thread.start();
        return thread;
    }
}
