package n9;

import com.facebook.ads.AdError;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.b;

/* loaded from: classes2.dex */
public class r implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private z7.b f25657a = new z7.b(this, AdError.NETWORK_ERROR_CODE);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f25658a;

        /* renamed from: b, reason: collision with root package name */
        private final o8.a f25659b;

        a(JSONObject jSONObject, o8.a aVar) {
            this.f25658a = jSONObject;
            this.f25659b = aVar;
        }

        public o8.a a() {
            return this.f25659b;
        }

        public JSONObject b() {
            return this.f25658a;
        }
    }

    private void b(List list, b9.a aVar) {
        ka.e.f().z().b(true);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2.a() != null) {
                aVar2.a().a(o8.b.c(aVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(List list, o8.b bVar) {
        if (!bVar.f()) {
            b(list, (b9.a) bVar.e());
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.a() != null) {
                aVar.a().a(o8.b.b(null));
            }
        }
    }

    public void d(JSONObject jSONObject, o8.a aVar) {
        this.f25657a.c(new a(jSONObject, aVar));
    }

    @Override // z7.b.a
    public void f(final List list) {
        JSONObject jSONObject = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k9.b.o(((a) it.next()).b(), jSONObject);
        }
        b9.e eVarA = b9.b.a();
        if (eVarA == null) {
            b(list, new b9.a("Request manager is null"));
        } else {
            eVarA.b(new s(jSONObject), new o8.a() { // from class: n9.q
                @Override // o8.a
                public final void a(o8.b bVar) {
                    this.f25655a.c(list, bVar);
                }
            });
        }
    }
}
