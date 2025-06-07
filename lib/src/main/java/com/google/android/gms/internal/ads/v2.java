package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v2 extends j3 {
    public static final Parcelable.Creator<v2> CREATOR = new u2();

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f16539n;

    /* JADX WARN: Illegal instructions before constructor call */
    v2(Parcel parcel) {
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        super(string);
        this.f16539n = parcel.createByteArray();
    }

    public v2(String str, byte[] bArr) {
        super(str);
        this.f16539n = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v2.class == obj.getClass()) {
            v2 v2Var = (v2) obj;
            if (this.f10269m.equals(v2Var.f10269m) && Arrays.equals(this.f16539n, v2Var.f16539n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10269m.hashCode() + 527) * 31) + Arrays.hashCode(this.f16539n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10269m);
        parcel.writeByteArray(this.f16539n);
    }
}
