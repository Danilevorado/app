package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import h3.a;

/* loaded from: classes.dex */
final class g4 extends q5 {

    /* renamed from: x, reason: collision with root package name */
    static final Pair f19919x = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f19920c;

    /* renamed from: d, reason: collision with root package name */
    public e4 f19921d;

    /* renamed from: e, reason: collision with root package name */
    public final d4 f19922e;

    /* renamed from: f, reason: collision with root package name */
    public final d4 f19923f;

    /* renamed from: g, reason: collision with root package name */
    public final f4 f19924g;

    /* renamed from: h, reason: collision with root package name */
    private String f19925h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19926i;

    /* renamed from: j, reason: collision with root package name */
    private long f19927j;

    /* renamed from: k, reason: collision with root package name */
    public final d4 f19928k;

    /* renamed from: l, reason: collision with root package name */
    public final b4 f19929l;

    /* renamed from: m, reason: collision with root package name */
    public final f4 f19930m;

    /* renamed from: n, reason: collision with root package name */
    public final b4 f19931n;

    /* renamed from: o, reason: collision with root package name */
    public final d4 f19932o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19933p;

    /* renamed from: q, reason: collision with root package name */
    public final b4 f19934q;

    /* renamed from: r, reason: collision with root package name */
    public final b4 f19935r;

    /* renamed from: s, reason: collision with root package name */
    public final d4 f19936s;

    /* renamed from: t, reason: collision with root package name */
    public final f4 f19937t;

    /* renamed from: u, reason: collision with root package name */
    public final f4 f19938u;

    /* renamed from: v, reason: collision with root package name */
    public final d4 f19939v;

    /* renamed from: w, reason: collision with root package name */
    public final c4 f19940w;

    g4(w4 w4Var) {
        super(w4Var);
        this.f19928k = new d4(this, "session_timeout", 1800000L);
        this.f19929l = new b4(this, "start_new_session", true);
        this.f19932o = new d4(this, "last_pause_time", 0L);
        this.f19930m = new f4(this, "non_personalized_ads", null);
        this.f19931n = new b4(this, "allow_remote_dynamite", false);
        this.f19922e = new d4(this, "first_open_time", 0L);
        this.f19923f = new d4(this, "app_install_time", 0L);
        this.f19924g = new f4(this, "app_instance_id", null);
        this.f19934q = new b4(this, "app_backgrounded", false);
        this.f19935r = new b4(this, "deep_link_retrieval_complete", false);
        this.f19936s = new d4(this, "deep_link_retrieval_attempts", 0L);
        this.f19937t = new f4(this, "firebase_feature_rollouts", null);
        this.f19938u = new f4(this, "deferred_attribution_cache", null);
        this.f19939v = new d4(this, "deferred_attribution_cache_timestamp", 0L);
        this.f19940w = new c4(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.q5
    protected final void g() {
        SharedPreferences sharedPreferences = this.f20269a.a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f19920c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f19933p = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.f19920c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f20269a.y();
        this.f19921d = new e4(this, "health_monitor", Math.max(0L, ((Long) i3.f20009d.a(null)).longValue()), null);
    }

    @Override // com.google.android.gms.measurement.internal.q5
    protected final boolean h() {
        return true;
    }

    protected final SharedPreferences m() {
        f();
        i();
        e4.p.l(this.f19920c);
        return this.f19920c;
    }

    final Pair n(String str) {
        f();
        long jB = this.f20269a.d().b();
        String str2 = this.f19925h;
        if (str2 != null && jB < this.f19927j) {
            return new Pair(str2, Boolean.valueOf(this.f19926i));
        }
        this.f19927j = jB + this.f20269a.y().p(str, i3.f20007c);
        h3.a.d(true);
        try {
            a.C0142a c0142aA = h3.a.a(this.f20269a.a());
            this.f19925h = "";
            String strA = c0142aA.a();
            if (strA != null) {
                this.f19925h = strA;
            }
            this.f19926i = c0142aA.b();
        } catch (Exception e5) {
            this.f20269a.b().o().b("Unable to get advertising id", e5);
            this.f19925h = "";
        }
        h3.a.d(false);
        return new Pair(this.f19925h, Boolean.valueOf(this.f19926i));
    }

    final x4.b o() {
        f();
        return x4.b.b(m().getString("consent_settings", "G1"));
    }

    final Boolean p() {
        f();
        if (m().contains("measurement_enabled")) {
            return Boolean.valueOf(m().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final void q(Boolean bool) {
        f();
        SharedPreferences.Editor editorEdit = m().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final void r(boolean z10) {
        f();
        this.f20269a.b().t().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor editorEdit = m().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    final boolean s() {
        SharedPreferences sharedPreferences = this.f19920c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final boolean t(long j10) {
        return j10 - this.f19928k.a() > this.f19932o.a();
    }

    final boolean u(int i10) {
        return x4.b.j(i10, m().getInt("consent_source", 100));
    }
}
