package a4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends f4.a {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* renamed from: m, reason: collision with root package name */
    Intent f103m;

    public a(Intent intent) {
        this.f103m = intent;
    }

    public Intent f() {
        return this.f103m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.p(parcel, 1, this.f103m, i10, false);
        f4.c.b(parcel, iA);
    }
}
