package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w2 extends f4.a {
    public static final Parcelable.Creator<w2> CREATOR = new m3();

    /* renamed from: m, reason: collision with root package name */
    public final int f24788m;

    /* renamed from: n, reason: collision with root package name */
    public final String f24789n;

    /* renamed from: o, reason: collision with root package name */
    public final String f24790o;

    /* renamed from: p, reason: collision with root package name */
    public w2 f24791p;

    /* renamed from: q, reason: collision with root package name */
    public IBinder f24792q;

    public w2(int i10, String str, String str2, w2 w2Var, IBinder iBinder) {
        this.f24788m = i10;
        this.f24789n = str;
        this.f24790o = str2;
        this.f24791p = w2Var;
        this.f24792q = iBinder;
    }

    public final d3.a f() {
        w2 w2Var = this.f24791p;
        return new d3.a(this.f24788m, this.f24789n, this.f24790o, w2Var == null ? null : new d3.a(w2Var.f24788m, w2Var.f24789n, w2Var.f24790o));
    }

    public final d3.l h() {
        w2 w2Var = this.f24791p;
        j2 h2Var = null;
        d3.a aVar = w2Var == null ? null : new d3.a(w2Var.f24788m, w2Var.f24789n, w2Var.f24790o);
        int i10 = this.f24788m;
        String str = this.f24789n;
        String str2 = this.f24790o;
        IBinder iBinder = this.f24792q;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            h2Var = iInterfaceQueryLocalInterface instanceof j2 ? (j2) iInterfaceQueryLocalInterface : new h2(iBinder);
        }
        return new d3.l(i10, str, str2, aVar, d3.u.d(h2Var));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f24788m);
        f4.c.q(parcel, 2, this.f24789n, false);
        f4.c.q(parcel, 3, this.f24790o, false);
        f4.c.p(parcel, 4, this.f24791p, i10, false);
        f4.c.j(parcel, 5, this.f24792q, false);
        f4.c.b(parcel, iA);
    }
}
