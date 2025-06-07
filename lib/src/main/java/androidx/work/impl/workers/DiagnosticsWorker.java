package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.e0;
import g1.a0;
import g1.j;
import g1.o;
import g1.w;
import j1.d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rb.h;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h.e(context, "context");
        h.e(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        e0 e0VarN = e0.n(getApplicationContext());
        h.d(e0VarN, "getInstance(applicationContext)");
        WorkDatabase workDatabaseS = e0VarN.s();
        h.d(workDatabaseS, "workManager.workDatabase");
        w wVarJ = workDatabaseS.J();
        o oVarH = workDatabaseS.H();
        a0 a0VarK = workDatabaseS.K();
        j jVarG = workDatabaseS.G();
        List listI = wVarJ.i(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List listC = wVarJ.c();
        List listT = wVarJ.t(200);
        if (!listI.isEmpty()) {
            b1.j.e().f(d.f24382a, "Recently completed work:\n\n");
            b1.j.e().f(d.f24382a, d.d(oVarH, a0VarK, jVarG, listI));
        }
        if (!listC.isEmpty()) {
            b1.j.e().f(d.f24382a, "Running work:\n\n");
            b1.j.e().f(d.f24382a, d.d(oVarH, a0VarK, jVarG, listC));
        }
        if (!listT.isEmpty()) {
            b1.j.e().f(d.f24382a, "Enqueued work:\n\n");
            b1.j.e().f(d.f24382a, d.d(oVarH, a0VarK, jVarG, listT));
        }
        c.a aVarC = c.a.c();
        h.d(aVarC, "success()");
        return aVarC;
    }
}
