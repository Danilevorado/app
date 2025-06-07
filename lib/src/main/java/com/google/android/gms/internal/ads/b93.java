package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class b93 extends ub3 implements ab3 {

    /* renamed from: p, reason: collision with root package name */
    static final boolean f6396p;

    /* renamed from: q, reason: collision with root package name */
    private static final Logger f6397q;

    /* renamed from: r, reason: collision with root package name */
    private static final q83 f6398r;

    /* renamed from: s, reason: collision with root package name */
    private static final Object f6399s;

    /* renamed from: m, reason: collision with root package name */
    private volatile Object f6400m;

    /* renamed from: n, reason: collision with root package name */
    private volatile t83 f6401n;

    /* renamed from: o, reason: collision with root package name */
    private volatile a93 f6402o;

    static {
        boolean z10;
        Throwable th;
        Throwable th2;
        q83 w83Var;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f6396p = z10;
        f6397q = Logger.getLogger(b93.class.getName());
        byte b10 = 0;
        try {
            w83Var = new z83(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e5) {
            try {
                th2 = e5;
                w83Var = new u83(AtomicReferenceFieldUpdater.newUpdater(a93.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(a93.class, a93.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b93.class, a93.class, "o"), AtomicReferenceFieldUpdater.newUpdater(b93.class, t83.class, "n"), AtomicReferenceFieldUpdater.newUpdater(b93.class, Object.class, "m"));
                th = null;
            } catch (Error | RuntimeException e10) {
                th = e10;
                th2 = e5;
                w83Var = new w83(b10 == true ? 1 : 0);
            }
        }
        f6398r = w83Var;
        if (th != null) {
            Logger logger = f6397q;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f6399s = new Object();
    }

    protected b93() {
    }

    private final void A(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e5) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e5.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void B(b93 b93Var, boolean z10) {
        t83 t83Var = null;
        while (true) {
            for (a93 a93VarB = f6398r.b(b93Var, a93.f6013c); a93VarB != null; a93VarB = a93VarB.f6015b) {
                Thread thread = a93VarB.f6014a;
                if (thread != null) {
                    a93VarB.f6014a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                b93Var.u();
            }
            b93Var.g();
            t83 t83Var2 = t83Var;
            t83 t83VarA = f6398r.a(b93Var, t83.f15741d);
            t83 t83Var3 = t83Var2;
            while (t83VarA != null) {
                t83 t83Var4 = t83VarA.f15744c;
                t83VarA.f15744c = t83Var3;
                t83Var3 = t83VarA;
                t83VarA = t83Var4;
            }
            while (t83Var3 != null) {
                t83Var = t83Var3.f15744c;
                Runnable runnable = t83Var3.f15742a;
                runnable.getClass();
                if (runnable instanceof v83) {
                    v83 v83Var = (v83) runnable;
                    b93Var = v83Var.f16630m;
                    if (b93Var.f6400m == v83Var) {
                        if (f6398r.f(b93Var, v83Var, j(v83Var.f16631n))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = t83Var3.f15743b;
                    executor.getClass();
                    C(runnable, executor);
                }
                t83Var3 = t83Var;
            }
            return;
            z10 = false;
        }
    }

    private static void C(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e5) {
            f6397q.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e5);
        }
    }

    private final void c(a93 a93Var) {
        a93Var.f6014a = null;
        while (true) {
            a93 a93Var2 = this.f6402o;
            if (a93Var2 != a93.f6013c) {
                a93 a93Var3 = null;
                while (a93Var2 != null) {
                    a93 a93Var4 = a93Var2.f6015b;
                    if (a93Var2.f6014a != null) {
                        a93Var3 = a93Var2;
                    } else if (a93Var3 != null) {
                        a93Var3.f6015b = a93Var4;
                        if (a93Var3.f6014a == null) {
                            break;
                        }
                    } else if (!f6398r.g(this, a93Var2, a93Var4)) {
                        break;
                    }
                    a93Var2 = a93Var4;
                }
                return;
            }
            return;
        }
    }

    private static final Object e(Object obj) throws ExecutionException {
        if (obj instanceof r83) {
            Throwable th = ((r83) obj).f14686b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof s83) {
            throw new ExecutionException(((s83) obj).f15153a);
        }
        if (obj == f6399s) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object j(ab3 ab3Var) {
        Throwable thA;
        if (ab3Var instanceof x83) {
            Object r83Var = ((b93) ab3Var).f6400m;
            if (r83Var instanceof r83) {
                r83 r83Var2 = (r83) r83Var;
                if (r83Var2.f14685a) {
                    Throwable th = r83Var2.f14686b;
                    r83Var = th != null ? new r83(false, th) : r83.f14684d;
                }
            }
            r83Var.getClass();
            return r83Var;
        }
        if ((ab3Var instanceof ub3) && (thA = ((ub3) ab3Var).a()) != null) {
            return new s83(thA);
        }
        boolean zIsCancelled = ab3Var.isCancelled();
        if ((!f6396p) && zIsCancelled) {
            r83 r83Var3 = r83.f14684d;
            r83Var3.getClass();
            return r83Var3;
        }
        try {
            Object objK = k(ab3Var);
            if (!zIsCancelled) {
                return objK == null ? f6399s : objK;
            }
            return new r83(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(ab3Var)));
        } catch (Error e5) {
            e = e5;
            return new s83(e);
        } catch (CancellationException e10) {
            return !zIsCancelled ? new s83(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(ab3Var)), e10)) : new r83(false, e10);
        } catch (RuntimeException e11) {
            e = e11;
            return new s83(e);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new r83(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(ab3Var)), e12)) : new s83(e12.getCause());
        }
    }

    private static Object k(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void y(StringBuilder sb2) {
        String hexString;
        String str = "]";
        try {
            Object objK = k(this);
            sb2.append("SUCCESS, result=[");
            if (objK == null) {
                hexString = "null";
            } else if (objK == this) {
                hexString = "this future";
            } else {
                sb2.append(objK.getClass().getName());
                sb2.append("@");
                hexString = Integer.toHexString(System.identityHashCode(objK));
            }
            sb2.append(hexString);
            sb2.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb2.append(str);
        } catch (RuntimeException e5) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e5.getClass());
            str = " thrown from get()]";
            sb2.append(str);
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(java.lang.StringBuilder r5) {
        /*
            r4 = this;
            int r0 = r5.length()
            java.lang.String r1 = "PENDING"
            r5.append(r1)
            java.lang.Object r1 = r4.f6400m
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.v83
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r5.append(r2)
            com.google.android.gms.internal.ads.v83 r1 = (com.google.android.gms.internal.ads.v83) r1
            com.google.android.gms.internal.ads.ab3 r1 = r1.f16631n
            r4.A(r5, r1)
        L1d:
            r5.append(r3)
            goto L46
        L21:
            java.lang.String r1 = r4.f()     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            java.lang.String r1 = com.google.android.gms.internal.ads.y33.a(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            goto L3b
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Exception thrown from implementation: "
            java.lang.String r1 = r2.concat(r1)
        L3b:
            if (r1 == 0) goto L46
            java.lang.String r2 = ", info=["
            r5.append(r2)
            r5.append(r1)
            goto L1d
        L46:
            boolean r1 = r4.isDone()
            if (r1 == 0) goto L56
            int r1 = r5.length()
            r5.delete(r0, r1)
            r4.y(r5)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b93.z(java.lang.StringBuilder):void");
    }

    @Override // com.google.android.gms.internal.ads.ub3
    protected final Throwable a() {
        if (!(this instanceof x83)) {
            return null;
        }
        Object obj = this.f6400m;
        if (obj instanceof s83) {
            return ((s83) obj).f15153a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ab3
    public void b(Runnable runnable, Executor executor) {
        t83 t83Var;
        i33.c(runnable, "Runnable was null.");
        i33.c(executor, "Executor was null.");
        if (!isDone() && (t83Var = this.f6401n) != t83.f15741d) {
            t83 t83Var2 = new t83(runnable, executor);
            do {
                t83Var2.f15744c = t83Var;
                if (f6398r.e(this, t83Var, t83Var2)) {
                    return;
                } else {
                    t83Var = this.f6401n;
                }
            } while (t83Var != t83.f15741d);
        }
        C(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        r83 r83Var;
        Object obj = this.f6400m;
        if (!(obj instanceof v83) && !(obj == null)) {
            return false;
        }
        if (f6396p) {
            r83Var = new r83(z10, new CancellationException("Future.cancel() was called."));
        } else {
            r83Var = z10 ? r83.f14683c : r83.f14684d;
            r83Var.getClass();
        }
        b93 b93Var = this;
        boolean z11 = false;
        while (true) {
            if (f6398r.f(b93Var, obj, r83Var)) {
                B(b93Var, z10);
                if (!(obj instanceof v83)) {
                    break;
                }
                ab3 ab3Var = ((v83) obj).f16631n;
                if (!(ab3Var instanceof x83)) {
                    ab3Var.cancel(z10);
                    break;
                }
                b93Var = (b93) ab3Var;
                obj = b93Var.f6400m;
                if (!(obj == null) && !(obj instanceof v83)) {
                    break;
                }
                z11 = true;
            } else {
                obj = b93Var.f6400m;
                if (!(obj instanceof v83)) {
                    return z11;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String f() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected void g() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f6400m;
        if ((obj2 != null) && (!(obj2 instanceof v83))) {
            return e(obj2);
        }
        a93 a93Var = this.f6402o;
        if (a93Var != a93.f6013c) {
            a93 a93Var2 = new a93();
            do {
                q83 q83Var = f6398r;
                q83Var.c(a93Var2, a93Var);
                if (q83Var.g(this, a93Var, a93Var2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            c(a93Var2);
                            throw new InterruptedException();
                        }
                        obj = this.f6400m;
                    } while (!((obj != null) & (!(obj instanceof v83))));
                    return e(obj);
                }
                a93Var = this.f6402o;
            } while (a93Var != a93.f6013c);
        }
        Object obj3 = this.f6400m;
        obj3.getClass();
        return e(obj3);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f6400m;
        boolean z10 = true;
        if ((obj != null) && (!(obj instanceof v83))) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            a93 a93Var = this.f6402o;
            if (a93Var != a93.f6013c) {
                a93 a93Var2 = new a93();
                do {
                    q83 q83Var = f6398r;
                    q83Var.c(a93Var2, a93Var);
                    if (q83Var.g(this, a93Var, a93Var2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                c(a93Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f6400m;
                            if ((obj2 != null) && (!(obj2 instanceof v83))) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        c(a93Var2);
                    } else {
                        a93Var = this.f6402o;
                    }
                } while (a93Var != a93.f6013c);
            }
            Object obj3 = this.f6400m;
            obj3.getClass();
            return e(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f6400m;
            if ((obj4 != null) && (!(obj4 instanceof v83))) {
                return e(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z10 = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z10) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z10) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    protected boolean h(Object obj) {
        if (obj == null) {
            obj = f6399s;
        }
        if (!f6398r.f(this, null, obj)) {
            return false;
        }
        B(this, false);
        return true;
    }

    protected boolean i(Throwable th) {
        Objects.requireNonNull(th);
        if (!f6398r.f(this, null, new s83(th))) {
            return false;
        }
        B(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f6400m instanceof r83;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.f6400m != null) & (!(r0 instanceof v83));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            y(sb2);
        } else {
            z(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void u() {
    }

    final void v(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(x());
        }
    }

    protected final boolean w(ab3 ab3Var) {
        s83 s83Var;
        Objects.requireNonNull(ab3Var);
        Object obj = this.f6400m;
        if (obj == null) {
            if (ab3Var.isDone()) {
                if (!f6398r.f(this, null, j(ab3Var))) {
                    return false;
                }
                B(this, false);
                return true;
            }
            v83 v83Var = new v83(this, ab3Var);
            if (f6398r.f(this, null, v83Var)) {
                try {
                    ab3Var.b(v83Var, da3.INSTANCE);
                } catch (Error | RuntimeException e5) {
                    try {
                        s83Var = new s83(e5);
                    } catch (Error | RuntimeException unused) {
                        s83Var = s83.f15152b;
                    }
                    f6398r.f(this, v83Var, s83Var);
                }
                return true;
            }
            obj = this.f6400m;
        }
        if (obj instanceof r83) {
            ab3Var.cancel(((r83) obj).f14685a);
        }
        return false;
    }

    protected final boolean x() {
        Object obj = this.f6400m;
        return (obj instanceof r83) && ((r83) obj).f14685a;
    }
}
