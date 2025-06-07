package y2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public class d implements x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28468a;

    /* renamed from: b, reason: collision with root package name */
    private final z2.d f28469b;

    /* renamed from: c, reason: collision with root package name */
    private final f f28470c;

    public d(Context context, z2.d dVar, f fVar) {
        this.f28468a = context;
        this.f28469b = dVar;
        this.f28470c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    @Override // y2.x
    public void a(r2.o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f28468a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f28468a.getSystemService("jobscheduler");
        int iC = c(oVar);
        if (!z10 && d(jobScheduler, iC, i10)) {
            v2.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long jO = this.f28469b.O(oVar);
        JobInfo.Builder builderC = this.f28470c.c(new JobInfo.Builder(iC, componentName), oVar.d(), jO, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", c3.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        v2.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(iC), Long.valueOf(this.f28470c.g(oVar.d(), jO, i10)), Long.valueOf(jO), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    @Override // y2.x
    public void b(r2.o oVar, int i10) {
        a(oVar, i10, false);
    }

    int c(r2.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f28468a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(c3.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
