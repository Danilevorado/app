package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w3 implements kc0 {
    public static final Parcelable.Creator<w3> CREATOR = new u3();

    /* renamed from: m, reason: collision with root package name */
    public final String f16941m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f16942n;

    /* renamed from: o, reason: collision with root package name */
    public final int f16943o;

    /* renamed from: p, reason: collision with root package name */
    public final int f16944p;

    /* synthetic */ w3(Parcel parcel, v3 v3Var) {
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        this.f16941m = string;
        this.f16942n = parcel.createByteArray();
        this.f16943o = parcel.readInt();
        this.f16944p = parcel.readInt();
    }

    public w3(String str, byte[] bArr, int i10, int i11) {
        this.f16941m = str;
        this.f16942n = bArr;
        this.f16943o = i10;
        this.f16944p = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w3.class == obj.getClass()) {
            w3 w3Var = (w3) obj;
            if (this.f16941m.equals(w3Var.f16941m) && Arrays.equals(this.f16942n, w3Var.f16942n) && this.f16943o == w3Var.f16943o && this.f16944p == w3Var.f16944p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f16941m.hashCode() + 527) * 31) + Arrays.hashCode(this.f16942n)) * 31) + this.f16943o) * 31) + this.f16944p;
    }

    @Override // com.google.android.gms.internal.ads.kc0
    public final /* synthetic */ void p(n70 n70Var) {
    }

    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.f16941m));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16941m);
        parcel.writeByteArray(this.f16942n);
        parcel.writeInt(this.f16943o);
        parcel.writeInt(this.f16944p);
    }
}
