package b4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c0 extends f4.a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: m, reason: collision with root package name */
    private final boolean f4407m;

    /* renamed from: n, reason: collision with root package name */
    private final String f4408n;

    /* renamed from: o, reason: collision with root package name */
    private final int f4409o;

    /* renamed from: p, reason: collision with root package name */
    private final int f4410p;

    c0(boolean z10, String str, int i10, int i11) {
        this.f4407m = z10;
        this.f4408n = str;
        this.f4409o = k0.a(i10) - 1;
        this.f4410p = p.a(i11) - 1;
    }

    public final String f() {
        return this.f4408n;
    }

    public final boolean h() {
        return this.f4407m;
    }

    public final int v() {
        return p.a(this.f4410p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.c(parcel, 1, this.f4407m);
        f4.c.q(parcel, 2, this.f4408n, false);
        f4.c.k(parcel, 3, this.f4409o);
        f4.c.k(parcel, 4, this.f4410p);
        f4.c.b(parcel, iA);
    }

    public final int x() {
        return k0.a(this.f4409o);
    }
}
