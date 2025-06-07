package k3;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.ej;

/* loaded from: classes.dex */
public abstract class y1 extends ej implements z1 {
    public static z1 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return iInterfaceQueryLocalInterface instanceof z1 ? (z1) iInterfaceQueryLocalInterface : new x1(iBinder);
    }
}
