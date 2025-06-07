package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.o30;

/* loaded from: classes.dex */
public final class g2 extends dj {
    g2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final f2 w3(l4.a aVar, o30 o30Var, int i10) {
        f2 d2Var;
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, o30Var);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(1, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            d2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            d2Var = iInterfaceQueryLocalInterface instanceof f2 ? (f2) iInterfaceQueryLocalInterface : new d2(strongBinder);
        }
        parcelW0.recycle();
        return d2Var;
    }
}
