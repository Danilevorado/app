package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.e0;
import androidx.work.impl.utils.futures.d;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b1.j;
import d1.e;
import f1.o;
import g1.v;
import g1.w;
import hb.q;
import ib.i;
import java.util.List;
import rb.h;
import u5.a;

/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends c implements d1.c {

    /* renamed from: q, reason: collision with root package name */
    private final WorkerParameters f4291q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f4292r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f4293s;

    /* renamed from: t, reason: collision with root package name */
    private final d f4294t;

    /* renamed from: u, reason: collision with root package name */
    private c f4295u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h.e(context, "appContext");
        h.e(workerParameters, "workerParameters");
        this.f4291q = workerParameters;
        this.f4292r = new Object();
        this.f4294t = d.u();
    }

    private final void d() {
        if (this.f4294t.isCancelled()) {
            return;
        }
        String strL = getInputData().l("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        j jVarE = j.e();
        h.d(jVarE, "get()");
        if (strL == null || strL.length() == 0) {
            jVarE.c(j1.c.f24381a, "No worker to delegate to.");
        } else {
            c cVarB = getWorkerFactory().b(getApplicationContext(), strL, this.f4291q);
            this.f4295u = cVarB;
            if (cVarB == null) {
                jVarE.a(j1.c.f24381a, "No worker to delegate to.");
            } else {
                e0 e0VarN = e0.n(getApplicationContext());
                h.d(e0VarN, "getInstance(applicationContext)");
                w wVarJ = e0VarN.s().J();
                String string = getId().toString();
                h.d(string, "id.toString()");
                v vVarL = wVarJ.l(string);
                if (vVarL != null) {
                    o oVarR = e0VarN.r();
                    h.d(oVarR, "workManagerImpl.trackers");
                    e eVar = new e(oVarR, this);
                    eVar.a(i.b(vVarL));
                    String string2 = getId().toString();
                    h.d(string2, "id.toString()");
                    if (!eVar.e(string2)) {
                        jVarE.a(j1.c.f24381a, "Constraints not met for delegate " + strL + ". Requesting retry.");
                        d dVar = this.f4294t;
                        h.d(dVar, "future");
                        j1.c.e(dVar);
                        return;
                    }
                    jVarE.a(j1.c.f24381a, "Constraints met for delegate " + strL);
                    try {
                        c cVar = this.f4295u;
                        h.b(cVar);
                        final a aVarStartWork = cVar.startWork();
                        h.d(aVarStartWork, "delegate!!.startWork()");
                        aVarStartWork.d(new Runnable() { // from class: j1.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                ConstraintTrackingWorker.f(this.f24379m, aVarStartWork);
                            }
                        }, getBackgroundExecutor());
                        return;
                    } catch (Throwable th) {
                        jVarE.b(j1.c.f24381a, "Delegated worker " + strL + " threw exception in startWork.", th);
                        synchronized (this.f4292r) {
                            if (!this.f4293s) {
                                d dVar2 = this.f4294t;
                                h.d(dVar2, "future");
                                j1.c.d(dVar2);
                                return;
                            } else {
                                jVarE.a(j1.c.f24381a, "Constraints were unmet, Retrying.");
                                d dVar3 = this.f4294t;
                                h.d(dVar3, "future");
                                j1.c.e(dVar3);
                                return;
                            }
                        }
                    }
                }
            }
        }
        d dVar4 = this.f4294t;
        h.d(dVar4, "future");
        j1.c.d(dVar4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ConstraintTrackingWorker constraintTrackingWorker, a aVar) {
        h.e(constraintTrackingWorker, "this$0");
        h.e(aVar, "$innerFuture");
        synchronized (constraintTrackingWorker.f4292r) {
            if (constraintTrackingWorker.f4293s) {
                d dVar = constraintTrackingWorker.f4294t;
                h.d(dVar, "future");
                j1.c.e(dVar);
            } else {
                constraintTrackingWorker.f4294t.s(aVar);
            }
            q qVar = q.f24177a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ConstraintTrackingWorker constraintTrackingWorker) {
        h.e(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.d();
    }

    @Override // d1.c
    public void c(List list) {
        h.e(list, "workSpecs");
        j.e().a(j1.c.f24381a, "Constraints changed for " + list);
        synchronized (this.f4292r) {
            this.f4293s = true;
            q qVar = q.f24177a;
        }
    }

    @Override // d1.c
    public void e(List list) {
        h.e(list, "workSpecs");
    }

    @Override // androidx.work.c
    public void onStopped() {
        super.onStopped();
        c cVar = this.f4295u;
        if (cVar == null || cVar.isStopped()) {
            return;
        }
        cVar.stop();
    }

    @Override // androidx.work.c
    public a startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: j1.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.g(this.f24378m);
            }
        });
        d dVar = this.f4294t;
        h.d(dVar, "future");
        return dVar;
    }
}
