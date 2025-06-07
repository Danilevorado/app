package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n3 extends j3 {
    public static final Parcelable.Creator<n3> CREATOR = new m3();

    /* renamed from: n, reason: collision with root package name */
    public final int f12380n;

    /* renamed from: o, reason: collision with root package name */
    public final int f12381o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12382p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f12383q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f12384r;

    public n3(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f12380n = i10;
        this.f12381o = i11;
        this.f12382p = i12;
        this.f12383q = iArr;
        this.f12384r = iArr2;
    }

    n3(Parcel parcel) {
        super("MLLT");
        this.f12380n = parcel.readInt();
        this.f12381o = parcel.readInt();
        this.f12382p = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i10 = sv2.f15560a;
        this.f12383q = iArrCreateIntArray;
        this.f12384r = parcel.createIntArray();
    }

    @Override // com.google.android.gms.internal.ads.j3, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n3.class == obj.getClass()) {
            n3 n3Var = (n3) obj;
            if (this.f12380n == n3Var.f12380n && this.f12381o == n3Var.f12381o && this.f12382p == n3Var.f12382p && Arrays.equals(this.f12383q, n3Var.f12383q) && Arrays.equals(this.f12384r, n3Var.f12384r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f12380n + 527) * 31) + this.f12381o) * 31) + this.f12382p) * 31) + Arrays.hashCode(this.f12383q)) * 31) + Arrays.hashCode(this.f12384r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12380n);
        parcel.writeInt(this.f12381o);
        parcel.writeInt(this.f12382p);
        parcel.writeIntArray(this.f12383q);
        parcel.writeIntArray(this.f12384r);
    }
}
