package g7;

import com.onesignal.e3;
import com.onesignal.n2;
import com.onesignal.o3;
import com.onesignal.r1;
import com.onesignal.w2;
import ib.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import rb.h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f23877a;

    /* renamed from: b, reason: collision with root package name */
    private final c f23878b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23879a;

        static {
            int[] iArr = new int[h7.b.values().length];
            iArr[h7.b.NOTIFICATION.ordinal()] = 1;
            iArr[h7.b.IAM.ordinal()] = 2;
            f23879a = iArr;
        }
    }

    public e(n2 n2Var, r1 r1Var, w2 w2Var) {
        h.e(n2Var, "preferences");
        h.e(r1Var, "logger");
        h.e(w2Var, "timeProvider");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f23877a = concurrentHashMap;
        c cVar = new c(n2Var);
        this.f23878b = cVar;
        f7.a aVar = f7.a.f23657a;
        concurrentHashMap.put(aVar.a(), new b(cVar, r1Var, w2Var));
        concurrentHashMap.put(aVar.b(), new d(cVar, r1Var, w2Var));
    }

    public final void a(JSONObject jSONObject, List list) {
        h.e(jSONObject, "jsonObject");
        h.e(list, "influences");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h7.a aVar = (h7.a) it.next();
            if (a.f23879a[aVar.c().ordinal()] == 1) {
                g().a(jSONObject, aVar);
            }
        }
    }

    public final g7.a b(e3.s sVar) {
        h.e(sVar, "entryAction");
        if (sVar.g()) {
            return g();
        }
        return null;
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(g());
        arrayList.add(e());
        return arrayList;
    }

    public final List d(e3.s sVar) {
        h.e(sVar, "entryAction");
        ArrayList arrayList = new ArrayList();
        if (sVar.b()) {
            return arrayList;
        }
        g7.a aVarG = sVar.d() ? g() : null;
        if (aVarG != null) {
            arrayList.add(aVarG);
        }
        arrayList.add(e());
        return arrayList;
    }

    public final g7.a e() {
        Object obj = this.f23877a.get(f7.a.f23657a.a());
        h.b(obj);
        h.d(obj, "trackers[OSInfluenceConstants.IAM_TAG]!!");
        return (g7.a) obj;
    }

    public final List f() {
        Collection collectionValues = this.f23877a.values();
        h.d(collectionValues, "trackers.values");
        ArrayList arrayList = new ArrayList(k.h(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((g7.a) it.next()).e());
        }
        return arrayList;
    }

    public final g7.a g() {
        Object obj = this.f23877a.get(f7.a.f23657a.b());
        h.b(obj);
        h.d(obj, "trackers[OSInfluenceConstants.NOTIFICATION_TAG]!!");
        return (g7.a) obj;
    }

    public final List h() {
        Collection collectionValues = this.f23877a.values();
        h.d(collectionValues, "trackers.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!h.a(((g7.a) obj).h(), f7.a.f23657a.a())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k.h(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g7.a) it.next()).e());
        }
        return arrayList2;
    }

    public final void i() {
        Collection collectionValues = this.f23877a.values();
        h.d(collectionValues, "trackers.values");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((g7.a) it.next()).p();
        }
    }

    public final void j(o3.e eVar) {
        h.e(eVar, "influenceParams");
        this.f23878b.q(eVar);
    }
}
