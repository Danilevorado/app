package q7;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f26315a = new HashMap();

    public Class a(String str) {
        if (this.f26315a.containsKey(str)) {
            return (Class) this.f26315a.get(str);
        }
        throw new UnsupportedClassVersionError(String.format("Cannot find Persistable type for '%s' key. Please, add it through 'registerPersistable' builder method.", str));
    }
}
