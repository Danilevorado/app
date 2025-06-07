package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kb.a;
import kb.e;
import yb.d;

@Keep
/* loaded from: classes2.dex */
public final class AndroidExceptionPreHandler extends a implements d {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(d.f28601k);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z10 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z10 = true;
                }
            }
            if (z10) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // yb.d
    public void handleException(e eVar, Throwable th) {
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 28) {
            Method methodPreHandler = preHandler();
            Object objInvoke = methodPreHandler == null ? null : methodPreHandler.invoke(null, new Object[0]);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
            if (uncaughtExceptionHandler == null) {
                return;
            }
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
