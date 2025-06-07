package a5;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import e4.p;
import i4.h;
import i4.q;
import i4.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import t4.i;

/* loaded from: classes.dex */
public class b {

    /* renamed from: r, reason: collision with root package name */
    private static final long f161r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f162s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final Object f163t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static volatile f f164u = new d();

    /* renamed from: a, reason: collision with root package name */
    private final Object f165a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f166b;

    /* renamed from: c, reason: collision with root package name */
    private int f167c;

    /* renamed from: d, reason: collision with root package name */
    private Future f168d;

    /* renamed from: e, reason: collision with root package name */
    private long f169e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f170f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f171g;

    /* renamed from: h, reason: collision with root package name */
    private int f172h;

    /* renamed from: i, reason: collision with root package name */
    t4.b f173i;

    /* renamed from: j, reason: collision with root package name */
    private i4.e f174j;

    /* renamed from: k, reason: collision with root package name */
    private WorkSource f175k;

    /* renamed from: l, reason: collision with root package name */
    private final String f176l;

    /* renamed from: m, reason: collision with root package name */
    private final String f177m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f178n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f179o;

    /* renamed from: p, reason: collision with root package name */
    private AtomicInteger f180p;

    /* renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f181q;

    public b(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f165a = new Object();
        this.f167c = 0;
        this.f170f = new HashSet();
        this.f171g = true;
        this.f174j = h.d();
        this.f179o = new HashMap();
        this.f180p = new AtomicInteger(0);
        p.m(context, "WakeLock: context must not be null");
        p.g(str, "WakeLock: wakeLockName must not be empty");
        this.f178n = context.getApplicationContext();
        this.f177m = str;
        this.f173i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f176l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f176l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb2.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i10, str);
        this.f166b = wakeLockNewWakeLock;
        if (s.c(context)) {
            WorkSource workSourceB = s.b(context, q.a(packageName) ? context.getPackageName() : packageName);
            this.f175k = workSourceB;
            if (workSourceB != null) {
                i(wakeLockNewWakeLock, workSourceB);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f162s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f163t) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = f162s;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    t4.h.a();
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f162s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.f181q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(b bVar) {
        synchronized (bVar.f165a) {
            if (bVar.b()) {
                Log.e("WakeLock", String.valueOf(bVar.f176l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                bVar.g();
                if (bVar.b()) {
                    bVar.f167c = 1;
                    bVar.h(0);
                }
            }
        }
    }

    private final String f(String str) {
        if (this.f171g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f170f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f170f);
        this.f170f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        a.a(arrayList.get(0));
        throw null;
    }

    private final void h(int i10) {
        synchronized (this.f165a) {
            if (b()) {
                if (this.f171g) {
                    int i11 = this.f167c - 1;
                    this.f167c = i11;
                    if (i11 > 0) {
                        return;
                    }
                } else {
                    this.f167c = 0;
                }
                g();
                Iterator it = this.f179o.values().iterator();
                while (it.hasNext()) {
                    ((e) it.next()).f183a = 0;
                }
                this.f179o.clear();
                Future future = this.f168d;
                if (future != null) {
                    future.cancel(false);
                    this.f168d = null;
                    this.f169e = 0L;
                }
                this.f172h = 0;
                try {
                    if (this.f166b.isHeld()) {
                        try {
                            this.f166b.release();
                        } catch (RuntimeException e5) {
                            if (!e5.getClass().equals(RuntimeException.class)) {
                                throw e5;
                            }
                            Log.e("WakeLock", String.valueOf(this.f176l).concat(" failed to release!"), e5);
                            if (this.f173i != null) {
                            }
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f176l).concat(" should be held!"));
                    }
                } finally {
                    if (this.f173i != null) {
                        this.f173i = null;
                    }
                }
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e5) {
            Log.wtf("WakeLock", e5.toString());
        }
    }

    public void a(long j10) {
        this.f180p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f161r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f165a) {
            if (!b()) {
                this.f173i = t4.b.a(false, null);
                this.f166b.acquire();
                this.f174j.b();
            }
            this.f167c++;
            this.f172h++;
            f(null);
            e eVar = (e) this.f179o.get(null);
            if (eVar == null) {
                eVar = new e(null);
                this.f179o.put(null, eVar);
            }
            eVar.f183a++;
            long jB = this.f174j.b();
            long j11 = Long.MAX_VALUE - jB > jMax ? jB + jMax : Long.MAX_VALUE;
            if (j11 > this.f169e) {
                this.f169e = j11;
                Future future = this.f168d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f168d = this.f181q.schedule(new Runnable() { // from class: a5.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.e(this.f182m);
                    }
                }, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f165a) {
            z10 = this.f167c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f180p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f176l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f165a) {
            f(null);
            if (this.f179o.containsKey(null)) {
                e eVar = (e) this.f179o.get(null);
                if (eVar != null) {
                    int i10 = eVar.f183a - 1;
                    eVar.f183a = i10;
                    if (i10 == 0) {
                        this.f179o.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f176l).concat(" counter does not exist"));
            }
            h(0);
        }
    }

    public void d(boolean z10) {
        synchronized (this.f165a) {
            this.f171g = z10;
        }
    }
}
