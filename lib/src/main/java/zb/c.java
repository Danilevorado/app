package zb;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import hb.l;
import hb.m;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f28931a;
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            l.a aVar = l.f24171m;
            objA = l.a(new a(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            l.a aVar2 = l.f24171m;
            objA = l.a(m.a(th));
        }
        f28931a = (b) (l.b(objA) ? null : objA);
    }

    public static final Handler a(Looper looper, boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
