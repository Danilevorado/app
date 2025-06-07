package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class qe0 extends Thread {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f14280m;

    qe0(se0 se0Var, String str) {
        this.f14280m = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new ef0(null).o(this.f14280m);
    }
}
