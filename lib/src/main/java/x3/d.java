package x3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d extends f4.a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: m, reason: collision with root package name */
    private final String f28248m;

    /* renamed from: n, reason: collision with root package name */
    private final String f28249n;

    public d(String str, String str2) {
        this.f28248m = str;
        this.f28249n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, this.f28248m, false);
        f4.c.q(parcel, 2, this.f28249n, false);
        f4.c.b(parcel, iA);
    }
}
