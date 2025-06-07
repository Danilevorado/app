package s3;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class u extends LinkedHashMap {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ v f26864m;

    u(v vVar) {
        this.f26864m = vVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.f26864m) {
            int size = size();
            v vVar = this.f26864m;
            if (size <= vVar.f26865a) {
                return false;
            }
            vVar.f26870f.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            return size() > this.f26864m.f26865a;
        }
    }
}
