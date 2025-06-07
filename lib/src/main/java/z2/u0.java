package z2;

import android.content.Context;

/* loaded from: classes.dex */
public final class u0 implements t2.b {

    /* renamed from: a, reason: collision with root package name */
    private final gb.a f28847a;

    /* renamed from: b, reason: collision with root package name */
    private final gb.a f28848b;

    /* renamed from: c, reason: collision with root package name */
    private final gb.a f28849c;

    public u0(gb.a aVar, gb.a aVar2, gb.a aVar3) {
        this.f28847a = aVar;
        this.f28848b = aVar2;
        this.f28849c = aVar3;
    }

    public static u0 a(gb.a aVar, gb.a aVar2, gb.a aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    @Override // gb.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c((Context) this.f28847a.get(), (String) this.f28848b.get(), ((Integer) this.f28849c.get()).intValue());
    }
}
