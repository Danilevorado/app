package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.measurement.bd;
import com.google.android.gms.internal.measurement.dc;
import com.google.android.gms.internal.measurement.fd;
import com.google.android.gms.internal.measurement.gc;
import com.google.android.gms.internal.measurement.hb;
import com.google.android.gms.internal.measurement.id;
import com.google.android.gms.internal.measurement.jc;
import com.google.android.gms.internal.measurement.kb;
import com.google.android.gms.internal.measurement.ld;
import com.google.android.gms.internal.measurement.mc;
import com.google.android.gms.internal.measurement.nb;
import com.google.android.gms.internal.measurement.od;
import com.google.android.gms.internal.measurement.pc;
import com.google.android.gms.internal.measurement.qb;
import com.google.android.gms.internal.measurement.rd;
import com.google.android.gms.internal.measurement.sc;
import com.google.android.gms.internal.measurement.tb;
import com.google.android.gms.internal.measurement.u6;
import com.google.android.gms.internal.measurement.ud;
import com.google.android.gms.internal.measurement.vc;
import com.google.android.gms.internal.measurement.wb;
import com.google.android.gms.internal.measurement.xd;
import com.google.android.gms.internal.measurement.yc;
import com.google.android.gms.internal.measurement.zb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class i3 {
    public static final h3 A;
    public static final h3 A0;
    public static final h3 B;
    public static final h3 B0;
    public static final h3 C;
    public static final h3 C0;
    public static final h3 D;
    public static final h3 D0;
    public static final h3 E;
    public static final h3 E0;
    public static final h3 F;
    public static final h3 F0;
    public static final h3 G;
    public static final h3 G0;
    public static final h3 H;
    public static final h3 H0;
    public static final h3 I;
    public static final h3 I0;
    public static final h3 J;
    public static final h3 J0;
    public static final h3 K;
    public static final h3 L;
    public static final h3 M;
    public static final h3 N;
    public static final h3 O;
    public static final h3 P;
    public static final h3 Q;
    public static final h3 R;
    public static final h3 S;
    public static final h3 T;
    public static final h3 U;
    public static final h3 V;
    public static final h3 W;
    public static final h3 X;
    public static final h3 Y;
    public static final h3 Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final h3 f20004a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final h3 f20006b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final h3 f20008c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final h3 f20010d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final h3 f20012e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final h3 f20014f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final h3 f20016g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final h3 f20018h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final h3 f20020i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final h3 f20022j0;

    /* renamed from: k, reason: collision with root package name */
    public static final h3 f20023k;

    /* renamed from: k0, reason: collision with root package name */
    public static final h3 f20024k0;

    /* renamed from: l, reason: collision with root package name */
    public static final h3 f20025l;

    /* renamed from: l0, reason: collision with root package name */
    public static final h3 f20026l0;

    /* renamed from: m, reason: collision with root package name */
    public static final h3 f20027m;

    /* renamed from: m0, reason: collision with root package name */
    public static final h3 f20028m0;

    /* renamed from: n, reason: collision with root package name */
    public static final h3 f20029n;

    /* renamed from: n0, reason: collision with root package name */
    public static final h3 f20030n0;

    /* renamed from: o, reason: collision with root package name */
    public static final h3 f20031o;

    /* renamed from: o0, reason: collision with root package name */
    public static final h3 f20032o0;

    /* renamed from: p, reason: collision with root package name */
    public static final h3 f20033p;

    /* renamed from: p0, reason: collision with root package name */
    public static final h3 f20034p0;

    /* renamed from: q, reason: collision with root package name */
    public static final h3 f20035q;

    /* renamed from: q0, reason: collision with root package name */
    public static final h3 f20036q0;

    /* renamed from: r, reason: collision with root package name */
    public static final h3 f20037r;

    /* renamed from: r0, reason: collision with root package name */
    public static final h3 f20038r0;

    /* renamed from: s, reason: collision with root package name */
    public static final h3 f20039s;

    /* renamed from: s0, reason: collision with root package name */
    public static final h3 f20040s0;

    /* renamed from: t, reason: collision with root package name */
    public static final h3 f20041t;

    /* renamed from: t0, reason: collision with root package name */
    public static final h3 f20042t0;

    /* renamed from: u, reason: collision with root package name */
    public static final h3 f20043u;

    /* renamed from: u0, reason: collision with root package name */
    public static final h3 f20044u0;

    /* renamed from: v, reason: collision with root package name */
    public static final h3 f20045v;

    /* renamed from: v0, reason: collision with root package name */
    public static final h3 f20046v0;

    /* renamed from: w, reason: collision with root package name */
    public static final h3 f20047w;

    /* renamed from: w0, reason: collision with root package name */
    public static final h3 f20048w0;

    /* renamed from: x, reason: collision with root package name */
    public static final h3 f20049x;

    /* renamed from: x0, reason: collision with root package name */
    public static final h3 f20050x0;

    /* renamed from: y, reason: collision with root package name */
    public static final h3 f20051y;

    /* renamed from: y0, reason: collision with root package name */
    public static final h3 f20052y0;

    /* renamed from: z, reason: collision with root package name */
    public static final h3 f20053z;

    /* renamed from: z0, reason: collision with root package name */
    public static final h3 f20054z0;

    /* renamed from: a, reason: collision with root package name */
    private static final List f20003a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    private static final Set f20005b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c, reason: collision with root package name */
    public static final h3 f20007c = a("measurement.ad_id_cache_time", 10000L, 10000L, new f3() { // from class: com.google.android.gms.measurement.internal.i0
        @Override // com.google.android.gms.measurement.internal.f3
        public final Object a() {
            h3 h3Var = i3.f20007c;
            return Long.valueOf(qb.n());
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public static final h3 f20009d = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new f3() { // from class: com.google.android.gms.measurement.internal.a0
        @Override // com.google.android.gms.measurement.internal.f3
        public final Object a() {
            h3 h3Var = i3.f20007c;
            return Long.valueOf(qb.x());
        }
    });

    /* renamed from: e, reason: collision with root package name */
    public static final h3 f20011e = a("measurement.config.cache_time", 86400000L, 3600000L, new f3() { // from class: com.google.android.gms.measurement.internal.m0
        @Override // com.google.android.gms.measurement.internal.f3
        public final Object a() {
            h3 h3Var = i3.f20007c;
            return Long.valueOf(qb.p());
        }
    });

    /* renamed from: f, reason: collision with root package name */
    public static final h3 f20013f = a("measurement.config.url_scheme", "https", "https", new f3() { // from class: com.google.android.gms.measurement.internal.y0
        @Override // com.google.android.gms.measurement.internal.f3
        public final Object a() {
            h3 h3Var = i3.f20007c;
            return qb.l();
        }
    });

    /* renamed from: g, reason: collision with root package name */
    public static final h3 f20015g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new f3() { // from class: com.google.android.gms.measurement.internal.l1
        @Override // com.google.android.gms.measurement.internal.f3
        public final Object a() {
            h3 h3Var = i3.f20007c;
            return qb.k();
        }
    });

    /* renamed from: h, reason: collision with root package name */
    public static final h3 f20017h = a("measurement.upload.max_bundles", 100, 100, new f3() { // from class: com.google.android.gms.measurement.internal.x1
        @Override // com.google.android.gms.measurement.internal.f3
        public final Object a() {
            h3 h3Var = i3.f20007c;
            return Integer.valueOf((int) qb.I());
        }
    });

    /* renamed from: i, reason: collision with root package name */
    public static final h3 f20019i = a("measurement.upload.max_batch_size", 65536, 65536, new f3() { // from class: com.google.android.gms.measurement.internal.k2
        @Override // com.google.android.gms.measurement.internal.f3
        public final Object a() {
            h3 h3Var = i3.f20007c;
            return Integer.valueOf((int) qb.f());
        }
    });

    /* renamed from: j, reason: collision with root package name */
    public static final h3 f20021j = a("measurement.upload.max_bundle_size", 65536, 65536, new f3() { // from class: com.google.android.gms.measurement.internal.w2
        @Override // com.google.android.gms.measurement.internal.f3
        public final Object a() {
            h3 h3Var = i3.f20007c;
            return Integer.valueOf((int) qb.H());
        }
    });

    static {
        Integer numValueOf = Integer.valueOf(AdError.NETWORK_ERROR_CODE);
        f20023k = a("measurement.upload.max_events_per_bundle", numValueOf, numValueOf, new f3() { // from class: com.google.android.gms.measurement.internal.a3
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) qb.L());
            }
        });
        f20025l = a("measurement.upload.max_events_per_day", 100000, 100000, new f3() { // from class: com.google.android.gms.measurement.internal.c3
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) qb.b());
            }
        });
        f20027m = a("measurement.upload.max_error_events_per_day", numValueOf, numValueOf, new f3() { // from class: com.google.android.gms.measurement.internal.t0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) qb.K());
            }
        });
        f20029n = a("measurement.upload.max_public_events_per_day", 50000, 50000, new f3() { // from class: com.google.android.gms.measurement.internal.f1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) qb.c());
            }
        });
        f20031o = a("measurement.upload.max_conversions_per_day", 10000, 10000, new f3() { // from class: com.google.android.gms.measurement.internal.q1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) qb.J());
            }
        });
        f20033p = a("measurement.upload.max_realtime_events_per_day", 10, 10, new f3() { // from class: com.google.android.gms.measurement.internal.c2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) qb.e());
            }
        });
        f20035q = a("measurement.store.max_stored_events_per_app", 100000, 100000, new f3() { // from class: com.google.android.gms.measurement.internal.n2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) qb.s());
            }
        });
        f20037r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new f3() { // from class: com.google.android.gms.measurement.internal.y2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return qb.m();
            }
        });
        f20039s = a("measurement.upload.backoff_period", 43200000L, 43200000L, new f3() { // from class: com.google.android.gms.measurement.internal.d3
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.E());
            }
        });
        f20041t = a("measurement.upload.window_interval", 3600000L, 3600000L, new f3() { // from class: com.google.android.gms.measurement.internal.e3
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.i());
            }
        });
        f20043u = a("measurement.upload.interval", 3600000L, 3600000L, new f3() { // from class: com.google.android.gms.measurement.internal.x
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.G());
            }
        });
        f20045v = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, new f3() { // from class: com.google.android.gms.measurement.internal.z
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.y());
            }
        });
        f20047w = a("measurement.upload.debug_upload_interval", 1000L, 1000L, new f3() { // from class: com.google.android.gms.measurement.internal.b0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.q());
            }
        });
        f20049x = a("measurement.upload.minimum_delay", 500L, 500L, new f3() { // from class: com.google.android.gms.measurement.internal.c0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.w());
            }
        });
        f20051y = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new f3() { // from class: com.google.android.gms.measurement.internal.d0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.v());
            }
        });
        f20053z = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new f3() { // from class: com.google.android.gms.measurement.internal.e0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.B());
            }
        });
        A = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new f3() { // from class: com.google.android.gms.measurement.internal.f0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.z());
            }
        });
        B = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new f3() { // from class: com.google.android.gms.measurement.internal.g0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.F());
            }
        });
        C = a("measurement.upload.retry_time", 1800000L, 1800000L, new f3() { // from class: com.google.android.gms.measurement.internal.h0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.h());
            }
        });
        D = a("measurement.upload.retry_count", 6, 6, new f3() { // from class: com.google.android.gms.measurement.internal.j0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) qb.g());
            }
        });
        E = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new f3() { // from class: com.google.android.gms.measurement.internal.k0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.d());
            }
        });
        F = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, new f3() { // from class: com.google.android.gms.measurement.internal.l0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) qb.r());
            }
        });
        G = a("measurement.audience.filter_result_max_count", 200, 200, new f3() { // from class: com.google.android.gms.measurement.internal.n0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) qb.u());
            }
        });
        H = a("measurement.upload.max_public_user_properties", 25, 25, null);
        I = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        J = a("measurement.upload.max_public_event_params", 25, 25, null);
        K = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new f3() { // from class: com.google.android.gms.measurement.internal.o0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.A());
            }
        });
        Boolean bool = Boolean.FALSE;
        L = a("measurement.test.boolean_flag", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.p0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(vc.g());
            }
        });
        M = a("measurement.test.string_flag", "---", "---", new f3() { // from class: com.google.android.gms.measurement.internal.q0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return vc.f();
            }
        });
        N = a("measurement.test.long_flag", -1L, -1L, new f3() { // from class: com.google.android.gms.measurement.internal.r0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(vc.d());
            }
        });
        O = a("measurement.test.int_flag", -2, -2, new f3() { // from class: com.google.android.gms.measurement.internal.s0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) vc.c());
            }
        });
        Double dValueOf = Double.valueOf(-3.0d);
        P = a("measurement.test.double_flag", dValueOf, dValueOf, new f3() { // from class: com.google.android.gms.measurement.internal.u0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Double.valueOf(vc.b());
            }
        });
        Q = a("measurement.experiment.max_ids", 50, 50, new f3() { // from class: com.google.android.gms.measurement.internal.v0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) qb.t());
            }
        });
        R = a("measurement.max_bundles_per_iteration", 100, 100, new f3() { // from class: com.google.android.gms.measurement.internal.w0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) qb.o());
            }
        });
        S = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new f3() { // from class: com.google.android.gms.measurement.internal.x0
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.C());
            }
        });
        T = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new f3() { // from class: com.google.android.gms.measurement.internal.a1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Long.valueOf(qb.D());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        U = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.b1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(bd.c());
            }
        });
        V = a("measurement.quality.checksum", bool, bool, null);
        W = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.c1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(gc.e());
            }
        });
        X = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.d1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(gc.d());
            }
        });
        Y = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.e1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(gc.f());
            }
        });
        Z = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.g1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(ud.c());
            }
        });
        f20004a0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.h1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(pc.c());
            }
        });
        f20006b0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.i1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(sc.c());
            }
        });
        f20008c0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.j1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(rd.d());
            }
        });
        f20010d0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.k1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(xd.c());
            }
        });
        f20012e0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.m1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(dc.d());
            }
        });
        f20014f0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.n1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(mc.d());
            }
        });
        f20016g0 = a("measurement.collection.synthetic_data_mitigation", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.o1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(od.c());
            }
        });
        f20018h0 = a("measurement.service.storage_consent_support_version", 203600, 203600, new f3() { // from class: com.google.android.gms.measurement.internal.p1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Integer.valueOf((int) tb.b());
            }
        });
        f20020i0 = a("measurement.client.click_identifier_control.dev", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.r1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(kb.c());
            }
        });
        f20022j0 = a("measurement.service.click_identifier_control", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.s1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(nb.c());
            }
        });
        f20024k0 = a("measurement.module.pixie.fix_array", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.t1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(yc.d());
            }
        });
        f20026l0 = a("measurement.adid_zero.only_request_adid_if_enabled", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.u1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(hb.c());
            }
        });
        f20028m0 = a("measurement.service.refactor.package_side_screen", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.v1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(id.d());
            }
        });
        f20030n0 = a("measurement.enhanced_campaign.service", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.w1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(wb.e());
            }
        });
        f20032o0 = a("measurement.enhanced_campaign.client", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.y1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(wb.d());
            }
        });
        f20034p0 = a("measurement.enhanced_campaign.srsltid.client", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.z1
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(wb.f());
            }
        });
        f20036q0 = a("measurement.enhanced_campaign.srsltid.service", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.b2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(wb.g());
            }
        });
        f20038r0 = a("measurement.service.store_null_safelist", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.d2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(zb.d());
            }
        });
        f20040s0 = a("measurement.service.store_safelist", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.e2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(zb.e());
            }
        });
        f20042t0 = a("measurement.redaction.no_aiid_in_config_request", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.f2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.l());
            }
        });
        f20044u0 = a("measurement.redaction.config_redacted_fields", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.g2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.f());
            }
        });
        f20046v0 = a("measurement.redaction.upload_redacted_fields", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.h2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.o());
            }
        });
        f20048w0 = a("measurement.redaction.upload_subdomain_override", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.i2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.p());
            }
        });
        f20050x0 = a("measurement.redaction.device_info", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.j2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.g());
            }
        });
        f20052y0 = a("measurement.redaction.user_id", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.l2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.q());
            }
        });
        f20054z0 = a("measurement.redaction.google_signals", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.m2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.k());
            }
        });
        A0 = a("measurement.collection.enable_session_stitching_token.service", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.o2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(ld.e());
            }
        });
        B0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.p2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(ld.d());
            }
        });
        C0 = a("measurement.redaction.app_instance_id", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.q2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.d());
            }
        });
        D0 = a("measurement.redaction.populate_ephemeral_app_instance_id", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.r2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.j());
            }
        });
        E0 = a("measurement.redaction.enhanced_uid", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.s2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.i());
            }
        });
        F0 = a("measurement.redaction.e_tag", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.t2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.h());
            }
        });
        G0 = a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.u2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.e());
            }
        });
        H0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.v2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.m());
            }
        });
        I0 = a("measurement.redaction.scion_payload_generator", bool, bool, new f3() { // from class: com.google.android.gms.measurement.internal.x2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(fd.n());
            }
        });
        J0 = a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, new f3() { // from class: com.google.android.gms.measurement.internal.z2
            @Override // com.google.android.gms.measurement.internal.f3
            public final Object a() {
                h3 h3Var = i3.f20007c;
                return Boolean.valueOf(jc.d());
            }
        });
    }

    static h3 a(String str, Object obj, Object obj2, f3 f3Var) {
        h3 h3Var = new h3(str, obj, obj2, f3Var, null);
        f20003a.add(h3Var);
        return h3Var;
    }

    public static Map c(Context context) {
        com.google.android.gms.internal.measurement.x5 x5VarA = com.google.android.gms.internal.measurement.x5.a(context.getContentResolver(), com.google.android.gms.internal.measurement.i6.a("com.google.android.gms.measurement"), new Runnable() { // from class: x4.c
            @Override // java.lang.Runnable
            public final void run() {
                u6.d();
            }
        });
        return x5VarA == null ? Collections.emptyMap() : x5VarA.b();
    }
}
