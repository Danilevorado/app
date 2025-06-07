package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t2 extends j3 {
    public static final Parcelable.Creator<t2> CREATOR = new s2();

    /* renamed from: n, reason: collision with root package name */
    public final String f15652n;

    /* renamed from: o, reason: collision with root package name */
    public final String f15653o;

    /* renamed from: p, reason: collision with root package name */
    public final int f15654p;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f15655q;

    t2(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        this.f15652n = string;
        this.f15653o = parcel.readString();
        this.f15654p = parcel.readInt();
        this.f15655q = parcel.createByteArray();
    }

    public t2(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f15652n = str;
        this.f15653o = str2;
        this.f15654p = i10;
        this.f15655q = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t2.class == obj.getClass()) {
            t2 t2Var = (t2) obj;
            if (this.f15654p == t2Var.f15654p && sv2.b(this.f15652n, t2Var.f15652n) && sv2.b(this.f15653o, t2Var.f15653o) && Arrays.equals(this.f15655q, t2Var.f15655q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f15654p + 527;
        String str = this.f15652n;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i11 = i10 * 31;
        String str2 = this.f15653o;
        return ((((i11 + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f15655q);
    }

    @Override // com.google.android.gms.internal.ads.j3, com.google.android.gms.internal.ads.kc0
    public final void p(n70 n70Var) {
        n70Var.s(this.f15655q, this.f15654p);
    }

    @Override // com.google.android.gms.internal.ads.j3
    public final String toString() {
        return this.f10269m + ": mimeType=" + this.f15652n + ", description=" + this.f15653o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15652n);
        parcel.writeString(this.f15653o);
        parcel.writeInt(this.f15654p);
        parcel.writeByteArray(this.f15655q);
    }
}
