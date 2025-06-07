package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class p extends Service implements n {

    /* renamed from: m, reason: collision with root package name */
    private final e0 f3156m = new e0(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f3156m.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f3156m.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f3156m.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f3156m.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }

    @Override // androidx.lifecycle.n
    public j s() {
        return this.f3156m.a();
    }
}
