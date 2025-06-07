package v7;

import androidx.work.b;
import b1.l;
import b9.d;
import com.pushwoosh.SendCachedRequestWorker;
import java.util.concurrent.TimeUnit;
import ka.e;
import n7.m;
import va.b;

/* loaded from: classes2.dex */
public class a implements o8.a {

    /* renamed from: a, reason: collision with root package name */
    private o8.a f27903a;

    /* renamed from: b, reason: collision with root package name */
    private d f27904b;

    /* renamed from: c, reason: collision with root package name */
    private b f27905c;

    public a(d dVar, b bVar) {
        this(null, dVar, bVar);
    }

    public a(o8.a aVar, d dVar, b bVar) {
        this.f27903a = aVar;
        this.f27904b = dVar;
        this.f27905c = bVar;
    }

    public static void b(d dVar) throws Throwable {
        long jA = e.g().a(dVar);
        if (jA >= 0) {
            m.b((l) ((l.a) ((l.a) ((l.a) new l.a(SendCachedRequestWorker.class).m(new b.a().g("data_cached_request_id", jA).a())).j(m.c())).i(b1.a.LINEAR, 5L, TimeUnit.SECONDS)).b(), "SendCachedRequestWorker", b1.d.APPEND);
        }
    }

    @Override // o8.a
    public void a(o8.b bVar) throws Throwable {
        if (!bVar.f() && (bVar.e() instanceof va.a) && c((va.a) bVar.e())) {
            b(this.f27904b);
        }
        o8.a aVar = this.f27903a;
        if (aVar != null) {
            aVar.a(bVar);
        }
    }

    boolean c(va.a aVar) {
        return aVar.a() == 0 && aVar.b() == 0;
    }
}
