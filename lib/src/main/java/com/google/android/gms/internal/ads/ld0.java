package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class ld0 implements Parcelable {
    public static final Parcelable.Creator<ld0> CREATOR = new kb0();

    /* renamed from: m, reason: collision with root package name */
    private final kc0[] f11486m;

    /* renamed from: n, reason: collision with root package name */
    public final long f11487n;

    public ld0(long j10, kc0... kc0VarArr) {
        this.f11487n = j10;
        this.f11486m = kc0VarArr;
    }

    ld0(Parcel parcel) {
        this.f11486m = new kc0[parcel.readInt()];
        int i10 = 0;
        while (true) {
            kc0[] kc0VarArr = this.f11486m;
            if (i10 >= kc0VarArr.length) {
                this.f11487n = parcel.readLong();
                return;
            } else {
                kc0VarArr[i10] = (kc0) parcel.readParcelable(kc0.class.getClassLoader());
                i10++;
            }
        }
    }

    public ld0(List list) {
        this(-9223372036854775807L, (kc0[]) list.toArray(new kc0[0]));
    }

    public final int a() {
        return this.f11486m.length;
    }

    public final kc0 b(int i10) {
        return this.f11486m[i10];
    }

    public final ld0 c(kc0... kc0VarArr) {
        int length = kc0VarArr.length;
        if (length == 0) {
            return this;
        }
        long j10 = this.f11487n;
        kc0[] kc0VarArr2 = this.f11486m;
        int i10 = sv2.f15560a;
        int length2 = kc0VarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(kc0VarArr2, length2 + length);
        System.arraycopy(kc0VarArr, 0, objArrCopyOf, length2, length);
        return new ld0(j10, (kc0[]) objArrCopyOf);
    }

    public final ld0 d(ld0 ld0Var) {
        return ld0Var == null ? this : c(ld0Var.f11486m);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ld0.class == obj.getClass()) {
            ld0 ld0Var = (ld0) obj;
            if (Arrays.equals(this.f11486m, ld0Var.f11486m) && this.f11487n == ld0Var.f11487n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f11486m) * 31;
        long j10 = this.f11487n;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        String string = Arrays.toString(this.f11486m);
        long j10 = this.f11487n;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11486m.length);
        for (kc0 kc0Var : this.f11486m) {
            parcel.writeParcelable(kc0Var, 0);
        }
        parcel.writeLong(this.f11487n);
    }
}
