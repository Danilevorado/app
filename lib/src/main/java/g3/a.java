package g3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.gw;
import com.google.android.gms.internal.ads.hw;

/* loaded from: classes.dex */
public final class a extends f4.a {
    public static final Parcelable.Creator<a> CREATOR = new j();

    /* renamed from: m, reason: collision with root package name */
    private final boolean f23843m;

    /* renamed from: n, reason: collision with root package name */
    private final IBinder f23844n;

    a(boolean z10, IBinder iBinder) {
        this.f23843m = z10;
        this.f23844n = iBinder;
    }

    public boolean f() {
        return this.f23843m;
    }

    public final hw h() {
        IBinder iBinder = this.f23844n;
        if (iBinder == null) {
            return null;
        }
        return gw.L5(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.c(parcel, 1, f());
        f4.c.j(parcel, 2, this.f23844n, false);
        f4.c.b(parcel, iA);
    }
}
