package ma;

import a9.i;
import a9.j;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private String f25408a = g.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private ea.e f25409b;

    /* renamed from: c, reason: collision with root package name */
    private h f25410c;

    /* renamed from: d, reason: collision with root package name */
    private b f25411d;

    /* renamed from: e, reason: collision with root package name */
    private s9.c f25412e;

    /* renamed from: f, reason: collision with root package name */
    private c f25413f;

    public g(ea.e eVar, h hVar, s9.c cVar, c cVar2) {
        this.f25413f = cVar2;
        this.f25409b = eVar;
        this.f25410c = hVar;
        this.f25412e = cVar;
        i.f(f8.b.class, new j() { // from class: ma.d
            @Override // a9.j
            public final void a(a9.g gVar) {
                this.f25405a.f((f8.b) gVar);
            }
        });
        i.f(f8.d.class, new j() { // from class: ma.f
            @Override // a9.j
            public final void a(a9.g gVar) {
                this.f25407a.h((f8.d) gVar);
            }
        });
        i.f(f8.c.class, new j() { // from class: ma.e
            @Override // a9.j
            public final void a(a9.g gVar) {
                this.f25406a.g((f8.c) gVar);
            }
        });
    }

    private a d(ga.b bVar) {
        return this.f25410c.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(f8.b bVar) {
        k9.h.v(this.f25408a, "handle close RichMedia");
        if (this.f25411d == null) {
            k9.h.v(this.f25408a, "delegate is null");
            return;
        }
        k9.h.v(this.f25408a, "try use delegate onClose");
        q9.b bVarA = bVar.a();
        if (bVarA == null) {
            k9.h.l(this.f25408a, "resource in event is null");
        } else {
            if (i(bVarA)) {
                return;
            }
            this.f25411d.b(this.f25410c.b(bVarA));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(f8.c cVar) {
        if (cVar == null) {
            return;
        }
        if (cVar.a() != null) {
            k9.h.k(cVar.a().getMessage());
        }
        k9.h.v(this.f25408a, "handle error RichMedia");
        if (this.f25411d == null) {
            k9.h.v(this.f25408a, "delegate is null");
            return;
        }
        k9.h.v(this.f25408a, "try use delegate onError");
        q9.b bVarB = cVar.b();
        if (bVarB == null) {
            k9.h.l(this.f25408a, "resource in event is null");
        } else {
            if (i(bVarB)) {
                return;
            }
            this.f25411d.d(this.f25410c.b(bVarB), cVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(f8.d dVar) {
        k9.h.v(this.f25408a, "handle present RichMedia");
        if (this.f25411d == null) {
            k9.h.v(this.f25408a, "delegate is null");
            return;
        }
        k9.h.v(this.f25408a, "try use delegate onPresent");
        q9.b bVarA = dVar.a();
        if (bVarA == null) {
            k9.h.l(this.f25408a, "resource in event is null");
        } else {
            if (i(bVarA)) {
                return;
            }
            this.f25411d.a(this.f25410c.b(bVarA));
        }
    }

    private boolean i(q9.b bVar) {
        if (!TextUtils.isEmpty(bVar.l())) {
            return false;
        }
        k9.h.v(this.f25408a, "code is empty, resource is not RichMedia, abort use delegate");
        return true;
    }

    private boolean j(ga.b bVar) {
        String str;
        String str2;
        q9.b bVarB = bVar.b();
        if (bVarB == null) {
            str = this.f25408a;
            str2 = "resource is null, abort show RichMedia";
        } else {
            if (bVar.c() != ga.a.IN_APP || bVarB.v() || this.f25412e.e(bVarB.l())) {
                return false;
            }
            str = this.f25408a;
            str2 = "resource is not downloaded, abort show RichMedia";
        }
        k9.h.l(str, str2);
        return true;
    }

    private void l(ga.b bVar) {
        if (!j(bVar) && this.f25411d.c(d(bVar))) {
            this.f25409b.c(bVar);
        }
    }

    public c e() {
        return this.f25413f;
    }

    public void k(ga.b bVar) {
        if (this.f25411d != null) {
            l(bVar);
        } else {
            this.f25409b.c(bVar);
        }
    }
}
