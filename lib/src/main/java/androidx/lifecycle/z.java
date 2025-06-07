package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.g0;
import androidx.lifecycle.j;
import n0.a;
import t0.c;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final a.b f3180a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final a.b f3181b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final a.b f3182c = new a();

    public static final class a implements a.b {
        a() {
        }
    }

    public static final class b implements a.b {
        b() {
        }
    }

    public static final class c implements a.b {
        c() {
        }
    }

    static final class d extends rb.i implements qb.l {

        /* renamed from: n, reason: collision with root package name */
        public static final d f3183n = new d();

        d() {
            super(1);
        }

        @Override // qb.l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final b0 c(n0.a aVar) {
            rb.h.e(aVar, "$this$initializer");
            return new b0();
        }
    }

    public static final y a(n0.a aVar) {
        rb.h.e(aVar, "<this>");
        t0.e eVar = (t0.e) aVar.a(f3180a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        k0 k0Var = (k0) aVar.a(f3181b);
        if (k0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f3182c);
        String str = (String) aVar.a(g0.c.f3133d);
        if (str != null) {
            return b(eVar, k0Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final y b(t0.e eVar, k0 k0Var, String str, Bundle bundle) {
        a0 a0VarD = d(eVar);
        b0 b0VarE = e(k0Var);
        y yVar = (y) b0VarE.f().get(str);
        if (yVar != null) {
            return yVar;
        }
        y yVarA = y.f3173f.a(a0VarD.b(str), bundle);
        b0VarE.f().put(str, yVarA);
        return yVarA;
    }

    public static final void c(t0.e eVar) {
        rb.h.e(eVar, "<this>");
        j.c cVarB = eVar.s().b();
        rb.h.d(cVarB, "lifecycle.currentState");
        if (!(cVarB == j.c.INITIALIZED || cVarB == j.c.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (eVar.c().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            a0 a0Var = new a0(eVar.c(), (k0) eVar);
            eVar.c().h("androidx.lifecycle.internal.SavedStateHandlesProvider", a0Var);
            eVar.s().a(new SavedStateHandleAttacher(a0Var));
        }
    }

    public static final a0 d(t0.e eVar) {
        rb.h.e(eVar, "<this>");
        c.InterfaceC0188c interfaceC0188cC = eVar.c().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        a0 a0Var = interfaceC0188cC instanceof a0 ? (a0) interfaceC0188cC : null;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final b0 e(k0 k0Var) {
        rb.h.e(k0Var, "<this>");
        n0.c cVar = new n0.c();
        cVar.a(rb.j.a(b0.class), d.f3183n);
        return (b0) new g0(k0Var, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", b0.class);
    }
}
