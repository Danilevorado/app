package n7;

import android.content.Context;
import b1.b;

/* loaded from: classes.dex */
public abstract class m {
    private static b1.u a() {
        try {
            return (b1.u) b1.u.class.getMethod("g", Context.class).invoke(null, c9.a.b());
        } catch (NoSuchMethodException | NullPointerException e5) {
            if (e5 instanceof NullPointerException) {
                k9.h.k("Incorrect state of app. Context is null");
            }
            return b1.u.f();
        }
    }

    public static void b(b1.l lVar, String str, b1.d dVar) {
        try {
            a().d(str, dVar, lVar);
        } catch (Exception e5) {
            k9.h.k("Failed to enqueue work.");
            e5.printStackTrace();
        }
    }

    public static b1.b c() {
        return new b.a().b(b1.k.CONNECTED).a();
    }
}
