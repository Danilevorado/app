package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z50 extends f4.a {
    public static final Parcelable.Creator<z50> CREATOR = new a60();

    /* renamed from: m, reason: collision with root package name */
    public final int f18411m;

    /* renamed from: n, reason: collision with root package name */
    public final int f18412n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18413o;

    z50(int i10, int i11, int i12) {
        this.f18411m = i10;
        this.f18412n = i11;
        this.f18413o = i12;
    }

    public static z50 f(d3.v vVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof z50)) {
            z50 z50Var = (z50) obj;
            if (z50Var.f18413o == this.f18413o && z50Var.f18412n == this.f18412n && z50Var.f18411m == this.f18411m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f18411m, this.f18412n, this.f18413o});
    }

    public final String toString() {
        return this.f18411m + "." + this.f18412n + "." + this.f18413o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f18411m);
        f4.c.k(parcel, 2, this.f18412n);
        f4.c.k(parcel, 3, this.f18413o);
        f4.c.b(parcel, iA);
    }
}
