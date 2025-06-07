package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class yy2 extends f4.a {
    public static final Parcelable.Creator<yy2> CREATOR = new zy2();

    /* renamed from: m, reason: collision with root package name */
    public final int f18324m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f18325n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18326o;

    yy2(int i10, byte[] bArr, int i11) {
        this.f18324m = i10;
        this.f18325n = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f18326o = i11;
    }

    public yy2(byte[] bArr, int i10) {
        this(1, null, 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f18324m);
        f4.c.f(parcel, 2, this.f18325n, false);
        f4.c.k(parcel, 3, this.f18326o);
        f4.c.b(parcel, iA);
    }
}
