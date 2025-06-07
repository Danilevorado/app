package com.onesignal;

import com.facebook.ads.AdError;
import com.onesignal.e3;
import com.onesignal.p3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class o3 {

    /* renamed from: a, reason: collision with root package name */
    private static int f22162a;

    class a extends p3.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22163a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22164b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f22165c;

        /* renamed from: com.onesignal.o3$a$a, reason: collision with other inner class name */
        class RunnableC0111a implements Runnable {
            RunnableC0111a() {
            }

            @Override // java.lang.Runnable
            public void run() throws InterruptedException {
                int i10 = (o3.f22162a * 10000) + 30000;
                if (i10 > 90000) {
                    i10 = 90000;
                }
                e3.a(e3.z.INFO, "Failed to get Android parameters, trying again in " + (i10 / AdError.NETWORK_ERROR_CODE) + " seconds.");
                try {
                    Thread.sleep(i10);
                    o3.b();
                    a aVar = a.this;
                    o3.e(aVar.f22163a, aVar.f22164b, aVar.f22165c);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
        }

        a(String str, String str2, c cVar) {
            this.f22163a = str;
            this.f22164b = str2;
            this.f22165c = cVar;
        }

        @Override // com.onesignal.p3.g
        void a(int i10, String str, Throwable th) {
            if (i10 == 403) {
                e3.a(e3.z.FATAL, "403 error getting OneSignal params, omitting further retries!");
            } else {
                new Thread(new RunnableC0111a(), "OS_PARAMS_REQUEST").start();
            }
        }

        @Override // com.onesignal.p3.g
        void b(String str) {
            o3.f(str, this.f22165c);
        }
    }

    class b extends f {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ JSONObject f22167p;

        b(JSONObject jSONObject) {
            this.f22167p = jSONObject;
            this.f22180b = jSONObject.optBoolean("enterp", false);
            this.f22181c = jSONObject.optBoolean("require_email_auth", false);
            this.f22182d = jSONObject.optBoolean("require_user_id_auth", false);
            this.f22183e = jSONObject.optJSONArray("chnl_lst");
            this.f22184f = jSONObject.optBoolean("fba", false);
            this.f22185g = jSONObject.optBoolean("restore_ttl_filter", true);
            this.f22179a = jSONObject.optString("android_sender_id", null);
            this.f22186h = jSONObject.optBoolean("clear_group_on_summary_click", true);
            this.f22187i = jSONObject.optBoolean("receive_receipts_enable", false);
            this.f22188j = !jSONObject.has("disable_gms_missing_prompt") ? null : Boolean.valueOf(jSONObject.optBoolean("disable_gms_missing_prompt", false));
            this.f22189k = !jSONObject.has("unsubscribe_on_notifications_disabled") ? null : Boolean.valueOf(jSONObject.optBoolean("unsubscribe_on_notifications_disabled", true));
            this.f22190l = !jSONObject.has("location_shared") ? null : Boolean.valueOf(jSONObject.optBoolean("location_shared", true));
            this.f22191m = !jSONObject.has("requires_user_privacy_consent") ? null : Boolean.valueOf(jSONObject.optBoolean("requires_user_privacy_consent", false));
            this.f22192n = new e();
            if (jSONObject.has("outcomes")) {
                o3.g(jSONObject.optJSONObject("outcomes"), this.f22192n);
            }
            this.f22193o = new d();
            if (jSONObject.has("fcm")) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("fcm");
                this.f22193o.f22170c = jSONObjectOptJSONObject.optString("api_key", null);
                this.f22193o.f22169b = jSONObjectOptJSONObject.optString("app_id", null);
                this.f22193o.f22168a = jSONObjectOptJSONObject.optString("project_id", null);
            }
        }
    }

    interface c {
        void a(f fVar);
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        String f22168a;

        /* renamed from: b, reason: collision with root package name */
        String f22169b;

        /* renamed from: c, reason: collision with root package name */
        String f22170c;

        d() {
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        int f22171a = 1440;

        /* renamed from: b, reason: collision with root package name */
        int f22172b = 10;

        /* renamed from: c, reason: collision with root package name */
        int f22173c = 1440;

        /* renamed from: d, reason: collision with root package name */
        int f22174d = 10;

        /* renamed from: e, reason: collision with root package name */
        boolean f22175e = false;

        /* renamed from: f, reason: collision with root package name */
        boolean f22176f = false;

        /* renamed from: g, reason: collision with root package name */
        boolean f22177g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f22178h = false;

        public int a() {
            return this.f22174d;
        }

        public int b() {
            return this.f22173c;
        }

        public int c() {
            return this.f22171a;
        }

        public int d() {
            return this.f22172b;
        }

        public boolean e() {
            return this.f22175e;
        }

        public boolean f() {
            return this.f22176f;
        }

        public boolean g() {
            return this.f22177g;
        }

        public String toString() {
            return "InfluenceParams{indirectNotificationAttributionWindow=" + this.f22171a + ", notificationLimit=" + this.f22172b + ", indirectIAMAttributionWindow=" + this.f22173c + ", iamLimit=" + this.f22174d + ", directEnabled=" + this.f22175e + ", indirectEnabled=" + this.f22176f + ", unattributedEnabled=" + this.f22177g + '}';
        }
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        String f22179a;

        /* renamed from: b, reason: collision with root package name */
        boolean f22180b;

        /* renamed from: c, reason: collision with root package name */
        boolean f22181c;

        /* renamed from: d, reason: collision with root package name */
        boolean f22182d;

        /* renamed from: e, reason: collision with root package name */
        JSONArray f22183e;

        /* renamed from: f, reason: collision with root package name */
        boolean f22184f;

        /* renamed from: g, reason: collision with root package name */
        boolean f22185g;

        /* renamed from: h, reason: collision with root package name */
        boolean f22186h;

        /* renamed from: i, reason: collision with root package name */
        boolean f22187i;

        /* renamed from: j, reason: collision with root package name */
        Boolean f22188j;

        /* renamed from: k, reason: collision with root package name */
        Boolean f22189k;

        /* renamed from: l, reason: collision with root package name */
        Boolean f22190l;

        /* renamed from: m, reason: collision with root package name */
        Boolean f22191m;

        /* renamed from: n, reason: collision with root package name */
        e f22192n;

        /* renamed from: o, reason: collision with root package name */
        d f22193o;

        f() {
        }
    }

    static /* synthetic */ int b() {
        int i10 = f22162a;
        f22162a = i10 + 1;
        return i10;
    }

    static void e(String str, String str2, c cVar) {
        a aVar = new a(str, str2, cVar);
        String str3 = "apps/" + str + "/android_params.js";
        if (str2 != null) {
            str3 = str3 + "?player_id=" + str2;
        }
        e3.a(e3.z.DEBUG, "Starting request to get Android parameters.");
        p3.e(str3, aVar, "CACHE_KEY_REMOTE_PARAMS");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(String str, c cVar) {
        try {
            cVar.a(new b(new JSONObject(str)));
        } catch (NullPointerException | JSONException e5) {
            e3.z zVar = e3.z.FATAL;
            e3.b(zVar, "Error parsing android_params!: ", e5);
            e3.a(zVar, "Response that errored from android_params!: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(JSONObject jSONObject, e eVar) {
        if (jSONObject.has("v2_enabled")) {
            eVar.f22178h = jSONObject.optBoolean("v2_enabled");
        }
        if (jSONObject.has("direct")) {
            eVar.f22175e = jSONObject.optJSONObject("direct").optBoolean("enabled");
        }
        if (jSONObject.has("indirect")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("indirect");
            eVar.f22176f = jSONObjectOptJSONObject.optBoolean("enabled");
            if (jSONObjectOptJSONObject.has("notification_attribution")) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("notification_attribution");
                eVar.f22171a = jSONObjectOptJSONObject2.optInt("minutes_since_displayed", 1440);
                eVar.f22172b = jSONObjectOptJSONObject2.optInt("limit", 10);
            }
            if (jSONObjectOptJSONObject.has("in_app_message_attribution")) {
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("in_app_message_attribution");
                eVar.f22173c = jSONObjectOptJSONObject3.optInt("minutes_since_displayed", 1440);
                eVar.f22174d = jSONObjectOptJSONObject3.optInt("limit", 10);
            }
        }
        if (jSONObject.has("unattributed")) {
            eVar.f22177g = jSONObject.optJSONObject("unattributed").optBoolean("enabled");
        }
    }
}
