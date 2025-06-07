package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.f1;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract class i extends Service {

    /* renamed from: n, reason: collision with root package name */
    private Binder f21497n;

    /* renamed from: p, reason: collision with root package name */
    private int f21499p;

    /* renamed from: m, reason: collision with root package name */
    final ExecutorService f21496m = n.d();

    /* renamed from: o, reason: collision with root package name */
    private final Object f21498o = new Object();

    /* renamed from: q, reason: collision with root package name */
    private int f21500q = 0;

    class a implements f1.a {
        a() {
        }

        @Override // com.google.firebase.messaging.f1.a
        public b5.i a(Intent intent) {
            return i.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            d1.c(intent);
        }
        synchronized (this.f21498o) {
            int i10 = this.f21500q - 1;
            this.f21500q = i10;
            if (i10 == 0) {
                k(this.f21499p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Intent intent, b5.i iVar) {
        d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, b5.j jVar) {
        try {
            f(intent);
        } finally {
            jVar.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b5.i j(final Intent intent) {
        if (g(intent)) {
            return b5.l.e(null);
        }
        final b5.j jVar = new b5.j();
        this.f21496m.execute(new Runnable() { // from class: com.google.firebase.messaging.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f21485m.i(intent, jVar);
            }
        });
        return jVar.a();
    }

    protected abstract Intent e(Intent intent);

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean k(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f21497n == null) {
            this.f21497n = new f1(new a());
        }
        return this.f21497n;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f21496m.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.f21498o) {
            this.f21499p = i11;
            this.f21500q++;
        }
        Intent intentE = e(intent);
        if (intentE == null) {
            d(intent);
            return 2;
        }
        b5.i iVarJ = j(intentE);
        if (iVarJ.m()) {
            d(intent);
            return 2;
        }
        iVarJ.c(h.f21489m, new b5.d() { // from class: com.google.firebase.messaging.f
            @Override // b5.d
            public final void a(b5.i iVar) {
                this.f21481a.h(intent, iVar);
            }
        });
        return 3;
    }
}
