package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.u;
import b1.j;
import f1.o;
import g1.m;
import g1.v;
import h1.s;
import h1.y;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class f implements d1.c, y.a {

    /* renamed from: y, reason: collision with root package name */
    private static final String f4090y = j.i("DelayMetCommandHandler");

    /* renamed from: m, reason: collision with root package name */
    private final Context f4091m;

    /* renamed from: n, reason: collision with root package name */
    private final int f4092n;

    /* renamed from: o, reason: collision with root package name */
    private final m f4093o;

    /* renamed from: p, reason: collision with root package name */
    private final g f4094p;

    /* renamed from: q, reason: collision with root package name */
    private final d1.e f4095q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f4096r;

    /* renamed from: s, reason: collision with root package name */
    private int f4097s;

    /* renamed from: t, reason: collision with root package name */
    private final Executor f4098t;

    /* renamed from: u, reason: collision with root package name */
    private final Executor f4099u;

    /* renamed from: v, reason: collision with root package name */
    private PowerManager.WakeLock f4100v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f4101w;

    /* renamed from: x, reason: collision with root package name */
    private final u f4102x;

    f(Context context, int i10, g gVar, u uVar) {
        this.f4091m = context;
        this.f4092n = i10;
        this.f4094p = gVar;
        this.f4093o = uVar.a();
        this.f4102x = uVar;
        o oVarR = gVar.g().r();
        this.f4098t = gVar.f().b();
        this.f4099u = gVar.f().a();
        this.f4095q = new d1.e(oVarR, this);
        this.f4101w = false;
        this.f4097s = 0;
        this.f4096r = new Object();
    }

    private void f() {
        synchronized (this.f4096r) {
            this.f4095q.d();
            this.f4094p.h().b(this.f4093o);
            PowerManager.WakeLock wakeLock = this.f4100v;
            if (wakeLock != null && wakeLock.isHeld()) {
                j.e().a(f4090y, "Releasing wakelock " + this.f4100v + "for WorkSpec " + this.f4093o);
                this.f4100v.release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f4097s != 0) {
            j.e().a(f4090y, "Already started work for " + this.f4093o);
            return;
        }
        this.f4097s = 1;
        j.e().a(f4090y, "onAllConstraintsMet for " + this.f4093o);
        if (this.f4094p.e().p(this.f4102x)) {
            this.f4094p.h().a(this.f4093o, 600000L, this);
        } else {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        j jVarE;
        String str;
        StringBuilder sb2;
        String strB = this.f4093o.b();
        if (this.f4097s < 2) {
            this.f4097s = 2;
            j jVarE2 = j.e();
            str = f4090y;
            jVarE2.a(str, "Stopping work for WorkSpec " + strB);
            this.f4099u.execute(new g.b(this.f4094p, b.f(this.f4091m, this.f4093o), this.f4092n));
            if (this.f4094p.e().k(this.f4093o.b())) {
                j.e().a(str, "WorkSpec " + strB + " needs to be rescheduled");
                this.f4099u.execute(new g.b(this.f4094p, b.e(this.f4091m, this.f4093o), this.f4092n));
                return;
            }
            jVarE = j.e();
            sb2 = new StringBuilder();
            sb2.append("Processor does not have WorkSpec ");
            sb2.append(strB);
            strB = ". No need to reschedule";
        } else {
            jVarE = j.e();
            str = f4090y;
            sb2 = new StringBuilder();
            sb2.append("Already stopped work for ");
        }
        sb2.append(strB);
        jVarE.a(str, sb2.toString());
    }

    @Override // h1.y.a
    public void a(m mVar) {
        j.e().a(f4090y, "Exceeded time limits on execution for " + mVar);
        this.f4098t.execute(new e(this));
    }

    @Override // d1.c
    public void c(List list) {
        this.f4098t.execute(new e(this));
    }

    @Override // d1.c
    public void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (g1.y.a((v) it.next()).equals(this.f4093o)) {
                this.f4098t.execute(new Runnable() { // from class: androidx.work.impl.background.systemalarm.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4088m.i();
                    }
                });
                return;
            }
        }
    }

    void g() {
        String strB = this.f4093o.b();
        this.f4100v = s.b(this.f4091m, strB + " (" + this.f4092n + ")");
        j jVarE = j.e();
        String str = f4090y;
        jVarE.a(str, "Acquiring wakelock " + this.f4100v + "for WorkSpec " + strB);
        this.f4100v.acquire();
        v vVarL = this.f4094p.g().s().J().l(strB);
        if (vVarL == null) {
            this.f4098t.execute(new e(this));
            return;
        }
        boolean zH = vVarL.h();
        this.f4101w = zH;
        if (zH) {
            this.f4095q.a(Collections.singletonList(vVarL));
            return;
        }
        j.e().a(str, "No constraints for " + strB);
        e(Collections.singletonList(vVarL));
    }

    void h(boolean z10) {
        j.e().a(f4090y, "onExecuted " + this.f4093o + ", " + z10);
        f();
        if (z10) {
            this.f4099u.execute(new g.b(this.f4094p, b.e(this.f4091m, this.f4093o), this.f4092n));
        }
        if (this.f4101w) {
            this.f4099u.execute(new g.b(this.f4094p, b.a(this.f4091m), this.f4092n));
        }
    }
}
