package o6;

import com.google.firebase.messaging.j0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f25807b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final o6.a f25808a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private o6.a f25809a = null;

        a() {
        }

        public b a() {
            return new b(this.f25809a);
        }

        public a b(o6.a aVar) {
            this.f25809a = aVar;
            return this;
        }
    }

    b(o6.a aVar) {
        this.f25808a = aVar;
    }

    public static a b() {
        return new a();
    }

    public o6.a a() {
        return this.f25808a;
    }

    public byte[] c() {
        return j0.a(this);
    }
}
