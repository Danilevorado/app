package k3;

import android.os.Parcel;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public abstract class c0 extends ej implements d0 {
    public c0() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                f();
                break;
            case 2:
                int i12 = parcel.readInt();
                fj.c(parcel);
                H(i12);
                break;
            case 3:
                break;
            case 4:
                i();
                break;
            case 5:
                j();
                break;
            case 6:
                d();
                break;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                h();
                break;
            case 8:
                w2 w2Var = (w2) fj.a(parcel, w2.CREATOR);
                fj.c(parcel);
                y(w2Var);
                break;
            case 9:
                k();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
