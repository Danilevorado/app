package androidx.work;

import android.os.Build;
import androidx.work.impl.d;
import b1.g;
import b1.i;
import b1.q;
import b1.r;
import b1.w;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final Executor f4017a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f4018b;

    /* renamed from: c, reason: collision with root package name */
    final w f4019c;

    /* renamed from: d, reason: collision with root package name */
    final i f4020d;

    /* renamed from: e, reason: collision with root package name */
    final q f4021e;

    /* renamed from: f, reason: collision with root package name */
    final g f4022f;

    /* renamed from: g, reason: collision with root package name */
    final r f4023g;

    /* renamed from: h, reason: collision with root package name */
    final String f4024h;

    /* renamed from: i, reason: collision with root package name */
    final int f4025i;

    /* renamed from: j, reason: collision with root package name */
    final int f4026j;

    /* renamed from: k, reason: collision with root package name */
    final int f4027k;

    /* renamed from: l, reason: collision with root package name */
    final int f4028l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f4029m;

    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0064a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f4030a = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4031b;

        ThreadFactoryC0064a(boolean z10) {
            this.f4031b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f4031b ? "WM.task-" : "androidx.work-") + this.f4030a.incrementAndGet());
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        Executor f4033a;

        /* renamed from: b, reason: collision with root package name */
        w f4034b;

        /* renamed from: c, reason: collision with root package name */
        i f4035c;

        /* renamed from: d, reason: collision with root package name */
        Executor f4036d;

        /* renamed from: e, reason: collision with root package name */
        q f4037e;

        /* renamed from: f, reason: collision with root package name */
        g f4038f;

        /* renamed from: g, reason: collision with root package name */
        r f4039g;

        /* renamed from: h, reason: collision with root package name */
        String f4040h;

        /* renamed from: i, reason: collision with root package name */
        int f4041i = 4;

        /* renamed from: j, reason: collision with root package name */
        int f4042j = 0;

        /* renamed from: k, reason: collision with root package name */
        int f4043k = Integer.MAX_VALUE;

        /* renamed from: l, reason: collision with root package name */
        int f4044l = 20;

        public a a() {
            return new a(this);
        }
    }

    a(b bVar) {
        Executor executor = bVar.f4033a;
        this.f4017a = executor == null ? a(false) : executor;
        Executor executorA = bVar.f4036d;
        if (executorA == null) {
            this.f4029m = true;
            executorA = a(true);
        } else {
            this.f4029m = false;
        }
        this.f4018b = executorA;
        w wVar = bVar.f4034b;
        this.f4019c = wVar == null ? w.c() : wVar;
        i iVar = bVar.f4035c;
        this.f4020d = iVar == null ? i.c() : iVar;
        q qVar = bVar.f4037e;
        this.f4021e = qVar == null ? new d() : qVar;
        this.f4025i = bVar.f4041i;
        this.f4026j = bVar.f4042j;
        this.f4027k = bVar.f4043k;
        this.f4028l = bVar.f4044l;
        this.f4022f = bVar.f4038f;
        this.f4023g = bVar.f4039g;
        this.f4024h = bVar.f4040h;
    }

    private Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    private ThreadFactory b(boolean z10) {
        return new ThreadFactoryC0064a(z10);
    }

    public String c() {
        return this.f4024h;
    }

    public Executor d() {
        return this.f4017a;
    }

    public g e() {
        return this.f4022f;
    }

    public i f() {
        return this.f4020d;
    }

    public int g() {
        return this.f4027k;
    }

    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.f4028l / 2 : this.f4028l;
    }

    public int i() {
        return this.f4026j;
    }

    public int j() {
        return this.f4025i;
    }

    public q k() {
        return this.f4021e;
    }

    public r l() {
        return this.f4023g;
    }

    public Executor m() {
        return this.f4018b;
    }

    public w n() {
        return this.f4019c;
    }
}
