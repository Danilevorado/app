package ka;

import android.content.SharedPreferences;
import android.text.TextUtils;
import f9.a;
import java.util.Locale;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final h9.h f24887a;

    /* renamed from: b, reason: collision with root package name */
    private final h9.b f24888b;

    /* renamed from: c, reason: collision with root package name */
    private final h9.h f24889c;

    /* renamed from: d, reason: collision with root package name */
    private final h9.h f24890d;

    /* renamed from: e, reason: collision with root package name */
    private final h9.h f24891e;

    /* renamed from: f, reason: collision with root package name */
    private final h9.h f24892f;

    /* renamed from: g, reason: collision with root package name */
    private final h9.h f24893g;

    /* renamed from: h, reason: collision with root package name */
    private final h9.f f24894h;

    /* renamed from: i, reason: collision with root package name */
    private final h9.f f24895i;

    /* renamed from: j, reason: collision with root package name */
    private final h9.b f24896j;

    /* renamed from: k, reason: collision with root package name */
    private final h9.h f24897k;

    /* renamed from: l, reason: collision with root package name */
    private final h9.h f24898l;

    /* renamed from: m, reason: collision with root package name */
    private final h9.h f24899m;

    /* renamed from: n, reason: collision with root package name */
    private final h9.b f24900n;

    /* renamed from: o, reason: collision with root package name */
    private final h9.h f24901o;

    /* renamed from: p, reason: collision with root package name */
    private final h9.b f24902p;

    /* renamed from: q, reason: collision with root package name */
    private final h9.b f24903q;

    /* renamed from: r, reason: collision with root package name */
    private final h9.b f24904r;

    /* renamed from: s, reason: collision with root package name */
    private final h9.h f24905s;

    /* renamed from: t, reason: collision with root package name */
    private final h9.h f24906t;

    /* renamed from: u, reason: collision with root package name */
    private final z7.d f24907u;

    /* renamed from: v, reason: collision with root package name */
    private final n9.e f24908v;

    /* renamed from: w, reason: collision with root package name */
    private h9.b f24909w;

    /* renamed from: x, reason: collision with root package name */
    private h9.b f24910x;

    d(z7.d dVar, n9.e eVar) {
        k9.h.u("RegistrationPrefs()...");
        this.f24907u = dVar;
        this.f24908v = eVar;
        SharedPreferences sharedPreferencesA = c9.a.h().a("com.pushwoosh.registration");
        h9.h hVar = new h9.h(sharedPreferencesA, "application_id", "");
        this.f24890d = hVar;
        if (hVar.a().isEmpty() && dVar.m() != null) {
            hVar.b(dVar.m());
        }
        h9.h hVar2 = new h9.h(sharedPreferencesA, "project_id", "");
        this.f24889c = hVar2;
        if (hVar2.a().isEmpty() && dVar.x() != null) {
            hVar2.b(dVar.x());
        }
        h9.h hVar3 = new h9.h(sharedPreferencesA, "xiaomi_app_id", "");
        this.f24891e = hVar3;
        if (hVar3.a().isEmpty() && dVar.k() != null) {
            hVar3.b(dVar.k());
        }
        h9.h hVar4 = new h9.h(sharedPreferencesA, "xiaomi_app_key", "");
        this.f24892f = hVar4;
        if (hVar4.a().isEmpty() && dVar.b() != null) {
            hVar4.b(dVar.b());
        }
        h9.h hVar5 = new h9.h(sharedPreferencesA, "pw_xiaomi_app_region", "GLOBAL");
        this.f24893g = hVar5;
        if (hVar5.a().isEmpty() && dVar.p() != null) {
            hVar5.b(dVar.p());
        }
        h9.h hVar6 = new h9.h(sharedPreferencesA, "registration_id", "");
        this.f24887a = hVar6;
        h9.d dVar2 = new h9.d(sharedPreferencesA, "app_version", 0);
        String strA = hVar6.a();
        this.f24909w = new h9.b(sharedPreferencesA, "pw_registered_for_push", (strA == null || strA.isEmpty()) ? false : true);
        this.f24896j = new h9.b(sharedPreferencesA, "force_register", false);
        this.f24910x = new h9.b(sharedPreferencesA, "pw_user_denied_notification_permission", false);
        int iD = g9.a.d();
        if (dVar2.a() != iD) {
            k9.h.v("RegistrationPrefs", "App version changed from " + dVar2.a() + " to " + iD + "; resetting registration id");
            hVar6.b("");
            dVar2.b(iD);
        }
        this.f24888b = new h9.b(sharedPreferencesA, "registered_on_server", false);
        this.f24894h = new h9.f(sharedPreferencesA, "last_registration_change", 0L);
        this.f24895i = new h9.f(sharedPreferencesA, "last_firebase_registration", 0L);
        this.f24897k = new h9.h(sharedPreferencesA, "user_id", "");
        this.f24898l = new h9.h(sharedPreferencesA, "device_id", "");
        this.f24899m = new h9.h(sharedPreferencesA, "log_level", dVar.v());
        this.f24900n = new h9.b(sharedPreferencesA, "settags_failed", false);
        this.f24902p = new h9.b(sharedPreferencesA, "pw_communication_enable", true);
        this.f24903q = new h9.b(sharedPreferencesA, "pw_remove_all_device_data", false);
        this.f24904r = new h9.b(sharedPreferencesA, "pw_gdpr_enable", true);
        h9.h hVar7 = new h9.h(sharedPreferencesA, "pw_base_url", "");
        this.f24901o = hVar7;
        hVar7.b(e(hVar7.a()));
        this.f24905s = new h9.h(sharedPreferencesA, "pw_hwid", "");
        this.f24906t = new h9.h(sharedPreferencesA, "pw_language", dVar.w() ? n() : "en");
        k9.h.u("RegistrationPrefs() done");
    }

    private String e(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("http://")) {
            str = i();
        }
        if (str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }

    private String n() {
        return Locale.getDefault().getLanguage().equals("zh") ? Locale.getDefault().toLanguageTag() : Locale.getDefault().getLanguage();
    }

    static f9.a s(e9.a aVar) {
        f9.a aVar2 = new f9.a("com.pushwoosh.registration");
        a.EnumC0131a enumC0131a = a.EnumC0131a.STRING;
        aVar2.b(aVar, enumC0131a, "application_id");
        aVar2.b(aVar, enumC0131a, "project_id");
        aVar2.b(aVar, enumC0131a, "registration_id");
        aVar2.b(aVar, a.EnumC0131a.INT, "app_version");
        a.EnumC0131a enumC0131a2 = a.EnumC0131a.BOOLEAN;
        aVar2.b(aVar, enumC0131a2, "registered_on_server");
        a.EnumC0131a enumC0131a3 = a.EnumC0131a.LONG;
        aVar2.b(aVar, enumC0131a3, "last_registration_change");
        aVar2.b(aVar, enumC0131a3, "last_firebase_registration");
        aVar2.b(aVar, enumC0131a, "user_id");
        aVar2.b(aVar, enumC0131a, "device_id");
        aVar2.b(aVar, enumC0131a, "log_level");
        aVar2.b(aVar, enumC0131a, "pw_base_url");
        aVar2.b(aVar, enumC0131a2, "settags_failed");
        SharedPreferences sharedPreferencesA = aVar.a("com.pushwoosh.registration");
        if (sharedPreferencesA == null) {
            return aVar2;
        }
        aVar2.c("pw_registered_for_push", sharedPreferencesA.contains("pw_registered_for_push") ? sharedPreferencesA.getBoolean("pw_registered_for_push", false) : !TextUtils.isEmpty(sharedPreferencesA.getString("registration_id", "")));
        return aVar2;
    }

    public h9.h A() {
        return this.f24897k;
    }

    public h9.h a() {
        return this.f24890d;
    }

    public h9.h b() {
        return this.f24901o;
    }

    public void c() {
        t().b("");
        p().b(0L);
    }

    public h9.b d() {
        return this.f24902p;
    }

    public h9.h f() {
        return this.f24898l;
    }

    public h9.b g() {
        return this.f24896j;
    }

    public h9.b h() {
        return this.f24904r;
    }

    public String i() {
        String strA = this.f24907u.a();
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = this.f24890d.a();
        return (TextUtils.equals(strA2, "") || strA2.contains(".")) ? "https://cp.pushwoosh.com/json/1.3/" : String.format("https://%s.api.pushwoosh.com/json/1.3/", strA2);
    }

    public h9.b j() {
        return this.f24910x;
    }

    public h9.h k() {
        return this.f24905s;
    }

    public h9.b l() {
        return this.f24909w;
    }

    public h9.h m() {
        return this.f24906t;
    }

    public h9.f o() {
        return this.f24895i;
    }

    public h9.f p() {
        return this.f24894h;
    }

    public h9.h q() {
        return this.f24899m;
    }

    public h9.h r() {
        return this.f24889c;
    }

    public h9.h t() {
        return this.f24887a;
    }

    public h9.b u() {
        return this.f24888b;
    }

    public h9.b v() {
        return this.f24903q;
    }

    public void w() {
        a().b("");
        b().b("");
        p().b(0L);
        z().b(false);
        this.f24888b.b(false);
    }

    public void x() {
        c();
        r().b("");
    }

    public void y(String str) {
        a().b(str);
        b().b(i());
    }

    public h9.b z() {
        return this.f24900n;
    }
}
