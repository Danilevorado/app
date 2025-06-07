package ab;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t9.e;
import t9.f;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final List f267a = new ArrayList();

    private void a(SharedPreferences sharedPreferences, e eVar) {
        Map<String, ?> all = sharedPreferences.getAll();
        if (all.isEmpty()) {
            return;
        }
        f fVarEdit = eVar.edit();
        Iterator<String> it = all.keySet().iterator();
        while (it.hasNext()) {
            b(all, fVarEdit, it.next());
        }
        if (fVarEdit.commit()) {
            sharedPreferences.edit().clear().commit();
        }
    }

    private void b(Map map, f fVar, String str) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            fVar.putString(str, (String) obj);
        }
        if (obj instanceof Set) {
            fVar.putStringSet(str, (Set) obj);
        }
        if (obj instanceof Integer) {
            fVar.putInt(str, ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            fVar.putLong(str, ((Long) obj).longValue());
        }
        if (obj instanceof Float) {
            fVar.putFloat(str, ((Float) obj).floatValue());
        }
        if (obj instanceof Boolean) {
            fVar.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    public void c(e eVar) {
        Iterator it = this.f267a.iterator();
        while (it.hasNext()) {
            a((SharedPreferences) it.next(), eVar);
        }
    }
}
