package g1;

import android.database.Cursor;
import androidx.room.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f23723a;

    /* renamed from: b, reason: collision with root package name */
    private final q0.g f23724b;

    class a extends q0.g {
        a(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // q0.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u0.k kVar, n nVar) {
            if (nVar.a() == null) {
                kVar.v(1);
            } else {
                kVar.q(1, nVar.a());
            }
            if (nVar.b() == null) {
                kVar.v(2);
            } else {
                kVar.q(2, nVar.b());
            }
        }
    }

    public p(i0 i0Var) {
        this.f23723a = i0Var;
        this.f23724b = new a(i0Var);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // g1.o
    public void a(n nVar) {
        this.f23723a.d();
        this.f23723a.e();
        try {
            this.f23724b.h(nVar);
            this.f23723a.B();
        } finally {
            this.f23723a.i();
        }
    }

    @Override // g1.o
    public List b(String str) {
        q0.l lVarE = q0.l.e("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            lVarE.v(1);
        } else {
            lVarE.q(1, str);
        }
        this.f23723a.d();
        Cursor cursorD = s0.c.d(this.f23723a, lVarE, false, null);
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
