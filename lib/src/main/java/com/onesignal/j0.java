package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.onesignal.e3;
import com.onesignal.v1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class j0 {

    class a implements v1.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f22067a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f22068b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f22069c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f22070d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f22071e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f22072f;

        a(boolean z10, JSONObject jSONObject, Context context, int i10, String str, long j10) {
            this.f22067a = z10;
            this.f22068b = jSONObject;
            this.f22069c = context;
            this.f22070d = i10;
            this.f22071e = str;
            this.f22072f = j10;
        }

        @Override // com.onesignal.v1.d
        public void a(boolean z10) throws InterruptedException {
            if (this.f22067a || !z10) {
                OSNotificationWorkManager.b(this.f22069c, w1.b(this.f22068b), this.f22070d, this.f22071e, this.f22072f, this.f22067a, false);
                if (this.f22067a) {
                    OSUtils.V(100);
                }
            }
        }
    }

    class b implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f22073a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f22074b;

        b(f fVar, e eVar) {
            this.f22073a = fVar;
            this.f22074b = eVar;
        }

        @Override // com.onesignal.j0.d
        public void a(boolean z10) {
            if (!z10) {
                this.f22073a.d(true);
            }
            this.f22074b.a(this.f22073a);
        }
    }

    class c implements v1.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f22075a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f22076b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f22077c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f22078d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ JSONObject f22079e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f22080f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f22081g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f f22082h;

        c(boolean z10, Context context, Bundle bundle, d dVar, JSONObject jSONObject, long j10, boolean z11, f fVar) {
            this.f22075a = z10;
            this.f22076b = context;
            this.f22077c = bundle;
            this.f22078d = dVar;
            this.f22079e = jSONObject;
            this.f22080f = j10;
            this.f22081g = z11;
            this.f22082h = fVar;
        }

        @Override // com.onesignal.v1.d
        public void a(boolean z10) {
            if (this.f22075a || !z10) {
                OSNotificationWorkManager.b(this.f22076b, w1.b(this.f22079e), this.f22077c.containsKey("android_notif_id") ? this.f22077c.getInt("android_notif_id") : 0, this.f22079e.toString(), this.f22080f, this.f22075a, this.f22081g);
                this.f22082h.g(true);
                this.f22078d.a(true);
                return;
            }
            e3.a(e3.z.DEBUG, "startNotificationProcessing returning, with context: " + this.f22076b + " and bundle: " + this.f22077c);
            this.f22078d.a(false);
        }
    }

    interface d {
        void a(boolean z10);
    }

    interface e {
        void a(f fVar);
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        private boolean f22083a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f22084b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f22085c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f22086d;

        f() {
        }

        boolean a() {
            return this.f22084b;
        }

        public boolean b() {
            return this.f22086d;
        }

        boolean c() {
            return !this.f22083a || this.f22084b || this.f22085c || this.f22086d;
        }

        void d(boolean z10) {
            this.f22084b = z10;
        }

        public void e(boolean z10) {
            this.f22085c = z10;
        }

        void f(boolean z10) {
            this.f22083a = z10;
        }

        public void g(boolean z10) {
            this.f22086d = z10;
        }
    }

    static JSONObject a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e5) {
                e3.b(e3.z.ERROR, "bundleAsJSONObject error for key: " + str, e5);
            }
        }
        return jSONObject;
    }

    static JSONObject b(JSONObject jSONObject) {
        return new JSONObject(jSONObject.optString("custom"));
    }

    static boolean c(Bundle bundle) {
        return d(bundle, "licon") || d(bundle, "bicon") || bundle.getString("bg_img", null) != null;
    }

    private static boolean d(Bundle bundle, String str) {
        String strTrim = bundle.getString(str, "").trim();
        return strTrim.startsWith("http://") || strTrim.startsWith("https://");
    }

    static void e(x1 x1Var) {
        if (x1Var.m()) {
            e3.a(e3.z.DEBUG, "Marking restored or disabled notifications as dismissed: " + x1Var.toString());
            String str = "android_notification_id = " + x1Var.a();
            l3 l3VarX = l3.x(x1Var.d());
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", (Integer) 1);
            l3VarX.f("notification", contentValues, str, null);
            k.c(l3VarX, x1Var.d());
        }
    }

    private static void f(Bundle bundle) throws JSONException {
        String string;
        if (bundle.containsKey("o")) {
            try {
                JSONObject jSONObject = new JSONObject(bundle.getString("custom"));
                JSONObject jSONObject2 = jSONObject.has("a") ? jSONObject.getJSONObject("a") : new JSONObject();
                JSONArray jSONArray = new JSONArray(bundle.getString("o"));
                bundle.remove("o");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    String string2 = jSONObject3.getString("n");
                    jSONObject3.remove("n");
                    if (jSONObject3.has("i")) {
                        string = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        string = string2;
                    }
                    jSONObject3.put("id", string);
                    jSONObject3.put("text", string2);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                }
                jSONObject2.put("actionButtons", jSONArray);
                jSONObject2.put("actionId", "__DEFAULT__");
                if (!jSONObject.has("a")) {
                    jSONObject.put("a", jSONObject2);
                }
                bundle.putString("custom", jSONObject.toString());
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
    }

    static JSONArray g(JSONObject jSONObject) {
        return new JSONArray().put(jSONObject);
    }

    static void h(Context context, Bundle bundle, e eVar) throws JSONException {
        f fVar = new f();
        if (!w1.d(bundle)) {
            eVar.a(fVar);
            return;
        }
        fVar.f(true);
        f(bundle);
        if (!j1.c(context, bundle)) {
            q(context, bundle, fVar, new b(fVar, eVar));
        } else {
            fVar.e(true);
            eVar.a(fVar);
        }
    }

    private static void i(x1 x1Var) {
        if (x1Var.n() || !x1Var.e().has("collapse_key") || "do_not_collapse".equals(x1Var.e().optString("collapse_key"))) {
            return;
        }
        Cursor cursorA = l3.x(x1Var.d()).a("notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{x1Var.e().optString("collapse_key")}, null, null, null);
        if (cursorA.moveToFirst()) {
            x1Var.f().t(cursorA.getInt(cursorA.getColumnIndex("android_notification_id")));
        }
        cursorA.close();
    }

    static void j(Context context, l lVar) {
        e3.Q0(context);
        try {
            String strE = lVar.e("json_payload");
            if (strE != null) {
                JSONObject jSONObject = new JSONObject(strE);
                e3.b1(context, jSONObject, new a(lVar.getBoolean("is_restoring", false), jSONObject, context, lVar.f("android_notif_id") ? lVar.c("android_notif_id").intValue() : 0, strE, lVar.d("timestamp").longValue()));
                return;
            }
            e3.a(e3.z.ERROR, "json_payload key is nonexistent from mBundle passed to ProcessFromFCMIntentService: " + lVar);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    static int k(u1 u1Var, boolean z10) {
        return l(u1Var, false, z10);
    }

    private static int l(u1 u1Var, boolean z10, boolean z11) throws JSONException {
        e3.a(e3.z.DEBUG, "Starting processJobForDisplay opened: " + z10 + " fromBackgroundLogic: " + z11);
        x1 x1VarB = u1Var.b();
        i(x1VarB);
        int iIntValue = x1VarB.a().intValue();
        boolean zN = false;
        if (p(x1VarB)) {
            x1VarB.p(true);
            if (z11 && e3.P1(x1VarB)) {
                u1Var.g(false);
                e3.L(u1Var);
                return iIntValue;
            }
            zN = u.n(x1VarB);
        }
        if (!x1VarB.n()) {
            n(x1VarB, z10, zN);
            OSNotificationWorkManager.c(w1.b(u1Var.b().e()));
            e3.K0(x1VarB);
        }
        return iIntValue;
    }

    static int m(x1 x1Var, boolean z10) {
        return l(new u1(x1Var, x1Var.n(), true), false, z10);
    }

    static void n(x1 x1Var, boolean z10, boolean z11) {
        o(x1Var, z10);
        if (!z11) {
            e(x1Var);
            return;
        }
        String strB = x1Var.b();
        OSReceiveReceiptController.c().a(x1Var.d(), strB);
        e3.x0().l(strB);
    }

    private static void o(x1 x1Var, boolean z10) {
        e3.z zVar = e3.z.DEBUG;
        e3.a(zVar, "Saving Notification job: " + x1Var.toString());
        Context contextD = x1Var.d();
        JSONObject jSONObjectE = x1Var.e();
        try {
            JSONObject jSONObjectB = b(x1Var.e());
            l3 l3VarX = l3.x(x1Var.d());
            int i10 = 1;
            if (x1Var.m()) {
                String str = "android_notification_id = " + x1Var.a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", (Integer) 1);
                l3VarX.f("notification", contentValues, str, null);
                k.c(l3VarX, contextD);
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notification_id", jSONObjectB.optString("i"));
            if (jSONObjectE.has("grp")) {
                contentValues2.put("group_id", jSONObjectE.optString("grp"));
            }
            if (jSONObjectE.has("collapse_key") && !"do_not_collapse".equals(jSONObjectE.optString("collapse_key"))) {
                contentValues2.put("collapse_id", jSONObjectE.optString("collapse_key"));
            }
            if (!z10) {
                i10 = 0;
            }
            contentValues2.put("opened", Integer.valueOf(i10));
            if (!z10) {
                contentValues2.put("android_notification_id", x1Var.a());
            }
            if (x1Var.k() != null) {
                contentValues2.put("title", x1Var.k().toString());
            }
            if (x1Var.c() != null) {
                contentValues2.put("message", x1Var.c().toString());
            }
            contentValues2.put("expire_time", Long.valueOf((jSONObjectE.optLong("google.sent_time", e3.B0().b()) / 1000) + jSONObjectE.optInt("google.ttl", 259200)));
            contentValues2.put("full_data", jSONObjectE.toString());
            l3VarX.V("notification", null, contentValues2);
            e3.a(zVar, "Notification saved values: " + contentValues2.toString());
            if (z10) {
                return;
            }
            k.c(l3VarX, contextD);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    private static boolean p(x1 x1Var) {
        return x1Var.l() || OSUtils.I(x1Var.e().optString("alert"));
    }

    private static void q(Context context, Bundle bundle, f fVar, d dVar) throws JSONException {
        JSONObject jSONObjectA = a(bundle);
        e3.b1(context, jSONObjectA, new c(bundle.getBoolean("is_restoring", false), context, bundle, dVar, jSONObjectA, e3.B0().b() / 1000, Integer.parseInt(bundle.getString("pri", "0")) > 9, fVar));
    }
}
