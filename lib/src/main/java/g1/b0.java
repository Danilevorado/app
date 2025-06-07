package g1;

import android.database.Cursor;
import androidx.room.i0;
import g1.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f23691a;

    /* renamed from: b, reason: collision with root package name */
    private final q0.g f23692b;

    /* renamed from: c, reason: collision with root package name */
    private final q0.m f23693c;

    class a extends q0.g {
        a(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // q0.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u0.k kVar, z zVar) {
            if (zVar.a() == null) {
                kVar.v(1);
            } else {
                kVar.q(1, zVar.a());
            }
            if (zVar.b() == null) {
                kVar.v(2);
            } else {
                kVar.q(2, zVar.b());
            }
        }
    }

    class b extends q0.m {
        b(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public b0(i0 i0Var) {
        this.f23691a = i0Var;
        this.f23692b = new a(i0Var);
        this.f23693c = new b(i0Var);
    }

    public static List d() {
        return Collections.emptyList();
    }

    @Override // g1.a0
    public void a(z zVar) {
        this.f23691a.d();
        this.f23691a.e();
        try {
            this.f23692b.h(zVar);
            this.f23691a.B();
        } finally {
            this.f23691a.i();
        }
    }

    @Override // g1.a0
    public void b(String str, Set set) {
        a0.a.a(this, str, set);
    }

    @Override // g1.a0
    public List c(String str) {
        q0.l lVarE = q0.l.e("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            lVarE.v(1);
        } else {
            lVarE.q(1, str);
        }
        this.f23691a.d();
        Cursor cursorD = s0.c.d(this.f23691a, lVarE, false, null);
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
}
