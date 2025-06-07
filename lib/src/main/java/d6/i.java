package d6;

import java.io.IOException;

/* loaded from: classes.dex */
class i implements a6.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f22975a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22976b = false;

    /* renamed from: c, reason: collision with root package name */
    private a6.c f22977c;

    /* renamed from: d, reason: collision with root package name */
    private final f f22978d;

    i(f fVar) {
        this.f22978d = fVar;
    }

    private void a() {
        if (this.f22975a) {
            throw new a6.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f22975a = true;
    }

    @Override // a6.g
    public a6.g b(String str) throws IOException {
        a();
        this.f22978d.g(this.f22977c, str, this.f22976b);
        return this;
    }

    @Override // a6.g
    public a6.g c(boolean z10) {
        a();
        this.f22978d.l(this.f22977c, z10, this.f22976b);
        return this;
    }

    void d(a6.c cVar, boolean z10) {
        this.f22975a = false;
        this.f22977c = cVar;
        this.f22976b = z10;
    }
}
