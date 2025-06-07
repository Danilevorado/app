package com.google.android.gms.internal.ads;

import java.net.HttpURLConnection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wz2 extends oz2 {

    /* renamed from: m, reason: collision with root package name */
    private z33 f17305m;

    /* renamed from: n, reason: collision with root package name */
    private z33 f17306n;

    /* renamed from: o, reason: collision with root package name */
    private vz2 f17307o;

    /* renamed from: p, reason: collision with root package name */
    private HttpURLConnection f17308p;

    wz2() {
        this(new z33() { // from class: com.google.android.gms.internal.ads.tz2
            @Override // com.google.android.gms.internal.ads.z33
            public final Object a() {
                return wz2.c();
            }
        }, new z33() { // from class: com.google.android.gms.internal.ads.uz2
            @Override // com.google.android.gms.internal.ads.z33
            public final Object a() {
                return wz2.e();
            }
        }, null);
    }

    wz2(z33 z33Var, z33 z33Var2, vz2 vz2Var) {
        this.f17305m = z33Var;
        this.f17306n = z33Var2;
        this.f17307o = vz2Var;
    }

    static /* synthetic */ Integer c() {
        return -1;
    }

    static /* synthetic */ Integer e() {
        return -1;
    }

    public static void y(HttpURLConnection httpURLConnection) {
        pz2.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        y(this.f17308p);
    }

    public HttpURLConnection s() {
        pz2.b(((Integer) this.f17305m.a()).intValue(), ((Integer) this.f17306n.a()).intValue());
        vz2 vz2Var = this.f17307o;
        Objects.requireNonNull(vz2Var);
        HttpURLConnection httpURLConnection = (HttpURLConnection) vz2Var.a();
        this.f17308p = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection x(vz2 vz2Var, final int i10, final int i11) {
        this.f17305m = new z33() { // from class: com.google.android.gms.internal.ads.qz2
            @Override // com.google.android.gms.internal.ads.z33
            public final Object a() {
                return Integer.valueOf(i10);
            }
        };
        this.f17306n = new z33() { // from class: com.google.android.gms.internal.ads.rz2
            @Override // com.google.android.gms.internal.ads.z33
            public final Object a() {
                return Integer.valueOf(i11);
            }
        };
        this.f17307o = vz2Var;
        return s();
    }
}
