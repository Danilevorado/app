package aa;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.core.app.o;
import com.pushwoosh.NotificationUpdateReceiver;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import w9.j;
import w9.k;

/* loaded from: classes2.dex */
class i extends d {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f264d = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ka.h f266c = ka.e.d();

    /* renamed from: b, reason: collision with root package name */
    private final w9.b f265b = f();

    i() {
    }

    private int d(String str) {
        int iA;
        if (!TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (f264d) {
            iA = this.f266c.n().a();
            if (this.f266c.o().a()) {
                iA++;
                this.f266c.n().b(iA);
            }
        }
        return iA;
    }

    private Intent e(long j10, int i10, w9.d dVar) {
        Intent intent = new Intent(c9.a.b(), (Class<?>) NotificationUpdateReceiver.class);
        intent.putExtra("row_id", j10);
        intent.putExtra("is_delete_intent", true);
        intent.putExtra("pushBundle", dVar.v());
        intent.putExtra("group_id", i10);
        intent.setAction(Long.toString(System.currentTimeMillis()));
        return intent;
    }

    private w9.b f() {
        try {
            Class clsA = ka.e.d().q().a();
            if (clsA != null) {
                return (w9.b) clsA.newInstance();
            }
        } catch (Exception e5) {
            k9.h.o(e5);
        }
        return new w9.e();
    }

    private void g(Notification notification, Intent intent, w9.d dVar) {
        Context contextB = c9.a.b();
        if (contextB == null) {
            k9.h.k("Incorrect state of app. Context is null");
            return;
        }
        String strP = dVar.p();
        int iD = d(strP);
        Intent intentE = null;
        try {
            long jY = ka.e.e().y(dVar.v(), iD, notification.getGroup());
            int iE = k.e(notification.getGroup());
            intent.putExtra("row_id", jY);
            intentE = e(jY, iE, dVar);
        } catch (Exception unused) {
        }
        notification.contentIntent = PendingIntent.getActivity(contextB, iD, intent, k9.i.a(268435456));
        if (intentE != null) {
            long jM = dVar.m();
            if (jM != -1) {
                intentE.putExtra("pushwoosh_notification_id", jM);
            }
            notification.deleteIntent = PendingIntent.getBroadcast(contextB, iD, intentE, k9.i.a(268435456));
        }
        h(intent, strP, iD);
        NotificationManager notificationManagerI = c9.a.e().i();
        if (notificationManagerI == null) {
            return;
        }
        notificationManagerI.notify(strP, iD, notification);
        k();
        i(dVar);
        a9.i.e(new c(iD, strP, dVar));
    }

    private void h(Intent intent, String str, int i10) {
        ka.g gVarB = ka.e.b();
        gVarB.b(i10, str);
        if (intent.hasExtra("local_push_id")) {
            gVarB.a(intent.getIntExtra("local_push_id", 0), i10, str);
        }
    }

    private void i(w9.d dVar) {
        this.f266c.r().b(dVar.w().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean j(Notification notification, StatusBarNotification statusBarNotification) {
        return TextUtils.equals(statusBarNotification.getNotification().getGroup(), notification.getGroup());
    }

    private void k() {
        if (ka.e.d().l().a()) {
            z7.f.l();
        }
    }

    @Override // aa.d
    protected void b(w9.d dVar) {
        if (dVar.u()) {
            return;
        }
        if (this.f266c.o().a()) {
            l(dVar);
            return;
        }
        Notification notificationK = this.f265b.k(dVar);
        if (notificationK == null) {
            return;
        }
        Intent intentJ = this.f265b.j(dVar);
        o.e(c9.a.b()).d();
        g(notificationK, intentJ, dVar);
    }

    protected void l(w9.d dVar) {
        final Notification notificationK = this.f265b.k(dVar);
        if (notificationK == null) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            List list = (List) x9.b.g().stream().filter(new Predicate() { // from class: aa.h
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return i.j(notificationK, (StatusBarNotification) obj);
                }
            }).collect(Collectors.toList());
            if (list.size() >= 1) {
                boolean zK = x9.b.k(dVar, list);
                int size = list.size();
                if (!zK) {
                    size++;
                }
                Notification notificationF = k.f(size, i10 >= 26 ? notificationK.getChannelId() : j.f28072c, notificationK.getGroup());
                if (notificationF != null) {
                    k.d(notificationF);
                }
            }
        }
        Intent intentJ = this.f265b.j(dVar);
        intentJ.putExtra("group_id", k.e(dVar.d()));
        g(notificationK, intentJ, dVar);
    }
}
