package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class i1 implements ServiceConnection {

    /* renamed from: m, reason: collision with root package name */
    private final Context f21503m;

    /* renamed from: n, reason: collision with root package name */
    private final Intent f21504n;

    /* renamed from: o, reason: collision with root package name */
    private final ScheduledExecutorService f21505o;

    /* renamed from: p, reason: collision with root package name */
    private final Queue f21506p;

    /* renamed from: q, reason: collision with root package name */
    private f1 f21507q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f21508r;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f21509a;

        /* renamed from: b, reason: collision with root package name */
        private final b5.j f21510b = new b5.j();

        a(Intent intent) {
            this.f21509a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f21509a.getAction() + " Releasing WakeLock.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.h1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21495m.f();
                }
            }, (this.f21509a.getFlags() & 268435456) != 0 ? d1.f21471a : 9000L, TimeUnit.MILLISECONDS);
            e().c(scheduledExecutorService, new b5.d() { // from class: com.google.firebase.messaging.g1
                @Override // b5.d
                public final void a(b5.i iVar) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f21510b.e(null);
        }

        b5.i e() {
            return this.f21510b.a();
        }
    }

    i1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new j4.b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    i1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f21506p = new ArrayDeque();
        this.f21508r = false;
        Context applicationContext = context.getApplicationContext();
        this.f21503m = applicationContext;
        this.f21504n = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f21505o = scheduledExecutorService;
    }

    private void a() {
        while (!this.f21506p.isEmpty()) {
            ((a) this.f21506p.poll()).d();
        }
    }

    private synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f21506p.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            f1 f1Var = this.f21507q;
            if (f1Var == null || !f1Var.isBinderAlive()) {
                d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f21507q.c((a) this.f21506p.poll());
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f21508r);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f21508r) {
            return;
        }
        this.f21508r = true;
        try {
        } catch (SecurityException e5) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e5);
        }
        if (h4.a.b().a(this.f21503m, this.f21504n, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f21508r = false;
        a();
    }

    synchronized b5.i c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.c(this.f21505o);
        this.f21506p.add(aVar);
        b();
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f21508r = false;
        if (iBinder instanceof f1) {
            this.f21507q = (f1) iBinder;
            b();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }
}
