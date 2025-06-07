package k3;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.ej;

/* loaded from: classes.dex */
public abstract class t0 extends ej implements u0 {
    public static u0 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof u0 ? (u0) iInterfaceQueryLocalInterface : new s0(iBinder);
    }
}
