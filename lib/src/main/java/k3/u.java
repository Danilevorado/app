package k3;

/* loaded from: classes.dex */
public abstract class u extends d3.c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f24772a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private d3.c f24773b;

    @Override // d3.c, k3.a
    public final void O() {
        synchronized (this.f24772a) {
            d3.c cVar = this.f24773b;
            if (cVar != null) {
                cVar.O();
            }
        }
    }

    @Override // d3.c
    public final void d() {
        synchronized (this.f24772a) {
            d3.c cVar = this.f24773b;
            if (cVar != null) {
                cVar.d();
            }
        }
    }

    @Override // d3.c
    public void e(d3.l lVar) {
        synchronized (this.f24772a) {
            d3.c cVar = this.f24773b;
            if (cVar != null) {
                cVar.e(lVar);
            }
        }
    }

    @Override // d3.c
    public final void g() {
        synchronized (this.f24772a) {
            d3.c cVar = this.f24773b;
            if (cVar != null) {
                cVar.g();
            }
        }
    }

    @Override // d3.c
    public void h() {
        synchronized (this.f24772a) {
            d3.c cVar = this.f24773b;
            if (cVar != null) {
                cVar.h();
            }
        }
    }

    @Override // d3.c
    public final void o() {
        synchronized (this.f24772a) {
            d3.c cVar = this.f24773b;
            if (cVar != null) {
                cVar.o();
            }
        }
    }

    public final void r(d3.c cVar) {
        synchronized (this.f24772a) {
            this.f24773b = cVar;
        }
    }
}
