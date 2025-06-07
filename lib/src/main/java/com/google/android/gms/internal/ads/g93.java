package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class g93 {

    /* renamed from: a, reason: collision with root package name */
    private Uri f8655a;

    /* renamed from: b, reason: collision with root package name */
    private Map f8656b = Collections.emptyMap();

    /* renamed from: c, reason: collision with root package name */
    private long f8657c;

    /* renamed from: d, reason: collision with root package name */
    private int f8658d;

    public final g93 a(int i10) {
        this.f8658d = 6;
        return this;
    }

    public final g93 b(Map map) {
        this.f8656b = map;
        return this;
    }

    public final g93 c(long j10) {
        this.f8657c = j10;
        return this;
    }

    public final g93 d(Uri uri) {
        this.f8655a = uri;
        return this;
    }

    public final ib3 e() {
        if (this.f8655a != null) {
            return new ib3(this.f8655a, this.f8656b, this.f8657c, this.f8658d);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
