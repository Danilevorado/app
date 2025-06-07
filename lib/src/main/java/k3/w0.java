package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w0 extends f4.a {
    public static final Parcelable.Creator<w0> CREATOR = new v1();

    /* renamed from: m, reason: collision with root package name */
    public final String f24786m;

    /* renamed from: n, reason: collision with root package name */
    public final String f24787n;

    public w0(String str, String str2) {
        this.f24786m = str;
        this.f24787n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, this.f24786m, false);
        f4.c.q(parcel, 2, this.f24787n, false);
        f4.c.b(parcel, iA);
    }
}
