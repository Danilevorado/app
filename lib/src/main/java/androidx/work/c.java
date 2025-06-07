package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.futures.d;
import b1.e;
import b1.w;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: m, reason: collision with root package name */
    private Context f4049m;

    /* renamed from: n, reason: collision with root package name */
    private WorkerParameters f4050n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f4051o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f4052p;

    public static abstract class a {

        /* renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C0065a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f4053a;

            public C0065a() {
                this(androidx.work.b.f4046c);
            }

            public C0065a(androidx.work.b bVar) {
                this.f4053a = bVar;
            }

            public androidx.work.b e() {
                return this.f4053a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0065a.class != obj.getClass()) {
                    return false;
                }
                return this.f4053a.equals(((C0065a) obj).f4053a);
            }

            public int hashCode() {
                return (C0065a.class.getName().hashCode() * 31) + this.f4053a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f4053a + '}';
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        public static final class C0066c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f4054a;

            public C0066c() {
                this(androidx.work.b.f4046c);
            }

            public C0066c(androidx.work.b bVar) {
                this.f4054a = bVar;
            }

            public androidx.work.b e() {
                return this.f4054a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0066c.class != obj.getClass()) {
                    return false;
                }
                return this.f4054a.equals(((C0066c) obj).f4054a);
            }

            public int hashCode() {
                return (C0066c.class.getName().hashCode() * 31) + this.f4054a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f4054a + '}';
            }
        }

        a() {
        }

        public static a a() {
            return new C0065a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new C0066c();
        }

        public static a d(androidx.work.b bVar) {
            return new C0066c(bVar);
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f4049m = context;
        this.f4050n = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f4049m;
    }

    public Executor getBackgroundExecutor() {
        return this.f4050n.a();
    }

    public u5.a getForegroundInfoAsync() {
        d dVarU = d.u();
        dVarU.r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return dVarU;
    }

    public final UUID getId() {
        return this.f4050n.c();
    }

    public final b getInputData() {
        return this.f4050n.d();
    }

    public final Network getNetwork() {
        return this.f4050n.e();
    }

    public final int getRunAttemptCount() {
        return this.f4050n.g();
    }

    public final Set<String> getTags() {
        return this.f4050n.h();
    }

    public i1.c getTaskExecutor() {
        return this.f4050n.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f4050n.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f4050n.k();
    }

    public w getWorkerFactory() {
        return this.f4050n.l();
    }

    public final boolean isStopped() {
        return this.f4051o;
    }

    public final boolean isUsed() {
        return this.f4052p;
    }

    public void onStopped() {
    }

    public final u5.a setForegroundAsync(e eVar) {
        return this.f4050n.b().a(getApplicationContext(), getId(), eVar);
    }

    public u5.a setProgressAsync(b bVar) {
        return this.f4050n.f().a(getApplicationContext(), getId(), bVar);
    }

    public final void setUsed() {
        this.f4052p = true;
    }

    public abstract u5.a startWork();

    public final void stop() {
        this.f4051o = true;
        onStopped();
    }
}
