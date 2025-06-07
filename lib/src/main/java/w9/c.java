package w9;

import android.content.Context;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private g8.f f28026c = n7.l.i().g();

    /* renamed from: f, reason: collision with root package name */
    private Context f28029f = c9.a.b();

    /* renamed from: d, reason: collision with root package name */
    private f f28027d = n7.l.i().q();

    /* renamed from: a, reason: collision with root package name */
    private m f28024a = new m(ba.a.b());

    /* renamed from: b, reason: collision with root package name */
    private n f28025b = new n(z9.a.b(), aa.a.b());

    /* renamed from: e, reason: collision with root package name */
    private z7.d f28028e = n7.l.i().e();

    /* renamed from: g, reason: collision with root package name */
    private u8.b f28030g = n7.l.i().r();

    void a(Bundle bundle) {
        if (bundle == null) {
            k9.h.r("handle null message");
            return;
        }
        k9.h.s("NotificationService", "handleMessage: " + bundle.toString());
        if (this.f28025b.b(bundle)) {
            return;
        }
        d dVarA = this.f28026c.a(bundle);
        boolean zI = i(dVarA);
        if (zI && this.f28028e.g()) {
            this.f28030g.a(bundle);
        }
        this.f28025b.a(dVarA, zI);
    }

    public final void b(Bundle bundle) {
        a(bundle);
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            k9.h.r("open null notification");
            return;
        }
        d dVar = new d(bundle);
        try {
            if (k() && this.f28024a.d(bundle)) {
                return;
            }
            this.f28027d.f(dVar);
            l(dVar);
        } finally {
            this.f28024a.b(bundle);
            h(dVar);
        }
    }

    public final void d(Bundle bundle) {
        if (bundle == null) {
            k9.h.r("cancel null notification");
        } else {
            g(new d(bundle));
        }
    }

    public final void e(List list) {
        j(list);
    }

    protected boolean f() {
        return w7.a.g();
    }

    protected void g(d dVar) {
    }

    protected void h(d dVar) {
    }

    protected boolean i(d dVar) {
        return ka.e.d() != null && ka.e.d().u().a() && f();
    }

    protected void j(List list) {
        c(((d) list.get(list.size() - 1)).v());
    }

    protected boolean k() {
        return true;
    }

    protected void l(d dVar) {
        this.f28024a.c(dVar);
    }
}
