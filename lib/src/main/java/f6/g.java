package f6;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.n;
import f6.k;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import x5.q;

/* loaded from: classes.dex */
public class g implements j, k {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadFactory f23644f = new ThreadFactory() { // from class: f6.e
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return g.m(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final h6.b f23645a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f23646b;

    /* renamed from: c, reason: collision with root package name */
    private final h6.b f23647c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f23648d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f23649e;

    private g(final Context context, final String str, Set set, h6.b bVar) {
        this(new h6.b() { // from class: f6.b
            @Override // h6.b
            public final Object get() {
                return g.k(context, str);
            }
        }, set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f23644f), bVar, context);
    }

    g(h6.b bVar, Set set, Executor executor, h6.b bVar2, Context context) {
        this.f23645a = bVar;
        this.f23648d = set;
        this.f23649e = executor;
        this.f23647c = bVar2;
        this.f23646b = context;
    }

    public static x5.d h() {
        return x5.d.d(g.class, j.class, k.class).b(q.i(Context.class)).b(q.i(v5.d.class)).b(q.k(h.class)).b(q.j(q6.i.class)).f(new x5.h() { // from class: f6.f
            @Override // x5.h
            public final Object a(x5.e eVar) {
                return g.i(eVar);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g i(x5.e eVar) {
        return new g((Context) eVar.a(Context.class), ((v5.d) eVar.a(v5.d.class)).n(), eVar.b(h.class), eVar.c(q6.i.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String j() {
        String string;
        synchronized (this) {
            l lVar = (l) this.f23645a.get();
            List listC = lVar.c();
            lVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < listC.size(); i10++) {
                m mVar = (m) listC.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", mVar.c());
                jSONObject.put("dates", new JSONArray((Collection) mVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    string = byteArrayOutputStream.toString("UTF-8");
                } finally {
                }
            } finally {
            }
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l k(Context context, String str) {
        return new l(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void l() {
        synchronized (this) {
            ((l) this.f23645a.get()).k(System.currentTimeMillis(), ((q6.i) this.f23647c.get()).a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread m(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // f6.j
    public b5.i a() {
        return n.a(this.f23646b) ^ true ? b5.l.e("") : b5.l.c(this.f23649e, new Callable() { // from class: f6.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f23640a.j();
            }
        });
    }

    @Override // f6.k
    public synchronized k.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        l lVar = (l) this.f23645a.get();
        if (!lVar.i(jCurrentTimeMillis)) {
            return k.a.NONE;
        }
        lVar.g();
        return k.a.GLOBAL;
    }

    public b5.i n() {
        if (this.f23648d.size() > 0 && !(!n.a(this.f23646b))) {
            return b5.l.c(this.f23649e, new Callable() { // from class: f6.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f23641a.l();
                }
            });
        }
        return b5.l.e(null);
    }
}
