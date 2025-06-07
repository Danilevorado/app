package k3;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public abstract class i0 extends ej implements j0 {
    public i0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String strC;
        if (i10 != 1) {
            if (i10 == 2) {
                strC = c();
            } else {
                if (i10 == 3) {
                    boolean zI = i();
                    parcel2.writeNoException();
                    int i12 = fj.f8294b;
                    parcel2.writeInt(zI ? 1 : 0);
                    return true;
                }
                if (i10 == 4) {
                    strC = e();
                } else {
                    if (i10 != 5) {
                        return false;
                    }
                    c4 c4Var = (c4) fj.a(parcel, c4.CREATOR);
                    int i13 = parcel.readInt();
                    fj.c(parcel);
                    m5(c4Var, i13);
                }
            }
            parcel2.writeNoException();
            parcel2.writeString(strC);
            return true;
        }
        c4 c4Var2 = (c4) fj.a(parcel, c4.CREATOR);
        fj.c(parcel);
        E3(c4Var2);
        parcel2.writeNoException();
        return true;
    }
}
