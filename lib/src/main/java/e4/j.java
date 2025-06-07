package e4;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface j extends IInterface {

    public static abstract class a extends r4.b implements j {
        public static j w0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new p1(iBinder);
        }
    }

    Account b();
}
