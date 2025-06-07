package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class fk implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ gk f8306m;

    fk(gk gkVar) {
        this.f8306m = gkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8306m.f8774o) {
            gk gkVar = this.f8306m;
            if (gkVar.f8775p && gkVar.f8776q) {
                gkVar.f8775p = false;
                ze0.b("App went background");
                Iterator it = this.f8306m.f8777r.iterator();
                while (it.hasNext()) {
                    try {
                        ((hk) it.next()).a(false);
                    } catch (Exception e5) {
                        ze0.e("", e5);
                    }
                }
            } else {
                ze0.b("App is still foreground");
            }
        }
    }
}
