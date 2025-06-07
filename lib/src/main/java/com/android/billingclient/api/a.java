package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.e;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    public static final class C0088a {

        /* renamed from: a, reason: collision with root package name */
        private volatile e f5131a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f5132b;

        /* renamed from: c, reason: collision with root package name */
        private volatile k1.g f5133c;

        /* renamed from: d, reason: collision with root package name */
        private volatile k1.i f5134d;

        /* renamed from: e, reason: collision with root package name */
        private volatile boolean f5135e;

        /* renamed from: f, reason: collision with root package name */
        private volatile boolean f5136f;

        /* synthetic */ C0088a(Context context, k1.b0 b0Var) {
            this.f5132b = context;
        }

        public a a() {
            if (this.f5132b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f5133c != null) {
                if (this.f5131a == null || !this.f5131a.a()) {
                    throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
                }
                return this.f5133c != null ? this.f5134d == null ? new b((String) null, this.f5131a, this.f5132b, this.f5133c, (k1.p) null, (u) null, (ExecutorService) null) : new b((String) null, this.f5131a, this.f5132b, this.f5133c, this.f5134d, (u) null, (ExecutorService) null) : new b(null, this.f5131a, this.f5132b, null, null, null);
            }
            if (this.f5134d != null) {
                throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
            }
            if (this.f5135e || this.f5136f) {
                return new b(null, this.f5132b, null, null);
            }
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }

        public C0088a b() {
            e.a aVarC = e.c();
            aVarC.b();
            c(aVarC.a());
            return this;
        }

        public C0088a c(e eVar) {
            this.f5131a = eVar;
            return this;
        }

        public C0088a d(k1.g gVar) {
            this.f5133c = gVar;
            return this;
        }
    }

    public static C0088a e(Context context) {
        return new C0088a(context, null);
    }

    public abstract void a(k1.a aVar, k1.b bVar);

    public abstract void b(k1.d dVar, k1.e eVar);

    public abstract boolean c();

    public abstract d d(Activity activity, c cVar);

    public abstract void f(String str, k1.f fVar);

    public abstract void g(f fVar, k1.h hVar);

    public abstract void h(k1.c cVar);
}
