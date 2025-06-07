package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.p;
import androidx.work.impl.background.systemalarm.g;
import b1.j;
import h1.s;

/* loaded from: classes.dex */
public class SystemAlarmService extends p implements g.c {

    /* renamed from: p, reason: collision with root package name */
    private static final String f4074p = j.i("SystemAlarmService");

    /* renamed from: n, reason: collision with root package name */
    private g f4075n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f4076o;

    private void g() {
        g gVar = new g(this);
        this.f4075n = gVar;
        gVar.l(this);
    }

    @Override // androidx.work.impl.background.systemalarm.g.c
    public void a() {
        this.f4076o = true;
        j.e().a(f4074p, "All commands completed in dispatcher");
        s.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.p, android.app.Service
    public void onCreate() {
        super.onCreate();
        g();
        this.f4076o = false;
    }

    @Override // androidx.lifecycle.p, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4076o = true;
        this.f4075n.j();
    }

    @Override // androidx.lifecycle.p, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f4076o) {
            j.e().f(f4074p, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f4075n.j();
            g();
            this.f4076o = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4075n.a(intent, i11);
        return 3;
    }
}
