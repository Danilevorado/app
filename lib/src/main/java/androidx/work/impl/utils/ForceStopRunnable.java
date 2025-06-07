package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.b;
import androidx.work.impl.e0;
import androidx.work.impl.z;
import b1.g;
import b1.j;
import b1.t;
import g1.r;
import g1.v;
import g1.w;
import h1.m;
import h1.n;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private static final String f4243q = j.i("ForceStopRunnable");

    /* renamed from: r, reason: collision with root package name */
    private static final long f4244r = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: m, reason: collision with root package name */
    private final Context f4245m;

    /* renamed from: n, reason: collision with root package name */
    private final e0 f4246n;

    /* renamed from: o, reason: collision with root package name */
    private final m f4247o;

    /* renamed from: p, reason: collision with root package name */
    private int f4248p = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private static final String f4249a = j.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            j.e().j(f4249a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, e0 e0Var) {
        this.f4245m = context.getApplicationContext();
        this.f4246n = e0Var;
        this.f4247o = e0Var.o();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentD = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f4244r;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = b.i(this.f4245m, this.f4246n);
        WorkDatabase workDatabaseS = this.f4246n.s();
        w wVarJ = workDatabaseS.J();
        r rVarI = workDatabaseS.I();
        workDatabaseS.e();
        try {
            List<v> listC = wVarJ.c();
            boolean z10 = (listC == null || listC.isEmpty()) ? false : true;
            if (z10) {
                for (v vVar : listC) {
                    wVarJ.o(t.ENQUEUED, vVar.f23739a);
                    wVarJ.f(vVar.f23739a, -1L);
                }
            }
            rVarI.c();
            workDatabaseS.B();
            return z10 || zI;
        } finally {
            workDatabaseS.i();
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            j.e().a(f4243q, "Rescheduling Workers.");
            this.f4246n.w();
            this.f4246n.o().e(false);
        } else if (e()) {
            j.e().a(f4243q, "Application was force-stopped, rescheduling.");
            this.f4246n.w();
            this.f4247o.d(System.currentTimeMillis());
        } else if (zA) {
            j.e().a(f4243q, "Found unfinished work, scheduling it.");
            androidx.work.impl.t.b(this.f4246n.l(), this.f4246n.s(), this.f4246n.q());
        }
    }

    public boolean e() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentD = d(this.f4245m, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f4245m.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jA = this.f4247o.a();
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i11);
                        if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= jA) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f4245m);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e5) {
            j.e().l(f4243q, "Ignoring exception", e5);
            return true;
        }
    }

    public boolean f() {
        a aVarL = this.f4246n.l();
        if (TextUtils.isEmpty(aVarL.c())) {
            j.e().a(f4243q, "The default process name was not specified.");
            return true;
        }
        boolean zB = n.b(this.f4245m, aVarL);
        j.e().a(f4243q, "Is default app process = " + zB);
        return zB;
    }

    public boolean h() {
        return this.f4246n.o().b();
    }

    public void i(long j10) throws InterruptedException {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IllegalStateException illegalStateException;
        g gVarE;
        int i10;
        try {
            if (f()) {
                while (true) {
                    try {
                        z.d(this.f4245m);
                        j.e().a(f4243q, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e5) {
                            i10 = this.f4248p + 1;
                            this.f4248p = i10;
                            if (i10 >= 3) {
                                j jVarE = j.e();
                                String str = f4243q;
                                jVarE.d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e5);
                                illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e5);
                                gVarE = this.f4246n.l().e();
                                if (gVarE == null) {
                                    throw illegalStateException;
                                }
                                j.e().b(str, "Routing exception to the specified exception handler", illegalStateException);
                                gVarE.a(illegalStateException);
                            }
                            j.e().b(f4243q, "Retrying after " + (i10 * 300), e5);
                            i(((long) this.f4248p) * 300);
                        }
                        j.e().b(f4243q, "Retrying after " + (i10 * 300), e5);
                        i(((long) this.f4248p) * 300);
                    } catch (SQLiteException e10) {
                        j.e().c(f4243q, "Unexpected SQLite exception during migrations");
                        illegalStateException = new IllegalStateException("Unexpected SQLite exception during migrations", e10);
                        gVarE = this.f4246n.l().e();
                        if (gVarE == null) {
                            throw illegalStateException;
                        }
                    }
                }
            }
        } finally {
            this.f4246n.v();
        }
    }
}
