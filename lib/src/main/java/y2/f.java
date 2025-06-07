package y2;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import y2.c;

/* loaded from: classes.dex */
public abstract class f {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private b3.a f28473a;

        /* renamed from: b, reason: collision with root package name */
        private Map f28474b = new HashMap();

        public a a(p2.d dVar, b bVar) {
            this.f28474b.put(dVar, bVar);
            return this;
        }

        public f b() {
            Objects.requireNonNull(this.f28473a, "missing required property: clock");
            if (this.f28474b.keySet().size() < p2.d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f28474b;
            this.f28474b = new HashMap();
            return f.d(this.f28473a, map);
        }

        public a c(b3.a aVar) {
            this.f28473a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new c.b().c(Collections.emptySet());
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static f d(b3.a aVar, Map map) {
        return new y2.b(aVar, map);
    }

    public static f f(b3.a aVar) {
        return b().a(p2.d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(p2.d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(p2.d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, p2.d dVar, long j10, int i10) {
        builder.setMinimumLatency(g(dVar, j10, i10));
        j(builder, ((b) h().get(dVar)).c());
        return builder;
    }

    abstract b3.a e();

    public long g(p2.d dVar, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = (b) h().get(dVar);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    abstract Map h();
}
