package e;

import android.content.Context;
import android.content.Intent;
import rb.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: e.a$a, reason: collision with other inner class name */
    public static final class C0121a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f23001a;

        public C0121a(Object obj) {
            this.f23001a = obj;
        }

        public final Object a() {
            return this.f23001a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0121a b(Context context, Object obj) {
        h.e(context, "context");
        return null;
    }

    public abstract Object c(int i10, Intent intent);
}
