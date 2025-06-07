package m9;

import a9.o;
import android.text.TextUtils;
import b8.n;
import f8.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private b9.e f25367a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f25368b;

    /* renamed from: c, reason: collision with root package name */
    private final o9.c f25369c;

    /* renamed from: d, reason: collision with root package name */
    private final b f25370d;

    /* renamed from: e, reason: collision with root package name */
    private final r8.b f25371e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f25372f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private final ka.d f25373g;

    public h(final b9.e eVar, s9.d dVar, o9.c cVar, r8.b bVar, s9.c cVar2, ka.d dVar2) {
        this.f25367a = eVar;
        this.f25368b = dVar;
        this.f25369c = cVar;
        this.f25371e = bVar;
        this.f25373g = dVar2;
        this.f25370d = new b(dVar, cVar2);
        a9.i.f(u9.b.class, new a9.j() { // from class: m9.c
            @Override // a9.j
            public final void a(a9.g gVar) {
                h.h(eVar, (u9.b) gVar);
            }
        });
    }

    private String f(o8.b bVar, String str) {
        return (bVar.e() == null || TextUtils.isEmpty(bVar.e().getMessage())) ? str : bVar.e().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(b9.e eVar, u9.b bVar) {
        eVar.e(new m(bVar.a().l(), ka.e.d().m().a(), bVar.a().l()));
        ka.e.d().m().b(null);
    }

    private void k(List list) {
        boolean z10;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            String strM = ((q9.b) it.next()).m();
            if (strM != null && !strM.isEmpty()) {
                z10 = true;
                break;
            }
        }
        this.f25373g.h().b(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(q9.b bVar, a.EnumC0130a[] enumC0130aArr, CountDownLatch countDownLatch, f8.a aVar) {
        if (aVar != null) {
            if ((aVar.b().equals(a.EnumC0130a.DEPLOY_FAILED) || aVar.b().equals(a.EnumC0130a.DEPLOYED)) && aVar.a().equals(bVar.l())) {
                enumC0130aArr[0] = aVar.b();
                countDownLatch.countDown();
            }
        }
    }

    private boolean m(q9.b bVar) {
        if (this.f25370d.a(bVar)) {
            return true;
        }
        return this.f25369c.h(bVar) ? t(bVar) : !this.f25369c.a(Collections.singletonList(bVar)).b().isEmpty();
    }

    private o9.a o(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q9.b bVar = (q9.b) it.next();
            if (!this.f25370d.a(bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList.isEmpty() ? o9.a.a() : this.f25369c.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(o8.a aVar, o8.b bVar) {
        if (aVar == null) {
            return;
        }
        j jVar = (j) bVar.d();
        if (jVar != null) {
            aVar.a(o8.b.b((jVar.c() == null && jVar.d()) ? new q9.b(jVar.a(), jVar.d()) : jVar.c()));
            return;
        }
        b9.a aVar2 = (b9.a) bVar.e();
        if (aVar2 == null) {
            return;
        }
        aVar.a(o8.b.c(new e8.b(aVar2.getMessage())));
        k9.h.y("[InApp]InAppRepository", aVar2.getMessage(), aVar2);
    }

    private String q(o8.b bVar) {
        return f(bVar, "an error occurred during /registerUser request");
    }

    private boolean t(final q9.b bVar) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final a.EnumC0130a[] enumC0130aArr = {a.EnumC0130a.DEPLOY_FAILED};
        o oVarF = a9.i.f(f8.a.class, new a9.j() { // from class: m9.d
            @Override // a9.j
            public final void a(a9.g gVar) {
                h.l(bVar, enumC0130aArr, countDownLatch, (f8.a) gVar);
            }
        });
        try {
            countDownLatch.await();
            oVarF.a();
            return enumC0130aArr[0].equals(a.EnumC0130a.DEPLOYED);
        } catch (InterruptedException e5) {
            k9.h.n("Deploy interrupted", e5);
            return false;
        }
    }

    private boolean u() {
        if (this.f25367a != null) {
            return true;
        }
        b9.e eVarA = b9.b.a();
        this.f25367a = eVarA;
        return eVarA != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(o8.a aVar, o8.b bVar) {
        if (aVar == null) {
            return;
        }
        if (bVar.f()) {
            aVar.a(o8.b.b((Void) bVar.d()));
        } else if (bVar.e() != null) {
            aVar.a(o8.b.c(new s7.c(((b9.a) bVar.e()).getMessage())));
            k9.h.y("[InApp]InAppRepository", ((b9.a) bVar.e()).getMessage(), bVar.e());
        }
    }

    private boolean w() throws InterruptedException, TimeoutException {
        k9.h.u("Wait until getInApps finished");
        for (int i10 = 0; !this.f25372f.get() && i10 < 25; i10++) {
            Thread.sleep(200L);
        }
        if (this.f25372f.get()) {
            return true;
        }
        throw new TimeoutException("InApp wait timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(o8.a aVar, o8.b bVar) {
        if (aVar == null) {
            return;
        }
        aVar.a(bVar.f() ? o8.b.b(Boolean.TRUE) : o8.b.c(new e8.e(q(bVar))));
    }

    public o8.b g(String str) {
        try {
            q9.b bVarD = q9.b.d(str);
            if (m(bVarD)) {
                return o8.b.b(bVarD);
            }
            return o8.b.c(new p8.a("Can't download or update richMedia: " + bVarD.l()));
        } catch (p8.a e5) {
            return o8.b.c(e5);
        }
    }

    public void i(String str, String str2, String str3, String str4, int i10, final o8.a aVar) {
        b9.e eVar;
        l lVar = new l(str, str2, str3, str4, i10);
        if (u() && (eVar = this.f25367a) != null) {
            eVar.b(lVar, new o8.a() { // from class: m9.g
                @Override // o8.a
                public final void a(o8.b bVar) {
                    h.v(aVar, bVar);
                }
            });
        } else if (aVar != null) {
            aVar.a(o8.b.c(new s7.c("Request Manager is null")));
        }
    }

    public void j(String str, sa.b bVar, final o8.a aVar) {
        b9.e eVar;
        i iVar = new i(str, n7.l.i().t().r(), bVar);
        if (u() && (eVar = this.f25367a) != null) {
            eVar.b(iVar, new o8.a() { // from class: m9.f
                @Override // o8.a
                public final void a(o8.b bVar2) {
                    h.p(aVar, bVar2);
                }
            });
        } else if (aVar != null) {
            aVar.a(o8.b.c(new e8.b("Request Manager is null")));
        }
    }

    public o8.b n(q9.b bVar) {
        k9.h.u("mapToHtmlData for resource " + bVar.l() + " inApp is required: " + bVar.v() + " inAppLoaded: " + this.f25372f.get());
        if (bVar.u()) {
            try {
                if (this.f25372f.get() || (bVar.v() && w())) {
                    q9.b bVarC = this.f25368b.c(bVar.l());
                    if (bVarC == null) {
                        return o8.b.c(new p8.a(String.format("Rich media with code %s does not exist.", bVar.l())));
                    }
                    bVar = bVarC;
                }
            } catch (Exception e5) {
                return o8.b.c(new p8.a(String.format("Can't download or update richMedia: %s", bVar.l()), e5));
            }
        }
        if (this.f25370d.a(bVar) || m(bVar)) {
            try {
                return o8.b.b(this.f25371e.d(bVar));
            } catch (IOException e10) {
                return o8.b.c(new p8.a(String.format("Can't mapping resource %s to htmlData", bVar.l()), e10));
            }
        }
        return o8.b.c(new p8.a("Can't download or update richMedia: " + bVar.l()));
    }

    public o8.b r() {
        b9.a aVar;
        o8.b bVarC;
        b9.e eVar;
        try {
            a aVar2 = new a();
            if (!u() || (eVar = this.f25367a) == null) {
                aVar = new b9.a("Request Manager is null");
            } else {
                o8.b bVarD = eVar.d(aVar2);
                List list = (List) bVarD.d();
                if (bVarD.f()) {
                    if (list != null && !list.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(this.f25368b.f(list));
                        n.f(list);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            this.f25369c.g((String) it.next());
                        }
                        k(list);
                        o(list);
                    }
                    bVarC = o8.b.b(null);
                    return bVarC;
                }
                aVar = (b9.a) bVarD.e();
            }
            bVarC = o8.b.c(aVar);
            return bVarC;
        } finally {
            this.f25372f.set(true);
        }
    }

    public void s(String str, final o8.a aVar) {
        b9.e eVar;
        k kVar = new k(str);
        if (!u() || (eVar = this.f25367a) == null) {
            return;
        }
        eVar.b(kVar, new o8.a() { // from class: m9.e
            @Override // o8.a
            public final void a(o8.b bVar) {
                this.f25363a.x(aVar, bVar);
            }
        });
    }
}
