package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.meta.analytics.dsp.uinode.C0547Do;
import com.meta.analytics.dsp.uinode.C0654Hz;

/* loaded from: assets/audience_network.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C0547Do();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public PrivateCommand(long j10, byte[] bArr, long j11) {
        this.A01 = j11;
        this.A00 = j10;
        this.A02 = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.A02 = bArr;
        parcel.readByteArray(bArr);
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, C0547Do c0547Do) {
        this(parcel);
    }

    public static PrivateCommand A00(C0654Hz c0654Hz, int i10, long j10) {
        long jA0M = c0654Hz.A0M();
        byte[] bArr = new byte[i10 - 4];
        c0654Hz.A0c(bArr, 0, bArr.length);
        return new PrivateCommand(jA0M, bArr, j10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02.length);
        parcel.writeByteArray(this.A02);
    }
}
