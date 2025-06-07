package c1;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.e;
import androidx.work.impl.e0;
import androidx.work.impl.s;
import androidx.work.impl.u;
import androidx.work.impl.v;
import b1.j;
import b1.t;
import d1.c;
import d1.d;
import f1.o;
import g1.m;
import g1.y;
import h1.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class b implements s, c, e {

    /* renamed from: v, reason: collision with root package name */
    private static final String f4649v = j.i("GreedyScheduler");

    /* renamed from: m, reason: collision with root package name */
    private final Context f4650m;

    /* renamed from: n, reason: collision with root package name */
    private final e0 f4651n;

    /* renamed from: o, reason: collision with root package name */
    private final d f4652o;

    /* renamed from: q, reason: collision with root package name */
    private a f4654q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f4655r;

    /* renamed from: u, reason: collision with root package name */
    Boolean f4658u;

    /* renamed from: p, reason: collision with root package name */
    private final Set f4653p = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    private final v f4657t = new v();

    /* renamed from: s, reason: collision with root package name */
    private final Object f4656s = new Object();

    public b(Context context, androidx.work.a aVar, o oVar, e0 e0Var) {
        this.f4650m = context;
        this.f4651n = e0Var;
        this.f4652o = new d1.e(oVar, this);
        this.f4654q = new a(this, aVar.k());
    }

    private void g() {
        this.f4658u = Boolean.valueOf(n.b(this.f4650m, this.f4651n.l()));
    }

    private void h() {
        if (this.f4655r) {
            return;
        }
        this.f4651n.p().g(this);
        this.f4655r = true;
    }

    private void i(m mVar) {
        synchronized (this.f4656s) {
            Iterator it = this.f4653p.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g1.v vVar = (g1.v) it.next();
                if (y.a(vVar).equals(mVar)) {
                    j.e().a(f4649v, "Stopping tracking for " + mVar);
                    this.f4653p.remove(vVar);
                    this.f4652o.a(this.f4653p);
                    break;
                }
            }
        }
    }

    @Override // androidx.work.impl.s
    public void a(String str) {
        if (this.f4658u == null) {
            g();
        }
        if (!this.f4658u.booleanValue()) {
            j.e().f(f4649v, "Ignoring schedule request in non-main process");
            return;
        }
        h();
        j.e().a(f4649v, "Cancelling work ID " + str);
        a aVar = this.f4654q;
        if (aVar != null) {
            aVar.b(str);
        }
        Iterator it = this.f4657t.b(str).iterator();
        while (it.hasNext()) {
            this.f4651n.B((u) it.next());
        }
    }

    @Override // androidx.work.impl.s
    public void b(g1.v... vVarArr) {
        j jVarE;
        String str;
        StringBuilder sb2;
        String str2;
        if (this.f4658u == null) {
            g();
        }
        if (!this.f4658u.booleanValue()) {
            j.e().f(f4649v, "Ignoring schedule request in a secondary process");
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (g1.v vVar : vVarArr) {
            long jC = vVar.c();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (vVar.f23740b == t.ENQUEUED) {
                if (jCurrentTimeMillis < jC) {
                    a aVar = this.f4654q;
                    if (aVar != null) {
                        aVar.a(vVar);
                    }
                } else if (vVar.h()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (vVar.f23748j.h()) {
                        jVarE = j.e();
                        str = f4649v;
                        sb2 = new StringBuilder();
                        sb2.append("Ignoring ");
                        sb2.append(vVar);
                        str2 = ". Requires device idle.";
                    } else if (i10 < 24 || !vVar.f23748j.e()) {
                        hashSet.add(vVar);
                        hashSet2.add(vVar.f23739a);
                    } else {
                        jVarE = j.e();
                        str = f4649v;
                        sb2 = new StringBuilder();
                        sb2.append("Ignoring ");
                        sb2.append(vVar);
                        str2 = ". Requires ContentUri triggers.";
                    }
                    sb2.append(str2);
                    jVarE.a(str, sb2.toString());
                } else {
                    j.e().a(f4649v, "Starting work for " + vVar.f23739a);
                    this.f4651n.y(this.f4657t.d(vVar));
                }
            }
        }
        synchronized (this.f4656s) {
            if (!hashSet.isEmpty()) {
                j.e().a(f4649v, "Starting tracking for " + TextUtils.join(",", hashSet2));
                this.f4653p.addAll(hashSet);
                this.f4652o.a(this.f4653p);
            }
        }
    }

    @Override // d1.c
    public void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m mVarA = y.a((g1.v) it.next());
            j.e().a(f4649v, "Constraints not met: Cancelling work ID " + mVarA);
            u uVarA = this.f4657t.a(mVarA);
            if (uVarA != null) {
                this.f4651n.B(uVarA);
            }
        }
    }

    @Override // androidx.work.impl.e
    /* renamed from: d */
    public void l(m mVar, boolean z10) {
        this.f4657t.a(mVar);
        i(mVar);
    }

    @Override // d1.c
    public void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m mVarA = y.a((g1.v) it.next());
            j.e().a(f4649v, "Constraints met: Scheduling work ID " + mVarA);
            this.f4651n.y(this.f4657t.c(mVarA));
        }
    }

    @Override // androidx.work.impl.s
    public boolean f() {
        return false;
    }
}
