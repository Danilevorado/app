package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import b1.b;
import b1.j;
import b1.k;
import g1.v;
import java.util.Iterator;

/* loaded from: classes.dex */
class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f4123b = j.i("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    private final ComponentName f4124a;

    /* renamed from: androidx.work.impl.background.systemjob.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0068a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4125a;

        static {
            int[] iArr = new int[k.values().length];
            f4125a = iArr;
            try {
                iArr[k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4125a[k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4125a[k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4125a[k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4125a[k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    a(Context context) {
        this.f4124a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(b.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.a(), cVar.b() ? 1 : 0);
    }

    static int c(k kVar) {
        int i10 = C0068a.f4125a[kVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 != 4) {
            if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        j.e().a(f4123b, "API version too low. Cannot convert network type value " + kVar);
        return 1;
    }

    static void d(JobInfo.Builder builder, k kVar) {
        if (Build.VERSION.SDK_INT < 30 || kVar != k.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(kVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(v vVar, int i10) {
        b1.b bVar = vVar.f23748j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", vVar.f23739a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", vVar.f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", vVar.j());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f4124a).setRequiresCharging(bVar.g()).setRequiresDeviceIdle(bVar.h()).setExtras(persistableBundle);
        d(extras, bVar.d());
        if (!bVar.h()) {
            extras.setBackoffCriteria(vVar.f23751m, vVar.f23750l == b1.a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(vVar.c() - System.currentTimeMillis(), 0L);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!vVar.f23755q) {
            extras.setImportantWhileForeground(true);
        }
        if (i11 >= 24 && bVar.e()) {
            Iterator it = bVar.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((b.c) it.next()));
            }
            extras.setTriggerContentUpdateDelay(bVar.b());
            extras.setTriggerContentMaxDelay(bVar.a());
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            extras.setRequiresBatteryNotLow(bVar.f());
            extras.setRequiresStorageNotLow(bVar.i());
        }
        boolean z10 = vVar.f23749k > 0;
        boolean z11 = jMax > 0;
        if (i12 >= 31 && vVar.f23755q && !z10 && !z11) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
