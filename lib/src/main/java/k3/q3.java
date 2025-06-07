package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q3 extends f4.a {
    public static final Parcelable.Creator<q3> CREATOR = new r3();

    /* renamed from: m, reason: collision with root package name */
    public final int f24719m;

    /* renamed from: n, reason: collision with root package name */
    public final int f24720n;

    public q3(int i10, int i11) {
        this.f24719m = i10;
        this.f24720n = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f24719m);
        f4.c.k(parcel, 2, this.f24720n);
        f4.c.b(parcel, iA);
    }
}
