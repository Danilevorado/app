package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class vu1 extends b90 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ wu1 f16862m;

    protected vu1(wu1 wu1Var) {
        this.f16862m = wu1Var;
    }

    @Override // com.google.android.gms.internal.ads.c90
    public final void l0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f16862m.f17267m.e(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.c90
    public final void u0(m3.a0 a0Var) {
        this.f16862m.f17267m.f(a0Var.f());
    }
}
