package e4;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class t0 extends r4.b implements u0 {
    public static u0 w0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof u0 ? (u0) iInterfaceQueryLocalInterface : new s0(iBinder);
    }
}
