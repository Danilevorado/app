package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class sb implements rb {
    public static final u6 A;
    public static final u6 B;
    public static final u6 C;
    public static final u6 D;
    public static final u6 E;
    public static final u6 F;
    public static final u6 G;
    public static final u6 H;
    public static final u6 I;
    public static final u6 J;
    public static final u6 K;
    public static final u6 L;
    public static final u6 M;

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f19284a;

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f19285b;

    /* renamed from: c, reason: collision with root package name */
    public static final u6 f19286c;

    /* renamed from: d, reason: collision with root package name */
    public static final u6 f19287d;

    /* renamed from: e, reason: collision with root package name */
    public static final u6 f19288e;

    /* renamed from: f, reason: collision with root package name */
    public static final u6 f19289f;

    /* renamed from: g, reason: collision with root package name */
    public static final u6 f19290g;

    /* renamed from: h, reason: collision with root package name */
    public static final u6 f19291h;

    /* renamed from: i, reason: collision with root package name */
    public static final u6 f19292i;

    /* renamed from: j, reason: collision with root package name */
    public static final u6 f19293j;

    /* renamed from: k, reason: collision with root package name */
    public static final u6 f19294k;

    /* renamed from: l, reason: collision with root package name */
    public static final u6 f19295l;

    /* renamed from: m, reason: collision with root package name */
    public static final u6 f19296m;

    /* renamed from: n, reason: collision with root package name */
    public static final u6 f19297n;

    /* renamed from: o, reason: collision with root package name */
    public static final u6 f19298o;

    /* renamed from: p, reason: collision with root package name */
    public static final u6 f19299p;

    /* renamed from: q, reason: collision with root package name */
    public static final u6 f19300q;

    /* renamed from: r, reason: collision with root package name */
    public static final u6 f19301r;

    /* renamed from: s, reason: collision with root package name */
    public static final u6 f19302s;

    /* renamed from: t, reason: collision with root package name */
    public static final u6 f19303t;

    /* renamed from: u, reason: collision with root package name */
    public static final u6 f19304u;

    /* renamed from: v, reason: collision with root package name */
    public static final u6 f19305v;

    /* renamed from: w, reason: collision with root package name */
    public static final u6 f19306w;

    /* renamed from: x, reason: collision with root package name */
    public static final u6 f19307x;

    /* renamed from: y, reason: collision with root package name */
    public static final u6 f19308y;

    /* renamed from: z, reason: collision with root package name */
    public static final u6 f19309z;

    static {
        q6 q6VarA = new q6(i6.a("com.google.android.gms.measurement")).a();
        f19284a = q6VarA.d("measurement.ad_id_cache_time", 10000L);
        f19285b = q6VarA.d("measurement.max_bundles_per_iteration", 100L);
        f19286c = q6VarA.d("measurement.config.cache_time", 86400000L);
        f19287d = q6VarA.e("measurement.log_tag", "FA");
        f19288e = q6VarA.e("measurement.config.url_authority", "app-measurement.com");
        f19289f = q6VarA.e("measurement.config.url_scheme", "https");
        f19290g = q6VarA.d("measurement.upload.debug_upload_interval", 1000L);
        f19291h = q6VarA.d("measurement.lifetimevalue.max_currency_tracked", 4L);
        f19292i = q6VarA.d("measurement.store.max_stored_events_per_app", 100000L);
        f19293j = q6VarA.d("measurement.experiment.max_ids", 50L);
        f19294k = q6VarA.d("measurement.audience.filter_result_max_count", 200L);
        f19295l = q6VarA.d("measurement.alarm_manager.minimum_interval", 60000L);
        f19296m = q6VarA.d("measurement.upload.minimum_delay", 500L);
        f19297n = q6VarA.d("measurement.monitoring.sample_period_millis", 86400000L);
        f19298o = q6VarA.d("measurement.upload.realtime_upload_interval", 10000L);
        f19299p = q6VarA.d("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        f19300q = q6VarA.d("measurement.config.cache_time.service", 3600000L);
        f19301r = q6VarA.d("measurement.service_client.idle_disconnect_millis", 5000L);
        f19302s = q6VarA.e("measurement.log_tag.service", "FA-SVC");
        f19303t = q6VarA.d("measurement.upload.stale_data_deletion_interval", 86400000L);
        f19304u = q6VarA.d("measurement.sdk.attribution.cache.ttl", 604800000L);
        f19305v = q6VarA.d("measurement.redaction.app_instance_id.ttl", 7200000L);
        f19306w = q6VarA.d("measurement.upload.backoff_period", 43200000L);
        f19307x = q6VarA.d("measurement.upload.initial_upload_delay_time", 15000L);
        f19308y = q6VarA.d("measurement.upload.interval", 3600000L);
        f19309z = q6VarA.d("measurement.upload.max_bundle_size", 65536L);
        A = q6VarA.d("measurement.upload.max_bundles", 100L);
        B = q6VarA.d("measurement.upload.max_conversions_per_day", 500L);
        C = q6VarA.d("measurement.upload.max_error_events_per_day", 1000L);
        D = q6VarA.d("measurement.upload.max_events_per_bundle", 1000L);
        E = q6VarA.d("measurement.upload.max_events_per_day", 100000L);
        F = q6VarA.d("measurement.upload.max_public_events_per_day", 50000L);
        G = q6VarA.d("measurement.upload.max_queue_time", 2419200000L);
        H = q6VarA.d("measurement.upload.max_realtime_events_per_day", 10L);
        I = q6VarA.d("measurement.upload.max_batch_size", 65536L);
        J = q6VarA.d("measurement.upload.retry_count", 6L);
        K = q6VarA.d("measurement.upload.retry_time", 1800000L);
        L = q6VarA.e("measurement.upload.url", "https://app-measurement.com/a");
        M = q6VarA.d("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long A() {
        return ((Long) C.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long B() {
        return ((Long) f19308y.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long D() {
        return ((Long) B.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long E() {
        return ((Long) J.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long F() {
        return ((Long) F.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final String L() {
        return (String) f19289f.b();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long N() {
        return ((Long) D.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long O() {
        return ((Long) G.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long P() {
        return ((Long) M.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long Q() {
        return ((Long) H.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final String T() {
        return (String) f19288e.b();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long a() {
        return ((Long) f19284a.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long b() {
        return ((Long) f19285b.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long c() {
        return ((Long) f19291h.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long d() {
        return ((Long) f19286c.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long e() {
        return ((Long) f19292i.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long f() {
        return ((Long) f19290g.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long g() {
        return ((Long) f19294k.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long h() {
        return ((Long) f19293j.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long i() {
        return ((Long) f19295l.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long j() {
        return ((Long) f19296m.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long k() {
        return ((Long) f19297n.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long l() {
        return ((Long) f19298o.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long m() {
        return ((Long) f19301r.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long n() {
        return ((Long) f19299p.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long o() {
        return ((Long) f19304u.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long o0() {
        return ((Long) E.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long p() {
        return ((Long) f19303t.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long q() {
        return ((Long) f19305v.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long r() {
        return ((Long) f19306w.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long t() {
        return ((Long) f19307x.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long u() {
        return ((Long) f19309z.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long v() {
        return ((Long) A.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long w() {
        return ((Long) I.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final String y() {
        return (String) L.b();
    }

    @Override // com.google.android.gms.internal.measurement.rb
    public final long z() {
        return ((Long) K.b()).longValue();
    }
}
