package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.e0;
import b1.j;
import g1.i;
import g1.l;
import g1.m;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4077a = j.i("Alarms");

    /* renamed from: androidx.work.impl.background.systemalarm.a$a, reason: collision with other inner class name */
    static class C0067a {
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    public static void a(Context context, e0 e0Var, m mVar) {
        g1.j jVarG = e0Var.s().G();
        i iVarG = jVarG.g(mVar);
        if (iVarG != null) {
            b(context, mVar, iVarG.f23711c);
            j.e().a(f4077a, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            jVarG.c(mVar);
        }
    }

    private static void b(Context context, m mVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, mVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        j.e().a(f4077a, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    public static void c(Context context, e0 e0Var, m mVar, long j10) {
        int iC;
        WorkDatabase workDatabaseS = e0Var.s();
        g1.j jVarG = workDatabaseS.G();
        i iVarG = jVarG.g(mVar);
        if (iVarG != null) {
            b(context, mVar, iVarG.f23711c);
            iC = iVarG.f23711c;
        } else {
            iC = new h1.g(workDatabaseS).c();
            jVarG.b(l.a(mVar, iC));
        }
        d(context, mVar, iC, j10);
    }

    private static void d(Context context, m mVar, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, mVar), 201326592);
        if (alarmManager != null) {
            C0067a.a(alarmManager, 0, j10, service);
        }
    }
}
