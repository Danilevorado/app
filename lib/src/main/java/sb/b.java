package sb;

import java.util.Random;
import rb.h;

/* loaded from: classes2.dex */
public final class b extends sb.a {

    /* renamed from: o, reason: collision with root package name */
    private final a f27091o = new a();

    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // sb.a
    public Random c() {
        Object obj = this.f27091o.get();
        h.d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
