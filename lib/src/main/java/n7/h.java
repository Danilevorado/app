package n7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import sa.b;

/* loaded from: classes.dex */
public class h {

    /* renamed from: e, reason: collision with root package name */
    public static final String f25538e = "GDPRManager";

    /* renamed from: a, reason: collision with root package name */
    private n9.o f25539a;

    /* renamed from: b, reason: collision with root package name */
    private w9.f f25540b;

    /* renamed from: c, reason: collision with root package name */
    private y7.e f25541c;

    /* renamed from: d, reason: collision with root package name */
    private Set f25542d = new HashSet(Arrays.asList("Application Version", "Language", "Last Application Open", "First Install"));

    h(n9.o oVar, w9.f fVar, y7.e eVar) {
        this.f25539a = oVar;
        this.f25540b = fVar;
        this.f25541c = eVar;
    }

    private sa.b h(sa.b bVar) {
        b.a aVar = new b.a();
        Iterator it = bVar.a().keySet().iterator();
        while (it.hasNext()) {
            aVar.g((String) it.next(), null);
        }
        return aVar.b();
    }

    private void i(o8.a aVar) {
        k9.h.h(f25538e, "The GDPR solution isn’t available for this account");
        if (aVar == null) {
            return;
        }
        aVar.a(o8.b.c(new e8.c("The GDPR solution isn’t available for this account")));
    }

    private void j(o8.a aVar, e8.c cVar) {
        if (aVar == null) {
            return;
        }
        aVar.a(cVar != null ? o8.b.c(cVar) : o8.b.b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void t(o8.b bVar, final o8.a aVar) {
        if (bVar.f()) {
            this.f25539a.h(new o8.a() { // from class: n7.c
                @Override // o8.a
                public final void a(o8.b bVar2) {
                    this.f25527a.r(aVar, bVar2);
                }
            });
            return;
        }
        if (aVar != null) {
            aVar.a(o8.b.c(bVar.e()));
        }
        k9.h.m(f25538e, "cant remove all device data", bVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m(boolean z10, o8.b bVar, final o8.a aVar) {
        if (bVar.f()) {
            this.f25539a.l(z10);
            if (z10) {
                this.f25540b.e(new o8.a() { // from class: n7.e
                    @Override // o8.a
                    public final void a(o8.b bVar2) {
                        this.f25531a.o(aVar, bVar2);
                    }
                }, true, null);
                return;
            } else {
                this.f25540b.d(new o8.a() { // from class: n7.f
                    @Override // o8.a
                    public final void a(o8.b bVar2) {
                        this.f25533a.q(aVar, bVar2);
                    }
                });
                return;
            }
        }
        k9.h.m(f25538e, "cant set Communication Enable to " + z10, bVar.e());
        if (aVar != null) {
            aVar.a(o8.b.c(bVar.e()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(o8.a aVar, o8.b bVar) {
        j(aVar, bVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(o8.b bVar, final o8.a aVar) {
        if (bVar.f()) {
            this.f25540b.d(new o8.a() { // from class: n7.a
                @Override // o8.a
                public final void a(o8.b bVar2) {
                    this.f25523a.s(aVar, bVar2);
                }
            });
        } else if (aVar != null) {
            aVar.a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(o8.a aVar, o8.b bVar) {
        j(aVar, bVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(o8.a aVar, o8.b bVar) {
        j(aVar, bVar.e());
        if (bVar.f()) {
            this.f25539a.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void r(final o8.a aVar, o8.b bVar) {
        if (bVar.f()) {
            this.f25539a.k(h((sa.b) bVar.d()), new o8.a() { // from class: n7.d
                @Override // o8.a
                public final void a(o8.b bVar2) {
                    this.f25529a.k(aVar, bVar2);
                }
            });
        } else if (aVar != null) {
            aVar.a(o8.b.c(bVar.e()));
        }
    }

    public static h v() {
        return l.i().f();
    }

    public void A(final boolean z10, final o8.a aVar) {
        if (!w()) {
            i(aVar);
        } else {
            this.f25541c.f("GDPRConsent", new b.a().e("channel", z10).f("device_type", 3).b(), new o8.a() { // from class: n7.g
                @Override // o8.a
                public final void a(o8.b bVar) {
                    this.f25535a.m(z10, aVar, bVar);
                }
            });
        }
    }

    public boolean w() {
        k9.h.h(f25538e, "isAvailable");
        return this.f25539a.w();
    }

    public boolean x() {
        k9.h.h(f25538e, "isCommunicationEnabled");
        return this.f25539a.u();
    }

    public boolean y() {
        k9.h.h(f25538e, "isDeviceDataRemoved");
        return this.f25539a.v();
    }

    public void z(final o8.a aVar) {
        if (!w()) {
            i(aVar);
            return;
        }
        sa.b bVarB = new b.a().e("status", true).f("device_type", 3).b();
        y7.e eVar = this.f25541c;
        if (eVar != null) {
            eVar.f("GDPRDelete", bVarB, new o8.a() { // from class: n7.b
                @Override // o8.a
                public final void a(o8.b bVar) {
                    this.f25525a.t(aVar, bVar);
                }
            });
        }
    }
}
