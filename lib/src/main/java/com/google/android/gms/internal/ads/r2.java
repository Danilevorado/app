package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r2 implements kc0 {
    public static final Parcelable.Creator<r2> CREATOR = new q2();

    /* renamed from: m, reason: collision with root package name */
    public final int f14578m;

    /* renamed from: n, reason: collision with root package name */
    public final String f14579n;

    /* renamed from: o, reason: collision with root package name */
    public final String f14580o;

    /* renamed from: p, reason: collision with root package name */
    public final String f14581p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f14582q;

    /* renamed from: r, reason: collision with root package name */
    public final int f14583r;

    public r2(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        gt1.d(z11);
        this.f14578m = i10;
        this.f14579n = str;
        this.f14580o = str2;
        this.f14581p = str3;
        this.f14582q = z10;
        this.f14583r = i11;
    }

    r2(Parcel parcel) {
        this.f14578m = parcel.readInt();
        this.f14579n = parcel.readString();
        this.f14580o = parcel.readString();
        this.f14581p = parcel.readString();
        int i10 = sv2.f15560a;
        this.f14582q = parcel.readInt() != 0;
        this.f14583r = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r2.class == obj.getClass()) {
            r2 r2Var = (r2) obj;
            if (this.f14578m == r2Var.f14578m && sv2.b(this.f14579n, r2Var.f14579n) && sv2.b(this.f14580o, r2Var.f14580o) && sv2.b(this.f14581p, r2Var.f14581p) && this.f14582q == r2Var.f14582q && this.f14583r == r2Var.f14583r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f14578m + 527;
        String str = this.f14579n;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i11 = i10 * 31;
        String str2 = this.f14580o;
        int iHashCode2 = (((i11 + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14581p;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f14582q ? 1 : 0)) * 31) + this.f14583r;
    }

    @Override // com.google.android.gms.internal.ads.kc0
    public final void p(n70 n70Var) {
        String str = this.f14580o;
        if (str != null) {
            n70Var.H(str);
        }
        String str2 = this.f14579n;
        if (str2 != null) {
            n70Var.A(str2);
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f14580o + "\", genre=\"" + this.f14579n + "\", bitrate=" + this.f14578m + ", metadataInterval=" + this.f14583r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14578m);
        parcel.writeString(this.f14579n);
        parcel.writeString(this.f14580o);
        parcel.writeString(this.f14581p);
        boolean z10 = this.f14582q;
        int i11 = sv2.f15560a;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.f14583r);
    }
}
