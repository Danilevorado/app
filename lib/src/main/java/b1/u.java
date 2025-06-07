package b1;

import android.content.Context;
import androidx.work.impl.e0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class u {
    protected u() {
    }

    public static u f() {
        e0 e0VarM = e0.m();
        if (e0VarM != null) {
            return e0VarM;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public static u g(Context context) {
        return e0.n(context);
    }

    public static void h(Context context, androidx.work.a aVar) {
        e0.h(context, aVar);
    }

    public abstract m a(String str);

    public final m b(v vVar) {
        return c(Collections.singletonList(vVar));
    }

    public abstract m c(List list);

    public m d(String str, d dVar, l lVar) {
        return e(str, dVar, Collections.singletonList(lVar));
    }

    public abstract m e(String str, d dVar, List list);
}
