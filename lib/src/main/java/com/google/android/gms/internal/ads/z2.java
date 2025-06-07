package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z2 extends j3 {
    public static final Parcelable.Creator<z2> CREATOR = new y2();

    /* renamed from: n, reason: collision with root package name */
    public final String f18369n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f18370o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f18371p;

    /* renamed from: q, reason: collision with root package name */
    public final String[] f18372q;

    /* renamed from: r, reason: collision with root package name */
    private final j3[] f18373r;

    z2(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        this.f18369n = string;
        this.f18370o = parcel.readByte() != 0;
        this.f18371p = parcel.readByte() != 0;
        this.f18372q = parcel.createStringArray();
        int i11 = parcel.readInt();
        this.f18373r = new j3[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f18373r[i12] = (j3) parcel.readParcelable(j3.class.getClassLoader());
        }
    }

    public z2(String str, boolean z10, boolean z11, String[] strArr, j3[] j3VarArr) {
        super("CTOC");
        this.f18369n = str;
        this.f18370o = z10;
        this.f18371p = z11;
        this.f18372q = strArr;
        this.f18373r = j3VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z2.class == obj.getClass()) {
            z2 z2Var = (z2) obj;
            if (this.f18370o == z2Var.f18370o && this.f18371p == z2Var.f18371p && sv2.b(this.f18369n, z2Var.f18369n) && Arrays.equals(this.f18372q, z2Var.f18372q) && Arrays.equals(this.f18373r, z2Var.f18373r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((this.f18370o ? 1 : 0) + 527) * 31) + (this.f18371p ? 1 : 0);
        String str = this.f18369n;
        return (i10 * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18369n);
        parcel.writeByte(this.f18370o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f18371p ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f18372q);
        parcel.writeInt(this.f18373r.length);
        for (j3 j3Var : this.f18373r) {
            parcel.writeParcelable(j3Var, 0);
        }
    }
}
