package m3;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;
import l4.a;

/* loaded from: classes.dex */
public abstract class s0 extends ej implements t0 {
    public s0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            fj.c(parcel);
            boolean zZzf = zzf(aVarW0, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else {
            if (i10 != 2) {
                return false;
            }
            l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
            fj.c(parcel);
            zze(aVarW02);
            parcel2.writeNoException();
        }
        return true;
    }
}
