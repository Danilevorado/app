package x2;

import android.content.Context;
import y2.x;

/* loaded from: classes.dex */
public final class i implements t2.b {

    /* renamed from: a, reason: collision with root package name */
    private final gb.a f28242a;

    /* renamed from: b, reason: collision with root package name */
    private final gb.a f28243b;

    /* renamed from: c, reason: collision with root package name */
    private final gb.a f28244c;

    /* renamed from: d, reason: collision with root package name */
    private final gb.a f28245d;

    public i(gb.a aVar, gb.a aVar2, gb.a aVar3, gb.a aVar4) {
        this.f28242a = aVar;
        this.f28243b = aVar2;
        this.f28244c = aVar3;
        this.f28245d = aVar4;
    }

    public static i a(gb.a aVar, gb.a aVar2, gb.a aVar3, gb.a aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, z2.d dVar, y2.f fVar, b3.a aVar) {
        return (x) t2.d.c(h.a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // gb.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f28242a.get(), (z2.d) this.f28243b.get(), (y2.f) this.f28244c.get(), (b3.a) this.f28245d.get());
    }
}
