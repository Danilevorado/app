package k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.o30;

/* loaded from: classes.dex */
public final class n0 extends dj {
    n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder w3(l4.a aVar, String str, o30 o30Var, int i10) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        parcelC.writeString(str);
        fj.f(parcelC, o30Var);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(1, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        parcelW0.recycle();
        return strongBinder;
    }
}
