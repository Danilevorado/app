package n2;

/* loaded from: classes.dex */
public final class b extends q.a {

    /* renamed from: u, reason: collision with root package name */
    private int f25486u;

    @Override // q.g, java.util.Map
    public void clear() {
        this.f25486u = 0;
        super.clear();
    }

    @Override // q.g, java.util.Map
    public int hashCode() {
        if (this.f25486u == 0) {
            this.f25486u = super.hashCode();
        }
        return this.f25486u;
    }

    @Override // q.g
    public void j(q.g gVar) {
        this.f25486u = 0;
        super.j(gVar);
    }

    @Override // q.g
    public Object k(int i10) {
        this.f25486u = 0;
        return super.k(i10);
    }

    @Override // q.g
    public Object l(int i10, Object obj) {
        this.f25486u = 0;
        return super.l(i10, obj);
    }

    @Override // q.g, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f25486u = 0;
        return super.put(obj, obj2);
    }
}
