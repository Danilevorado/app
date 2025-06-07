package e4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class r extends f4.a {
    public static final Parcelable.Creator<r> CREATOR = new x0();

    /* renamed from: m, reason: collision with root package name */
    private final int f23220m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f23221n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f23222o;

    /* renamed from: p, reason: collision with root package name */
    private final int f23223p;

    /* renamed from: q, reason: collision with root package name */
    private final int f23224q;

    public r(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f23220m = i10;
        this.f23221n = z10;
        this.f23222o = z11;
        this.f23223p = i11;
        this.f23224q = i12;
    }

    public int f() {
        return this.f23223p;
    }

    public int h() {
        return this.f23224q;
    }

    public boolean v() {
        return this.f23221n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, y());
        f4.c.c(parcel, 2, v());
        f4.c.c(parcel, 3, x());
        f4.c.k(parcel, 4, f());
        f4.c.k(parcel, 5, h());
        f4.c.b(parcel, iA);
    }

    public boolean x() {
        return this.f23222o;
    }

    public int y() {
        return this.f23220m;
    }
}
