package w9;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.pushwoosh.NotificationUpdateReceiver;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f28075a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final ka.h f28076b = ka.e.d();

    private static int a(String str) {
        int iE = e(str);
        if (iE == -1) {
            synchronized (f28075a) {
                ka.h hVar = f28076b;
                int iA = hVar.n().a();
                if (hVar.o().a()) {
                    iA++;
                    hVar.n().b(iA);
                    ka.e.i().s(str, iA);
                }
                iE = iA;
            }
        }
        return iE;
    }

    private static Intent b() {
        Intent intent = new Intent(c9.a.b(), (Class<?>) NotificationUpdateReceiver.class);
        intent.putExtra("is_summary_notification", true);
        intent.putExtra("is_delete_intent", true);
        intent.setAction(Long.toString(System.currentTimeMillis()));
        return intent;
    }

    private static j c() {
        try {
            Class clsA = ka.e.d().w().a();
            if (clsA != null) {
                return (j) clsA.newInstance();
            }
        } catch (Exception e5) {
            k9.h.o(e5);
        }
        return new g();
    }

    public static void d(Notification notification) {
        Context contextB = c9.a.b();
        if (contextB == null) {
            k9.h.k("Incorrect state of app. Context is null");
            return;
        }
        NotificationManager notificationManagerI = c9.a.e().i();
        if (notificationManagerI == null || notification == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            notification = Notification.Builder.recoverBuilder(contextB, notification).setChannelId(new s8.b(contextB).a("Push notifications summary")).build();
        }
        notificationManagerI.notify(a(notification.getGroup()), notification);
    }

    public static int e(String str) {
        try {
            return ka.e.i().c(str);
        } catch (s7.a unused) {
            return -1;
        }
    }

    public static Notification f(int i10, String str, String str2) {
        Context contextB = c9.a.b();
        if (contextB == null) {
            k9.h.k("Incorrect state of app. Context is null");
            return null;
        }
        Notification notificationE = c().e(i10, str, str2);
        if (notificationE == null) {
            return null;
        }
        int iA = a(str2);
        Intent intentD = j.d();
        intentD.putExtra("group_id", iA);
        intentD.putExtra("is_summary_notification", true);
        notificationE.extras.putBoolean("is_summary_notification", true);
        notificationE.contentIntent = PendingIntent.getActivity(contextB, iA, intentD, k9.i.a(268435456));
        notificationE.deleteIntent = PendingIntent.getBroadcast(contextB, iA, b(), k9.i.a(268435456));
        return notificationE;
    }
}
