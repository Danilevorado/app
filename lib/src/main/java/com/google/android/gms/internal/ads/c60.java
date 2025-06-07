package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class c60 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ AdOverlayInfoParcel f6787m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ zzbqi f6788n;

    c60(zzbqi zzbqiVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f6788n = zzbqiVar;
        this.f6787m = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException {
        j3.t.k();
        l3.s.a(this.f6788n.f18820a, this.f6787m, true);
    }
}
