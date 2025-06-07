package m3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public final class r0 extends dj implements t0 {
    r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // m3.t0
    public final void zze(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(2, parcelC);
    }

    @Override // m3.t0
    public final boolean zzf(l4.a aVar, String str, String str2) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        Parcel parcelW0 = w0(1, parcelC);
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }
}
