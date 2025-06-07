package z4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.k0;

/* loaded from: classes.dex */
public final class j extends f4.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: m, reason: collision with root package name */
    final int f28876m;

    /* renamed from: n, reason: collision with root package name */
    final k0 f28877n;

    j(int i10, k0 k0Var) {
        this.f28876m = i10;
        this.f28877n = k0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f28876m);
        f4.c.p(parcel, 2, this.f28877n, i10, false);
        f4.c.b(parcel, iA);
    }
}
