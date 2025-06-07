package com.webviewgold.myappname;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import androidx.core.app.l;
import com.facebook.ads.R;

/* loaded from: classes2.dex */
public class GPSService extends Service {

    /* renamed from: m, reason: collision with root package name */
    private l.e f22634m;

    /* renamed from: n, reason: collision with root package name */
    private NotificationManager f22635n;

    /* renamed from: o, reason: collision with root package name */
    private PowerManager.WakeLock f22636o;

    /* renamed from: p, reason: collision with root package name */
    private final IBinder f22637p = new a();

    public class a extends Binder {
        public a() {
        }
    }

    private String a() {
        return "Observing location";
    }

    private Notification b() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("GPSLoggerServiceChannel", "Location Foreground Service", 2);
            notificationChannel.setDescription("Location channel for foreground service notification");
            this.f22635n.createNotificationChannel(notificationChannel);
        }
        l.e eVar = new l.e(this, "GPSLoggerServiceChannel");
        this.f22634m = eVar;
        eVar.F(R.mipmap.ic_launcher_round).k(getResources().getColor(R.color.colorPrimary)).p(getString(R.string.app_name)).E(false).D(-1).i("service").B(true).K(1).o(a());
        Intent intent = new Intent(getApplicationContext(), (Class<?>) MainActivity.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(131072);
        this.f22634m.n(PendingIntent.getActivity(getApplicationContext(), 1, intent, 67108864));
        return this.f22634m.c();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        PowerManager.WakeLock wakeLock = this.f22636o;
        if (wakeLock != null && !wakeLock.isHeld()) {
            this.f22636o.acquire();
            Log.w("myApp", "[#] GPSService.java - WAKELOCK acquired");
        }
        Log.w("myApp", "[#] GPSService.java - BIND = onBind");
        return this.f22637p;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f22636o = ((PowerManager) getSystemService("power")).newWakeLock(1, "GPSLogger:wakelock");
    }

    @Override // android.app.Service
    public void onDestroy() {
        PowerManager.WakeLock wakeLock = this.f22636o;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f22636o.release();
            Log.w("myApp", "[#] GPSService.java - WAKELOCK released");
        }
        Log.w("myApp", "[#] GPSService.java - DESTROY = onDestroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        this.f22635n = (NotificationManager) getSystemService("notification");
        startForeground(121, b());
        Log.w("myApp", "[#] GPSService.java - START = onStartCommand");
        return 2;
    }
}
