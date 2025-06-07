package i4;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class h implements e {

    /* renamed from: a, reason: collision with root package name */
    private static final h f24306a = new h();

    private h() {
    }

    public static e d() {
        return f24306a;
    }

    @Override // i4.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // i4.e
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // i4.e
    public final long c() {
        return System.nanoTime();
    }
}
