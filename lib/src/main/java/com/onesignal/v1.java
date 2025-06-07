package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
class v1 extends r0 {

    /* renamed from: a, reason: collision with root package name */
    private final l3 f22475a;

    /* renamed from: b, reason: collision with root package name */
    private final r1 f22476b;

    class a extends j {
        a() {
        }

        @Override // com.onesignal.j, java.lang.Runnable
        public void run() {
            super.run();
            v1.this.f22475a.c("notification", "created_time < ?", new String[]{String.valueOf((e3.B0().b() / 1000) - 604800)});
        }
    }

    class b extends j {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ WeakReference f22478m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f22479n;

        b(WeakReference weakReference, int i10) {
            this.f22478m = weakReference;
            this.f22479n = i10;
        }

        @Override // com.onesignal.j, java.lang.Runnable
        public void run() {
            super.run();
            Context context = (Context) this.f22478m.get();
            if (context == null) {
                return;
            }
            String str = "android_notification_id = " + this.f22479n + " AND opened = 0 AND dismissed = 0";
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", (Integer) 1);
            if (v1.this.f22475a.f("notification", contentValues, str, null) > 0) {
                q0.e(context, v1.this.f22475a, this.f22479n);
            }
            k.c(v1.this.f22475a, context);
            m3.i(context).cancel(this.f22479n);
        }
    }

    class c extends j {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f22481m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ d f22482n;

        c(String str, d dVar) {
            this.f22481m = str;
            this.f22482n = dVar;
        }

        @Override // com.onesignal.j, java.lang.Runnable
        public void run() {
            super.run();
            boolean z10 = true;
            Cursor cursorA = v1.this.f22475a.a("notification", new String[]{"notification_id"}, "notification_id = ?", new String[]{this.f22481m}, null, null, null);
            boolean zMoveToFirst = cursorA.moveToFirst();
            cursorA.close();
            if (zMoveToFirst) {
                v1.this.f22476b.f("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.f22481m);
            } else {
                z10 = false;
            }
            this.f22482n.a(z10);
        }
    }

    interface d {
        void a(boolean z10);
    }

    public v1(l3 l3Var, r1 r1Var) {
        this.f22475a = l3Var;
        this.f22476b = r1Var;
    }

    private void g() {
        d(new a(), "OS_NOTIFICATIONS_THREAD");
    }

    private void i(String str, d dVar) {
        if (str == null || "".equals(str)) {
            dVar.a(false);
        } else if (OSNotificationWorkManager.a(str)) {
            d(new c(str, dVar), "OS_NOTIFICATIONS_THREAD");
        } else {
            this.f22476b.f("Notification notValidOrDuplicated with id duplicated");
            dVar.a(true);
        }
    }

    void h() {
        g();
    }

    void j(JSONObject jSONObject, d dVar) {
        String strB = w1.b(jSONObject);
        if (strB != null) {
            i(strB, dVar);
        } else {
            this.f22476b.f("Notification notValidOrDuplicated with id null");
            dVar.a(true);
        }
    }

    void k(int i10, WeakReference weakReference) {
        d(new b(weakReference, i10), "OS_NOTIFICATIONS_THREAD");
    }
}
