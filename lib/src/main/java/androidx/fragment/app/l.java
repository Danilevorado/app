package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f2863a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final m f2864b;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final m.l f2865a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f2866b;

        a(m.l lVar, boolean z10) {
            this.f2865a = lVar;
            this.f2866b = z10;
        }
    }

    l(m mVar) {
        this.f2864b = mVar;
    }

    void a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().a(fragment, bundle, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.a(this.f2864b, fragment, bundle);
            }
        }
    }

    void b(Fragment fragment, boolean z10) {
        Context contextH = this.f2864b.t0().h();
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().b(fragment, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.b(this.f2864b, fragment, contextH);
            }
        }
    }

    void c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().c(fragment, bundle, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.c(this.f2864b, fragment, bundle);
            }
        }
    }

    void d(Fragment fragment, boolean z10) {
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().d(fragment, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.d(this.f2864b, fragment);
            }
        }
    }

    void e(Fragment fragment, boolean z10) {
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().e(fragment, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.e(this.f2864b, fragment);
            }
        }
    }

    void f(Fragment fragment, boolean z10) {
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().f(fragment, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.f(this.f2864b, fragment);
            }
        }
    }

    void g(Fragment fragment, boolean z10) {
        Context contextH = this.f2864b.t0().h();
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().g(fragment, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.g(this.f2864b, fragment, contextH);
            }
        }
    }

    void h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().h(fragment, bundle, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.h(this.f2864b, fragment, bundle);
            }
        }
    }

    void i(Fragment fragment, boolean z10) {
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().i(fragment, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.i(this.f2864b, fragment);
            }
        }
    }

    void j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().j(fragment, bundle, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.j(this.f2864b, fragment, bundle);
            }
        }
    }

    void k(Fragment fragment, boolean z10) {
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().k(fragment, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.k(this.f2864b, fragment);
            }
        }
    }

    void l(Fragment fragment, boolean z10) {
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().l(fragment, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.l(this.f2864b, fragment);
            }
        }
    }

    void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().m(fragment, view, bundle, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.m(this.f2864b, fragment, view, bundle);
            }
        }
    }

    void n(Fragment fragment, boolean z10) {
        Fragment fragmentW0 = this.f2864b.w0();
        if (fragmentW0 != null) {
            fragmentW0.J().v0().n(fragment, true);
        }
        Iterator it = this.f2863a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f2866b) {
                aVar.f2865a.n(this.f2864b, fragment);
            }
        }
    }

    public void o(m.l lVar, boolean z10) {
        this.f2863a.add(new a(lVar, z10));
    }

    public void p(m.l lVar) {
        synchronized (this.f2863a) {
            int i10 = 0;
            int size = this.f2863a.size();
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (((a) this.f2863a.get(i10)).f2865a == lVar) {
                    this.f2863a.remove(i10);
                    break;
                }
                i10++;
            }
        }
    }
}
