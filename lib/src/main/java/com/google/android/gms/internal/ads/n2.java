package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n2 implements kc0 {
    public static final Parcelable.Creator<n2> CREATOR = new m2();

    /* renamed from: m, reason: collision with root package name */
    public final int f12360m;

    /* renamed from: n, reason: collision with root package name */
    public final String f12361n;

    /* renamed from: o, reason: collision with root package name */
    public final String f12362o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12363p;

    /* renamed from: q, reason: collision with root package name */
    public final int f12364q;

    /* renamed from: r, reason: collision with root package name */
    public final int f12365r;

    /* renamed from: s, reason: collision with root package name */
    public final int f12366s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f12367t;

    public n2(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f12360m = i10;
        this.f12361n = str;
        this.f12362o = str2;
        this.f12363p = i11;
        this.f12364q = i12;
        this.f12365r = i13;
        this.f12366s = i14;
        this.f12367t = bArr;
    }

    n2(Parcel parcel) {
        this.f12360m = parcel.readInt();
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        this.f12361n = string;
        this.f12362o = parcel.readString();
        this.f12363p = parcel.readInt();
        this.f12364q = parcel.readInt();
        this.f12365r = parcel.readInt();
        this.f12366s = parcel.readInt();
        this.f12367t = parcel.createByteArray();
    }

    public static n2 a(jm2 jm2Var) {
        int iM = jm2Var.m();
        String strF = jm2Var.F(jm2Var.m(), u23.f16140a);
        String strF2 = jm2Var.F(jm2Var.m(), u23.f16142c);
        int iM2 = jm2Var.m();
        int iM3 = jm2Var.m();
        int iM4 = jm2Var.m();
        int iM5 = jm2Var.m();
        int iM6 = jm2Var.m();
        byte[] bArr = new byte[iM6];
        jm2Var.b(bArr, 0, iM6);
        return new n2(iM, strF, strF2, iM2, iM3, iM4, iM5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n2.class == obj.getClass()) {
            n2 n2Var = (n2) obj;
            if (this.f12360m == n2Var.f12360m && this.f12361n.equals(n2Var.f12361n) && this.f12362o.equals(n2Var.f12362o) && this.f12363p == n2Var.f12363p && this.f12364q == n2Var.f12364q && this.f12365r == n2Var.f12365r && this.f12366s == n2Var.f12366s && Arrays.equals(this.f12367t, n2Var.f12367t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f12360m + 527) * 31) + this.f12361n.hashCode()) * 31) + this.f12362o.hashCode()) * 31) + this.f12363p) * 31) + this.f12364q) * 31) + this.f12365r) * 31) + this.f12366s) * 31) + Arrays.hashCode(this.f12367t);
    }

    @Override // com.google.android.gms.internal.ads.kc0
    public final void p(n70 n70Var) {
        n70Var.s(this.f12367t, this.f12360m);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f12361n + ", description=" + this.f12362o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12360m);
        parcel.writeString(this.f12361n);
        parcel.writeString(this.f12362o);
        parcel.writeInt(this.f12363p);
        parcel.writeInt(this.f12364q);
        parcel.writeInt(this.f12365r);
        parcel.writeInt(this.f12366s);
        parcel.writeByteArray(this.f12367t);
    }
}
