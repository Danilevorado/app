package z2;

import android.content.Context;

/* loaded from: classes.dex */
public final class h implements t2.b {

    /* renamed from: a, reason: collision with root package name */
    private final gb.a f28787a;

    public h(gb.a aVar) {
        this.f28787a = aVar;
    }

    public static h a(gb.a aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) t2.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // gb.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f28787a.get());
    }
}
