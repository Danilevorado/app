package g4;

import android.os.IBinder;
import android.os.Parcel;
import e4.s;

/* loaded from: classes.dex */
public final class a extends p4.a {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void p1(s sVar) {
        Parcel parcelC = C();
        p4.c.c(parcelC, sVar);
        L0(1, parcelC);
    }
}
