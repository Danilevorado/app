package e4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class f extends f4.a {
    public static final Parcelable.Creator<f> CREATOR = new g1();

    /* renamed from: m, reason: collision with root package name */
    private final r f23132m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f23133n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f23134o;

    /* renamed from: p, reason: collision with root package name */
    private final int[] f23135p;

    /* renamed from: q, reason: collision with root package name */
    private final int f23136q;

    /* renamed from: r, reason: collision with root package name */
    private final int[] f23137r;

    public f(r rVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f23132m = rVar;
        this.f23133n = z10;
        this.f23134o = z11;
        this.f23135p = iArr;
        this.f23136q = i10;
        this.f23137r = iArr2;
    }

    public int f() {
        return this.f23136q;
    }

    public int[] h() {
        return this.f23135p;
    }

    public int[] v() {
        return this.f23137r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.p(parcel, 1, this.f23132m, i10, false);
        f4.c.c(parcel, 2, x());
        f4.c.c(parcel, 3, y());
        f4.c.l(parcel, 4, h(), false);
        f4.c.k(parcel, 5, f());
        f4.c.l(parcel, 6, v(), false);
        f4.c.b(parcel, iA);
    }

    public boolean x() {
        return this.f23133n;
    }

    public boolean y() {
        return this.f23134o;
    }

    public final r z() {
        return this.f23132m;
    }
}
