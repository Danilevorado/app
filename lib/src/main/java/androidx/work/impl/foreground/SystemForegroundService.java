package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.p;
import androidx.work.impl.foreground.b;
import b1.j;

/* loaded from: classes.dex */
public class SystemForegroundService extends p implements b.InterfaceC0069b {

    /* renamed from: r, reason: collision with root package name */
    private static final String f4151r = j.i("SystemFgService");

    /* renamed from: s, reason: collision with root package name */
    private static SystemForegroundService f4152s = null;

    /* renamed from: n, reason: collision with root package name */
    private Handler f4153n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f4154o;

    /* renamed from: p, reason: collision with root package name */
    androidx.work.impl.foreground.b f4155p;

    /* renamed from: q, reason: collision with root package name */
    NotificationManager f4156q;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f4157m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Notification f4158n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f4159o;

        a(int i10, Notification notification, int i11) {
            this.f4157m = i10;
            this.f4158n = notification;
            this.f4159o = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                d.a(SystemForegroundService.this, this.f4157m, this.f4158n, this.f4159o);
            } else {
                SystemForegroundService.this.startForeground(this.f4157m, this.f4158n);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f4161m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Notification f4162n;

        b(int i10, Notification notification) {
            this.f4161m = i10;
            this.f4162n = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f4156q.notify(this.f4161m, this.f4162n);
        }
    }

    class c implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f4164m;

        c(int i10) {
            this.f4164m = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f4156q.cancel(this.f4164m);
        }
    }

    static class d {
        static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    private void g() {
        this.f4153n = new Handler(Looper.getMainLooper());
        this.f4156q = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.b bVar = new androidx.work.impl.foreground.b(getApplicationContext());
        this.f4155p = bVar;
        bVar.n(this);
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0069b
    public void d(int i10) {
        this.f4153n.post(new c(i10));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0069b
    public void e(int i10, int i11, Notification notification) {
        this.f4153n.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0069b
    public void f(int i10, Notification notification) {
        this.f4153n.post(new b(i10, notification));
    }

    @Override // androidx.lifecycle.p, android.app.Service
    public void onCreate() {
        super.onCreate();
        f4152s = this;
        g();
    }

    @Override // androidx.lifecycle.p, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4155p.l();
    }

    @Override // androidx.lifecycle.p, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f4154o) {
            j.e().f(f4151r, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f4155p.l();
            g();
            this.f4154o = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4155p.m(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0069b
    public void stop() {
        this.f4154o = true;
        j.e().a(f4151r, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f4152s = null;
        stopSelf();
    }
}
