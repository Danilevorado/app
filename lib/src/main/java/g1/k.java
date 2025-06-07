package g1;

import android.database.Cursor;
import androidx.room.i0;
import g1.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f23712a;

    /* renamed from: b, reason: collision with root package name */
    private final q0.g f23713b;

    /* renamed from: c, reason: collision with root package name */
    private final q0.m f23714c;

    /* renamed from: d, reason: collision with root package name */
    private final q0.m f23715d;

    class a extends q0.g {
        a(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // q0.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u0.k kVar, i iVar) {
            String str = iVar.f23709a;
            if (str == null) {
                kVar.v(1);
            } else {
                kVar.q(1, str);
            }
            kVar.G(2, iVar.a());
            kVar.G(3, iVar.f23711c);
        }
    }

    class b extends q0.m {
        b(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    class c extends q0.m {
        c(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(i0 i0Var) {
        this.f23712a = i0Var;
        this.f23713b = new a(i0Var);
        this.f23714c = new b(i0Var);
        this.f23715d = new c(i0Var);
    }

    public static List h() {
        return Collections.emptyList();
    }

    @Override // g1.j
    public List a() {
        q0.l lVarE = q0.l.e("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f23712a.d();
        Cursor cursorD = s0.c.d(this.f23712a, lVarE, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorD.getCount());
            while (cursorD.moveToNext()) {
                arrayList.add(cursorD.isNull(0) ? null : cursorD.getString(0));
            }
            return arrayList;
        } finally {
            cursorD.close();
            lVarE.s();
        }
    }

    @Override // g1.j
    public void b(i iVar) {
        this.f23712a.d();
        this.f23712a.e();
        try {
            this.f23713b.h(iVar);
            this.f23712a.B();
        } finally {
            this.f23712a.i();
        }
    }

    @Override // g1.j
    public void c(m mVar) {
        j.a.b(this, mVar);
    }

    @Override // g1.j
    public void d(String str, int i10) {
        this.f23712a.d();
        u0.k kVarA = this.f23714c.a();
        if (str == null) {
            kVarA.v(1);
        } else {
            kVarA.q(1, str);
        }
        kVarA.G(2, i10);
        this.f23712a.e();
        try {
            kVarA.t();
            this.f23712a.B();
        } finally {
            this.f23712a.i();
            this.f23714c.f(kVarA);
        }
    }

    @Override // g1.j
    public void e(String str) {
        this.f23712a.d();
        u0.k kVarA = this.f23715d.a();
        if (str == null) {
            kVarA.v(1);
        } else {
            kVarA.q(1, str);
        }
        this.f23712a.e();
        try {
            kVarA.t();
            this.f23712a.B();
        } finally {
            this.f23712a.i();
            this.f23715d.f(kVarA);
        }
    }

    @Override // g1.j
    public i f(String str, int i10) {
        q0.l lVarE = q0.l.e("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            lVarE.v(1);
        } else {
            lVarE.q(1, str);
        }
        lVarE.G(2, i10);
        this.f23712a.d();
        i iVar = null;
        String string = null;
        Cursor cursorD = s0.c.d(this.f23712a, lVarE, false, null);
        try {
            int iE = s0.b.e(cursorD, "work_spec_id");
            int iE2 = s0.b.e(cursorD, "generation");
            int iE3 = s0.b.e(cursorD, "system_id");
            if (cursorD.moveToFirst()) {
                if (!cursorD.isNull(iE)) {
                    string = cursorD.getString(iE);
                }
                iVar = new i(string, cursorD.getInt(iE2), cursorD.getInt(iE3));
            }
            return iVar;
        } finally {
            cursorD.close();
            lVarE.s();
        }
    }

    @Override // g1.j
    public i g(m mVar) {
        return j.a.a(this, mVar);
    }
}
