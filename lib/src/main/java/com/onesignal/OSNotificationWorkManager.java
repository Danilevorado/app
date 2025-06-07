package com.onesignal;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import b1.l;
import com.onesignal.e3;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class OSNotificationWorkManager {

    /* renamed from: a, reason: collision with root package name */
    private static Set f21645a = OSUtils.K();

    public static class NotificationWorker extends Worker {
        public NotificationWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        private void a(Context context, int i10, JSONObject jSONObject, boolean z10, Long l10) {
            s1 s1Var = new s1(null, jSONObject, i10);
            c2 c2Var = new c2(new u1(context, s1Var, jSONObject, z10, true, l10), s1Var);
            e3.g0 g0Var = e3.f21904p;
            if (g0Var == null) {
                e3.a(e3.z.WARN, "remoteNotificationReceivedHandler not setup, displaying normal OneSignal notification");
                c2Var.b(s1Var);
                return;
            }
            try {
                g0Var.a(context, c2Var);
            } catch (Throwable th) {
                e3.b(e3.z.ERROR, "remoteNotificationReceived throw an exception. Displaying normal OneSignal notification.", th);
                c2Var.b(s1Var);
                throw th;
            }
        }

        @Override // androidx.work.Worker
        public c.a doWork() {
            androidx.work.b inputData = getInputData();
            try {
                e3.i1(e3.z.DEBUG, "NotificationWorker running doWork with data: " + inputData);
                a(getApplicationContext(), inputData.i("android_notif_id", 0), new JSONObject(inputData.l("json_payload")), inputData.h("is_restoring", false), Long.valueOf(inputData.k("timestamp", System.currentTimeMillis() / 1000)));
                return c.a.c();
            } catch (JSONException e5) {
                e3.i1(e3.z.ERROR, "Error occurred doing work for job with id: " + getId().toString());
                e5.printStackTrace();
                return c.a.a();
            }
        }
    }

    static boolean a(String str) {
        if (!OSUtils.I(str)) {
            return true;
        }
        if (!f21645a.contains(str)) {
            f21645a.add(str);
            return true;
        }
        e3.a(e3.z.DEBUG, "OSNotificationWorkManager notification with notificationId: " + str + " already queued");
        return false;
    }

    static void b(Context context, String str, int i10, String str2, long j10, boolean z10, boolean z11) {
        b1.l lVar = (b1.l) ((l.a) new l.a(NotificationWorker.class).m(new b.a().f("android_notif_id", i10).h("json_payload", str2).g("timestamp", j10).e("is_restoring", z10).a())).b();
        e3.a(e3.z.DEBUG, "OSNotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + str2);
        d3.a(context).d(str, b1.d.KEEP, lVar);
    }

    static void c(String str) {
        if (OSUtils.I(str)) {
            f21645a.remove(str);
        }
    }
}
