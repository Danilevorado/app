package kotlinx.coroutines.scheduling;

import bc.o;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final long f24999a = o.e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f25000b = o.d("kotlinx.coroutines.scheduler.core.pool.size", ub.f.a(bc.m.a(), 2), 1, 0, 8, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f25001c = o.d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* renamed from: d, reason: collision with root package name */
    public static final long f25002d = TimeUnit.SECONDS.toNanos(o.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* renamed from: e, reason: collision with root package name */
    public static g f25003e = e.f24989a;

    /* renamed from: f, reason: collision with root package name */
    public static final i f25004f = new j(0);

    /* renamed from: g, reason: collision with root package name */
    public static final i f25005g = new j(1);
}
