package z4;

import android.os.Parcel;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public abstract class e extends p4.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p4.b
    protected final boolean w3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                p4.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
            case 6:
                p4.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
            default:
                return false;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                p4.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                l lVar = (l) p4.c.a(parcel, l.CREATOR);
                p4.c.b(parcel);
                N3(lVar);
                parcel2.writeNoException();
                return true;
            case 9:
                p4.c.b(parcel);
                parcel2.writeNoException();
                return true;
        }
    }
}
