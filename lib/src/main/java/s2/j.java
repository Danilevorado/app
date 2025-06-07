package s2;

import android.content.Context;

/* loaded from: classes.dex */
public final class j implements t2.b {

    /* renamed from: a, reason: collision with root package name */
    private final gb.a f26753a;

    /* renamed from: b, reason: collision with root package name */
    private final gb.a f26754b;

    /* renamed from: c, reason: collision with root package name */
    private final gb.a f26755c;

    public j(gb.a aVar, gb.a aVar2, gb.a aVar3) {
        this.f26753a = aVar;
        this.f26754b = aVar2;
        this.f26755c = aVar3;
    }

    public static j a(gb.a aVar, gb.a aVar2, gb.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, b3.a aVar, b3.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // gb.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f26753a.get(), (b3.a) this.f26754b.get(), (b3.a) this.f26755c.get());
    }
}
