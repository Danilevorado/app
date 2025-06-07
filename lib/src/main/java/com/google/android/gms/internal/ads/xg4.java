package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class xg4 {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLong f17553d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final ib3 f17554a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f17555b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f17556c;

    public xg4(long j10, ib3 ib3Var, Uri uri, Map map, long j11, long j12, long j13) {
        this.f17554a = ib3Var;
        this.f17555b = uri;
        this.f17556c = map;
    }

    public static long a() {
        return f17553d.getAndIncrement();
    }
}
