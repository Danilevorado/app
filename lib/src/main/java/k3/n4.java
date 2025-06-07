package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n4 extends f4.a {
    public static final Parcelable.Creator<n4> CREATOR = new o4();

    /* renamed from: m, reason: collision with root package name */
    public final int f24705m;

    public n4(int i10) {
        this.f24705m = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 2, this.f24705m);
        f4.c.b(parcel, iA);
    }
}
