package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c3 extends f4.a {
    public static final Parcelable.Creator<c3> CREATOR = new d3();

    /* renamed from: m, reason: collision with root package name */
    private final int f24611m;

    /* renamed from: n, reason: collision with root package name */
    private final int f24612n;

    /* renamed from: o, reason: collision with root package name */
    private final String f24613o;

    public c3(int i10, int i11, String str) {
        this.f24611m = i10;
        this.f24612n = i11;
        this.f24613o = str;
    }

    public final int f() {
        return this.f24612n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f24611m);
        f4.c.k(parcel, 2, this.f24612n);
        f4.c.q(parcel, 3, this.f24613o, false);
        f4.c.b(parcel, iA);
    }
}
