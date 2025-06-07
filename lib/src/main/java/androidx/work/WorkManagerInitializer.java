package androidx.work;

import android.content.Context;
import androidx.work.a;
import b1.j;
import b1.u;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements x0.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3999a = j.i("WrkMgrInitializer");

    @Override // x0.a
    public List a() {
        return Collections.emptyList();
    }

    @Override // x0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u create(Context context) {
        j.e().a(f3999a, "Initializing WorkManager with default configuration.");
        u.h(context, new a.b().a());
        return u.g(context);
    }
}
