package h1;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.e0;
import b1.m;
import java.util.List;

/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private static final String f24000o = b1.j.i("EnqueueRunnable");

    /* renamed from: m, reason: collision with root package name */
    private final androidx.work.impl.w f24001m;

    /* renamed from: n, reason: collision with root package name */
    private final androidx.work.impl.n f24002n;

    public c(androidx.work.impl.w wVar) {
        this(wVar, new androidx.work.impl.n());
    }

    public c(androidx.work.impl.w wVar, androidx.work.impl.n nVar) {
        this.f24001m = wVar;
        this.f24002n = nVar;
    }

    private static boolean b(androidx.work.impl.w wVar) {
        boolean zC = c(wVar.g(), wVar.f(), (String[]) androidx.work.impl.w.l(wVar).toArray(new String[0]), wVar.d(), wVar.b());
        wVar.k();
        return zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(androidx.work.impl.e0 r18, java.util.List r19, java.lang.String[] r20, java.lang.String r21, b1.d r22) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.c.c(androidx.work.impl.e0, java.util.List, java.lang.String[], java.lang.String, b1.d):boolean");
    }

    private static boolean e(androidx.work.impl.w wVar) {
        List<androidx.work.impl.w> listE = wVar.e();
        boolean zE = false;
        if (listE != null) {
            for (androidx.work.impl.w wVar2 : listE) {
                if (wVar2.j()) {
                    b1.j.e().k(f24000o, "Already enqueued work ids (" + TextUtils.join(", ", wVar2.c()) + ")");
                } else {
                    zE |= e(wVar2);
                }
            }
        }
        return b(wVar) | zE;
    }

    public boolean a() {
        WorkDatabase workDatabaseS = this.f24001m.g().s();
        workDatabaseS.e();
        try {
            boolean zE = e(this.f24001m);
            workDatabaseS.B();
            return zE;
        } finally {
            workDatabaseS.i();
        }
    }

    public b1.m d() {
        return this.f24002n;
    }

    public void f() {
        e0 e0VarG = this.f24001m.g();
        androidx.work.impl.t.b(e0VarG.l(), e0VarG.s(), e0VarG.q());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f24001m.h()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.f24001m + ")");
            }
            if (a()) {
                l.a(this.f24001m.g().k(), RescheduleReceiver.class, true);
                f();
            }
            this.f24002n.a(b1.m.f4363a);
        } catch (Throwable th) {
            this.f24002n.a(new m.b.a(th));
        }
    }
}
