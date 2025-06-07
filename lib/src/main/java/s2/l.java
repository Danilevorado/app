package s2;

import android.content.Context;

/* loaded from: classes.dex */
public final class l implements t2.b {

    /* renamed from: a, reason: collision with root package name */
    private final gb.a f26761a;

    /* renamed from: b, reason: collision with root package name */
    private final gb.a f26762b;

    public l(gb.a aVar, gb.a aVar2) {
        this.f26761a = aVar;
        this.f26762b = aVar2;
    }

    public static l a(gb.a aVar, gb.a aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // gb.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f26761a.get(), this.f26762b.get());
    }
}
