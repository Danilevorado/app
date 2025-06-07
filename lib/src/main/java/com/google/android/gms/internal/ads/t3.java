package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t3 extends j3 {
    public static final Parcelable.Creator<t3> CREATOR = new s3();

    /* renamed from: n, reason: collision with root package name */
    public final String f15664n;

    /* renamed from: o, reason: collision with root package name */
    public final String f15665o;

    /* JADX WARN: Illegal instructions before constructor call */
    t3(Parcel parcel) {
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        super(string);
        this.f15664n = parcel.readString();
        this.f15665o = parcel.readString();
    }

    public t3(String str, String str2, String str3) {
        super(str);
        this.f15664n = str2;
        this.f15665o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t3.class == obj.getClass()) {
            t3 t3Var = (t3) obj;
            if (this.f10269m.equals(t3Var.f10269m) && sv2.b(this.f15664n, t3Var.f15664n) && sv2.b(this.f15665o, t3Var.f15665o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f10269m.hashCode() + 527;
        String str = this.f15664n;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i10 = iHashCode * 31;
        String str2 = this.f15665o;
        return ((i10 + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.j3
    public final String toString() {
        return this.f10269m + ": url=" + this.f15665o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10269m);
        parcel.writeString(this.f15664n);
        parcel.writeString(this.f15665o);
    }
}
