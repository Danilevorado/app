package n4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // n4.f
    public final String d() {
        Parcel parcelW0 = w0(1, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // n4.f
    public final boolean f() {
        Parcel parcelW0 = w0(6, C());
        boolean zB = c.b(parcelW0);
        parcelW0.recycle();
        return zB;
    }

    @Override // n4.f
    public final boolean p0(boolean z10) {
        Parcel parcelC = C();
        c.a(parcelC, true);
        Parcel parcelW0 = w0(2, parcelC);
        boolean zB = c.b(parcelW0);
        parcelW0.recycle();
        return zB;
    }
}
