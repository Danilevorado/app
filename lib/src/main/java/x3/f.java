package x3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f extends f4.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: m, reason: collision with root package name */
    private final String f28250m;

    /* renamed from: n, reason: collision with root package name */
    private final int f28251n;

    public f(String str, int i10) {
        this.f28250m = str;
        this.f28251n = i10;
    }

    public final int f() {
        return this.f28251n;
    }

    public final String h() {
        return this.f28250m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, this.f28250m, false);
        f4.c.k(parcel, 2, this.f28251n);
        f4.c.b(parcel, iA);
    }
}
