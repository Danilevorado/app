package q2;

import q2.o;

/* loaded from: classes.dex */
final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    private final o.c f26239a;

    /* renamed from: b, reason: collision with root package name */
    private final o.b f26240b;

    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private o.c f26241a;

        /* renamed from: b, reason: collision with root package name */
        private o.b f26242b;

        b() {
        }

        @Override // q2.o.a
        public o a() {
            return new i(this.f26241a, this.f26242b);
        }

        @Override // q2.o.a
        public o.a b(o.b bVar) {
            this.f26242b = bVar;
            return this;
        }

        @Override // q2.o.a
        public o.a c(o.c cVar) {
            this.f26241a = cVar;
            return this;
        }
    }

    private i(o.c cVar, o.b bVar) {
        this.f26239a = cVar;
        this.f26240b = bVar;
    }

    @Override // q2.o
    public o.b b() {
        return this.f26240b;
    }

    @Override // q2.o
    public o.c c() {
        return this.f26239a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f26239a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f26240b;
            o.b bVarB = oVar.b();
            if (bVar == null) {
                if (bVarB == null) {
                    return true;
                }
            } else if (bVar.equals(bVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f26239a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f26240b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f26239a + ", mobileSubtype=" + this.f26240b + "}";
    }
}
