package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.l;
import com.google.firebase.messaging.c;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f21474a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f21475b;

    /* renamed from: c, reason: collision with root package name */
    private final i0 f21476c;

    public e(Context context, i0 i0Var, ExecutorService executorService) {
        this.f21474a = executorService;
        this.f21475b = context;
        this.f21476c = i0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f21475b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!i4.m.f()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f21475b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    private void c(c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f21475b.getSystemService("notification")).notify(aVar.f21459b, aVar.f21460c, aVar.f21458a.c());
    }

    private e0 d() {
        e0 e0VarF = e0.f(this.f21476c.p("gcm.n.image"));
        if (e0VarF != null) {
            e0VarF.x(this.f21474a);
        }
        return e0VarF;
    }

    private void e(l.e eVar, e0 e0Var) {
        if (e0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) b5.l.b(e0Var.g(), 5L, TimeUnit.SECONDS);
            eVar.x(bitmap);
            eVar.H(new l.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            e0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e5) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e5.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            e0Var.close();
        }
    }

    boolean a() throws PackageManager.NameNotFoundException {
        if (this.f21476c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        e0 e0VarD = d();
        c.a aVarF = c.f(this.f21475b, this.f21476c);
        e(aVarF.f21458a, e0VarD);
        c(aVarF);
        return true;
    }
}
