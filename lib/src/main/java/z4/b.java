package z4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class b extends f4.a implements c4.f {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: m, reason: collision with root package name */
    final int f28871m;

    /* renamed from: n, reason: collision with root package name */
    private int f28872n;

    /* renamed from: o, reason: collision with root package name */
    private Intent f28873o;

    b(int i10, int i11, Intent intent) {
        this.f28871m = i10;
        this.f28872n = i11;
        this.f28873o = intent;
    }

    @Override // c4.f
    public final Status e() {
        return this.f28872n == 0 ? Status.f5593r : Status.f5597v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f28871m;
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, i11);
        f4.c.k(parcel, 2, this.f28872n);
        f4.c.p(parcel, 3, this.f28873o, i10, false);
        f4.c.b(parcel, iA);
    }
}
