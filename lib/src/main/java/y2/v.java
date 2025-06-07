package y2;

import a3.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f28524a;

    /* renamed from: b, reason: collision with root package name */
    private final z2.d f28525b;

    /* renamed from: c, reason: collision with root package name */
    private final x f28526c;

    /* renamed from: d, reason: collision with root package name */
    private final a3.b f28527d;

    v(Executor executor, z2.d dVar, x xVar, a3.b bVar) {
        this.f28524a = executor;
        this.f28525b = dVar;
        this.f28526c = xVar;
        this.f28527d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator it = this.f28525b.C().iterator();
        while (it.hasNext()) {
            this.f28526c.b((r2.o) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f28527d.a(new b.a() { // from class: y2.t
            @Override // a3.b.a
            public final Object a() {
                return this.f28522a.d();
            }
        });
    }

    public void c() {
        this.f28524a.execute(new Runnable() { // from class: y2.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f28523m.e();
            }
        });
    }
}
