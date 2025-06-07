package t0;

import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.savedstate.Recreator;
import rb.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final a f27123d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final e f27124a;

    /* renamed from: b, reason: collision with root package name */
    private final c f27125b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27126c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }

        public final d a(e eVar) {
            h.e(eVar, "owner");
            return new d(eVar, null);
        }
    }

    private d(e eVar) {
        this.f27124a = eVar;
        this.f27125b = new c();
    }

    public /* synthetic */ d(e eVar, rb.f fVar) {
        this(eVar);
    }

    public static final d a(e eVar) {
        return f27123d.a(eVar);
    }

    public final c b() {
        return this.f27125b;
    }

    public final void c() {
        j jVarS = this.f27124a.s();
        h.d(jVarS, "owner.lifecycle");
        if (!(jVarS.b() == j.c.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        jVarS.a(new Recreator(this.f27124a));
        this.f27125b.e(jVarS);
        this.f27126c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f27126c) {
            c();
        }
        j jVarS = this.f27124a.s();
        h.d(jVarS, "owner.lifecycle");
        if (!jVarS.b().b(j.c.STARTED)) {
            this.f27125b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + jVarS.b()).toString());
    }

    public final void e(Bundle bundle) {
        h.e(bundle, "outBundle");
        this.f27125b.g(bundle);
    }
}
