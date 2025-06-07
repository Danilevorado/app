package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b3 extends j3 {
    public static final Parcelable.Creator<b3> CREATOR = new a3();

    /* renamed from: n, reason: collision with root package name */
    public final String f6317n;

    /* renamed from: o, reason: collision with root package name */
    public final String f6318o;

    /* renamed from: p, reason: collision with root package name */
    public final String f6319p;

    b3(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        this.f6317n = string;
        this.f6318o = parcel.readString();
        this.f6319p = parcel.readString();
    }

    public b3(String str, String str2, String str3) {
        super("COMM");
        this.f6317n = str;
        this.f6318o = str2;
        this.f6319p = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b3.class == obj.getClass()) {
            b3 b3Var = (b3) obj;
            if (sv2.b(this.f6318o, b3Var.f6318o) && sv2.b(this.f6317n, b3Var.f6317n) && sv2.b(this.f6319p, b3Var.f6319p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6317n;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f6318o;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.f6319p;
        return (((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.j3
    public final String toString() {
        return this.f10269m + ": language=" + this.f6317n + ", description=" + this.f6318o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10269m);
        parcel.writeString(this.f6317n);
        parcel.writeString(this.f6319p);
    }
}
