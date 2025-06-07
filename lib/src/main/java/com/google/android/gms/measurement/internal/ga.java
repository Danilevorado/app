package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.gc;

/* loaded from: classes.dex */
final class ga extends fa {

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.i3 f19952g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ b f19953h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ga(b bVar, String str, int i10, com.google.android.gms.internal.measurement.i3 i3Var) {
        super(str, i10);
        this.f19953h = bVar;
        this.f19952g = i3Var;
    }

    @Override // com.google.android.gms.measurement.internal.fa
    final int a() {
        return this.f19952g.v();
    }

    @Override // com.google.android.gms.measurement.internal.fa
    final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.fa
    final boolean c() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean k(Long l10, Long l11, com.google.android.gms.internal.measurement.d5 d5Var, boolean z10) {
        q3 q3VarU;
        String strF;
        String str;
        Boolean boolF;
        gc.c();
        boolean zA = this.f19953h.f20269a.y().A(this.f19909a, i3.W);
        boolean zB = this.f19952g.B();
        boolean zC = this.f19952g.C();
        boolean zD = this.f19952g.D();
        byte b10 = zB || zC || zD;
        Boolean boolJ = null;
        boolJ = null;
        if (z10 && b10 != true) {
            this.f19953h.f20269a.b().t().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f19910b), this.f19952g.E() ? Integer.valueOf(this.f19952g.v()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.b3 b3VarW = this.f19952g.w();
        boolean zB2 = b3VarW.B();
        if (d5Var.L()) {
            if (b3VarW.D()) {
                boolF = fa.h(d5Var.w(), b3VarW.x());
                boolJ = fa.j(boolF, zB2);
            } else {
                q3VarU = this.f19953h.f20269a.b().u();
                strF = this.f19953h.f20269a.D().f(d5Var.A());
                str = "No number filter for long property. property";
                q3VarU.b(str, strF);
            }
        } else if (!d5Var.K()) {
            if (d5Var.N()) {
                if (b3VarW.F()) {
                    boolF = fa.f(d5Var.B(), b3VarW.y(), this.f19953h.f20269a.b());
                } else if (!b3VarW.D()) {
                    q3VarU = this.f19953h.f20269a.b().u();
                    strF = this.f19953h.f20269a.D().f(d5Var.A());
                    str = "No string or number filter defined. property";
                } else if (p9.N(d5Var.B())) {
                    boolF = fa.i(d5Var.B(), b3VarW.x());
                } else {
                    this.f19953h.f20269a.b().u().c("Invalid user property value for Numeric number filter. property, value", this.f19953h.f20269a.D().f(d5Var.A()), d5Var.B());
                }
                boolJ = fa.j(boolF, zB2);
            } else {
                q3VarU = this.f19953h.f20269a.b().u();
                strF = this.f19953h.f20269a.D().f(d5Var.A());
                str = "User property has no value, property";
            }
            q3VarU.b(str, strF);
        } else if (b3VarW.D()) {
            boolF = fa.g(d5Var.v(), b3VarW.x());
            boolJ = fa.j(boolF, zB2);
        } else {
            q3VarU = this.f19953h.f20269a.b().u();
            strF = this.f19953h.f20269a.D().f(d5Var.A());
            str = "No number filter for double property. property";
            q3VarU.b(str, strF);
        }
        this.f19953h.f20269a.b().t().b("Property filter result", boolJ == null ? "null" : boolJ);
        if (boolJ == null) {
            return false;
        }
        this.f19911c = Boolean.TRUE;
        if (zD && !boolJ.booleanValue()) {
            return true;
        }
        if (!z10 || this.f19952g.B()) {
            this.f19912d = boolJ;
        }
        if (boolJ.booleanValue() && b10 != false && d5Var.M()) {
            long jX = d5Var.x();
            if (l10 != null) {
                jX = l10.longValue();
            }
            if (zA && this.f19952g.B() && !this.f19952g.C() && l11 != null) {
                jX = l11.longValue();
            }
            if (this.f19952g.C()) {
                this.f19914f = Long.valueOf(jX);
            } else {
                this.f19913e = Long.valueOf(jX);
            }
        }
        return true;
    }
}
