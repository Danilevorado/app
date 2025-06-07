package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class mw2 implements Runnable {
    mw2() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (ow2.f13430k != null) {
            ow2.f13430k.post(ow2.f13431l);
            ow2.f13430k.postDelayed(ow2.f13432m, 200L);
        }
    }
}
