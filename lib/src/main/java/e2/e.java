package e2;

/* loaded from: classes.dex */
public class e extends c2.c {
    public e(c cVar) {
        super(cVar);
    }

    @Override // t1.v
    public int a() {
        return ((c) this.f4665m).i();
    }

    @Override // t1.v
    public Class b() {
        return c.class;
    }

    @Override // t1.v
    public void c() {
        ((c) this.f4665m).stop();
        ((c) this.f4665m).k();
    }

    @Override // c2.c, t1.r
    public void initialize() {
        ((c) this.f4665m).e().prepareToDraw();
    }
}
