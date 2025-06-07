package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ib3 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f9668j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f9669a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9670b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9671c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f9672d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9673e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9674f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9675g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9676h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9677i;

    static {
        u40.b("media3.datasource");
    }

    public ib3(Uri uri) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
    }

    private ib3(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j10 + j11;
        boolean z10 = false;
        gt1.d(j13 >= 0);
        gt1.d(j11 >= 0);
        long j14 = -1;
        if (j12 <= 0) {
            if (j12 != -1) {
                j14 = j12;
            }
            gt1.d(z10);
            this.f9669a = uri;
            this.f9670b = 1;
            this.f9671c = null;
            this.f9672d = Collections.unmodifiableMap(new HashMap(map));
            this.f9674f = j11;
            this.f9673e = j13;
            this.f9675g = j14;
            this.f9676h = null;
            this.f9677i = i11;
        }
        j14 = j12;
        z10 = true;
        gt1.d(z10);
        this.f9669a = uri;
        this.f9670b = 1;
        this.f9671c = null;
        this.f9672d = Collections.unmodifiableMap(new HashMap(map));
        this.f9674f = j11;
        this.f9673e = j13;
        this.f9675g = j14;
        this.f9676h = null;
        this.f9677i = i11;
    }

    public ib3(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        this(uri, j10 - j11, 1, null, Collections.emptyMap(), j11, j12, null, i10, null);
    }

    public final boolean a(int i10) {
        return (this.f9677i & i10) == i10;
    }

    public final String toString() {
        return "DataSpec[GET " + String.valueOf(this.f9669a) + ", " + this.f9674f + ", " + this.f9675g + ", null, " + this.f9677i + "]";
    }
}
