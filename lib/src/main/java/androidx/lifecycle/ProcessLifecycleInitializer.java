package androidx.lifecycle;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements x0.a {
    @Override // x0.a
    public List a() {
        return Collections.emptyList();
    }

    @Override // x0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n create(Context context) {
        if (!androidx.startup.a.e(context).g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
        }
        k.a(context);
        v.k(context);
        return v.j();
    }
}
