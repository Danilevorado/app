package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public abstract class wa0 extends ej implements xa0 {
    public wa0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        ra0 pa0Var;
        switch (i10) {
            case 1:
                j();
                break;
            case 2:
                h();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    pa0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    pa0Var = iInterfaceQueryLocalInterface instanceof ra0 ? (ra0) iInterfaceQueryLocalInterface : new pa0(strongBinder);
                }
                fj.c(parcel);
                j5(pa0Var);
                break;
            case 4:
                int i12 = parcel.readInt();
                fj.c(parcel);
                X(i12);
                break;
            case 5:
                k3.w2 w2Var = (k3.w2) fj.a(parcel, k3.w2.CREATOR);
                fj.c(parcel);
                o5(w2Var);
                break;
            case 6:
                e();
                break;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                c();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
