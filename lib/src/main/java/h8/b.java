package h8;

import android.content.Context;
import com.google.firebase.messaging.n0;
import j9.b;
import java.util.Date;
import k9.h;
import ka.e;
import n7.k;

/* loaded from: classes2.dex */
public abstract class b {
    public static boolean a(n0 n0Var) {
        return i8.a.a(n0Var);
    }

    public static boolean b(Context context, n0 n0Var) {
        try {
            if (j9.b.d() == null) {
                new b.a().b(k8.b.a()).a(true);
            }
            if (a(n0Var)) {
                if (j9.b.d().e()) {
                    h.s("FcmHelper", "Received message: " + n0Var.f().toString() + " from: " + n0Var.h());
                    return k.a(context, j8.a.a(n0Var));
                }
            }
            return false;
        } catch (NullPointerException unused) {
            h.k("Firebase provider is not initialized, unsafe to handle received push");
            return false;
        }
    }

    public static void c(String str) {
        e.f().o().b(new Date().getTime());
        if (c9.a.b() == null) {
            h.k("Incorrect state of app. Context is null");
            return;
        }
        if (j9.b.d().i() instanceof n8.a) {
            try {
                String strB = l8.a.b();
                h.h("FcmHelper", "onTokenRefresh");
                if (strB == null || !strB.equals(e.f().t().a())) {
                    k.b(strB);
                }
            } catch (Exception e5) {
                h.l("PushwooshFcmHelper", "FCM registration error:" + e5.getMessage());
            }
        }
    }
}
