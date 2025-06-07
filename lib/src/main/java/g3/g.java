package g3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.gw;
import com.google.android.gms.internal.ads.hw;
import k3.x0;
import k3.y0;

/* loaded from: classes.dex */
public final class g extends f4.a {
    public static final Parcelable.Creator<g> CREATOR = new m();

    /* renamed from: m, reason: collision with root package name */
    private final boolean f23861m;

    /* renamed from: n, reason: collision with root package name */
    private final y0 f23862n;

    /* renamed from: o, reason: collision with root package name */
    private final IBinder f23863o;

    g(boolean z10, IBinder iBinder, IBinder iBinder2) {
        this.f23861m = z10;
        this.f23862n = iBinder != null ? x0.L5(iBinder) : null;
        this.f23863o = iBinder2;
    }

    public final boolean d() {
        return this.f23861m;
    }

    public final y0 f() {
        return this.f23862n;
    }

    public final hw h() {
        IBinder iBinder = this.f23863o;
        if (iBinder == null) {
            return null;
        }
        return gw.L5(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.c(parcel, 1, this.f23861m);
        y0 y0Var = this.f23862n;
        f4.c.j(parcel, 2, y0Var == null ? null : y0Var.asBinder(), false);
        f4.c.j(parcel, 3, this.f23863o, false);
        f4.c.b(parcel, iA);
    }
}
