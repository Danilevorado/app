package e4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e1 extends f4.a {
    public static final Parcelable.Creator<e1> CREATOR = new f1();

    /* renamed from: m, reason: collision with root package name */
    Bundle f23128m;

    /* renamed from: n, reason: collision with root package name */
    b4.d[] f23129n;

    /* renamed from: o, reason: collision with root package name */
    int f23130o;

    /* renamed from: p, reason: collision with root package name */
    f f23131p;

    e1(Bundle bundle, b4.d[] dVarArr, int i10, f fVar) {
        this.f23128m = bundle;
        this.f23129n = dVarArr;
        this.f23130o = i10;
        this.f23131p = fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.e(parcel, 1, this.f23128m, false);
        f4.c.t(parcel, 2, this.f23129n, i10, false);
        f4.c.k(parcel, 3, this.f23130o);
        f4.c.p(parcel, 4, this.f23131p, i10, false);
        f4.c.b(parcel, iA);
    }
}
