package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.e0;
import androidx.work.impl.s;
import b1.j;
import b1.n;
import b1.r;
import b1.t;
import g1.i;
import g1.l;
import g1.m;
import g1.v;
import g1.w;
import g1.y;
import h1.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class b implements s {

    /* renamed from: q, reason: collision with root package name */
    private static final String f4126q = j.i("SystemJobScheduler");

    /* renamed from: m, reason: collision with root package name */
    private final Context f4127m;

    /* renamed from: n, reason: collision with root package name */
    private final JobScheduler f4128n;

    /* renamed from: o, reason: collision with root package name */
    private final e0 f4129o;

    /* renamed from: p, reason: collision with root package name */
    private final a f4130p;

    public b(Context context, e0 e0Var) {
        this(context, e0Var, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public b(Context context, e0 e0Var, JobScheduler jobScheduler, a aVar) {
        this.f4127m = context;
        this.f4129o = e0Var;
        this.f4128n = jobScheduler;
        this.f4130p = aVar;
    }

    public static void c(Context context) {
        List listG;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            d(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    private static void d(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            j.e().d(f4126q, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    private static List e(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            m mVarH = h(jobInfo);
            if (mVarH != null && str.equals(mVarH.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            j.e().d(f4126q, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static m h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, e0 e0Var) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        List listA = e0Var.s().G().a();
        boolean z10 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                m mVarH = h(jobInfo);
                if (mVarH != null) {
                    hashSet.add(mVarH.b());
                } else {
                    d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                j.e().a(f4126q, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (z10) {
            WorkDatabase workDatabaseS = e0Var.s();
            workDatabaseS.e();
            try {
                w wVarJ = workDatabaseS.J();
                Iterator it2 = listA.iterator();
                while (it2.hasNext()) {
                    wVarJ.f((String) it2.next(), -1L);
                }
                workDatabaseS.B();
            } finally {
                workDatabaseS.i();
            }
        }
        return z10;
    }

    @Override // androidx.work.impl.s
    public void a(String str) {
        List listE = e(this.f4127m, this.f4128n, str);
        if (listE == null || listE.isEmpty()) {
            return;
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            d(this.f4128n, ((Integer) it.next()).intValue());
        }
        this.f4129o.s().G().e(str);
    }

    @Override // androidx.work.impl.s
    public void b(v... vVarArr) {
        List listE;
        WorkDatabase workDatabaseS = this.f4129o.s();
        g gVar = new g(workDatabaseS);
        for (v vVar : vVarArr) {
            workDatabaseS.e();
            try {
                v vVarL = workDatabaseS.J().l(vVar.f23739a);
                if (vVarL == null) {
                    j.e().k(f4126q, "Skipping scheduling " + vVar.f23739a + " because it's no longer in the DB");
                } else if (vVarL.f23740b != t.ENQUEUED) {
                    j.e().k(f4126q, "Skipping scheduling " + vVar.f23739a + " because it is no longer enqueued");
                } else {
                    m mVarA = y.a(vVar);
                    i iVarG = workDatabaseS.G().g(mVarA);
                    int iE = iVarG != null ? iVarG.f23711c : gVar.e(this.f4129o.l().i(), this.f4129o.l().g());
                    if (iVarG == null) {
                        this.f4129o.s().G().b(l.a(mVarA, iE));
                    }
                    j(vVar, iE);
                    if (Build.VERSION.SDK_INT == 23 && (listE = e(this.f4127m, this.f4128n, vVar.f23739a)) != null) {
                        int iIndexOf = listE.indexOf(Integer.valueOf(iE));
                        if (iIndexOf >= 0) {
                            listE.remove(iIndexOf);
                        }
                        j(vVar, !listE.isEmpty() ? ((Integer) listE.get(0)).intValue() : gVar.e(this.f4129o.l().i(), this.f4129o.l().g()));
                    }
                }
                workDatabaseS.B();
            } finally {
                workDatabaseS.i();
            }
        }
    }

    @Override // androidx.work.impl.s
    public boolean f() {
        return true;
    }

    public void j(v vVar, int i10) {
        JobInfo jobInfoA = this.f4130p.a(vVar, i10);
        j jVarE = j.e();
        String str = f4126q;
        jVarE.a(str, "Scheduling work ID " + vVar.f23739a + "Job ID " + i10);
        try {
            if (this.f4128n.schedule(jobInfoA) == 0) {
                j.e().k(str, "Unable to schedule work ID " + vVar.f23739a);
                if (vVar.f23755q && vVar.f23756r == n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    vVar.f23755q = false;
                    j.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", vVar.f23739a));
                    j(vVar, i10);
                }
            }
        } catch (IllegalStateException e5) {
            List listG = g(this.f4127m, this.f4128n);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listG != null ? listG.size() : 0), Integer.valueOf(this.f4129o.s().J().s().size()), Integer.valueOf(this.f4129o.l().h()));
            j.e().c(f4126q, str2);
            IllegalStateException illegalStateException = new IllegalStateException(str2, e5);
            r rVarL = this.f4129o.l().l();
            if (rVarL == null) {
                throw illegalStateException;
            }
            rVarL.a(illegalStateException);
        } catch (Throwable th) {
            j.e().d(f4126q, "Unable to schedule " + vVar, th);
        }
    }
}
