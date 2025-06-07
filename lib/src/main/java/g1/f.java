package g1;

import android.database.Cursor;
import androidx.room.i0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f23706a;

    /* renamed from: b, reason: collision with root package name */
    private final q0.g f23707b;

    class a extends q0.g {
        a(i0 i0Var) {
            super(i0Var);
        }

        @Override // q0.m
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // q0.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u0.k kVar, d dVar) {
            if (dVar.a() == null) {
                kVar.v(1);
            } else {
                kVar.q(1, dVar.a());
            }
            if (dVar.b() == null) {
                kVar.v(2);
            } else {
                kVar.G(2, dVar.b().longValue());
            }
        }
    }

    public f(i0 i0Var) {
        this.f23706a = i0Var;
        this.f23707b = new a(i0Var);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // g1.e
    public Long a(String str) {
        q0.l lVarE = q0.l.e("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            lVarE.v(1);
        } else {
            lVarE.q(1, str);
        }
        this.f23706a.d();
        Long lValueOf = null;
        Cursor cursorD = s0.c.d(this.f23706a, lVarE, false, null);
        try {
            if (cursorD.moveToFirst() && !cursorD.isNull(0)) {
                lValueOf = Long.valueOf(cursorD.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorD.close();
            lVarE.s();
        }
    }

    @Override // g1.e
    public void b(d dVar) {
        this.f23706a.d();
        this.f23706a.e();
        try {
            this.f23707b.h(dVar);
            this.f23706a.B();
        } finally {
            this.f23706a.i();
        }
    }
}
