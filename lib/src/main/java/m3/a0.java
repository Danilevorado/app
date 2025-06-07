package m3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.fp2;
import com.google.android.gms.internal.ads.y33;
import k3.w2;

/* loaded from: classes.dex */
public final class a0 extends f4.a {
    public static final Parcelable.Creator<a0> CREATOR = new c0();

    /* renamed from: m, reason: collision with root package name */
    public final String f25187m;

    /* renamed from: n, reason: collision with root package name */
    public final int f25188n;

    a0(String str, int i10) {
        this.f25187m = str == null ? "" : str;
        this.f25188n = i10;
    }

    public static a0 h(Throwable th) {
        w2 w2VarA = fp2.a(th);
        return new a0(y33.d(th.getMessage()) ? w2VarA.f24789n : th.getMessage(), w2VarA.f24788m);
    }

    public final z f() {
        return new z(this.f25187m, this.f25188n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, this.f25187m, false);
        f4.c.k(parcel, 2, this.f25188n);
        f4.c.b(parcel, iA);
    }
}
