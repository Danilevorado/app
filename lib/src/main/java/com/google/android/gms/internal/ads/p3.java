package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p3 extends j3 {
    public static final Parcelable.Creator<p3> CREATOR = new o3();

    /* renamed from: n, reason: collision with root package name */
    public final String f13531n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f13532o;

    p3(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        this.f13531n = string;
        this.f13532o = parcel.createByteArray();
    }

    public p3(String str, byte[] bArr) {
        super("PRIV");
        this.f13531n = str;
        this.f13532o = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p3.class == obj.getClass()) {
            p3 p3Var = (p3) obj;
            if (sv2.b(this.f13531n, p3Var.f13531n) && Arrays.equals(this.f13532o, p3Var.f13532o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f13531n;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f13532o);
    }

    @Override // com.google.android.gms.internal.ads.j3
    public final String toString() {
        return this.f10269m + ": owner=" + this.f13531n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13531n);
        parcel.writeByteArray(this.f13532o);
    }
}
