package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class s30 extends dj implements u30 {
    s30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void A() {
        L0(20, C());
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void D() {
        L0(15, C());
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void I1(k3.w2 w2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, w2Var);
        L0(23, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void N() {
        L0(13, C());
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void V3(ra0 ra0Var) {
        Parcel parcelC = C();
        fj.f(parcelC, ra0Var);
        L0(16, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void X1(int i10, String str) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        parcelC.writeString(str);
        L0(22, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void b0(String str) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        L0(21, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void c() {
        L0(1, C());
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void e() {
        L0(2, C());
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void f3(String str, String str2) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        L0(9, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void m() {
        L0(4, C());
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void n() {
        L0(8, C());
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void o() {
        L0(5, C());
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void p() {
        L0(6, C());
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void s0(int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void u() {
        L0(18, C());
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void u5(na0 na0Var) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void v() {
        L0(11, C());
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void v0(k3.w2 w2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, w2Var);
        L0(24, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void w(int i10) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        L0(3, parcelC);
    }

    @Override // com.google.android.gms.internal.ads.u30
    public final void w1(jv jvVar, String str) {
        Parcel parcelC = C();
        fj.f(parcelC, jvVar);
        parcelC.writeString(str);
        L0(10, parcelC);
    }
}
