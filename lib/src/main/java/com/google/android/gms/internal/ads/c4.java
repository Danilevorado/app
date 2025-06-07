package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c4 implements kc0 {
    public static final Parcelable.Creator<c4> CREATOR = new a4();

    /* renamed from: m, reason: collision with root package name */
    public final float f6767m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6768n;

    public c4(float f5, int i10) {
        this.f6767m = f5;
        this.f6768n = i10;
    }

    /* synthetic */ c4(Parcel parcel, b4 b4Var) {
        this.f6767m = parcel.readFloat();
        this.f6768n = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c4.class == obj.getClass()) {
            c4 c4Var = (c4) obj;
            if (this.f6767m == c4Var.f6767m && this.f6768n == c4Var.f6768n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f6767m).hashCode() + 527) * 31) + this.f6768n;
    }

    @Override // com.google.android.gms.internal.ads.kc0
    public final /* synthetic */ void p(n70 n70Var) {
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f6767m + ", svcTemporalLayerCount=" + this.f6768n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f6767m);
        parcel.writeInt(this.f6768n);
    }
}
