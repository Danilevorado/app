package w5;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.u2;
import e4.p;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f27940c;

    /* renamed from: a, reason: collision with root package name */
    final w4.a f27941a;

    /* renamed from: b, reason: collision with root package name */
    final Map f27942b;

    b(w4.a aVar) {
        p.l(aVar);
        this.f27941a = aVar;
        this.f27942b = new ConcurrentHashMap();
    }

    public static a c(v5.d dVar, Context context, e6.d dVar2) {
        p.l(dVar);
        p.l(context);
        p.l(dVar2);
        p.l(context.getApplicationContext());
        if (f27940c == null) {
            synchronized (b.class) {
                if (f27940c == null) {
                    Bundle bundle = new Bundle(1);
                    if (dVar.r()) {
                        dVar2.a(v5.a.class, new Executor() { // from class: w5.c
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new e6.b() { // from class: w5.d
                            @Override // e6.b
                            public final void a(e6.a aVar) {
                                b.d(aVar);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", dVar.q());
                    }
                    f27940c = new b(u2.s(context, null, null, null, bundle).p());
                }
            }
        }
        return f27940c;
    }

    static /* synthetic */ void d(e6.a aVar) {
        throw null;
    }

    @Override // w5.a
    public void a(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.d(str) && com.google.firebase.analytics.connector.internal.b.e(str, str2)) {
            this.f27941a.t(str, str2, obj);
        }
    }

    @Override // w5.a
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.d(str) && com.google.firebase.analytics.connector.internal.b.c(str2, bundle) && com.google.firebase.analytics.connector.internal.b.b(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.b.a(str, str2, bundle);
            this.f27941a.n(str, str2, bundle);
        }
    }
}
