package k3;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;
import l4.a;

/* loaded from: classes.dex */
public abstract class e2 extends ej implements f2 {
    public e2() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
        l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
        fj.c(parcel);
        Q4(string, aVarW0, aVarW02);
        parcel2.writeNoException();
        return true;
    }
}
