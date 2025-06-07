package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class ns1 extends e90 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ os1 f12841m;

    protected ns1(os1 os1Var) {
        this.f12841m = os1Var;
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void l0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f12841m.f13375m.e(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void u0(m3.a0 a0Var) {
        this.f12841m.f13375m.f(a0Var.f());
    }
}
