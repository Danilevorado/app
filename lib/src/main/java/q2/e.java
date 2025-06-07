package q2;

import q2.k;

/* loaded from: classes.dex */
final class e extends k {

    /* renamed from: a, reason: collision with root package name */
    private final k.b f26206a;

    /* renamed from: b, reason: collision with root package name */
    private final q2.a f26207b;

    static final class b extends k.a {

        /* renamed from: a, reason: collision with root package name */
        private k.b f26208a;

        /* renamed from: b, reason: collision with root package name */
        private q2.a f26209b;

        b() {
        }

        @Override // q2.k.a
        public k a() {
            return new e(this.f26208a, this.f26209b);
        }

        @Override // q2.k.a
        public k.a b(q2.a aVar) {
            this.f26209b = aVar;
            return this;
        }

        @Override // q2.k.a
        public k.a c(k.b bVar) {
            this.f26208a = bVar;
            return this;
        }
    }

    private e(k.b bVar, q2.a aVar) {
        this.f26206a = bVar;
        this.f26207b = aVar;
    }

    @Override // q2.k
    public q2.a b() {
        return this.f26207b;
    }

    @Override // q2.k
    public k.b c() {
        return this.f26206a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f26206a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            q2.a aVar = this.f26207b;
            q2.a aVarB = kVar.b();
            if (aVar == null) {
                if (aVarB == null) {
                    return true;
                }
            } else if (aVar.equals(aVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f26206a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        q2.a aVar = this.f26207b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f26206a + ", androidClientInfo=" + this.f26207b + "}";
    }
}
