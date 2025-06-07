package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public abstract class kz extends ej implements lz {
    public kz() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) fj.a(parcel, ParcelFileDescriptor.CREATOR);
        fj.c(parcel);
        o1(parcelFileDescriptor);
        return true;
    }
}
