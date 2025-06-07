package k3;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class e3 extends l4.c {
    public e3() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // l4.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof l1 ? (l1) iInterfaceQueryLocalInterface : new l1(iBinder);
    }
}
