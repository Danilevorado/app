package n7;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class k {
    public static boolean a(Context context, Bundle bundle) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        j.d(context);
        c(bundle);
        k9.g.d(bundle);
        return true;
    }

    public static void b(String str) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        j.d(c9.a.b());
        k9.g.i(str, null);
        a9.i.e(new y9.d(new o(str, true)));
    }

    static void c(Bundle bundle) {
        try {
            l.i().t().f(g8.e.C(bundle), g8.e.D(bundle));
        } catch (Throwable th) {
            k9.h.k("/messageDeliveryEvent was not sent. Exception occurred " + th.getClass().getCanonicalName() + ". " + th.getMessage());
        }
    }
}
