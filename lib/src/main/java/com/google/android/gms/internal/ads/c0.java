package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class c0 implements Comparator, Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new bm4();

    /* renamed from: m, reason: collision with root package name */
    private final b[] f6731m;

    /* renamed from: n, reason: collision with root package name */
    private int f6732n;

    /* renamed from: o, reason: collision with root package name */
    public final String f6733o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6734p;

    c0(Parcel parcel) {
        this.f6733o = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        int i10 = sv2.f15560a;
        this.f6731m = bVarArr;
        this.f6734p = bVarArr.length;
    }

    private c0(String str, boolean z10, b... bVarArr) {
        this.f6733o = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f6731m = bVarArr;
        this.f6734p = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public c0(String str, b... bVarArr) {
        this(null, true, bVarArr);
    }

    public c0(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public final b a(int i10) {
        return this.f6731m[i10];
    }

    public final c0 b(String str) {
        return sv2.b(this.f6733o, str) ? this : new c0(str, false, this.f6731m);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        b bVar = (b) obj;
        b bVar2 = (b) obj2;
        UUID uuid = yb4.f17956a;
        return uuid.equals(bVar.f6296n) ? !uuid.equals(bVar2.f6296n) ? 1 : 0 : bVar.f6296n.compareTo(bVar2.f6296n);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (sv2.b(this.f6733o, c0Var.f6733o) && Arrays.equals(this.f6731m, c0Var.f6731m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f6732n;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f6733o;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f6731m);
        this.f6732n = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6733o);
        parcel.writeTypedArray(this.f6731m, 0);
    }
}
