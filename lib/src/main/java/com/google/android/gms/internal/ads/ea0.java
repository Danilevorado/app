package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ea0 extends dj implements ga0 {
    ea0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final void c1(aa0 aa0Var) {
        Parcel parcelC = C();
        fj.f(parcelC, aa0Var);
        L0(5, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final void e() {
        L0(4, C());
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final void g() {
        L0(6, C());
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final void i() {
        L0(1, C());
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final void j() {
        L0(2, C());
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final void k() {
        L0(8, C());
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final void l() {
        L0(3, C());
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final void w(int i10) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        L0(7, parcelC);
    }
}
