package o4;

import android.content.Context;

/* loaded from: classes.dex */
public final class r implements x3.b {

    /* renamed from: a, reason: collision with root package name */
    private final x3.b f25753a;

    /* renamed from: b, reason: collision with root package name */
    private final x3.b f25754b;

    public r(Context context) {
        this.f25753a = new p(context, b4.f.h());
        this.f25754b = l.d(context);
    }

    public static /* synthetic */ b5.i b(r rVar, b5.i iVar) {
        if (iVar.n() || iVar.l()) {
            return iVar;
        }
        Exception excI = iVar.i();
        if (!(excI instanceof c4.a)) {
            return iVar;
        }
        int iB = ((c4.a) excI).b();
        return (iB == 43001 || iB == 43002 || iB == 43003 || iB == 17) ? rVar.f25754b.a() : iB == 43000 ? b5.l.d(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : iB != 15 ? iVar : b5.l.d(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // x3.b
    public final b5.i a() {
        return this.f25753a.a().g(new b5.a() { // from class: o4.q
            @Override // b5.a
            public final Object a(b5.i iVar) {
                return r.b(this.f25752a, iVar);
            }
        });
    }
}
