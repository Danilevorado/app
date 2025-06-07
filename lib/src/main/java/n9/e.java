package n9;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public class e {
    public static void c(String str) {
        h(str, null);
    }

    public static void d(final String str, String str2) {
        k9.h.h("DeviceRegistrar", "Registering for pushes...");
        final ka.d dVarF = ka.e.f();
        p pVar = new p(str, str2);
        b9.e eVarA = b9.b.a();
        if (eVarA == null) {
            a9.i.e(new y9.c("Request manager is null"));
        } else {
            eVarA.b(pVar, new o8.a() { // from class: n9.d
                @Override // o8.a
                public final void a(o8.b bVar) {
                    e.f(dVarF, str, bVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(String str, ka.d dVar, o8.b bVar) {
        if (bVar.f()) {
            k9.h.s("DeviceRegistrar", "Unregistered for pushes: " + str);
            a9.i.e(new y9.b(str));
            dVar.p().b(0L);
            return;
        }
        String message = bVar.e() == null ? "" : ((b9.a) bVar.e()).getMessage();
        if (TextUtils.isEmpty(message)) {
            message = "Pushwoosh unregistration error";
        }
        k9.h.l("DeviceRegistrar", "Unregistration error: " + message);
        a9.i.e(new y9.a(message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(ka.d dVar, String str, o8.b bVar) {
        if (bVar.f()) {
            dVar.u().b(true);
            a9.i.e(new y9.d(new n7.o(str, g())));
            dVar.p().b(new Date().getTime());
            k9.h.s("DeviceRegistrar", "Registered for push notifications: " + str);
            return;
        }
        String message = bVar.e() == null ? "" : ((b9.a) bVar.e()).getMessage();
        if (TextUtils.isEmpty(message)) {
            message = "Pushwoosh registration error";
        }
        k9.h.l("DeviceRegistrar", "Registration error: " + message);
        a9.i.e(new y9.c(message));
    }

    private static boolean g() {
        try {
            Context contextB = c9.a.b();
            return Build.VERSION.SDK_INT >= 33 ? androidx.core.content.a.a(contextB, "android.permission.POST_NOTIFICATIONS") == 0 : androidx.core.app.o.e(contextB).a();
        } catch (Exception e5) {
            k9.h.o(e5);
            return true;
        }
    }

    public static void h(final String str, String str2) {
        k9.h.h("DeviceRegistrar", "Unregistering for pushes...");
        final ka.d dVarF = ka.e.f();
        dVarF.u().b(false);
        x xVar = new x();
        b9.e eVarA = b9.b.a();
        if (eVarA == null) {
            a9.i.e(new y9.a("Request manager is null"));
        } else {
            eVarA.c(xVar, str2, new o8.a() { // from class: n9.c
                @Override // o8.a
                public final void a(o8.b bVar) {
                    e.e(str, dVarF, bVar);
                }
            });
        }
    }

    private static boolean i() {
        ka.d dVarF = ka.e.f();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(12, -10);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(new Date(dVarF.p().a()));
        return (calendar2.before(calendar3) && calendar3.before(calendar)) ? false : true;
    }

    public void j() {
        ka.d dVarF = ka.e.f();
        String strA = dVarF.t().a();
        if (strA == null || strA.isEmpty()) {
            return;
        }
        boolean zA = dVarF.g().a();
        dVarF.g().b(false);
        if (zA || i()) {
            d(strA, null);
        }
    }
}
