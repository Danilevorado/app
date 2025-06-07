package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q2 extends f4.a {
    public static final Parcelable.Creator<q2> CREATOR = new r2();

    /* renamed from: m, reason: collision with root package name */
    public final int f24718m;

    public q2(int i10) {
        this.f24718m = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 2, this.f24718m);
        f4.c.b(parcel, iA);
    }
}
