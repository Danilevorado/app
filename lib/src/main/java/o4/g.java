package o4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g extends a {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void L0(x3.d dVar, f fVar) {
        Parcel parcelC = C();
        c.b(parcelC, dVar);
        c.c(parcelC, fVar);
        w0(1, parcelC);
    }
}
