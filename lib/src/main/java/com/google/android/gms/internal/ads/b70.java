package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class b70 extends dj implements d70 {
    b70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void B() {
        L0(7, C());
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void D() {
        L0(9, C());
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void N4(int i10, int i11, Intent intent) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        parcelC.writeInt(i11);
        fj.d(parcelC, intent);
        L0(12, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void R(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(13, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void S2(Bundle bundle) {
        Parcel parcelC = C();
        fj.d(parcelC, bundle);
        L0(1, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void Y0(int i10, String[] strArr, int[] iArr) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        parcelC.writeStringArray(strArr);
        parcelC.writeIntArray(iArr);
        L0(15, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void f0(Bundle bundle) {
        Parcel parcelC = C();
        fj.d(parcelC, bundle);
        Parcel parcelW0 = w0(6, parcelC);
        if (parcelW0.readInt() != 0) {
            bundle.readFromParcel(parcelW0);
        }
        parcelW0.recycle();
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void g() {
        L0(10, C());
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void l() {
        L0(8, C());
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void m() {
        L0(5, C());
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void o() {
        L0(2, C());
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void q() {
        L0(4, C());
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void t() {
        L0(3, C());
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void u() {
        L0(14, C());
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final boolean z() {
        Parcel parcelW0 = w0(11, C());
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }
}
