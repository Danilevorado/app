package k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.n30;
import com.google.android.gms.internal.ads.o30;

/* loaded from: classes.dex */
public final class g1 extends dj implements i1 {
    g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // k3.i1
    public final o30 getAdapterCreator() {
        Parcel parcelW0 = w0(2, C());
        o30 o30VarL5 = n30.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return o30VarL5;
    }

    @Override // k3.i1
    public final c3 getLiteSdkVersion() {
        Parcel parcelW0 = w0(1, C());
        c3 c3Var = (c3) fj.a(parcelW0, c3.CREATOR);
        parcelW0.recycle();
        return c3Var;
    }
}
