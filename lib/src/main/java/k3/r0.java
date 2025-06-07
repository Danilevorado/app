package k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.o30;

/* loaded from: classes.dex */
public final class r0 extends dj {
    r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder w3(l4.a aVar, h4 h4Var, String str, o30 o30Var, int i10, int i11) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, h4Var);
        parcelC.writeString(str);
        fj.f(parcelC, o30Var);
        parcelC.writeInt(231004000);
        parcelC.writeInt(i11);
        Parcel parcelW0 = w0(2, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        parcelW0.recycle();
        return strongBinder;
    }
}
