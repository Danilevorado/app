package z4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g extends p4.a {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void p1(int i10) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        w0(7, parcelC);
    }

    public final void w3(e4.j jVar, int i10, boolean z10) {
        Parcel parcelC = C();
        p4.c.d(parcelC, jVar);
        parcelC.writeInt(i10);
        parcelC.writeInt(z10 ? 1 : 0);
        w0(9, parcelC);
    }

    public final void x4(j jVar, f fVar) {
        Parcel parcelC = C();
        p4.c.c(parcelC, jVar);
        p4.c.d(parcelC, fVar);
        w0(12, parcelC);
    }
}
