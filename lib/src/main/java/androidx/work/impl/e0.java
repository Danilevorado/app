package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.ForceStopRunnable;
import b1.j;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class e0 extends b1.u {

    /* renamed from: k, reason: collision with root package name */
    private static final String f4135k = b1.j.i("WorkManagerImpl");

    /* renamed from: l, reason: collision with root package name */
    private static e0 f4136l = null;

    /* renamed from: m, reason: collision with root package name */
    private static e0 f4137m = null;

    /* renamed from: n, reason: collision with root package name */
    private static final Object f4138n = new Object();

    /* renamed from: a, reason: collision with root package name */
    private Context f4139a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.work.a f4140b;

    /* renamed from: c, reason: collision with root package name */
    private WorkDatabase f4141c;

    /* renamed from: d, reason: collision with root package name */
    private i1.c f4142d;

    /* renamed from: e, reason: collision with root package name */
    private List f4143e;

    /* renamed from: f, reason: collision with root package name */
    private q f4144f;

    /* renamed from: g, reason: collision with root package name */
    private h1.m f4145g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4146h;

    /* renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f4147i;

    /* renamed from: j, reason: collision with root package name */
    private final f1.o f4148j;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public e0(Context context, androidx.work.a aVar, i1.c cVar) {
        this(context, aVar, cVar, context.getResources().getBoolean(b1.p.f4369a));
    }

    public e0(Context context, androidx.work.a aVar, i1.c cVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        b1.j.h(new j.a(aVar.j()));
        f1.o oVar = new f1.o(applicationContext, cVar);
        this.f4148j = oVar;
        List listJ = j(applicationContext, aVar, oVar);
        u(context, aVar, cVar, workDatabase, listJ, new q(context, aVar, cVar, workDatabase, listJ));
    }

    public e0(Context context, androidx.work.a aVar, i1.c cVar, boolean z10) {
        this(context, aVar, cVar, WorkDatabase.D(context.getApplicationContext(), cVar.b(), z10));
    }

    public static void h(Context context, androidx.work.a aVar) {
        synchronized (f4138n) {
            e0 e0Var = f4136l;
            if (e0Var != null && f4137m != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (e0Var == null) {
                Context applicationContext = context.getApplicationContext();
                if (f4137m == null) {
                    f4137m = new e0(applicationContext, aVar, new i1.d(aVar.m()));
                }
                f4136l = f4137m;
            }
        }
    }

    public static e0 m() {
        synchronized (f4138n) {
            e0 e0Var = f4136l;
            if (e0Var != null) {
                return e0Var;
            }
            return f4137m;
        }
    }

    public static e0 n(Context context) {
        e0 e0VarM;
        synchronized (f4138n) {
            e0VarM = m();
            if (e0VarM == null) {
                context.getApplicationContext();
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return e0VarM;
    }

    private void u(Context context, androidx.work.a aVar, i1.c cVar, WorkDatabase workDatabase, List list, q qVar) {
        Context applicationContext = context.getApplicationContext();
        this.f4139a = applicationContext;
        this.f4140b = aVar;
        this.f4142d = cVar;
        this.f4141c = workDatabase;
        this.f4143e = list;
        this.f4144f = qVar;
        this.f4145g = new h1.m(workDatabase);
        this.f4146h = false;
        if (Build.VERSION.SDK_INT >= 24 && a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f4142d.c(new ForceStopRunnable(applicationContext, this));
    }

    public void A(g1.m mVar) {
        this.f4142d.c(new h1.q(this, new u(mVar), true));
    }

    public void B(u uVar) {
        this.f4142d.c(new h1.q(this, uVar, false));
    }

    @Override // b1.u
    public b1.m a(String str) {
        h1.b bVarD = h1.b.d(str, this);
        this.f4142d.c(bVarD);
        return bVarD.e();
    }

    @Override // b1.u
    public b1.m c(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new w(this, list).a();
    }

    @Override // b1.u
    public b1.m e(String str, b1.d dVar, List list) {
        return new w(this, str, dVar, list).a();
    }

    public b1.m i(UUID uuid) {
        h1.b bVarB = h1.b.b(uuid, this);
        this.f4142d.c(bVarB);
        return bVarB.e();
    }

    public List j(Context context, androidx.work.a aVar, f1.o oVar) {
        return Arrays.asList(t.a(context, this), new c1.b(context, aVar, oVar, this));
    }

    public Context k() {
        return this.f4139a;
    }

    public androidx.work.a l() {
        return this.f4140b;
    }

    public h1.m o() {
        return this.f4145g;
    }

    public q p() {
        return this.f4144f;
    }

    public List q() {
        return this.f4143e;
    }

    public f1.o r() {
        return this.f4148j;
    }

    public WorkDatabase s() {
        return this.f4141c;
    }

    public i1.c t() {
        return this.f4142d;
    }

    public void v() {
        synchronized (f4138n) {
            this.f4146h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f4147i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f4147i = null;
            }
        }
    }

    public void w() {
        androidx.work.impl.background.systemjob.b.c(k());
        s().J().v();
        t.b(l(), s(), q());
    }

    public void x(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f4138n) {
            this.f4147i = pendingResult;
            if (this.f4146h) {
                pendingResult.finish();
                this.f4147i = null;
            }
        }
    }

    public void y(u uVar) {
        z(uVar, null);
    }

    public void z(u uVar, WorkerParameters.a aVar) {
        this.f4142d.c(new h1.p(this, uVar, aVar));
    }
}
