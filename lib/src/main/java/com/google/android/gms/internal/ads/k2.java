package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k2 implements kc0 {
    public static final Parcelable.Creator<k2> CREATOR;

    /* renamed from: s, reason: collision with root package name */
    private static final k9 f10777s;

    /* renamed from: t, reason: collision with root package name */
    private static final k9 f10778t;

    /* renamed from: m, reason: collision with root package name */
    public final String f10779m;

    /* renamed from: n, reason: collision with root package name */
    public final String f10780n;

    /* renamed from: o, reason: collision with root package name */
    public final long f10781o;

    /* renamed from: p, reason: collision with root package name */
    public final long f10782p;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f10783q;

    /* renamed from: r, reason: collision with root package name */
    private int f10784r;

    static {
        i7 i7Var = new i7();
        i7Var.s("application/id3");
        f10777s = i7Var.y();
        i7 i7Var2 = new i7();
        i7Var2.s("application/x-scte35");
        f10778t = i7Var2.y();
        CREATOR = new j2();
    }

    k2(Parcel parcel) {
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        this.f10779m = string;
        this.f10780n = parcel.readString();
        this.f10781o = parcel.readLong();
        this.f10782p = parcel.readLong();
        this.f10783q = parcel.createByteArray();
    }

    public k2(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f10779m = str;
        this.f10780n = str2;
        this.f10781o = j10;
        this.f10782p = j11;
        this.f10783q = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k2.class == obj.getClass()) {
            k2 k2Var = (k2) obj;
            if (this.f10781o == k2Var.f10781o && this.f10782p == k2Var.f10782p && sv2.b(this.f10779m, k2Var.f10779m) && sv2.b(this.f10780n, k2Var.f10780n) && Arrays.equals(this.f10783q, k2Var.f10783q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f10784r;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f10779m;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f10780n;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j10 = this.f10781o;
        long j11 = this.f10782p;
        int iHashCode3 = ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f10783q);
        this.f10784r = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.android.gms.internal.ads.kc0
    public final /* synthetic */ void p(n70 n70Var) {
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f10779m + ", id=" + this.f10782p + ", durationMs=" + this.f10781o + ", value=" + this.f10780n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10779m);
        parcel.writeString(this.f10780n);
        parcel.writeLong(this.f10781o);
        parcel.writeLong(this.f10782p);
        parcel.writeByteArray(this.f10783q);
    }
}
