package k3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h2 extends dj implements j2 {
    h2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // k3.j2
    public final Bundle c() {
        Parcel parcelW0 = w0(5, C());
        Bundle bundle = (Bundle) fj.a(parcelW0, Bundle.CREATOR);
        parcelW0.recycle();
        return bundle;
    }

    @Override // k3.j2
    public final l4 e() {
        Parcel parcelW0 = w0(4, C());
        l4 l4Var = (l4) fj.a(parcelW0, l4.CREATOR);
        parcelW0.recycle();
        return l4Var;
    }

    @Override // k3.j2
    public final String g() {
        Parcel parcelW0 = w0(6, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // k3.j2
    public final String h() {
        Parcel parcelW0 = w0(1, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // k3.j2
    public final String i() {
        Parcel parcelW0 = w0(2, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // k3.j2
    public final List j() {
        Parcel parcelW0 = w0(3, C());
        ArrayList arrayListCreateTypedArrayList = parcelW0.createTypedArrayList(l4.CREATOR);
        parcelW0.recycle();
        return arrayListCreateTypedArrayList;
    }
}
