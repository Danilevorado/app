package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class s44 extends n.e {

    /* renamed from: n, reason: collision with root package name */
    private final WeakReference f15083n;

    public s44(ks ksVar) {
        this.f15083n = new WeakReference(ksVar);
    }

    @Override // n.e
    public final void a(ComponentName componentName, n.c cVar) {
        ks ksVar = (ks) this.f15083n.get();
        if (ksVar != null) {
            ksVar.c(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ks ksVar = (ks) this.f15083n.get();
        if (ksVar != null) {
            ksVar.d();
        }
    }
}
