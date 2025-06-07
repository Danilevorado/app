package j7;

import com.onesignal.r1;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d implements k7.c {

    /* renamed from: a, reason: collision with root package name */
    private final r1 f24551a;

    /* renamed from: b, reason: collision with root package name */
    private final a f24552b;

    /* renamed from: c, reason: collision with root package name */
    private final j f24553c;

    public d(r1 r1Var, a aVar, j jVar) {
        rb.h.e(r1Var, "logger");
        rb.h.e(aVar, "outcomeEventsCache");
        rb.h.e(jVar, "outcomeEventsService");
        this.f24551a = r1Var;
        this.f24552b = aVar;
        this.f24553c = jVar;
    }

    @Override // k7.c
    public void a(String str, String str2) {
        rb.h.e(str, "notificationTableName");
        rb.h.e(str2, "notificationIdColumnName");
        this.f24552b.c(str, str2);
    }

    @Override // k7.c
    public void b(k7.b bVar) {
        rb.h.e(bVar, "event");
        this.f24552b.k(bVar);
    }

    @Override // k7.c
    public List c(String str, List list) {
        rb.h.e(str, "name");
        rb.h.e(list, "influences");
        List listG = this.f24552b.g(str, list);
        this.f24551a.f(rb.h.j("OneSignal getNotCachedUniqueOutcome influences: ", listG));
        return listG;
    }

    @Override // k7.c
    public void d(k7.b bVar) {
        rb.h.e(bVar, "outcomeEvent");
        this.f24552b.d(bVar);
    }

    @Override // k7.c
    public Set e() {
        Set setI = this.f24552b.i();
        this.f24551a.f(rb.h.j("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: ", setI));
        return setI;
    }

    @Override // k7.c
    public List f() {
        return this.f24552b.e();
    }

    @Override // k7.c
    public void g(Set set) {
        rb.h.e(set, "unattributedUniqueOutcomeEvents");
        this.f24551a.f(rb.h.j("OneSignal save unattributedUniqueOutcomeEvents: ", set));
        this.f24552b.l(set);
    }

    @Override // k7.c
    public void h(k7.b bVar) {
        rb.h.e(bVar, "eventParams");
        this.f24552b.m(bVar);
    }

    protected final r1 j() {
        return this.f24551a;
    }

    public final j k() {
        return this.f24553c;
    }
}
