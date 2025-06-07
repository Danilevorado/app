package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l3 extends j3 {
    public static final Parcelable.Creator<l3> CREATOR = new k3();

    /* renamed from: n, reason: collision with root package name */
    public final String f11308n;

    /* renamed from: o, reason: collision with root package name */
    public final String f11309o;

    /* renamed from: p, reason: collision with root package name */
    public final String f11310p;

    l3(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        this.f11308n = string;
        this.f11309o = parcel.readString();
        this.f11310p = parcel.readString();
    }

    public l3(String str, String str2, String str3) {
        super("----");
        this.f11308n = str;
        this.f11309o = str2;
        this.f11310p = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l3.class == obj.getClass()) {
            l3 l3Var = (l3) obj;
            if (sv2.b(this.f11309o, l3Var.f11309o) && sv2.b(this.f11308n, l3Var.f11308n) && sv2.b(this.f11310p, l3Var.f11310p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11308n;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f11309o;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.f11310p;
        return (((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.j3
    public final String toString() {
        return this.f10269m + ": domain=" + this.f11308n + ", description=" + this.f11309o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10269m);
        parcel.writeString(this.f11308n);
        parcel.writeString(this.f11310p);
    }
}
