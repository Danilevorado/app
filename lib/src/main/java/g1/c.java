package g1;

import android.database.Cursor;
import androidx.room.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f23696a;

    /* renamed from: b, reason: collision with root package name */
    private final q0.g f23697b;

    class a extends q0.g {
        a(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // q0.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u0.k kVar, g1.a aVar) {
            if (aVar.b() == null) {
                kVar.v(1);
            } else {
                kVar.q(1, aVar.b());
            }
            if (aVar.a() == null) {
                kVar.v(2);
            } else {
                kVar.q(2, aVar.a());
            }
        }
    }

    public c(i0 i0Var) {
        this.f23696a = i0Var;
        this.f23697b = new a(i0Var);
    }

    public static List e() {
        return Collections.emptyList();
    }

    @Override // g1.b
    public boolean a(String str) {
        q0.l lVarE = q0.l.e("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            lVarE.v(1);
        } else {
            lVarE.q(1, str);
        }
        this.f23696a.d();
        boolean z10 = false;
        Cursor cursorD = s0.c.d(this.f23696a, lVarE, false, null);
        try {
            if (cursorD.moveToFirst()) {
                z10 = cursorD.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorD.close();
            lVarE.s();
        }
    }

    @Override // g1.b
    public boolean b(String str) {
        q0.l lVarE = q0.l.e("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            lVarE.v(1);
        } else {
            lVarE.q(1, str);
        }
        this.f23696a.d();
        boolean z10 = false;
        Cursor cursorD = s0.c.d(this.f23696a, lVarE, false, null);
        try {
            if (cursorD.moveToFirst()) {
                z10 = cursorD.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorD.close();
            lVarE.s();
        }
    }

    @Override // g1.b
    public void c(g1.a aVar) {
        this.f23696a.d();
        this.f23696a.e();
        try {
            this.f23697b.h(aVar);
            this.f23696a.B();
        } finally {
            this.f23696a.i();
        }
    }

    @Override // g1.b
    public List d(String str) {
        q0.l lVarE = q0.l.e("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            lVarE.v(1);
        } else {
            lVarE.q(1, str);
        }
        this.f23696a.d();
        Cursor cursorD = s0.c.d(this.f23696a, lVarE, false, null);
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
