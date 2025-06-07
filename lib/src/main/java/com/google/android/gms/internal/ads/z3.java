package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z3 implements kc0 {
    public static final Parcelable.Creator<z3> CREATOR = new x3();

    /* renamed from: m, reason: collision with root package name */
    public final long f18390m;

    /* renamed from: n, reason: collision with root package name */
    public final long f18391n;

    /* renamed from: o, reason: collision with root package name */
    public final long f18392o;

    /* renamed from: p, reason: collision with root package name */
    public final long f18393p;

    /* renamed from: q, reason: collision with root package name */
    public final long f18394q;

    public z3(long j10, long j11, long j12, long j13, long j14) {
        this.f18390m = j10;
        this.f18391n = j11;
        this.f18392o = j12;
        this.f18393p = j13;
        this.f18394q = j14;
    }

    /* synthetic */ z3(Parcel parcel, y3 y3Var) {
        this.f18390m = parcel.readLong();
        this.f18391n = parcel.readLong();
        this.f18392o = parcel.readLong();
        this.f18393p = parcel.readLong();
        this.f18394q = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z3.class == obj.getClass()) {
            z3 z3Var = (z3) obj;
            if (this.f18390m == z3Var.f18390m && this.f18391n == z3Var.f18391n && this.f18392o == z3Var.f18392o && this.f18393p == z3Var.f18393p && this.f18394q == z3Var.f18394q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f18390m;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f18391n;
        long j13 = j12 ^ (j12 >>> 32);
        long j14 = this.f18392o;
        long j15 = j14 ^ (j14 >>> 32);
        long j16 = this.f18393p;
        long j17 = j16 ^ (j16 >>> 32);
        long j18 = this.f18394q;
        return ((((((((((int) j11) + 527) * 31) + ((int) j13)) * 31) + ((int) j15)) * 31) + ((int) j17)) * 31) + ((int) (j18 ^ (j18 >>> 32)));
    }

    @Override // com.google.android.gms.internal.ads.kc0
    public final /* synthetic */ void p(n70 n70Var) {
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f18390m + ", photoSize=" + this.f18391n + ", photoPresentationTimestampUs=" + this.f18392o + ", videoStartPosition=" + this.f18393p + ", videoSize=" + this.f18394q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f18390m);
        parcel.writeLong(this.f18391n);
        parcel.writeLong(this.f18392o);
        parcel.writeLong(this.f18393p);
        parcel.writeLong(this.f18394q);
    }
}
