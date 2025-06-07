package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d3 extends j3 {
    public static final Parcelable.Creator<d3> CREATOR = new c3();

    /* renamed from: n, reason: collision with root package name */
    public final String f7172n;

    /* renamed from: o, reason: collision with root package name */
    public final String f7173o;

    /* renamed from: p, reason: collision with root package name */
    public final String f7174p;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f7175q;

    d3(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        this.f7172n = string;
        this.f7173o = parcel.readString();
        this.f7174p = parcel.readString();
        this.f7175q = parcel.createByteArray();
    }

    public d3(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f7172n = str;
        this.f7173o = str2;
        this.f7174p = str3;
        this.f7175q = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d3.class == obj.getClass()) {
            d3 d3Var = (d3) obj;
            if (sv2.b(this.f7172n, d3Var.f7172n) && sv2.b(this.f7173o, d3Var.f7173o) && sv2.b(this.f7174p, d3Var.f7174p) && Arrays.equals(this.f7175q, d3Var.f7175q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7172n;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f7173o;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.f7174p;
        return (((((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f7175q);
    }

    @Override // com.google.android.gms.internal.ads.j3
    public final String toString() {
        return this.f10269m + ": mimeType=" + this.f7172n + ", filename=" + this.f7173o + ", description=" + this.f7174p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7172n);
        parcel.writeString(this.f7173o);
        parcel.writeString(this.f7174p);
        parcel.writeByteArray(this.f7175q);
    }
}
