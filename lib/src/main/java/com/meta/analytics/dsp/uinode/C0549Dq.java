package com.meta.analytics.dsp.uinode;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Dq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0549Dq {
    public final int A00;
    public final long A01;
    public final long A02;

    public C0549Dq(int i10, long j10, long j11) {
        this.A00 = i10;
        this.A02 = j10;
        this.A01 = j11;
    }

    public /* synthetic */ C0549Dq(int i10, long j10, long j11, C0548Dp c0548Dp) {
        this(i10, j10, j11);
    }

    public static C0549Dq A00(Parcel parcel) {
        return new C0549Dq(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
