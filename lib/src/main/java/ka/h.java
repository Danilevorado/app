package ka;

import android.content.SharedPreferences;
import com.facebook.ads.AdError;
import f9.a;
import h9.i;
import w9.l;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final h9.b f24924a;

    /* renamed from: b, reason: collision with root package name */
    private final h9.d f24925b;

    /* renamed from: c, reason: collision with root package name */
    private final h9.b f24926c;

    /* renamed from: d, reason: collision with root package name */
    private final h9.b f24927d;

    /* renamed from: e, reason: collision with root package name */
    private final h9.d f24928e;

    /* renamed from: f, reason: collision with root package name */
    private final h9.d f24929f;

    /* renamed from: g, reason: collision with root package name */
    private final h9.d f24930g;

    /* renamed from: h, reason: collision with root package name */
    private final h9.h f24931h;

    /* renamed from: i, reason: collision with root package name */
    private final h9.b f24932i;

    /* renamed from: j, reason: collision with root package name */
    private final h9.g f24933j;

    /* renamed from: k, reason: collision with root package name */
    private final i f24934k;

    /* renamed from: l, reason: collision with root package name */
    private final h9.h f24935l;

    /* renamed from: m, reason: collision with root package name */
    private final h9.a f24936m;

    /* renamed from: n, reason: collision with root package name */
    private final h9.e f24937n;

    /* renamed from: o, reason: collision with root package name */
    private final h9.c f24938o;

    /* renamed from: p, reason: collision with root package name */
    private final h9.c f24939p;

    /* renamed from: q, reason: collision with root package name */
    private final h9.b f24940q;

    /* renamed from: r, reason: collision with root package name */
    private final h9.h f24941r;

    /* renamed from: s, reason: collision with root package name */
    private final h9.h f24942s;

    /* renamed from: t, reason: collision with root package name */
    private final h9.b f24943t;

    /* renamed from: u, reason: collision with root package name */
    private final h9.b f24944u;

    /* renamed from: v, reason: collision with root package name */
    private final h9.b f24945v;

    /* renamed from: w, reason: collision with root package name */
    private final h9.b f24946w;

    /* renamed from: x, reason: collision with root package name */
    private final h9.b f24947x;

    /* renamed from: y, reason: collision with root package name */
    private final h9.b f24948y;

    /* renamed from: z, reason: collision with root package name */
    private final h9.b f24949z;

    h(z7.d dVar) {
        k9.h.u("NotificationPrefs()...");
        SharedPreferences sharedPreferencesA = c9.a.h().a("com.pushwoosh.pushnotifications");
        this.f24924a = new h9.b(sharedPreferencesA, "dm_multimode", dVar.y());
        this.f24925b = new h9.d(sharedPreferencesA, "dm_messageid", AdError.NO_FILL_ERROR_CODE);
        this.f24926c = new h9.b(sharedPreferencesA, "dm_lightson", dVar.d());
        this.f24927d = new h9.b(sharedPreferencesA, "dm_ledon", false);
        this.f24928e = new h9.d(sharedPreferencesA, "dm_led_color", -1);
        this.f24938o = new h9.c(sharedPreferencesA, "pw_notification_factory", dVar.h());
        this.f24939p = new h9.c(sharedPreferencesA, "pw_notification_factory", dVar.e());
        this.f24929f = new h9.d(sharedPreferencesA, "pw_notification_background_color", dVar.i());
        this.f24930g = new h9.d(sharedPreferencesA, "pw_richmedia_delay", dVar.t().b());
        this.f24931h = new h9.h(sharedPreferencesA, "pw_notification_stat_hash", null);
        this.f24932i = new h9.b(sharedPreferencesA, "pw_notifications_enabled", true);
        this.f24933j = new h9.g(sharedPreferencesA, "dm_soundtype", w9.i.DEFAULT_MODE);
        this.f24934k = new i(sharedPreferencesA, "dm_vibratetype", l.DEFAULT_MODE);
        this.f24935l = new h9.h(sharedPreferencesA, "channel_name", "Push notification");
        this.f24936m = new h9.a(sharedPreferencesA, "pushHistoryArray", 16, String.class);
        this.f24937n = new h9.e(sharedPreferencesA, "cached_tags_string");
        this.f24940q = new h9.b(sharedPreferencesA, "pw_tags_migration_done", false);
        this.f24941r = new h9.h(sharedPreferencesA, "pw_custom_data", null);
        this.f24942s = new h9.h(sharedPreferencesA, "pw_message_hash", null);
        this.f24943t = new h9.b(sharedPreferencesA, "pw_is_server_communication_allowed", dVar.j());
        this.f24944u = new h9.b(sharedPreferencesA, "pw_is_show_notification_alert", dVar.u());
        this.f24948y = new h9.b(sharedPreferencesA, "pw_handle_notifications_using_work_manager", dVar.s());
        this.f24945v = new h9.b(sharedPreferencesA, "pw_is_collecting_device_os_version_allowed", dVar.l());
        this.f24946w = new h9.b(sharedPreferencesA, "pw_is_collecting_device_locale_allowed", dVar.w());
        this.f24947x = new h9.b(sharedPreferencesA, "pw_is_collecting_device_model_allowed", dVar.f());
        this.f24949z = new h9.b(sharedPreferencesA, "pw_show_fullscreen_richmedia", dVar.n());
        k9.h.u("NotificationPrefs() done");
    }

    static f9.a a(e9.a aVar) {
        f9.a aVar2 = new f9.a("com.pushwoosh.pushnotifications");
        a.EnumC0131a enumC0131a = a.EnumC0131a.BOOLEAN;
        aVar2.b(aVar, enumC0131a, "dm_multimode");
        a.EnumC0131a enumC0131a2 = a.EnumC0131a.INT;
        aVar2.b(aVar, enumC0131a2, "dm_soundtype");
        aVar2.b(aVar, enumC0131a2, "dm_vibratetype");
        a.EnumC0131a enumC0131a3 = a.EnumC0131a.STRING;
        aVar2.b(aVar, enumC0131a3, "channel_name");
        aVar2.b(aVar, enumC0131a2, "dm_messageid");
        aVar2.b(aVar, enumC0131a, "dm_lightson");
        aVar2.b(aVar, enumC0131a, "dm_ledon");
        aVar2.b(aVar, enumC0131a2, "dm_led_color");
        aVar2.b(aVar, enumC0131a3, "pw_notification_factory");
        aVar2.b(aVar, enumC0131a3, "pushHistoryArray");
        aVar2.b(aVar, enumC0131a3, "cached_tags_string");
        aVar2.b(aVar, enumC0131a2, "pw_notification_background_color");
        aVar2.b(aVar, enumC0131a3, "pw_notification_stat_hash");
        aVar2.b(aVar, enumC0131a2, "pw_richmedia_delay");
        aVar2.b(aVar, enumC0131a, "pw_notifications_enabled");
        return aVar2;
    }

    public h9.h b() {
        return this.f24935l;
    }

    public h9.h c() {
        return this.f24941r;
    }

    public h9.b d() {
        return this.f24948y;
    }

    public h9.d e() {
        return this.f24929f;
    }

    public h9.b f() {
        return this.f24947x;
    }

    public h9.b g() {
        return this.f24945v;
    }

    public h9.b h() {
        return this.f24943t;
    }

    public h9.h i() {
        return this.f24931h;
    }

    public h9.d j() {
        return this.f24928e;
    }

    public h9.b k() {
        return this.f24927d;
    }

    public h9.b l() {
        return this.f24926c;
    }

    public h9.h m() {
        return this.f24942s;
    }

    public h9.d n() {
        return this.f24925b;
    }

    public h9.b o() {
        return this.f24924a;
    }

    public h9.b p() {
        return this.f24932i;
    }

    public h9.c q() {
        return this.f24938o;
    }

    public h9.a r() {
        return this.f24936m;
    }

    public h9.d s() {
        return this.f24930g;
    }

    public h9.b t() {
        return this.f24949z;
    }

    public h9.b u() {
        return this.f24944u;
    }

    public h9.g v() {
        return this.f24933j;
    }

    public h9.c w() {
        return this.f24939p;
    }

    public h9.e x() {
        return this.f24937n;
    }

    public i y() {
        return this.f24934k;
    }
}
