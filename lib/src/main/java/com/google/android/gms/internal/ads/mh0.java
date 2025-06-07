package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.b03;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class mh0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12101a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12102b;

    /* renamed from: c, reason: collision with root package name */
    private final ff0 f12103c;

    /* renamed from: d, reason: collision with root package name */
    private final xr f12104d;

    /* renamed from: e, reason: collision with root package name */
    private final as f12105e;

    /* renamed from: f, reason: collision with root package name */
    private final m3.h0 f12106f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f12107g;

    /* renamed from: h, reason: collision with root package name */
    private final String[] f12108h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12109i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12110j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12111k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12112l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12113m;

    /* renamed from: n, reason: collision with root package name */
    private rg0 f12114n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12115o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12116p;

    /* renamed from: q, reason: collision with root package name */
    private long f12117q;

    public mh0(Context context, ff0 ff0Var, String str, as asVar, xr xrVar) {
        m3.f0 f0Var = new m3.f0();
        f0Var.a("min_1", Double.MIN_VALUE, 1.0d);
        f0Var.a("1_5", 1.0d, 5.0d);
        f0Var.a("5_10", 5.0d, 10.0d);
        f0Var.a("10_20", 10.0d, 20.0d);
        f0Var.a("20_30", 20.0d, 30.0d);
        f0Var.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f12106f = f0Var.b();
        this.f12109i = false;
        this.f12110j = false;
        this.f12111k = false;
        this.f12112l = false;
        this.f12117q = -1L;
        this.f12101a = context;
        this.f12103c = ff0Var;
        this.f12102b = str;
        this.f12105e = asVar;
        this.f12104d = xrVar;
        String str2 = (String) k3.w.c().b(ir.A);
        if (str2 == null) {
            this.f12108h = new String[0];
            this.f12107g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.f12108h = new String[length];
        this.f12107g = new long[length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                this.f12107g[i10] = Long.parseLong(strArrSplit[i10]);
            } catch (NumberFormatException e5) {
                ze0.h("Unable to parse frame hash target time number.", e5);
                this.f12107g[i10] = -1;
            }
        }
    }

    public final void a(rg0 rg0Var) {
        sr.a(this.f12105e, this.f12104d, "vpc2");
        this.f12109i = true;
        this.f12105e.d("vpn", rg0Var.r());
        this.f12114n = rg0Var;
    }

    public final void b() {
        if (!this.f12109i || this.f12110j) {
            return;
        }
        sr.a(this.f12105e, this.f12104d, "vfr2");
        this.f12110j = true;
    }

    public final void c() {
        this.f12113m = true;
        if (!this.f12110j || this.f12111k) {
            return;
        }
        sr.a(this.f12105e, this.f12104d, "vfp2");
        this.f12111k = true;
    }

    public final void d() {
        if (!((Boolean) st.f15545a.e()).booleanValue() || this.f12115o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f12102b);
        bundle.putString("player", this.f12114n.r());
        for (m3.e0 e0Var : this.f12106f.a()) {
            String strValueOf = String.valueOf(e0Var.f25213a);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(e0Var.f25217e));
            String strValueOf2 = String.valueOf(e0Var.f25213a);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(e0Var.f25216d));
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.f12107g;
            if (i10 >= jArr.length) {
                j3.t.r();
                final Context context = this.f12101a;
                final String str = this.f12103c.f8252m;
                j3.t.r();
                bundle.putString("device", m3.b2.L());
                zq zqVar = ir.f9881a;
                bundle.putString("eids", TextUtils.join(",", k3.w.a().a()));
                k3.t.b();
                se0.y(context, str, "gmob-apps", bundle, true, new re0() { // from class: m3.t1
                    @Override // com.google.android.gms.internal.ads.re0
                    public final boolean o(String str2) {
                        Context context2 = context;
                        String str3 = str;
                        b03 b03Var = b2.f25197i;
                        j3.t.r();
                        b2.g(context2, str3, str2);
                        return true;
                    }
                });
                this.f12115o = true;
                return;
            }
            String str2 = this.f12108h[i10];
            if (str2 != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i10]).toString()), str2);
            }
            i10++;
        }
    }

    public final void e() {
        this.f12113m = false;
    }

    public final void f(rg0 rg0Var) {
        if (this.f12111k && !this.f12112l) {
            if (m3.n1.m() && !this.f12112l) {
                m3.n1.k("VideoMetricsMixin first frame");
            }
            sr.a(this.f12105e, this.f12104d, "vff2");
            this.f12112l = true;
        }
        long jC = j3.t.b().c();
        if (this.f12113m && this.f12116p && this.f12117q != -1) {
            this.f12106f.b(TimeUnit.SECONDS.toNanos(1L) / (jC - this.f12117q));
        }
        this.f12116p = this.f12113m;
        this.f12117q = jC;
        long jLongValue = ((Long) k3.w.c().b(ir.B)).longValue();
        long jI = rg0Var.i();
        int i10 = 0;
        while (true) {
            String[] strArr = this.f12108h;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && jLongValue > Math.abs(jI - this.f12107g[i10])) {
                String[] strArr2 = this.f12108h;
                int i11 = 8;
                Bitmap bitmap = rg0Var.getBitmap(8, 8);
                long j10 = 63;
                int i12 = 0;
                long j11 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j11 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j10);
                        j10--;
                        i13++;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr2[i10] = String.format("%016X", Long.valueOf(j11));
                return;
            }
            i10++;
        }
    }
}
