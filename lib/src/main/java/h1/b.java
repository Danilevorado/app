package h1;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.e0;
import b1.m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class b implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final androidx.work.impl.n f23992m = new androidx.work.impl.n();

    class a extends b {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ e0 f23993n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ UUID f23994o;

        a(e0 e0Var, UUID uuid) {
            this.f23993n = e0Var;
            this.f23994o = uuid;
        }

        @Override // h1.b
        void h() {
            WorkDatabase workDatabaseS = this.f23993n.s();
            workDatabaseS.e();
            try {
                a(this.f23993n, this.f23994o.toString());
                workDatabaseS.B();
                workDatabaseS.i();
                g(this.f23993n);
            } catch (Throwable th) {
                workDatabaseS.i();
                throw th;
            }
        }
    }

    /* renamed from: h1.b$b, reason: collision with other inner class name */
    class C0141b extends b {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ e0 f23995n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f23996o;

        C0141b(e0 e0Var, String str) {
            this.f23995n = e0Var;
            this.f23996o = str;
        }

        @Override // h1.b
        void h() {
            WorkDatabase workDatabaseS = this.f23995n.s();
            workDatabaseS.e();
            try {
                Iterator it = workDatabaseS.J().p(this.f23996o).iterator();
                while (it.hasNext()) {
                    a(this.f23995n, (String) it.next());
                }
                workDatabaseS.B();
                workDatabaseS.i();
                g(this.f23995n);
            } catch (Throwable th) {
                workDatabaseS.i();
                throw th;
            }
        }
    }

    class c extends b {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ e0 f23997n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f23998o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f23999p;

        c(e0 e0Var, String str, boolean z10) {
            this.f23997n = e0Var;
            this.f23998o = str;
            this.f23999p = z10;
        }

        @Override // h1.b
        void h() {
            WorkDatabase workDatabaseS = this.f23997n.s();
            workDatabaseS.e();
            try {
                Iterator it = workDatabaseS.J().g(this.f23998o).iterator();
                while (it.hasNext()) {
                    a(this.f23997n, (String) it.next());
                }
                workDatabaseS.B();
                workDatabaseS.i();
                if (this.f23999p) {
                    g(this.f23997n);
                }
            } catch (Throwable th) {
                workDatabaseS.i();
                throw th;
            }
        }
    }

    public static b b(UUID uuid, e0 e0Var) {
        return new a(e0Var, uuid);
    }

    public static b c(String str, e0 e0Var, boolean z10) {
        return new c(e0Var, str, z10);
    }

    public static b d(String str, e0 e0Var) {
        return new C0141b(e0Var, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        g1.w wVarJ = workDatabase.J();
        g1.b bVarE = workDatabase.E();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            b1.t tVarJ = wVarJ.j(str2);
            if (tVarJ != b1.t.SUCCEEDED && tVarJ != b1.t.FAILED) {
                wVarJ.o(b1.t.CANCELLED, str2);
            }
            linkedList.addAll(bVarE.d(str2));
        }
    }

    void a(e0 e0Var, String str) {
        f(e0Var.s(), str);
        e0Var.p().r(str);
        Iterator it = e0Var.q().iterator();
        while (it.hasNext()) {
            ((androidx.work.impl.s) it.next()).a(str);
        }
    }

    public b1.m e() {
        return this.f23992m;
    }

    void g(e0 e0Var) {
        androidx.work.impl.t.b(e0Var.l(), e0Var.s(), e0Var.q());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f23992m.a(b1.m.f4363a);
        } catch (Throwable th) {
            this.f23992m.a(new m.b.a(th));
        }
    }
}
