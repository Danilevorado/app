package g8;

import a9.j;
import a9.o;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    private static i f23894d;

    /* renamed from: a, reason: collision with root package name */
    private final o8.a f23895a;

    /* renamed from: b, reason: collision with root package name */
    private o f23896b;

    /* renamed from: c, reason: collision with root package name */
    private o f23897c;

    private i(o8.a aVar) {
        this.f23895a = aVar;
    }

    public static void c(o8.a aVar, boolean z10) {
        i iVar;
        boolean z11;
        if (aVar == null) {
            return;
        }
        if (!z10) {
            iVar = new i(aVar);
            z11 = false;
        } else {
            if (f23894d != null) {
                return;
            }
            iVar = new i(aVar);
            f23894d = iVar;
            z11 = true;
        }
        iVar.d(z11);
    }

    private void d(final boolean z10) {
        this.f23896b = a9.i.f(y9.d.class, new j() { // from class: g8.h
            @Override // a9.j
            public final void a(a9.g gVar) {
                this.f23892a.f(z10, (y9.d) gVar);
            }
        });
        this.f23897c = a9.i.f(y9.c.class, new j() { // from class: g8.g
            @Override // a9.j
            public final void a(a9.g gVar) {
                this.f23890a.e(z10, (y9.c) gVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(boolean z10, y9.c cVar) {
        g(z10);
        this.f23895a.a(o8.b.c(new e8.d((String) cVar.a())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(boolean z10, y9.d dVar) {
        g(z10);
        this.f23895a.a(o8.b.b((n7.o) dVar.a()));
    }

    private void g(boolean z10) {
        o oVar = this.f23896b;
        if (oVar != null) {
            oVar.a();
        }
        o oVar2 = this.f23897c;
        if (oVar2 != null) {
            oVar2.a();
        }
        if (z10) {
            f23894d = null;
        }
    }
}
