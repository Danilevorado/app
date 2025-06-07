package m9;

import java.io.File;

/* loaded from: classes2.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final s9.d f25357a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.c f25358b;

    b(s9.d dVar, s9.c cVar) {
        this.f25357a = dVar;
        this.f25358b = cVar;
    }

    public boolean a(q9.b bVar) {
        q9.b bVarC = this.f25357a.c(bVar.l());
        File fileB = this.f25358b.b(bVar.l());
        return bVarC != null && bVarC.r() == bVar.r() && fileB != null && fileB.exists();
    }
}
