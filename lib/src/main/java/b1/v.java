package b1;

import android.os.Build;
import ib.f0;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: d, reason: collision with root package name */
    public static final b f4377d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final UUID f4378a;

    /* renamed from: b, reason: collision with root package name */
    private final g1.v f4379b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f4380c;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f4381a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4382b;

        /* renamed from: c, reason: collision with root package name */
        private UUID f4383c;

        /* renamed from: d, reason: collision with root package name */
        private g1.v f4384d;

        /* renamed from: e, reason: collision with root package name */
        private final Set f4385e;

        public a(Class cls) {
            rb.h.e(cls, "workerClass");
            this.f4381a = cls;
            UUID uuidRandomUUID = UUID.randomUUID();
            rb.h.d(uuidRandomUUID, "randomUUID()");
            this.f4383c = uuidRandomUUID;
            String string = this.f4383c.toString();
            rb.h.d(string, "id.toString()");
            String name = cls.getName();
            rb.h.d(name, "workerClass.name");
            this.f4384d = new g1.v(string, name);
            String name2 = cls.getName();
            rb.h.d(name2, "workerClass.name");
            this.f4385e = f0.c(name2);
        }

        public final a a(String str) {
            rb.h.e(str, "tag");
            this.f4385e.add(str);
            return g();
        }

        public final v b() {
            v vVarC = c();
            b1.b bVar = this.f4384d.f23748j;
            boolean z10 = (Build.VERSION.SDK_INT >= 24 && bVar.e()) || bVar.f() || bVar.g() || bVar.h();
            g1.v vVar = this.f4384d;
            if (vVar.f23755q) {
                if (!(!z10)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (!(vVar.f23745g <= 0)) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            rb.h.d(uuidRandomUUID, "randomUUID()");
            k(uuidRandomUUID);
            return vVarC;
        }

        public abstract v c();

        public final boolean d() {
            return this.f4382b;
        }

        public final UUID e() {
            return this.f4383c;
        }

        public final Set f() {
            return this.f4385e;
        }

        public abstract a g();

        public final g1.v h() {
            return this.f4384d;
        }

        public final a i(b1.a aVar, long j10, TimeUnit timeUnit) {
            rb.h.e(aVar, "backoffPolicy");
            rb.h.e(timeUnit, "timeUnit");
            this.f4382b = true;
            g1.v vVar = this.f4384d;
            vVar.f23750l = aVar;
            vVar.k(timeUnit.toMillis(j10));
            return g();
        }

        public final a j(b1.b bVar) {
            rb.h.e(bVar, "constraints");
            this.f4384d.f23748j = bVar;
            return g();
        }

        public final a k(UUID uuid) {
            rb.h.e(uuid, "id");
            this.f4383c = uuid;
            String string = uuid.toString();
            rb.h.d(string, "id.toString()");
            this.f4384d = new g1.v(string, this.f4384d);
            return g();
        }

        public a l(long j10, TimeUnit timeUnit) {
            rb.h.e(timeUnit, "timeUnit");
            this.f4384d.f23745g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f4384d.f23745g) {
                return g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        public final a m(androidx.work.b bVar) {
            rb.h.e(bVar, "inputData");
            this.f4384d.f23743e = bVar;
            return g();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(rb.f fVar) {
            this();
        }
    }

    public v(UUID uuid, g1.v vVar, Set set) {
        rb.h.e(uuid, "id");
        rb.h.e(vVar, "workSpec");
        rb.h.e(set, "tags");
        this.f4378a = uuid;
        this.f4379b = vVar;
        this.f4380c = set;
    }

    public UUID a() {
        return this.f4378a;
    }

    public final String b() {
        String string = a().toString();
        rb.h.d(string, "id.toString()");
        return string;
    }

    public final Set c() {
        return this.f4380c;
    }

    public final g1.v d() {
        return this.f4379b;
    }
}
