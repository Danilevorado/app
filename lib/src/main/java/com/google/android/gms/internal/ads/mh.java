package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* loaded from: classes.dex */
final class mh implements AppOpsManager.OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ nh f12100a;

    mh(nh nhVar) {
        this.f12100a = nhVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        nh nhVar;
        boolean z11;
        if (z10) {
            this.f12100a.f12621a = System.currentTimeMillis();
            nhVar = this.f12100a;
            z11 = true;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            nh nhVar2 = this.f12100a;
            if (nhVar2.f12622b > 0 && jCurrentTimeMillis >= nhVar2.f12622b) {
                nhVar2.f12623c = jCurrentTimeMillis - nhVar2.f12622b;
            }
            nhVar = this.f12100a;
            z11 = false;
        }
        nhVar.f12624d = z11;
    }
}
