package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v3 extends f4.a {
    public static final Parcelable.Creator<v3> CREATOR = new w3();

    /* renamed from: m, reason: collision with root package name */
    public final boolean f24779m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f24780n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f24781o;

    public v3(d3.x xVar) {
        this(xVar.c(), xVar.b(), xVar.a());
    }

    public v3(boolean z10, boolean z11, boolean z12) {
        this.f24779m = z10;
        this.f24780n = z11;
        this.f24781o = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.c(parcel, 2, this.f24779m);
        f4.c.c(parcel, 3, this.f24780n);
        f4.c.c(parcel, 4, this.f24781o);
        f4.c.b(parcel, iA);
    }
}
