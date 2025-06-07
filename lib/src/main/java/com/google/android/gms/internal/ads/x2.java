package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x2 extends j3 {
    public static final Parcelable.Creator<x2> CREATOR = new w2();

    /* renamed from: n, reason: collision with root package name */
    public final String f17345n;

    /* renamed from: o, reason: collision with root package name */
    public final int f17346o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17347p;

    /* renamed from: q, reason: collision with root package name */
    public final long f17348q;

    /* renamed from: r, reason: collision with root package name */
    public final long f17349r;

    /* renamed from: s, reason: collision with root package name */
    private final j3[] f17350s;

    x2(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        this.f17345n = string;
        this.f17346o = parcel.readInt();
        this.f17347p = parcel.readInt();
        this.f17348q = parcel.readLong();
        this.f17349r = parcel.readLong();
        int i11 = parcel.readInt();
        this.f17350s = new j3[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f17350s[i12] = (j3) parcel.readParcelable(j3.class.getClassLoader());
        }
    }

    public x2(String str, int i10, int i11, long j10, long j11, j3[] j3VarArr) {
        super("CHAP");
        this.f17345n = str;
        this.f17346o = i10;
        this.f17347p = i11;
        this.f17348q = j10;
        this.f17349r = j11;
        this.f17350s = j3VarArr;
    }

    @Override // com.google.android.gms.internal.ads.j3, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x2.class == obj.getClass()) {
            x2 x2Var = (x2) obj;
            if (this.f17346o == x2Var.f17346o && this.f17347p == x2Var.f17347p && this.f17348q == x2Var.f17348q && this.f17349r == x2Var.f17349r && sv2.b(this.f17345n, x2Var.f17345n) && Arrays.equals(this.f17350s, x2Var.f17350s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.f17346o + 527) * 31) + this.f17347p;
        int i11 = (int) this.f17348q;
        int i12 = (int) this.f17349r;
        String str = this.f17345n;
        return (((((i10 * 31) + i11) * 31) + i12) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17345n);
        parcel.writeInt(this.f17346o);
        parcel.writeInt(this.f17347p);
        parcel.writeLong(this.f17348q);
        parcel.writeLong(this.f17349r);
        parcel.writeInt(this.f17350s.length);
        for (j3 j3Var : this.f17350s) {
            parcel.writeParcelable(j3Var, 0);
        }
    }
}
