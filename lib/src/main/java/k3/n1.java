package k3;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.ej;

/* loaded from: classes.dex */
public abstract class n1 extends ej implements o1 {
    public static o1 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterfaceQueryLocalInterface instanceof o1 ? (o1) iInterfaceQueryLocalInterface : new m1(iBinder);
    }
}
