package k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public final class d2 extends dj implements f2 {
    d2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // k3.f2
    public final void Q4(String str, l4.a aVar, l4.a aVar2) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        fj.f(parcelC, aVar);
        fj.f(parcelC, aVar2);
        L0(1, parcelC);
    }
}
