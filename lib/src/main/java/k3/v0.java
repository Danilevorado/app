package k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;

/* loaded from: classes.dex */
public final class v0 extends dj implements y0 {
    v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // k3.y0
    public final void z0(String str, String str2) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        L0(1, parcelC);
    }
}
