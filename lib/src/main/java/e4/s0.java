package e4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class s0 extends r4.a implements u0 {
    s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // e4.u0
    public final b4.c0 E5(b4.a0 a0Var) {
        Parcel parcelW0 = w0();
        r4.c.c(parcelW0, a0Var);
        Parcel parcelC = C(8, parcelW0);
        b4.c0 c0Var = (b4.c0) r4.c.a(parcelC, b4.c0.CREATOR);
        parcelC.recycle();
        return c0Var;
    }

    @Override // e4.u0
    public final b4.c0 f4(b4.a0 a0Var) {
        Parcel parcelW0 = w0();
        r4.c.c(parcelW0, a0Var);
        Parcel parcelC = C(6, parcelW0);
        b4.c0 c0Var = (b4.c0) r4.c.a(parcelC, b4.c0.CREATOR);
        parcelC.recycle();
        return c0Var;
    }

    @Override // e4.u0
    public final boolean i() {
        Parcel parcelC = C(7, w0());
        boolean zE = r4.c.e(parcelC);
        parcelC.recycle();
        return zE;
    }

    @Override // e4.u0
    public final boolean n5(b4.e0 e0Var, l4.a aVar) {
        Parcel parcelW0 = w0();
        r4.c.c(parcelW0, e0Var);
        r4.c.d(parcelW0, aVar);
        Parcel parcelC = C(5, parcelW0);
        boolean zE = r4.c.e(parcelC);
        parcelC.recycle();
        return zE;
    }
}
