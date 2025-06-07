package l4;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: l4.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0158a extends r4.b implements a {
        public AbstractBinderC0158a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a w0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new d(iBinder);
        }
    }
}
