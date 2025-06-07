package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import l4.a;

/* loaded from: classes.dex */
public final class ou extends dj implements qu {
    ou(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.qu
    public final double b() {
        Parcel parcelW0 = w0(3, C());
        double d10 = parcelW0.readDouble();
        parcelW0.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.qu
    public final Uri c() {
        Parcel parcelW0 = w0(2, C());
        Uri uri = (Uri) fj.a(parcelW0, Uri.CREATOR);
        parcelW0.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.qu
    public final int d() {
        Parcel parcelW0 = w0(5, C());
        int i10 = parcelW0.readInt();
        parcelW0.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.qu
    public final l4.a e() {
        Parcel parcelW0 = w0(1, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }

    @Override // com.google.android.gms.internal.ads.qu
    public final int f() {
        Parcel parcelW0 = w0(4, C());
        int i10 = parcelW0.readInt();
        parcelW0.recycle();
        return i10;
    }
}
