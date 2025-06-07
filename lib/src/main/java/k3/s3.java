package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s3 extends f4.a {
    public static final Parcelable.Creator<s3> CREATOR = new t3();

    /* renamed from: m, reason: collision with root package name */
    public final String f24749m;

    s3(String str) {
        this.f24749m = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 15, this.f24749m, false);
        f4.c.b(parcel, iA);
    }
}
