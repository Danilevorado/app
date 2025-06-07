package com.meta.analytics.dsp.uinode;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Dt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0552Dt {
    public final int A00;
    public final long A01;

    public C0552Dt(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public /* synthetic */ C0552Dt(int i10, long j10, C0551Ds c0551Ds) {
        this(i10, j10);
    }

    public static C0552Dt A00(Parcel parcel) {
        return new C0552Dt(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
