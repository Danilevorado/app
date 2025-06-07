package v4;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class g extends s4.n implements h {
    public static h w0(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new f(iBinder);
    }
}
