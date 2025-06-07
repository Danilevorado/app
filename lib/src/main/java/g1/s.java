package g1;

import androidx.room.i0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f23728a;

    /* renamed from: b, reason: collision with root package name */
    private final q0.g f23729b;

    /* renamed from: c, reason: collision with root package name */
    private final q0.m f23730c;

    /* renamed from: d, reason: collision with root package name */
    private final q0.m f23731d;

    class a extends q0.g {
        a(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // q0.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u0.k kVar, q qVar) throws Throwable {
            if (qVar.b() == null) {
                kVar.v(1);
            } else {
                kVar.q(1, qVar.b());
            }
            byte[] bArrN = androidx.work.b.n(qVar.a());
            if (bArrN == null) {
                kVar.v(2);
            } else {
                kVar.L(2, bArrN);
            }
        }
    }

    class b extends q0.m {
        b(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends q0.m {
        c(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public s(i0 i0Var) {
        this.f23728a = i0Var;
        this.f23729b = new a(i0Var);
        this.f23730c = new b(i0Var);
        this.f23731d = new c(i0Var);
    }

    public static List d() {
        return Collections.emptyList();
    }

    @Override // g1.r
    public void a(String str) {
        this.f23728a.d();
        u0.k kVarA = this.f23730c.a();
        if (str == null) {
            kVarA.v(1);
        } else {
            kVarA.q(1, str);
        }
        this.f23728a.e();
        try {
            kVarA.t();
            this.f23728a.B();
        } finally {
            this.f23728a.i();
            this.f23730c.f(kVarA);
        }
    }

    @Override // g1.r
    public void b(q qVar) {
        this.f23728a.d();
        this.f23728a.e();
        try {
            this.f23729b.h(qVar);
            this.f23728a.B();
        } finally {
            this.f23728a.i();
        }
    }

    @Override // g1.r
    public void c() {
        this.f23728a.d();
        u0.k kVarA = this.f23731d.a();
        this.f23728a.e();
        try {
            kVarA.t();
            this.f23728a.B();
        } finally {
            this.f23728a.i();
            this.f23731d.f(kVarA);
        }
    }
}
