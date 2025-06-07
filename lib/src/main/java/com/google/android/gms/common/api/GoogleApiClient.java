package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.c1;
import com.google.android.gms.common.api.internal.d0;
import d4.e;
import d4.f0;
import d4.g;
import e4.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
/* loaded from: classes.dex */
public abstract class GoogleApiClient {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f5571a = Collections.newSetFromMap(new WeakHashMap());

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f5572a;

        /* renamed from: d, reason: collision with root package name */
        private int f5575d;

        /* renamed from: e, reason: collision with root package name */
        private View f5576e;

        /* renamed from: f, reason: collision with root package name */
        private String f5577f;

        /* renamed from: g, reason: collision with root package name */
        private String f5578g;

        /* renamed from: i, reason: collision with root package name */
        private final Context f5580i;

        /* renamed from: k, reason: collision with root package name */
        private e f5582k;

        /* renamed from: m, reason: collision with root package name */
        private c f5584m;

        /* renamed from: n, reason: collision with root package name */
        private Looper f5585n;

        /* renamed from: b, reason: collision with root package name */
        private final Set f5573b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set f5574c = new HashSet();

        /* renamed from: h, reason: collision with root package name */
        private final Map f5579h = new q.a();

        /* renamed from: j, reason: collision with root package name */
        private final Map f5581j = new q.a();

        /* renamed from: l, reason: collision with root package name */
        private int f5583l = -1;

        /* renamed from: o, reason: collision with root package name */
        private b4.e f5586o = b4.e.p();

        /* renamed from: p, reason: collision with root package name */
        private a.AbstractC0091a f5587p = y4.d.f28548c;

        /* renamed from: q, reason: collision with root package name */
        private final ArrayList f5588q = new ArrayList();

        /* renamed from: r, reason: collision with root package name */
        private final ArrayList f5589r = new ArrayList();

        public a(Context context) {
            this.f5580i = context;
            this.f5585n = context.getMainLooper();
            this.f5577f = context.getPackageName();
            this.f5578g = context.getClass().getName();
        }

        public a a(com.google.android.gms.common.api.a aVar) {
            p.m(aVar, "Api must not be null");
            this.f5581j.put(aVar, null);
            List listA = ((a.e) p.m(aVar.c(), "Base client builder must not be null")).a(null);
            this.f5574c.addAll(listA);
            this.f5573b.addAll(listA);
            return this;
        }

        public a b(b bVar) {
            p.m(bVar, "Listener must not be null");
            this.f5588q.add(bVar);
            return this;
        }

        public a c(c cVar) {
            p.m(cVar, "Listener must not be null");
            this.f5589r.add(cVar);
            return this;
        }

        public GoogleApiClient d() {
            p.b(!this.f5581j.isEmpty(), "must call addApi() to add at least one API");
            e4.e eVarF = f();
            Map mapI = eVarF.i();
            q.a aVar = new q.a();
            q.a aVar2 = new q.a();
            ArrayList arrayList = new ArrayList();
            com.google.android.gms.common.api.a aVar3 = null;
            boolean z10 = false;
            for (com.google.android.gms.common.api.a aVar4 : this.f5581j.keySet()) {
                Object obj = this.f5581j.get(aVar4);
                boolean z11 = mapI.get(aVar4) != null;
                aVar.put(aVar4, Boolean.valueOf(z11));
                f0 f0Var = new f0(aVar4, z11);
                arrayList.add(f0Var);
                a.AbstractC0091a abstractC0091a = (a.AbstractC0091a) p.l(aVar4.a());
                a.f fVarC = abstractC0091a.c(this.f5580i, this.f5585n, eVarF, obj, f0Var, f0Var);
                aVar2.put(aVar4.b(), fVarC);
                if (abstractC0091a.b() == 1) {
                    z10 = obj != null;
                }
                if (fVarC.c()) {
                    if (aVar3 != null) {
                        throw new IllegalStateException(aVar4.d() + " cannot be used with " + aVar3.d());
                    }
                    aVar3 = aVar4;
                }
            }
            if (aVar3 != null) {
                if (z10) {
                    throw new IllegalStateException("With using " + aVar3.d() + ", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                }
                p.q(this.f5572a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar3.d());
                p.q(this.f5573b.equals(this.f5574c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar3.d());
            }
            d0 d0Var = new d0(this.f5580i, new ReentrantLock(), this.f5585n, eVarF, this.f5586o, this.f5587p, aVar, this.f5588q, this.f5589r, aVar2, this.f5583l, d0.m(aVar2.values(), true), arrayList);
            synchronized (GoogleApiClient.f5571a) {
                GoogleApiClient.f5571a.add(d0Var);
            }
            if (this.f5583l >= 0) {
                c1.t(this.f5582k).u(this.f5583l, d0Var, this.f5584m);
            }
            return d0Var;
        }

        public a e(Handler handler) {
            p.m(handler, "Handler must not be null");
            this.f5585n = handler.getLooper();
            return this;
        }

        public final e4.e f() {
            y4.a aVar = y4.a.f28536k;
            Map map = this.f5581j;
            com.google.android.gms.common.api.a aVar2 = y4.d.f28552g;
            if (map.containsKey(aVar2)) {
                aVar = (y4.a) this.f5581j.get(aVar2);
            }
            return new e4.e(this.f5572a, this.f5573b, this.f5579h, this.f5575d, this.f5576e, this.f5577f, this.f5578g, aVar, false);
        }
    }

    public interface b extends d4.d {
    }

    public interface c extends g {
    }

    public abstract void connect();

    public abstract void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void disconnect();

    public com.google.android.gms.common.api.internal.b e(com.google.android.gms.common.api.internal.b bVar) {
        throw new UnsupportedOperationException();
    }

    public a.f f(a.c cVar) {
        throw new UnsupportedOperationException();
    }

    public Context g() {
        throw new UnsupportedOperationException();
    }

    public Looper h() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean i();

    public abstract void j(c cVar);

    public abstract void k(c cVar);
}
