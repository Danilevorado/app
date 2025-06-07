package x2;

import a3.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import r2.o;
import r2.t;
import s2.m;
import y2.x;

/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f28230f = Logger.getLogger(t.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final x f28231a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f28232b;

    /* renamed from: c, reason: collision with root package name */
    private final s2.e f28233c;

    /* renamed from: d, reason: collision with root package name */
    private final z2.d f28234d;

    /* renamed from: e, reason: collision with root package name */
    private final a3.b f28235e;

    public c(Executor executor, s2.e eVar, x xVar, z2.d dVar, a3.b bVar) {
        this.f28232b = executor;
        this.f28233c = eVar;
        this.f28231a = xVar;
        this.f28234d = dVar;
        this.f28235e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(o oVar, r2.i iVar) {
        this.f28234d.F(oVar, iVar);
        this.f28231a.b(oVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final o oVar, p2.h hVar, r2.i iVar) {
        try {
            m mVarA = this.f28233c.a(oVar.b());
            if (mVarA == null) {
                String str = String.format("Transport backend '%s' is not registered", oVar.b());
                f28230f.warning(str);
                hVar.a(new IllegalArgumentException(str));
            } else {
                final r2.i iVarB = mVarA.b(iVar);
                this.f28235e.a(new b.a() { // from class: x2.a
                    @Override // a3.b.a
                    public final Object a() {
                        return this.f28223a.d(oVar, iVarB);
                    }
                });
                hVar.a(null);
            }
        } catch (Exception e5) {
            f28230f.warning("Error scheduling event " + e5.getMessage());
            hVar.a(e5);
        }
    }

    @Override // x2.e
    public void a(final o oVar, final r2.i iVar, final p2.h hVar) {
        this.f28232b.execute(new Runnable() { // from class: x2.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f28226m.e(oVar, hVar, iVar);
            }
        });
    }
}
