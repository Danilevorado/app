package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.d;
import java.util.Map;

/* loaded from: classes.dex */
public final class n0 extends f4.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* renamed from: m, reason: collision with root package name */
    Bundle f21524m;

    /* renamed from: n, reason: collision with root package name */
    private Map f21525n;

    /* renamed from: o, reason: collision with root package name */
    private b f21526o;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f21527a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21528b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f21529c;

        /* renamed from: d, reason: collision with root package name */
        private final String f21530d;

        /* renamed from: e, reason: collision with root package name */
        private final String f21531e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f21532f;

        /* renamed from: g, reason: collision with root package name */
        private final String f21533g;

        /* renamed from: h, reason: collision with root package name */
        private final String f21534h;

        /* renamed from: i, reason: collision with root package name */
        private final String f21535i;

        /* renamed from: j, reason: collision with root package name */
        private final String f21536j;

        /* renamed from: k, reason: collision with root package name */
        private final String f21537k;

        /* renamed from: l, reason: collision with root package name */
        private final String f21538l;

        /* renamed from: m, reason: collision with root package name */
        private final String f21539m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f21540n;

        /* renamed from: o, reason: collision with root package name */
        private final String f21541o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f21542p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f21543q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f21544r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f21545s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f21546t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f21547u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f21548v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f21549w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f21550x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f21551y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f21552z;

        private b(i0 i0Var) {
            this.f21527a = i0Var.p("gcm.n.title");
            this.f21528b = i0Var.h("gcm.n.title");
            this.f21529c = b(i0Var, "gcm.n.title");
            this.f21530d = i0Var.p("gcm.n.body");
            this.f21531e = i0Var.h("gcm.n.body");
            this.f21532f = b(i0Var, "gcm.n.body");
            this.f21533g = i0Var.p("gcm.n.icon");
            this.f21535i = i0Var.o();
            this.f21536j = i0Var.p("gcm.n.tag");
            this.f21537k = i0Var.p("gcm.n.color");
            this.f21538l = i0Var.p("gcm.n.click_action");
            this.f21539m = i0Var.p("gcm.n.android_channel_id");
            this.f21540n = i0Var.f();
            this.f21534h = i0Var.p("gcm.n.image");
            this.f21541o = i0Var.p("gcm.n.ticker");
            this.f21542p = i0Var.b("gcm.n.notification_priority");
            this.f21543q = i0Var.b("gcm.n.visibility");
            this.f21544r = i0Var.b("gcm.n.notification_count");
            this.f21547u = i0Var.a("gcm.n.sticky");
            this.f21548v = i0Var.a("gcm.n.local_only");
            this.f21549w = i0Var.a("gcm.n.default_sound");
            this.f21550x = i0Var.a("gcm.n.default_vibrate_timings");
            this.f21551y = i0Var.a("gcm.n.default_light_settings");
            this.f21546t = i0Var.j("gcm.n.event_time");
            this.f21545s = i0Var.e();
            this.f21552z = i0Var.q();
        }

        private static String[] b(i0 i0Var, String str) {
            Object[] objArrG = i0Var.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i10 = 0; i10 < objArrG.length; i10++) {
                strArr[i10] = String.valueOf(objArrG[i10]);
            }
            return strArr;
        }

        public String a() {
            return this.f21530d;
        }

        public String c() {
            return this.f21527a;
        }
    }

    public n0(Bundle bundle) {
        this.f21524m = bundle;
    }

    public Map f() {
        if (this.f21525n == null) {
            this.f21525n = d.a.a(this.f21524m);
        }
        return this.f21525n;
    }

    public String h() {
        return this.f21524m.getString("from");
    }

    public b v() {
        if (this.f21526o == null && i0.t(this.f21524m)) {
            this.f21526o = new b(new i0(this.f21524m));
        }
        return this.f21526o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        o0.c(this, parcel, i10);
    }
}
